public class MagicNum { 
    public static void main(String args[])
    {
        int myNumber = 7; //numero orignial
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;
        System.out.println (magicNumber);
    }
}
