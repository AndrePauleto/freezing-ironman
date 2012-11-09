package model;

public class Principal {

		public static void main(String[] args) {
			Filme f = new Filme(1,"2 Coelhos", "Ação", "Fernando Alves Pinto", "Afonso Poyart", "108 min.", "16 Anos", "Imagem Filmes", "Edgar encontra-se numa situação natural para a maioria dos brasileiros, espremido entre a criminalidade, que age impunemente, e o poder público, corrupto e ineficiente. Cansado desta situação, ele resolve fazer justiça com as próprias mãos e elabora um plano que colocará os criminosos e corruptos em rota de colisão. Dois Coelhos é um enigmático suspense de ação como nunca visto no cinema nacional.");
						
			System.out.println(f);

			System.out.println(f.getSinopse());
		}
}
