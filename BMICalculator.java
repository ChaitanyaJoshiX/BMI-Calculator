import java.util.*;
class BMICalculator
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, Welcome to the BMI calculator program.!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter your height in centimetres (cm) : ");
        float height = sc.nextFloat();
        height = height/100;
        System.out.println("Enter your weight in kilograms (kg) : ");
        float weight = sc.nextFloat();
        System.out.println("Thank you!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        float bmi = weight/(height*height);
        System.out.println("\t\tBMI TABLE");
        System.out.println("Lesser than 18.4 :\tUnderweight");
        System.out.println("Between 18.4 and 25.0 :\tNormal Weight");
        System.out.println("Between 25.0 and 30.0 :\tOverweight");
        System.out.println("Greater than 30.0 :\tObese");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Your BMI = "+bmi);
        //Comparing BMI to table 
        if (bmi <= 18.4)
        {
            System.out.println("You are underweight.");
        }
        else if(bmi > 18.4 && bmi < 25.0)
        {
            System.out.println("You have a normal weight.");
        }
        else if(bmi > 25.0 && bmi < 30.0)
        {
            System.out.println("You are overweight.");
        }
        else if(bmi > 30.0)
        {
            System.out.println("You are obese.");
        }
        else
        {
            System.out.println("Invalid Input");
        }
        System.out.println("Thank you for running my program!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}