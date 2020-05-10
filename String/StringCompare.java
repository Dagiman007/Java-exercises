public class StringCompare{
    public static void main(String[] args) {
        String s1 = new String("Hello"); // s1 is a copy of "hello"
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        System.out.printf(
              "S1 = %s\nS2 = %s\nS3 = %s\nS4 = %s\n\n", s1, s2, s3, s4);

        // test for equality
        if(s1.equals("hello")){
            System.out.println("s1 equals \"hello\"");
        }else{
            System.out.println("s1 does not equal \"hello\"");
        }

        // test for equality with ==
        if(s1 == "hello"){  // false they are not the same object
            System.out.println("s1 is the same object as \"hello\"");
        }else{
            System.out.println("s1 is not the same object as \"hello\"");
        }

        // test for equality (ignore case)
        if(s3.equalsIgnoreCase(s4)){
            System.out.printf("%s equals %s with case ignored\n", s3, s4);
        }else{
            System.out.println("s3 does not equal s4");
        }

        // test compareTo
        System.out.printf("\ns1.compareTo(s2) is %d", s1.compareTo(s2));
        System.out.printf("\ns2.compareTo(s2) is %d", s2.compareTo(s1));
        System.out.printf("\ns1.compareTo(s1) is %d", s1.compareTo(s1));
        System.out.printf("\ns3.compareTo(s4) is %d", s3.compareTo(s4));
        System.out.printf("\ns4.compareTo(s3) is %d", s4.compareTo(s3));

        // test regionMatches (case sensitive)
        if(s3.regionMatches(0, s4, 0, 5))
            System.out.println("First 5 characters of s3 and s4 match");
        else
            System.out.println("First 5 characters of s3 and s4 don't match");

        // test regionMatches (ignore case)
        if(s3.regionMatches(true, 0, s4, 0, 5))
            System.out.println("First 5 characters of s3 and s4 match with case ignored");
        else
            System.out.println("First 5 characters of s3 and s4 don't match");
    }
}
