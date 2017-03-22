class Number11 {
    public static void main(String args[])
        throws java.io.IOException {

        int i;

        System.out.println("Enter the letters");
        for(i = 0; (char) System.in.read()  !=  'q'; i++)
            System.out.println("Pass #" + i);
    }
}