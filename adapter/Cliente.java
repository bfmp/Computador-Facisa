package br.padrao.adapter;

public class Cliente {

	public static void main(String[] args) {
		
		ImagemAdapter adapter = new ImagemAdapter();
			
		ImagemBMP imagemBMP = new ImagemBMP();
		
		adapter.carregarImagem(imagemBMP);
		adapter.desenharImagem(imagemBMP);
		
		ImagemJpeg imagemJpeg = new ImagemJpeg();
		
		adapter.carregarImagem(imagemJpeg);
		adapter.desenharImagem(imagemJpeg);
		
		ImagemPNG imagemPNG = new ImagemPNG();
		
		adapter.carregarImagem(imagemPNG);
		adapter.desenharImagem(imagemPNG);	
	}
}
