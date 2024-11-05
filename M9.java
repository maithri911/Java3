public class M9 {
    public static void main(String[] args){
        String s1="Chandrashekhar rao Kuthyar";
        int len1=s1.length();
        String s2="kashish ";
        for(int i=0;i<len1;i++){
            s2=s2+s1.substring(len1-(i*1),len1-i);
            
        }
        System.out.println(s2);
    }
    
}
