 class LibraryManagementSystem {
        private static String libraryName = "Chitkara Library";
        private String title;
        private String author;
        private final int isbn;

        public LibraryManagementSystem(String title, String author,int isbn){
            this.title=title;
            this.author=author;
            this.isbn=isbn;
        }
        public void  showDetails(){
            if(this instanceof  LibraryManagementSystem) {
                System.out.println("Library Name :" + libraryName);
                System.out.println("Title:" + title);
                System.out.println("Author :"+author);
                System.out.println("Isbn :"+isbn);

            }

        }

            public  static  void main(String[] args){
                LibraryManagementSystem book1 = new LibraryManagementSystem("the yellow umbrella","ruskin bond",981234567);
                book1.showDetails();
            }



}
