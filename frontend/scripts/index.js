
        document.getElementById('signupForm').addEventListener('submit', function(event) {
            event.preventDefault();

            // Get form values
            var name = document.getElementById('name').value;
            var password = document.getElementById('password').value;

            // Create form data object
            var formData = new FormData();
            formData.append('name', name);
            formData.append('password', password);
            
            // Make API call
            fetch('http://localhost:8888/chat/user', {
                method: 'POST',
                body: JSON.stringify(formData),
                headers: {
                    'Content-Type':'application/json',
                },
            })
            
            .then(function(response) {
                if (response.ok) {
                    // Redirect to another page after successful signup
                    window.location.href = 'index.html';
                } else {
                    throw new Error('Error occurred during signup.');
                }
            })
            .catch(function(error) {
                console.log(error);
            });
        });
   