import java.util.Scanner;

public class Third{ 
public static void main(String[] args) { 
try (Scanner scanner = new Scanner(System.in)) {
        
    System.out.println("Введите число, которое вы хотите возвести в степень: ");
    if (scanner.hasNextInt()){
        int x=scanner.nextInt();
        System.out.println("Введите степень (от -15 до 15), в которую вы хотите возвести число: ");
        if (scanner.hasNextInt()){
            int n=scanner.nextInt();

        if (n==0){
            System.out.println("Ответ: 1"); 
         }else if (n==1){
            int result=x;
            System.out.println("Ответ: " + result);
        }else if (n==-1){
            double result = 1.0/x;
            System.out.println("Ответ: " + result);
        }else if (n>1){
            int result=x;
            n-=1;
            while (n!=0){
                result=result*x;
                n-=1;
            }
                System.out.println("Ответ: " + result);
        }else if (n<-1){
            Double result= 1.0/x;
            n+=1;
            while (n!=0){
                result=result/x;
                n+=1;
            }
                System.out.println("Ответ: " + result);
        }
    }else{
        System.out.println("Степень должна быть целым числом, попробуйте еще раз");
    }}else{
        System.out.println("Число должно быть целым, попробуйте еще раз");
    }
}
}
}

