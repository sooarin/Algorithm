package DFS_BFS;

import java.util.ArrayList;
import java.util.Collections;

class travel_route {
    ArrayList<String> list;
    boolean[] visited;
    
    public String[] solution(String[][] tickets) {
        list = new ArrayList<>();
        visited = new boolean[tickets.length];

        backtracking("ICN", 0, "ICN", tickets);
        Collections.sort(list);
        String[] result = list.get(0).split(" ");
        return result;
    }

    public void backtracking(String s, int idx, String result, String[][] tickets) {
        if(idx == tickets.length) {
            list.add(result);
            return;
        }
        for(int i = 0; i < tickets.length; i++) {
            if(visited[i] == false && tickets[i][0].equals(s)) {
                visited[i] = true;
                backtracking(tickets[i][1], idx + 1, result + " " + tickets[i][1], tickets);
                visited[i] = false;
            }
        }
    }
}
