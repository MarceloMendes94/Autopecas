var apiUrl = 'https://autopecas-api.herokuapp.com';
var api = {
  login(email, senha) {
    return fetch(`${apiUrl}/auth/login`, {
      headers: { 'Content-Type' : 'application/json' },
      method: 'POST',
      body: JSON.stringify({
        email,
        senha
      })
    }).then(function(res) {
      if (res.ok) {
        return res.json();
      }
      return Promise.reject(new Error('Usuário ou senha inválido!'));
    });
  },

  produtos() {
    return fetch(`${apiUrl}/produtos`, {
      method: 'GET',
      headers: {
        'Content-Type' : 'application/json',
        'Authorization' : `Bearer ${localStorage.getItem(authKey)}`
      }
    }).then(
      function(res) {
        if (res.ok) {
          return res.json();
        }
        return Promise.reject(new Error('Houve um erro inesperado ao tentar obter os produtos. Tente novamente mais tarde!'))
      }
    )
  },

  signup(obj) {
    return fetch(`${apiUrl}/auth/signup`, {
      headers: { 'Content-Type' : 'application/json' },
      method: 'POST',
      body: JSON.stringify(obj)
    }).then(function(res) {
      if (res.ok) {
        return;
      }
      return Promise.reject(new Error('Algo saiu errado!'));
    });    
  }
};
