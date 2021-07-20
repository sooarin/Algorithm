package Greedy;

import java.util.Arrays;

public class lifeboat {
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int index = people.length - 1;
        for(int i = 0; i <= index; i++, answer++)
            while(index > i && people[i] + people[index--] > limit)
                answer++;
        return answer;
    }
}
