class string {
    public static void main (String[] args) {

        String str= "surojit", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("surojit");

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);
    }
}


take a number from a user. convert a number from integer and vice versa.