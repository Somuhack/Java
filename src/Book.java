class Book {
    String title;
    String author;
    int isbn;
    boolean isBorrow;
    static int totalBooks;
    {
        totalBooks++;
    }

    Book(int isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    Book(int isbn){
        this(isbn,"Unknown","Unknown");
    }

    void borrowBook(){
        if(isBorrow) {
            System.out.println("The Book is Already Borrow");
        }
        else{
                isBorrow=true;
                System.out.println("Enjoy your Book "+ title);
            }
        }
    void returnBook(){
        if(isBorrow) {
            isBorrow = false;
            System.out.println("Thank you for returning the book");
        }
        else{
            System.out.println("The Book is Already Present in Library");
        }
    }

    public static void main(String[] args) {
        Book harry= new Book(1,"harry potter","Somnath Barik");
        Book Java = new Book(2);
        harry.borrowBook();
        Java.borrowBook();
        harry.borrowBook();
        harry.returnBook();
        harry.returnBook();
        System.out.println(Book.totalBooks);

    }
    }

