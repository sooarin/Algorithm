package Greedy;

import java.util.Arrays;

public class crackdown_camera {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (a,b) -> Integer.compare(a[1], b[1]));
        int cnt = 0;

        int min = Integer.MIN_VALUE;
        for(int[] route : routes) {
            if(min < route[0]) {
                min = route[1];
                ++cnt;
            }
        }
        return cnt;
    }
}
