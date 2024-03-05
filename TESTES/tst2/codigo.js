const botao = document.getElementById('botao');
const imagem = document.getElementById('imagem');

botao.addEventListener('click', () => {
    const imagens = [
        'https://img.freepik.com/fotos-gratis/lindo-girassol-com-gotas-de-agua_23-2150806368.jpg?w=360&t=st=1708990833~exp=1708991433~hmac=fa65ea206b73d717bda1c8560276aa4e3710c30d05c273491af70b7de5567bcd',
        '',
        'https://img.freepik.com/fotos-premium/grande-campo-de-girassois-florescendo_123211-976.jpg?w=740.png',
        'https://img.freepik.com/fotos-gratis/flor-de-girassol-dourada-em-vibrante-prado-de-verao-gerado-por-ia_24640-81396.jpg?w=740&t=st=1708990938~exp=1708991538~hmac=8c9a471544065af210bcc30a15a06089f992609201491209cc4d0d1db4dc1233.png',
        'https://img.freepik.com/fotos-gratis/close-vertical-de-um-lindo-gato-de-olhos-azuis-marrom-e-branco-brincando-com-uma-bola-de-la_181624-20265.jpg?w=360&t=st=1708990959~exp=1708991559~hmac=537a4718be28fc09598f1dba89cb9efc0fc9584f3f36681b02736812d43e6cba.png',
        'https://br.freepik.com/fotos-gratis/vista-3d-do-adoravel-gato-de-estimacao_45149891.htm#query=gatinhos%20fofos&position=29&from_view=keyword&track=ais&uuid=bce74628-9e16-4745-9812-d7dae3ddc92e.png'
    ];

    const randomIndex = Math.floor(Math.random() * imagens.length);
    const randomImage = imagens[randomIndex];

    imagem.src = randomImage;
    
});