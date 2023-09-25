package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String text = Integer.toString(number), nstr="";
        char ch;
        for (int i=0; i<text.length(); i++) {
            ch= text.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        int rev = Integer.parseInt(nstr);
        System.out.println(rev);
    }
}
