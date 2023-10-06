package Lab_Assignment;

public class LibraryItem {
    
        private String title;
        private String author;
        private int year;
        private boolean isBorrowed = false;
        private LibraryItemType itemType;
        
        
        
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public boolean getisBorrowed() {
            return isBorrowed;
        }
        public void setBorrowed(boolean isBorrowed) {
            this.isBorrowed = isBorrowed;
        }
        public LibraryItemType getItemType() {
            return itemType;
        }
        public void setItemType(LibraryItemType itemType) {
            this.itemType = itemType;
        }

        public LibraryItem(String title,String author ,int year ,boolean isBorrowed,LibraryItemType itemType){
            setAuthor(author);
            setBorrowed(isBorrowed);
            setItemType(itemType);
            setTitle(title);
            setYear(year);
        }
        public LibraryItem(){

        }

        @Override
        public String toString(){
            return String.format("%s %s %d ",this.title,this.author,this.year);
        }    
        
        public boolean equals(Object o){
            LibraryItem lib2 = (LibraryItem)o;

            return this.author == lib2.author && this.title == lib2.title;

            }
        }
    
