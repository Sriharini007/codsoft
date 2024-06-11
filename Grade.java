import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        int n,t=0,k;
        float l,p;
        System.out.println("Enter the no of subjects");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        k=n*100;
        System.out.println(k);
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the marks of subject"+i);
            a[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            t = t+a[i];
        }
        System.out.println("Total marks: "+t);
        l = (float)t/k;
        System.out.println(l);
        p = l*100;
        System.out.println("Percentage: "+p);
        if(p>=90){
            System.out.println("Grade A");
        }
        else if(p>=80 && p<90){
            System.out.println("Grade B");
        }
        else if(p>=70 && p<80){
            System.out.println("Grade C");
        }
        else if(p>=60 && p<70){
            System.out.println("Grade D");  
        }
        else{
            System.out.println("Fail");
        }
    }
}
