const message = document.getElementById("message");

function register() {

    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    if (email === "" || password === "") {
        message.style.color = "red";
        message.innerText = "All fields are required";
        return;
    }

    fetch("http://localhost:8080/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ email, password })
    })
    .then(res => res.text())
    .then(data => {
        if (data === "REGISTER_SUCCESS") {
            message.style.color = "green";
            message.innerText = "Registration successful! Now login.";
        } else {
            message.style.color = "red";
            message.innerText = "Email already exists!";
        }
    });
}

function login() {

    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    fetch("http://localhost:8080/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ email, password })
    })
    .then(res => res.text())
    .then(data => {
        if (data === "LOGIN_SUCCESS") {
            message.style.color = "green";
            message.innerText = "Login successful!";
        } else {
            message.style.color = "red";
            message.innerText = "Invalid credentials!";
        }
    });
}
