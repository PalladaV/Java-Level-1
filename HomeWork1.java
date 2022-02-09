public class HomeWork1 {
    public static void main(String[] args) {
       printThreeWords();
    }
    
    public static void printThreeWords() {
       System.out.println ("Orange");
       System.out.println ("Banana");
       System.out.println ("Apple");
       checkSumSign();    
    }
    
    public static void checkSumSign() {
        int a = -6;
        int b = 5;
        System.out.println(a + b >= 0? "The amount is positive" : "The sum is negative");  
        printColor();
    }
    
    public static void printColor() {
        int value = 54;
        
        if (value <= 0) {
        System.out.println("Red");
        } else if (value > 0 && value < 100) {
        System.out.println("Yellow");    
        } else if (value > 100) {
        System.out.println("Green");
        }
        compareNumbers();
    }
    
    public static void compareNumbers() {
        int a = 8;
        int b = 12;
        System.out.println(a >= b? "a >= b" : "a < b");
    }
}