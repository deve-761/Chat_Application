let arr = JSON.parse(localStorage.getItem("community"))||[] ;


document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    // Get form values
    var name = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    // Create form data object
    var formData = new FormData();
    formData.append('username', name);
    formData.append('password', password);

    // Make API call
    fetch('http://localhost:8888/login/login', {
        method: 'POST',
        body: JSON.stringify(formData),
        headers: {
            'Content-Type':'application/json',
        },
    })
    .then(function(response) {
        console.log(response);
        if (response.ok) {
            window.location.href = 'community.html';
        } else {
            throw new Error('Error occurred during login.');
        }
    })
    .catch(function(error) {
        console.log(error);
    });
});

