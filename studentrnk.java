package Array_case;

public class studentrnk {
    public static void main(String[] args) {
        int [] scores = {78,90,65,90,85,72,95,85};
         
        for (int i = 0; i < scores.length-1; i++) {
            for (int j = i+1 ; j < scores.length;j++) {
                if (scores[i]< scores [j]) {
                    int temp = scores [i];
                    scores[i]=scores[j];
                    scores[j]=temp;
                }
            }
            
        }
        System.out.println("Sorted scores:");
        for(int score:scores) {
            System.out.print(score+"");
        }
        System.out.println("\nTop three distinct scores:");
        int count =0;
        int previous =-1;

        for (int score : scores){
            if (score != previous) {
                System.out.println(score);
                previous=score;
                count++;
    
            }
            if (count==3){
            break;
            }
        }
        System.out.println("Student ranks");
        int rank=0;
        previous=-1;

        for (int score :scores) {
            if (score != previous) {
                rank++;
                previous = score;
                System.out.println(score +"->Rank"+ rank);
            }
        }
    }
    
}
