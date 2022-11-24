import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Введите ваш год рождения: ");
                if (scanner.hasNextInt()){
                    int year=scanner.nextInt();
                    System.out.println("Введите ваш месяц рождения: ");
                    if (scanner.hasNextInt()){
                        int month=scanner.nextInt();
                        System.out.println("Введите ваш день рождения: ");
                        if (scanner.hasNextInt()){
                            int day=scanner.nextInt();
            int tekday=25;
            int tekmonth=11;
            int tekyear=2022;
            
            if (day<1){
                System.out.println("День не может быть отрицательным или нулем, попробуйте еще раз");
                System.exit(0);
            }
            if (year<1){
                System.out.println("Год не может быть отрицательным или нулем, попробуйте еще раз");
                System.exit(0);
            }
            if (month<1){
                System.out.println("Месяц не может быть отрицательным или нулем, попробуйте еще раз");
                System.exit(0);
            }
            if (day>31){
                System.out.println("В месяце не может быть более 31 дня, попробуйте еще раз");
                System.exit(0);
            }
            if (month>12){
                System.out.println("В году не может быть больше 12 месяцев, попробуйте еще раз");
                System.exit(0);
            }
            if (year>2022){
                System.out.println("Ваш год рождения не может быть больше 2022, попробуйте еще раз");
                System.exit(0);
            }
            int dayvozr=tekday-day;
            int monthvozr=tekmonth-month;
            int yearvozr=tekyear-year;
            
            System.out.println(yearvozr + " лет, " + monthvozr + " месяцев и " + dayvozr + " дней ");
        }else{
            System.out.println("День должен быть целым числом, попробуйте еще раз");
        }}else{
            System.out.println("Месяц должен быть целым числом, попробуйте еще раз");
        }}else{
            System.out.println("Год должен быть целым числом, попробуйте еще раз");
        }
    }
}
    }