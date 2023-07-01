public class Module1 {


    //Problem 1 : Change the case of the character entered. (using operators only).
    public void characterCase(){
        char char1 = 'A', char2 ='z';
        System.out.println("After case switch we get : "+(char)((char1 >= 'a' && char1 <= 'z') ? (char1 - 'a' + 'A'): (char1 - 'A' + 'a')));
        System.out.println("After case switch we get : "+(char)((char2 >= 'a' && char2 <= 'z') ? (char2 - 'a' + 'A'): (char2 - 'A' + 'a')));
    }

    // Problem 2 : Write a program to convert temperature given in Celsius (user input) to Fahrenheit. (0°C × 9/5) + 32
    public void celsiusToFahrenheit(float celsius){
        System.out.printf( "Temp in Fahrenheit is : %.2f (%.2f celsius)", (celsius * (9/5))+32,celsius);
    }

    /*Problem 3 : Write a program to find the area of a triangle. Take the length of sides as user input.
     (Area printed should be rounded off to two decimal places).
     Square root of√s(s - a)(s - b)(s - c) where s is half the perimeter, or (a + b + c)/2.*/
    public void triangleArea(int a, int b, int c){
        int s = (a+b+c)/2;
        double area = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        System.out.println("Area of triangle with sides " +a+","+b+","+c+" = " + area);
    }


    //Problem 4 : Take user input amount of money and consider an infinite supply of denominations 1, 20, 50 and 100.
    // What is the minimum number of denominations to make the change?

    public void findChange(int money){
        int counter =0;
        while (money > 0) {
        if(money>=100){
            money=money-100;
            counter++;
        } else if (money>=50) {
            money=money-50;
            counter++;
        } else if (money>=20) {
            money=money-20;
            counter++;
        }else {
            money=money-1;
            counter++;
        }
        }
        System.out.println("Minimum number of denominations to make the change : " + counter);
        }
}
