document.addEventListener('DOMContentLoaded', function() {
  /* TRIGGERS (FOR DIALOGS AND OVERLAYS) */
  var triggers = document.querySelectorAll('.trigger');

  for (var i = 0; i < triggers.length; i++) {
    triggers[i].addEventListener('click', function(event) {
      var target = document.getElementById(this.getAttribute('rel'));
      target.classList.add('active');
      document.body.classList.add('with-overlay-nav');
      return false;
    });
  }

  /* SNACKBAR */

  // Closing elements
  var snackbars = document.querySelectorAll('.snackbar');

  for (var i = 0; i < snackbars.length; i++) {
    snackbars[i].addEventListener('click', function(event) {
      if ((event.target.classList.contains('close')) || (event.target.parentNode.classList.contains('close'))) {
        this.classList.remove('active');
      }
    });
  }

  /* DIALOGS */

  // Closing elements
  var dialogs = document.querySelectorAll('.dialog');

  for (var i = 0; i < dialogs.length; i++) {
    dialogs[i].addEventListener('click', function(event) {
      if ((event.target.classList.contains('close')) || (event.target.parentNode.classList.contains('close'))) {
        this.classList.remove('active');
        document.body.classList.remove('with-overlay');
      }
    });
  }

  /* OVERLAYS */

  // Closing elements
  var overlays = document.querySelectorAll('.overlay');

  for (var i = 0; i < overlays.length; i++) {
    overlays[i].addEventListener('click', function(event) {
      if ((event.target.classList.contains('close')) || (event.target.parentNode.classList.contains('close'))) {
        this.classList.remove('active');
        document.body.classList.remove('with-overlay');
        document.body.classList.remove('with-overlay-nav');
      }
    });
  }

  /* DIALOGS & OVERLAYS */

  // Close overlays & dialogs with escape key
  document.onkeydown = function(evt) {
    evt = evt || window.event;
    if (evt.keyCode == 27) {
      var overlays = document.querySelectorAll('.overlay');

      for (var i = 0; i < overlays.length; i++) {
        overlays[i].classList.remove('active');
      }

      document.body.classList.remove('with-overlay');

      var dialogs = document.querySelectorAll('.dialog');

      for (var i = 0; i < dialogs.length; i++) {
        dialogs[i].classList.remove('active');
      }
    }
  };

  /* FASTCLICK */
  if ('addEventListener' in document) {
    document.addEventListener('DOMContentLoaded', function() {
      FastClick.attach(document.body);
    }, false);
  }

  /* COLLAPSIBLE */
  var collapsibles = document.querySelectorAll('.collapsible');

  for (var i = 0; i < collapsibles.length; i++) {
    var collapsible = collapsibles[i];

    if (window.location.hash == '#' + collapsible.getAttribute('id')) {
      collapsible.classList.add('expanded');
    } else {
      collapsible.classList.add('collapsed');
    }

    collapsible.addEventListener('click', function(event) {
      event.preventDefault();

      var header = this.querySelector('.header');
      var body = this.querySelector('.body');
      var container = this.querySelector('.body .container');

      // if (header.contains(event.target)) {
        if (this.classList.contains('collapsed')) {
          body.style.maxHeight = container.offsetHeight;
        } else {
          body.style.maxHeight = '';
        }
        this.classList.toggle('collapsed');
        this.classList.toggle('expanded');
      // }
    });
  }

  /* SCROLL */
  function throttle(func, wait, options) {
    var context, args, result;
    var timeout = null;
    var previous = 0;
    if (!options) options = {};
    var later = function() {
      previous = options.leading === false ? 0 : Date.now();
      timeout = null;
      result = func.apply(context, args);
      if (!timeout) context = args = null;
    };
    return function() {
      var now = Date.now();
      if (!previous && options.leading === false) previous = now;
      var remaining = wait - (now - previous);
      context = this;
      args = arguments;
      if (remaining <= 0 || remaining > wait) {
        if (timeout) {
          clearTimeout(timeout);
          timeout = null;
        }
        previous = now;
        result = func.apply(context, args);
        if (!timeout) context = args = null;
      } else if (!timeout && options.trailing !== false) {
        timeout = setTimeout(later, remaining);
      }
      return result;
    };
  };
  // Prevents the mouse from scrolling, add arrow to scroll list

  // extension:
  $.fn.scrollEnd = function(callback, timeout) {
    $(this).scroll(function(){
      var $this = $(this);
      if ($this.data('scrollTimeout')) {
        clearTimeout($this.data('scrollTimeout'));
      }
      $this.data('scrollTimeout', setTimeout(callback,timeout));
    });
  };
// how to call it (with a 1000ms timeout):
  window.addArrowToScroll = function addArrowToScroll(el){
    var scroll = $(el)[0];
    if (!scroll) return;
    var allWidth = scroll.scrollWidth;
    var showWidth = scroll.clientWidth;
    var arrowLeft = $(scroll).prev();
    var arrowRight = $(scroll).next();
    showArrow(); // First determine the arrow display
    function moveScroll(dire){
      var scrollLeft = dire === "left" ? scroll.scrollLeft - 300 : scroll.scrollLeft + 300;
      $(scroll).animate({scrollLeft:scrollLeft}, 500,function(){
        showArrow()
      });
    }
    function showArrow(){
      // Decide how to display the arrow
      var scrollLeft = scroll.scrollLeft;
      if(allWidth === showWidth){
        arrowLeft.addClass('hidden');
        arrowRight.addClass('hidden');
      }else if(scrollLeft >0 && scrollLeft + showWidth < allWidth){
        arrowLeft.removeClass('hidden');
        arrowRight.removeClass('hidden');
      }else if(scrollLeft > 0 || scrollLeft + showWidth === allWidth || scrollLeft + showWidth > allWidth){
        arrowLeft.removeClass('hidden');
        arrowRight.addClass('hidden');
      }else if(scrollLeft ===0 || scrollLeft < 0){
        arrowLeft.addClass('hidden');// hide arrow
        arrowRight.removeClass('hidden'); // dispaly srrow
      }
    }
    $(scroll).scrollEnd(function(){
      showArrow()
    }, 500);
    arrowLeft.on('click', throttle(function(){moveScroll("left")}, 1000));
    arrowRight.on('click',throttle(function(){moveScroll("right")}, 1000));
  }
  // Add an event to the scroll of a static file
  addArrowToScroll('.scroll');
});

 /* prevent child event trigger parent event */
 window.stopEvtPropagation = function stopEvtPropagation(el, evt) {
   // the default evt is 'click'
   evt = evt || 'click'
   // if a single el object is passed to the fn, convert it into an array
   var els = Array.prototype.slice.call(el)
   els = els.length ? els : [el]
   els.forEach(function(el) {
     el.addEventListener && el.addEventListener(evt, function(event){
       event.stopPropagation()
     })
   })
 }

 stopEvtPropagation(document.querySelectorAll('.body .container p a'))


$(document).ready(function() {
  if ($('.subcategories').find('.active').offset()) {
    $('.subcategories').animate({scrollLeft: ($('.subcategories').find('.active').offset().left - 16)},0);
  }

  // Change tmall title's hypen to non-break hypen
  $('.page-front .tmall .title-1 strong').each(function(){
    $(this).html($(this).html().replace('-','&#8209;'))
  });

  // Make page scroll to top when click binding msr card
  $(document).on('click','.svc .frap .button, .MsrContainer .frap .button', function(){
    document.querySelector('html').scrollTo(0,0)
  })

  // Add ids for homepage slide-next button
  $('.page-front .slick-next').attr('id', 'home-navigation');

   // Click search bar make parent scroll bar unscrollable
  $('#help-cta-search').on('click',function(){
    document.body.style.overflow = 'hidden';
  })

  $('#help-search-overlay .close').on('click',function(){
    document.body.style.overflow = 'inherit';
  })

  $('#featured-campaign-search').on('click', function() {
    $('#help-search-input').focus();
    $('#menu-search-input').focus();
  })

  $.getScript('/assets/js/wcl-survey.79108021.js', function() {
    setTimeout(() => {
      var $window = $(window)
      var $frap = $('.frap')
      var frap = $frap[0]

      window.initWCLSurvey({
        surveyId: 'TYT75Gnh',
        lang: document.querySelector('body.lang-zh') ? 'zh' : 'en',
        apiRoot: SURVEY_URL,
        reminderDelay: 30000,
        position: {
          right: frap ? ($window.width() - ($frap.offset().left + $frap.outerWidth()) + 'px') : '20px',
          bottom: frap ? ($window.height() - $frap[0].getBoundingClientRect().top + 'px') : '20px'
        },
        onTrackView: function() {
          window.dataLayer && window.dataLayer.push({
            event: 'surveyView'
          })
        },
        onTrackDuration: function(options) {
          window.dataLayer && window.dataLayer.push({
            event: options.close ? 'closeSurvey' : 'completeSurvey',
            surveyDuration: options.duration
          })
        },
      })
    }, 60000)
  })
})
