public class BmiCalculator{
    public static void main(String[] args){
        //calculating bmi 
        //put your real height and weight
        double heightInMeter = 1.70;// it is for example 
        double weightInKilogram = 70;// it is for example 
        double bmi = weightInKilogram / (heightInMeter*2);

        System.out.println("your bmi is: " + bmi);

    }
}