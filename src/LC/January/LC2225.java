package LC.January;

import java.util.*;

// 15th Jan
public class LC2225 {
    public List<List<Integer>> findWinners(int[][] matches) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> winners = new ArrayList<>();
        List<Integer> losers = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();

        for(int[] match: matches){
            map.put(match[0], map.getOrDefault(match[0],0));
            map.put(match[1], map.getOrDefault(match[1],0)+1);
        }
        
        for(int key: map.keySet()){
            if(map.get(key) == 0){
                winners.add(key);
            }
            else if(map.get(key) == 1){
                losers.add(key);
            }
        }

        Collections.sort(winners);
        Collections.sort(losers);

        res.add(winners);
        res.add(losers);

        return res;
    }
}
