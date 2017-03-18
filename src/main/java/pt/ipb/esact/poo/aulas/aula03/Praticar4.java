package pt.ipb.esact.poo.aulas.aula03;

public class Praticar4 {

    public static void main(String[] args) {
        // #1 Ainda no método main() da classe Main tente criar os livros
        Book b1 = new Book("Harry Potter and the Cursed Child", 2016);
        Book b2 = new Book("Binge", 2015);
        Book b3 = new Book("Halo: Hunters in the Dark", 2015);

        // #2 Para cada um dos livros coloque na consola o titlulo e o ano
        System.out.println(b1.getTitle());
        System.out.println(b1.getYear());
        System.out.println(b2.getTitle());
        System.out.println(b2.getYear());
        System.out.println(b3.getTitle());
        System.out.println(b3.getYear());

        // #3 No final coloque na consola o número total de livros
        Book.showCount();
    }

}
