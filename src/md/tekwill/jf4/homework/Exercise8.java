package md.tekwill.jf4.homework;

public class Exercise8 {

    /*
     * Write a Java program to print a face. Go to the editor
     * Expected Output
     *
     *  +"""""+
     * [| o o |]
     *  |  ^  |
     *  | '-' |
     *  +-----+
     */

    public static void main(String[] args) {
        char chars1[] = {' ','+','"','"','"','"','"','+'};
        String A = new String(chars1);
        char chars2[] = {'[','|',' ','o',' ','o',' ','|',']'};
        String B = new String(chars2);
        char chars3[] = {' ','|',' ',' ','^',' ',' ','|'};
        String C = new String(chars3);
        char chars4[] = {' ','|',' ','`','-','`',' ','|'};
        String D = new String(chars4);
        char chars5[] = {' ','+','-','-','-','-','-','+'};
        String E = new String(chars5);


        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
    }
}