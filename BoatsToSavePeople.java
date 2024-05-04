public class BoatsToSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);
        int i=0,j=people.length-1;
        while(i<=j){
            if((people[j]+people[i])<=limit){
                i++;
            }
            j--;
            boats++;
        }
        return boats;
    }
    public static void main(String[] args){
        int[] people={1,2};
        int limit=3;
        System.out.println(numRescueBoats(people, limit));
    }
}