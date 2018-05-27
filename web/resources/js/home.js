$(function() {
  $('.carousel-home').slick({
    lazyLoad: 'progressive',
    autoplay: true,
    cssEase: 'linear',
    speed: 500,
    autoplaySpeed: 5000,
  })
  $('.slick-active').find('span').addClass('animated');
  $('.carousel-home').on('afterChange', function(event, slick, currentSlide) {
    $('.slick-active').find('span').addClass('animated');
    $('.slick-active').siblings('.slick-slide').find('span').removeClass('animated')
  })
})
