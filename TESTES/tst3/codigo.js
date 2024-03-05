const btnCat = document.getElementById('btnCat');

btnCat.addEventListener('click', () => {
  const randomNumber = Math.floor(Math.random() * 10) + 1; // Número aleatório de 1 a 10
  const imgUrl = `https://cataas.com/cat?${randomNumber}`; // URL para imagens aleatórias de gatos
  document.body.style.backgroundImage = `url('${imgUrl}')`; // Define a imagem de fundo do corpo da página
});
