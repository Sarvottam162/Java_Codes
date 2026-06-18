
// appnnacollege -> apncoleg

public class removeDuplicateFromSrtring {
    public static void main(String[] args) {
        String s = "appnnacollege";
        StringBuilder sb = new StringBuilder();

        //boolean arr to track which letter already came;
        boolean[] track = new boolean[26];

        StringBuilder res = duplicate(s,sb,0, track);
        System.out.println(res);
    }
    public static StringBuilder duplicate(String s , StringBuilder sb,int i ,boolean[] track){
        
        if(i == s.length()) return sb;

        int j = s.charAt(i) - 'a';
        if(!track[j]){
             track[j] = true;
             return duplicate(s ,sb.append(s.charAt(i)),i + 1 , track);
            }
        else return duplicate(s ,sb,i + 1 ,track);
    }
}
