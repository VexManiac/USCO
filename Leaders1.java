import java.util.*;

public class Leaders {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        char[] breeds = new char[N];
        breeds = sc.nextLine().toCharArray();
        String[] lengths = (sc.nextLine().split(" "));
        int[] lengthsi = new int[N];
        for(int i = 0; i<N; i++){
            lengthsi[i] = Integer.parseInt(lengths[i]) - 1;
        }
        int firstbreed2 = -1;
        char breed1 = 'e';
        int lastbreed1 = 0;
        int ans = 0;
        //find last instance of breed 2
        breed1 = breeds[0];
        for(int i = 0; i<N; i++){
            if(firstbreed2 == -1 && breeds[i] != breed1)
                firstbreed2 = i ;
            if(breeds[i] == breed1)
                lastbreed1 = i;
        }
        for(int i = 0; i<firstbreed2; i++){
            if(lengthsi[i] >= firstbreed2 || lengthsi[i] > lastbreed1) {
                ans++;
            }
        }
        System.out.println(ans);

    }
}