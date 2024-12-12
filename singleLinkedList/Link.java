package singleLinkedList;

public class Link {
    public String bookName;
    public int millionSold;
    public Link next;

    public Link(String bookName,int millionSold){
        this.bookName=bookName;
        this.millionSold=millionSold;
    }
    public void display(){
        System.out.println(bookName+":"+millionSold+",000,000");
    }
    public String toString(){
        return bookName;
    }
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.insertToHead("Don Quixote", 500);
        linkedList.insertToHead("The Lord of Rings", 150);
        linkedList.insertToHead("Harry Potter",700);
        linkedList.insertToHead("1984", 200);

        linkedList.display();;
        
        linkedList.removeFromHead();
        linkedList.display();

        System.out.println(linkedList.find("The Lord of Rings"));

        linkedList.display();
    }
}
