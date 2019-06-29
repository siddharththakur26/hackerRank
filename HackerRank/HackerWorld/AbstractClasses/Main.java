package HackerRank.HackerWorld.AbstractClasses;

abstract public class Main {

        String title;
        String author;

        Main(String title, String author) {
            this.title = title;
            this.author = author;
        }
        abstract void display();
    }
    abstract class Mybook extends Main{

        int price;
        Mybook(String title, String author,int price) {
            super(title, author);
            this.price=price;
        }
        void display(){
            System.out.println("Title: "+this.title+"\n"+"Author: "+this.author+"\n"+"price: "+this.price);
        }

    }
