package Medium;

import java.util.ArrayList;
import java.util.List;

public class Sequential_Digits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList();
        for (int i = 1; i <= 9; i++){
            int num = i;
            int nextDigit = i + 1;
            while (num <= high && nextDigit <= 9){
                num = num * 10 + nextDigit;
                if (low <= num && num <= high){
                    ans.add(num);
                }
                ++nextDigit;
            }
        }
        ans.sort(null);
        return ans;
    }
}
