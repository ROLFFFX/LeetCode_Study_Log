package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_Absolute_Difference {
    public List<List<Integer>> minimumAbsDifference_optimized(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList();
        int min = Integer.MAX_VALUE;;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (diff == min) {
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return res;
    }
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList();
        int diff = Integer.MAX_VALUE;;
        for (int i = 0; i < arr.length - 1; i++){
            diff = Math.min(diff, Math.abs(arr[i + 1] - arr[i]));
        }
        for (int i = 0; i < arr.length - 1; i++){
            if (Math.abs(arr[i + 1] - arr[i]) != diff) continue;
            List<Integer> pair = new ArrayList();
            pair.add(arr[i]);
            pair.add(arr[i + 1]);
            ans.add(pair);
        }
        return ans;
    }
}
