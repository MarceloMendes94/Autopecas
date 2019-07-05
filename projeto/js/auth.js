var authKey = 'AUTH'

function isLoggedIn() {
  let token = localStorage.getItem(authKey);
  if (token) {
    let decoded = jwt_decode(token);
    let currentDate = Date.now() / 1000;
    if (decoded.exp >= currentDate) {
      return true;
    }
  }
  return false;
}

function login() {
  const emailInput = document.getElementById('email');
  const passwordInput = document.getElementById('password');
  const errTextElement = document.getElementById('loginError');
  errTextElement.textContent = '';
  api.login(emailInput.value, passwordInput.value)
    .then(
      function(token) {
        localStorage.setItem(authKey, token);
        location.pathname = 'index.html';
      },
      function(err) {
        errTextElement.textContent = err.message || 'Ocorreu um erro inesperado!';
      }
    )
}

function logout() {
  localStorage.removeItem(authKey);
  location.pathname = 'login.html';
}
