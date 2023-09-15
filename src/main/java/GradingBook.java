import java.util.HashMap;
import java.util.Map;

public class GradingBook {
    Map<String,Integer> map = new HashMap<String, Integer>();
    public Integer addGrade(int grade, String name){
        return map.put(name,grade);
    }



    public char returnGrade(char grade){
        return 'a';
    }

}
