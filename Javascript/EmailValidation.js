const validateEmail = (email) => {
    return email.match(
      /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/
    );
  };
  
  const validate = () => {
    const $result = $('#result');
    const email = $('#email').val();
    $result.text('');
  
    if (validateEmail(email)) {
      $result.text(email + ' is valid :)');
      $result.css('color', 'green');
    } else {
      $result.text(email + ' is not valid :(');
      $result.css('color', 'red');
    }
    return false;
  }
  
  $('#email').on('input', validate);