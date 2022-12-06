public class StringBasic {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "aello world";
        String s3 = new String("hello world");
        String s4 = "HelLo WorLD";

        System.out.println("Lowercase "+s1.toLowerCase());
        System.out.println("Uppercase : "+s1.toUpperCase());
        System.out.println("Equals : "+s1.equals(s2));
        System.out.println("Equals to : "+s1==s3);
        System.out.println("Equals ignore case : "+s1.equalsIgnoreCase(s4));    //true
        System.out.println("Length : "+s1.length());                //11
        String[] s1Array = s1.split("\\s");
        for (int i = 0; i < s1Array.length; i++) {
            System.out.println(s1Array[i]);
        }

        String result = s1Array[0];

        System.out.println(s1.charAt(4));
        System.out.println(s1.compareTo(s2));
        String emptyString = "";
        String nullString = null;

        System.out.println(emptyString.isEmpty());
        System.out.println(emptyString.length()==0);

        String s5 = "hello world";
        System.out.println("Contains : "+s1.contains(s5));
        System.out.println(s5.concat("world"));
        System.out.println(s5);
        System.out.println(s5.indexOf('l'));
        System.out.println(s5.lastIndexOf('l'));
        System.out.println(s5.replace('l','m'));
        String a = "I am in the top of the world";
        System.out.println(a.replaceAll("the","THE"));

        StringBuilder stringBuilder = new StringBuilder(s5);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
        System.out.println("reverse : "+stringBuilder);

        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append('c');
        sb.append("string");
        System.out.println(sb);
        sb.delete(2,6);
        System.out.println(sb);

        String reverse = "";
        for (int i = s5.length()-1; i >=0 ; i--) {
            reverse += s5.charAt(i);
        }
        System.out.println(reverse);

        Long longvalue = 32L;

        int int1 = 90;
        System.out.println(int1);

        int int2 = 010;
        System.out.println(int2);

    }
}
