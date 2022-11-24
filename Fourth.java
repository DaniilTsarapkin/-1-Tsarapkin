import java.util.Scanner;
public class Fourth {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    
    int countOfPointsInCircle=0;

    System.out.println("Введите количетсво точек: ");
        if (scanner.hasNextInt()){
        int countOfPoints=scanner.nextInt();
            if (countOfPoints>0){
        System.out.println("Введите радиус окружности в формате числа с плавающей точкой (через запятую): ");
        if (scanner.hasNextDouble()){
            Double radius=scanner.nextDouble();
            if (radius>0){
        while (countOfPoints!=0){
            System.out.println("Введите значение х в виде числа с плавающей точкой (через запятую): ");
            if (scanner.hasNextDouble()){
            Double x = scanner.nextDouble();
            System.out.println("Введите значение y в виде числа с плавающей точкой (через запятую): ");
            if (scanner.hasNextDouble()){
            Double y = scanner.nextDouble();
            if ((x*x)+(y*y)<=(radius*radius));
            countOfPoints--;
            countOfPointsInCircle++;

        System.out.println("Количетсво точек: "+ countOfPointsInCircle);
        scanner.close();
    }else{
        System.out.println("Значение y должно быть числом с плавающей точкой (через запятую), попробуйте еще раз");
        System.exit(0);
    }}else{
        System.out.println("Значение x должно быть числом с плавающей точкой (через запятую), попробуйте еще раз");
        System.exit(0);
    }}}else{
        System.out.println("Радиус должен быть больше нуля, попробуйте еще раз");
    }}else{
        System.out.println("Радиус должно быть числом с плавающей точкой (через запятую), попробуйте еще раз");
    }}else{
        System.out.println("Количество точек должно быть положительным числом, попробуйте еще раз");
    }}else{
        System.out.println("Количетсво точек должно быть целым числом, попробуйте еще раз");
    }}}