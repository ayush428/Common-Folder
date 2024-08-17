import java.util.*;
public class Pronunciation {
    void getPron(int a){
        if (a < 10){
            System.out.println(Num(a));
        }
        else if (a < 20){
            switch (a){
                case 10: System.out.println("ten");
                break;
                case 11: System.out.println("eleven");
                break;
                case 12: System.out.println("twelve");
                break;
                case 13: System.out.println("thirteen");
                break;
                case 14: System.out.println("fourteen");
                break;
                case 15: System.out.println("fifteen");
                break;
                case 16: System.out.println("sixteen");
                break;
                case 17: System.out.println("seventeen");
                break;
                case 18: System.out.println("eighteen");
                break;
                case 19: System.out.println("nineteen");
            }           
        }
        else if (a<= 99){
            int d = a / 10;
            System.out.println(getPrefix(d) + "-" + Num(a%10));
        }
    }
    String getPrefix(int a){
        String ans = "";
        switch (a){
            case 2: ans = "twenty";
            break;
            case 3: ans = "thirty";
            break;
            case 4: ans = "forty";
            break;
            case 5: ans = "fifty";
            break;
            case 6: ans = "sixty";
            break;
            case 7: ans = "seventy";
            break;
            case 8: ans = "eighty";
            break;
            case 9: ans = "ninety";
            break;
        }
        return ans;
    }
    String Num(int a){
        String p = "";
        switch (a){
            case 1:p = "one";
            break;
            case 2: p = "two";
            break;
            case 3: p = "three";
            break;
            case 4: p = "four";
            break;
            case 5:p = "five";
            break;
            case 6: p = "six";
            break;
            case 7: p = "seven";
            break;
            case 8: p = "eight";
            break;
            case 9: p = "nine";
        }
        return p;
    }
    public static void main(String[] args) {
        
    }  
}