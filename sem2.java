// алгоритм сортировки пузырьком числового массива, 
//результат после каждой итерации запишите в лог-файл.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class sem2 {
   

    public static void main(String[] args) throws SecurityException, IOException {
        int[] mas = {15, 2, 8, 16, 7};
        boolean isSorted = false;
        int buf;
        while (!isSorted)  {
            isSorted = true;
            for (int i = 0; i<mas.length-1; i++)   {
                if(mas[i] > mas[i+1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
        
   
        Logger logger = Logger.getLogger(sem2.class.getName());
        FileHandler fh = new FileHandler("log_bubble.txt");
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat); 
        logger.info("bubble sort algorithm");
    
    }
}    
    /*
// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
public static void main(String[] args) {
    Map<String, String> obj = new HashMap<String,String>();
    obj.put("name","Ivanov");
    obj.put("country","Russia");
    obj.put("city","Moscow");
    obj.put("age",null);
    System.out.println(getQuery(obj));
}
    public static String getQuery(Map<String, String> object) {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : object.entrySet()) {
            if (pair.getValue() != null) {
                s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }
  

    // task *** строку [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"} 
    // переделать в -> Студент Иванов получил 5 по предмету Математика
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("name Ivanov mark 5 
                                              subject Mathematics");

    // print string
    System.out.println("String = " + str.toString());

    // replace Character from index 15 to 16 by " not "
    StringBuilder strReturn = str.replace(0, 4, " student ");
    

    // print string
    System.out.println("After Replace() String = " + strReturn.toString());
    }



    public static void main(String[] args) {
        String master = "name Иванов oценка предмет Математика";
        String target = "name";
        String replacemeString = "student";

        int startIndex = master.indexOf(target);
        int stopIndex = startIndex + target.length();

        StringBuilder builder = new StringBuilder(master);
    }





    public static void main(String[] args) {
        try {
            File myObj = new File("Students.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }  

    public static void modifyFile(String filePath, String oldString, String newString) {
        File fileToBeModified = new File(filePath);
        StringBuilder oldContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileToBeModified))) {
            String line = reader.readLine();
            while (line != null) {
                oldContent.append(line).append(System.lineSeparator());
                line = reader.readLine();
            }
            String content = oldContent.toString();
            String newContent = content.replaceAll(oldString, newString);
            try (FileWriter writer = new FileWriter(Students.txt)) {
                writer.write(newContent);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }  
}    
*/


