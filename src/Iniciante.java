public class Iniciante {
    public static void main(String[] args) {  //primeiro construtor, cria um primeiro papel sulfite.
        Papel meuPapel = new Papel();
        meuPapel.marca = "sulfite";
        meuPapel.cor = "branco";
        meuPapel.textura = "lisa";
        meuPapel.tamanho = "A4" ;
        meuPapel.gramatura = 60;
        //da o print que tem na classe Papel
        meuPapel.esboco();
        meuPapel.lineart();
        meuPapel.pintura();
//cria outro papel so que agr Canson, logo ele passa pro segundo construtor que vai pegar essas informacoes pre estabelecidas.
        criarPapel("Canson", "amarelado", "texturizada", "A4", 60);
    }
    public static void criarPapel(String marca, String cor, String textura, String tamanho, int gramatura) {
        Papel papelIniciante = new Papel();
        papelIniciante.marca = marca;
        papelIniciante.cor = cor;
        papelIniciante.textura = textura;
        papelIniciante.tamanho = tamanho;
        papelIniciante.gramatura = gramatura;
        //da o print que tem na classe Papel
        papelIniciante.esboco();
        papelIniciante.lineart();
        papelIniciante.pintura();
    }
}
