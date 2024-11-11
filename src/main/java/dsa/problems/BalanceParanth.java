package dsa.problems;

import java.util.Stack;

public class BalanceParanth {

        public boolean CheckBalancedParanthesis(String input)
        {
            Stack<Character> stk=new Stack<>();
            for(int i=0;i<input.length();i++)
            {
                if(input.charAt(i)=='(' || input.charAt(i)=='[' || input.charAt(i)=='{')
                {
                    stk.push(input.charAt(i));
                }else
                {
                    if(!stk.isEmpty() && ((stk.peek()=='(' && input.charAt(i)==')') ||
                            (stk.peek()=='{' && input.charAt(i)=='}') ||
                            (stk.peek()=='[' && input.charAt(i)==']')))
                    {
                        stk.pop();
                    }
                }
            }
            return  stk.empty();


        }
    }