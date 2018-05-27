// tracking search queries 
function trackSearch (selector) {
  var searchField = document.querySelector(selector);
  textEntered = false,
  timeout = 2000,
  minLength = 2;
  var timer, searchText;
  var handleInput = function() {
    searchText = searchField ? searchField.value : '';
    if (!searchText.length < minLength) {
      window.dataLayer.push({
        'event': 'customSearch',
        'customSearchInput': searchText
      });
      textEntered = false;
    }
  };

  var startTimer = function(e) {
    textEntered = true;
    window.clearTimeout(timer);
    if (e.keyCode === 13) {
      handleInput();
    } else {
      timer = setTimeout(handleInput, timeout);
    }
  };
  if (searchField !== null) {
    searchField.addEventListener('keydown', startTimer, true);
    searchField.addEventListener('blur', function() {
      if (textEntered) {
        window.clearTimeout(timer);
        handleInput();
      }
    }, true);
  }
}