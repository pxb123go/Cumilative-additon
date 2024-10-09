import java.util.Scanner;

class proggram{
    public static void main(String[] args) {
        System.out.println("Type any number");
    Scanner sc=new Scanner(System.in);
     int i1=sc.nextInt();
     int sum=0;
     for(int i=1;i<=i1;i++){
        sum=sum+i;
     }
     System.out.println("the sum is " + sum);
    }
}