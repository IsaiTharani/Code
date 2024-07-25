import java.util.*;
import java.util.InputMismatchException;
public class utilities {
    public static Object getInput(Class<?> type,Scanner scan){
        Object obj=null;
        try {
            switch(type.getSimpleName()){
            case "String":
                obj=scan.nextLine();
                break;
            case "Integer":
                obj=scan.nextInt();
                scan.nextLine();
                break;
            case "Double":
                obj=scan.nextDouble();
                scan.nextLine();
            default:
                break;            
            }
            
        } catch (InputMismatchException e) {
            scan.nextLine();
            obj= getInput(type,scan);
            // TODO: handle exception
        }
        return obj;  
    } 
    public boolean checkString(String input){
        if(input.isEmpty() || input.isBlank()){
            return false;
        }
        return true;
    } 
}
