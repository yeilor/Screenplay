#language: es

Característica: Login usuario

  @Login
  Escenario: : Login de usuario exitoso
    Dado  que el usuario se encuentre en la app de Bienestar
    Cuando ingresa con sus credenciales
    Y realiza una compra de experiencia
    Entonces visualizara mensaje de Felicitaciones
    Y hara Logout