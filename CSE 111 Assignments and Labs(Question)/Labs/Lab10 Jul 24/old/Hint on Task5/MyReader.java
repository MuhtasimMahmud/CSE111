import java.util.*;
public class MyReader{
    //modify following line so that this method can throw Exception
    int readInteger() throws EitaIntegerNoiException{
        Scanner k = new Scanner(System.in);
        
        int answer;
       
        String s;
        s = k.next();
        if (s.contains(".")){
          throw new EitaIntegerNoiException();
         
        }else{    
          return (Integer.parseInt(s));
        }
        
    }
}
