public class swapNumber {
    public static void main(String[]args){
        int a=23;
        int b=40;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping the number : "+a+" "+b);
    }
}
