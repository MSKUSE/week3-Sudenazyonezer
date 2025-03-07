public class Findmaximum {
    public static void main(String[] args) {


        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c= Integer.parseInt(args[2]);
        if (a>b && a>c) {
            System.out.println(a + " is maximum");
        }else if (b>c && b>a) {
            System.out.println(b + " is maximum");
        }else{
            System.out.println(c+" is maximum");
        }

        int num1=Integer.parseInt(args[0]);
        int num2 =Integer.parseInt(args[1]);
        boolean condition =num1>num2;
        int max =condition ? num1:num2;
        System.out.println(max);
    }



}
