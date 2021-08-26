package codetop;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String>  generateParenthesis(int n){
            ArrayList<String> as = new ArrayList<String>();
            backtrack(as,new StringBuffer(),0,0,n);
            return as;
        }
    public void backtrack(ArrayList<String> as,StringBuffer sb,int open,int close,int n){
            //as只是用来装一下结果集
        //open = n && close ==nu,前后都能匹配上
            if(open==n && close==open){
                as.add(sb.toString());
                return;
            }
            //不满足条件时，往里面添
         //添左边的括号
        //注意这里没有for循环
            if(open<n){
                //现添加
                sb.append("(");
                backtrack(as,sb,open+1,close,n);
                sb.deleteCharAt(sb.length()-1);
            }
            //添右边的括号
            //必须用if去判断
            if(close<open){
                sb.append(")");
                backtrack(as,sb,open,close+1,n);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }

