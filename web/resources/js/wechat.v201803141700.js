document.addEventListener('DOMContentLoaded', function () {
  /* do nothing if browsing on windows except chrome */
  // windows Edge has "Chrome" in its UA
  var isWindowsButNotChrome = /Windows(?=.*Chrome.*Edge)|Windows(?!.*Chrome)|Win32/ig.test(navigator.userAgent);
  // wechat browser might have "windows" in its UA
  var isWeixin = /micromessenger/i.test(navigator.userAgent);
  if (isWindowsButNotChrome && !isWeixin) {
    return;
  }

  /* WECHAT SHARING */
  var hostname = window.location.protocol + '//' + window.location.hostname;
  var appId = /www.starbucks.com.cn$/i.test(hostname) ? 'wxaf48360fec8b1f0c' : 'wx186c10fc6a4ff63c';
  if (!/starbucks.com.cn$/i.test(hostname)) {
    return;
  }
  $.ajax({
    url: hostname + '/api/external/wechat/thirdParty/jssdkSignature',
    method: 'POST',
    data: {
      data: {
        url: location.href.split('#')[0],
        appId: appId
      }
    }
  }).done(function (resData) {
    var signature = resData.signature;
    var nonceStr = resData.nonceStr;
    var timestamp = resData.timestamp;
    if (signature && nonceStr && timestamp && wx) {
      wx.config({
        debug: false,
        appId: appId,
        timestamp: timestamp,
        nonceStr: nonceStr,
        signature: signature,
        jsApiList: [
          'checkJsApi',
          'onMenuShareTimeline',
          'onMenuShareAppMessage'
        ]
      });
      wx.ready(function () {
        var pageShareData = {
          title: WECHAT_TITLE,
          desc: WECHAT_DESC,
          // it's ok to have GA here
          // if there is query string(e.g. start with '?' character
          // then new queries should append with '&' character
          // double '?' characters is invalid syntax
          link: location.href + (/\?/.test(location.href) ? '&' : '?') + 'utm_source=sbux%20china&utm_medium=wechat',
          imgUrl: hostname + WECHAT_IMAGE,
          success: function (res) {
            console.log('This page shared:', location.href);
          },
          cancel: function (res) {
            console.log('Cancelled page sharing for:', location.href);
          }
        };
        wx.onMenuShareTimeline(pageShareData);
        wx.onMenuShareAppMessage(pageShareData);
      });
      wx.error(function (res) {
        console.log('wechat jssdk error: ', res);
      });
    }
  }).fail(function (jqXHR, textStatus) {
    console.log('Request to share api failed: ', textStatus);
  });
})
