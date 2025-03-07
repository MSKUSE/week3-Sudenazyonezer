public class FindMinimum {
    public static void main(String[] args) {
        int a =Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        if (a<b && a<c) {
            System.out.println(a + " is minimum");
        }else if (b<c && b<a) {
            System.out.println(b + " is minimum");
        }else{
            System.out.println(c+" is minimum");

        }
        int num1 =Integer.parseInt(args[0]);
        int num2= Integer.parseInt(args[1]);
        int num3= Integer.parseInt(args[2]);
        boolean num1_min= num1<num2 && num1<num3;
        boolean num2_min= num2<num1 && num2<num3;
        int min =num1_min ? num1 : num2_min ? num2 : num3;
        System.out.println(min);
        }

    }
}