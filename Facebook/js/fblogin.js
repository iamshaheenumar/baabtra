$(document).ready(function(){
  addPlaceholder();
  $(window).resize(function(){addPlaceholder();})
  });
  function addPlaceholder() {
    if ($(window).width() < 991 ) {
      $("#username").attr("placeholder","Email address or phone number");
      $("#password").attr("placeholder","Password");
    }
    else {
      $("#username").attr("placeholder","");
      $("#password").attr("placeholder","");

    }

  }
