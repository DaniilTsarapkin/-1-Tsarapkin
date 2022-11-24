import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
                 System.out.println("Введите меcяц: ");
                if (scanner.hasNextInt()){
                    int month=scanner.nextInt();
                    System.out.println("Введите день: ");
                    if (scanner.hasNextInt()){
                        int day=scanner.nextInt();
            
            if (day>29&month==2){
                System.out.println("В феврале может быть не больше 29 дней, попробуйте еще раз");
                System.exit(0);
            }
            if (day<1){
                System.out.println("День не может быть отрицательным или нулем, попробуйте еще раз");
                System.exit(0);
            }
            if (day>31){
                System.out.println("В месяце не может быть больше 31 дня, попробуйте еще раз");
                System.exit(0);
            }
                if (month<1){
                System.out.println("Месяц не может быть отрицательным или нулем, попробуйте еще раз");
                System.exit(0); 
            }
            
            if (month>12){
                System.out.println("В году не может быть больше 12 месяцев ");  
            } else if (month==1|month ==2|month == 12){
                System.out.println("Зима");
            }else if  (month==3|month==4|month==5){
                System.out.println("Весна");
                }else if  (month==6|month==7|month==8){
                    System.out.println("Лето");
                        } else {
                            System.out.println("Осень");
                        }
                        }else{
                            System.out.println("День должен быть целым числом, попробуйте еще раз");
                        }}else{
                            System.out.println("Месяц должен быть целым числом, попробуйте еще раз");
                        }
                    }
                }
            }