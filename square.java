import java.util.Scanner; //import the scanner class
class square{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); //Creating a object of Scanner class
        System.out.print("Enter The Number : ");
        int value = read.nextInt(); //Read the value from keybord using Scanner object
        if(value>=1 && value<=5) //Checking the lower and upper limit
        {
            int square = value * value ; 
            System.out.println("The square of the given Number is :"+square);
        }
        else{
            System.out.println("The Input is out of the range");
        }
    }
}