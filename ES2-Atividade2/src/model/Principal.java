package model;

public class Principal {

		public static void main(String[] args) {
			Filme f = new Filme(1,"2 Coelhos", "A��o", "Fernando Alves Pinto", "Afonso Poyart", "108 min.", "16 Anos", "Imagem Filmes", "Edgar encontra-se numa situa��o natural para a maioria dos brasileiros, espremido entre a criminalidade, que age impunemente, e o poder p�blico, corrupto e ineficiente. Cansado desta situa��o, ele resolve fazer justi�a com as pr�prias m�os e elabora um plano que colocar� os criminosos e corruptos em rota de colis�o. Dois Coelhos � um enigm�tico suspense de a��o como nunca visto no cinema nacional.");
						
			System.out.println(f);

			System.out.println(f.getSinopse());
		}
}
