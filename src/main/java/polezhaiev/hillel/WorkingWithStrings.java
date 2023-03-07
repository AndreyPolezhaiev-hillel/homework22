package polezhaiev.hillel;

public class WorkingWithStrings {
    public String reverseString(String string){
        if(string == null || string.length() == 0){
            return "";
        }
        return new StringBuffer(string).reverse().toString();
    }

    public char getFirstLetter(String string){
        if(string == null || string.length() == 0){
            return 0;
        }
        return string.charAt(0);
    }

    public char getLastLetter(String string){
        if(string == null || string.length() == 0){
            return 0;
        }
        return string.charAt(string.length() - 1);
    }
}
