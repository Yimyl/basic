package Regular;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.regex.MatchResult;


public class Demo01 {
    public static void main(String[] args) {
        String s = "{\"getA\",\"setA\",\"setB\"}}";
//        String s2 = "getA";
//        String re2 = "\w+";
//        System.out.println(s);
        String re = "\\{(\"\\w+\",)(\"\\w+\",)\"(\\w+)\"";
        judge(re,s);
        Matcher m = match(re, s);
        if(m.find()){
            System.out.println(m.group());
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
            //System.out.println(m.group(4));
        }
//        String re2 = "(\\w+)\\1\\1r\\(\\)";
//        System.out.println(num[0]);
//        System.out.println(num2[0]);
//        System.out.println(s2);
        //judge(re2,s2);
//        String re3 = "0|100|([1-9]\\d?)";
//        judge(re3,"1005");
//        Matcher m = match(re2, s2);
//        m.find();
//        System.out.println(m.group(0));
//        System.out.println(m.group(1));
        //System.out.println(m.group(2));
    }
    public static int method(int i){
        try{
            return i;
        }catch(Exception e){

        }finally{
            i=5;return i;
        }

    }
    public static Matcher match(String reg, String s){
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(s);
//        matcher.
        return matcher;

    }
    public static void judge(String reg, String s){
        //System.out.println(s);
        boolean bo = Pattern.matches(reg, s);
        System.out.println(bo);
    }

}
