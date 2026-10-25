package Array_case;
import java.util.Arrays;

public class Remove {
  public static void main(String[] args) {
      int [] ids ={101,102,101,103,102,104,105,103};
      int [] unique = new int [ids.length];
      int size =0;

      for (int i =0 ;i< ids.length;i++) {
        boolean found = false;
        for (int j =0 ;j< size;j++){
            if (ids [i]==unique[j]){
                found = true ;
                break;
            }
        }
        if (!found) {
            unique[size] = ids [i];
            size ++;
        } else {
            System.out.println("Duplicate ID:"+ ids [i]);

        }
      }
      System.out.println("Unique IDs:"+ Arrays .toString(Arrays. copyOf(unique, size)));
      System.out.println(" Unique participants :" + size);

  }  
}
