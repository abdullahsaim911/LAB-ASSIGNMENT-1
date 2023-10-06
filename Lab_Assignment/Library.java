package Lab_Assignment;

public class Library {
    LibraryItem[] libraryitems = new LibraryItem[5];

    public void addItem(LibraryItem item){
      
            for(int i =0;i<libraryitems.length;i++){
                if(libraryitems[i]==null){
                    libraryitems[i]=item;
                    break;
                }
                
            }
        }


    public void borrowItem(LibraryItem item){
        if( item.getisBorrowed()== false){
            item.setBorrowed(true);
            System.out.println("BOOK BORROWED ");
        }
        else
        System.out.println("NOT AVAILABLE ");
    }

    public void returnItem(LibraryItem item){
            if( item.getisBorrowed()== true){
                item.setBorrowed(false);
                System.out.println("BOOK RETURNED ");
            }
        else
        System.out.println("NOT AVAILABLE ");
    }

    public void displayAvailableItems(){
        for(LibraryItem items :libraryitems){
            System.out.println(items);
        }
    }
    
    public void displayBorrowedItems(){
        
        for (LibraryItem item :libraryitems ){
            if(item!= null)
            {
                if(item.getisBorrowed()== true){
                    System.out.println(item.toString() + "Borrowed");
                }
                
            }
           
        }
    }
  
}
