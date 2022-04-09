package kg.geekteck.tests;

public class CustomMath {

    public String add(int a, int b){
        return String.valueOf(a+b);
    }

    public String sub(int a, int b){
        return String.valueOf(a-b);
    }

    public String multiply(int a, int b){
        return String.valueOf(a*b);
    }

    public String division(int a, int b){
        if (b==0){
            return "Нельзя делить на ноль";
        }
        return String.valueOf(a/b);
    }
}
