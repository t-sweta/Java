import java.util.*;
public class balancedBrackets {
  public static boolean isbalanced(String st){
    int n = st.length();
    Stack<Character> s = new Stack<>();
    for(int i = 0;i<n;i++){
      char ch = st.charAt(i);
      if(ch=='('){
        s.push('(');
      }
      else{
        if(s.size()==0) return false;
        else if(ch==')'){
          s.pop();
        }
      }
    }
    if(s.size()>0) return false;
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    System.out.println(isbalanced(st));
  }
  
}
