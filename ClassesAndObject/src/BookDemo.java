public class BookDemo {
    public static void main(String[] args) {

        Book got =new Book("Geroge","GOT","Fantasy",880);

        Book math = new Book("James","Numbers","Academic",250);

         printBook(got);
         printBook(math);

    }
    public static void printBook(Book book){
        System.out.println(book.getTitle());
        System.out.println(" by "+ book.getAuthor() + "  has "+book.getPages()+ " of genere is  "+book.getGenre());

    }
}
