var interval = setInterval(function() {
  document.querySelector('body').style = 'display: none';
  if (!isLoggedIn()) {
    let atualPath = location.pathname.substr(1).split('.')[0];
    if (atualPath !== 'login' && atualPath !== 'cadastrocliente' ) {
      location.pathname = 'login.html';
      return;
    }
  } else {
    if (location.pathname.substr(1).split('.')[0] === 'login') {
      location.pathname = 'index.html';
    }
  }
  document.querySelector('body').style = '';
  clearInterval(interval);
}, 50);
