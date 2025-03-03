import java.util.*;
public class FirstAndLastElement{
    public static void solve(String str,char ele,int i,ArrayList<Integer> ans){
        if(i>=str.length()){
            return;
        }
        if(str.charAt(i)==ele){
            ans.add(i);
        }
        solve(str,ele,i+1,ans);
    }
    public static void main(String[] args){
        ArrayList<Integer> ans = new ArrayList<>();
        String str = "dsvjhbakjahdvsb";
        char ele = 'j';
        solve(str,ele,0,ans);
        if(ans.size()>=2){
            System.out.println(ans.get(0)+","+ans.get(ans.size()-1));
        }
        else{
            System.out.println(ans.get(0)+","+ans.get(0));
        }
    
    }
}