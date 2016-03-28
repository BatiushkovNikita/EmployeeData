function validateForm(event) {

    var firstName = document.getElementById('firstName').value.trim();
    var firstNameError = document.getElementById('firstNameError');
    firstNameError.innerText = '';
    if (firstName == null || firstName == '') {
        firstNameError.innerText = 'Please input First name';
        event.preventDefault();
    } else if (firstName.length > 45) {
        firstNameError.innerText = 'First name to long';
        event.preventDefault();
    } else if (firstName.match('^([A-z][a-z]+)$') == null) {
        firstNameError.innerText = 'First name should contain only letters';
        event.preventDefault();
    }

    var lastName = document.getElementById('lastName').value.trim();
    var lastNameError = document.getElementById('lastNameError');
    lastNameError.innerText = '';
    if (lastName == null || lastName == '') {
        lastNameError.innerText = 'Please input Last name';
        event.preventDefault();
    } else if (lastName.length > 45) {
        lastNameError.innerText = 'Last name to long';
        event.preventDefault();
    } else if (lastName.match('^([A-z][a-z]+)$') == null) {
        lastNameError.innerText = 'Last name should contain only letters';
        event.preventDefault();
    }
}
