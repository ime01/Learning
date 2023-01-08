package main.kotlin.codility;

import java.util.HashSet;

public class PlayGround {



   /* public  int solution(int x, int y, int D){
        int distance = y-x;
        int jumps = (int) Math.ceil(distance/(double)D);
    }
*/

    public int missingElement(int[] A){

        HashSet<Integer> list = new HashSet<>();

        for (int i=1; i<=A.length+1; i++){

            list.add(i);
        }

        for (int i =0; i<A.length; i++){

            list.remove((Integer) A[i]);
        }

        return list.iterator().next();
    }
}
