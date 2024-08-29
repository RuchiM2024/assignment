package Utility;

public class FirstNonRepeatingChar {
    private String str;
    public FirstNonRepeatingChar(String inputStr)
    {
        this.str=inputStr;
    }
    public Character GetFirstNonRepeatingCharacter(String input)
    {
        Character c='\0';
        //String input=this.str;

        for(Character e:input.toCharArray())
        {
            if(input.indexOf(e)==input.lastIndexOf(e))
            {
                c=e;
                break;
            }
        }
        return c;
    }
}
