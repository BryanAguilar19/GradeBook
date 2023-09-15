import Model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradingBook {
    Map<String,Integer> map = new HashMap<String, Integer>();

    List<String> student = new ArrayList<String>();
    public Integer addGrade(int grade, String name){
        return map.put(name,grade);
    }

    public void assignGrade(Student student, int score){

    }

}
