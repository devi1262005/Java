import java.util.*;
abstract class Password{
    String str="";
    Random rand = new Random();
    abstract void display();
    void password(String s){
        String st;
        st = s.substring(0,1).toUpperCase();
        st+=s.substring(1,s.length()).toLowerCase();
        
        for(int i = 0;i<s.length();i++){
            if(i%2!=0){
                str+="*";
            }
            else{
                str+=st.charAt(i);
            }
        }
        int random = rand.nextInt(1000);
        str+=random;
        
    }
}
class Generator extends Password{
    void display(){
        System.out.println("Password: "+str);
    }
}
public class PasswordGenerator{
    public static void main(String[] args){
        Generator g = new Generator();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s = scn.nextLine();
        g.password(s);
        g.display();
    }
}
