package DSA_Leetcode_POD;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class FindWinningPlayer {

    public static int findWinnigPlayers(int[] skills,int k){
        int countOfPlayer=skills.length;
        Deque<Integer> deque=new ArrayDeque<>();
        for(int i=0;i<countOfPlayer;i++){
            deque.addLast(i);
        }
        int maxSkillIdx=0;
        for(int i=0;i<countOfPlayer;i++){
            if(skills[i]>skills[maxSkillIdx]){
                maxSkillIdx=i;
            }
        }
        int currentWinner = deque.pollFirst();
        int currentWinCount = 0;

        while (currentWinCount < k) {
            int nextPlayer = deque.pollFirst();

            if (skills[currentWinner] > skills[nextPlayer]) {
                currentWinCount++;
                deque.addLast(nextPlayer);
            } else {
                currentWinCount = 1;
                deque.addLast(currentWinner);
                currentWinner = nextPlayer;
            }

            if (currentWinner == maxSkillIdx) {
                return currentWinner;
            }
        }

        return currentWinner;







//        int p1,p2,winner,looser;
//        while(true){
//            p1=deque.pollFirst();
//            p2=deque.pollFirst();
//            if(skill[p1]>skill[p2]){
//                winner=p1;
//                looser=p2;
//            }
//            else{
//                winner=p2;
//                looser=p1;
//            }
//            consecutiveWin[winner]++;
//            if(consecutiveWin[winner]==k){
//                return winner;
//            }
//            deque.addFirst(winner);
//            deque.addLast(looser);
        //}

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfPlayer=sc.nextInt();
        int [] skill=new int[numberOfPlayer];
        for(int i=0;i<numberOfPlayer;i++){
            skill[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println("The player who is going to win the game is : "+ findWinnigPlayers(skill,k) );
    }
}
