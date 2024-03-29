package Easy;

public class RomanToInteger_5_13 {
    public static void main(String[] args) {
////        I             1
////        V             5
////        X             10
////        L             50
////        C             100
////        D             500
////        M             1000
        String s = "DCXXI";
        System.out.println(romanToInt(s));
    }

    public int romanToInt_optimized(String s) {
        int ans = 0;
        int prev = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int curr = getValue(s.charAt(i));
            if (curr > prev) {
                ans -= prev;
            } else {
                ans += prev;
            }
            prev = curr;
        }
        ans += prev;
        return ans;
    }

    public int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    /** failed attempt **/
    public static int romanToInt(String s) {
        int return_val = 0;
        int str_len = s.length();
        boolean flag = false;
        for (int i = 0; i < str_len - 1; i++) {
            if (s.charAt(i) == 'V') {
                return_val += 5;
            } else if (s.charAt(i) == 'L') {
                return_val += 50;
            } else if (s.charAt(i) == 'D') {
                return_val += 500;
            } else if (s.charAt(i) == 'M') {
                return_val += 1000;
            } else if (s.charAt(i) == 'I') {
                if (s.charAt(i + 1) == 'V') {
                    return_val += 4;
                    i++;
                    if (i == str_len - 1) {
                        flag = true;
                    }

                } else if (s.charAt(i + 1) == 'X') {
                    return_val += 9;
                    i++;
                    if (i == str_len - 1) {
                        flag = true;
                    }

                } else {
                    return_val += 1;
                }
            } else if (s.charAt(i) == 'X') {
                if (s.charAt(i + 1) == 'L') {
                    return_val += 40;
                    i++;
                    if (i == str_len - 1) {
                        flag = true;
                    }

                } else if (s.charAt(i + 1) == 'C') {
                    return_val += 90;
                    i++;
                    if (i == str_len - 1) {
                        flag = true;
                    }

                } else {
                    return_val += 10;
                }
            } else if (s.charAt(i) == 'C') {
                if (s.charAt(i + 1) == 'D') {
                    return_val += 400;
                    i++;
                    if (i == str_len - 1) {
                        flag = true;
                    }

                } else if (s.charAt(i + 1) == 'M') {
                    return_val += 900;
                    i++;
                    if (i == str_len - 1) {
                        flag = true;
                    }

                } else {
                    return_val += 100;
                }
            }
        }
            if (flag == false){
                if (s.charAt(str_len-1) == 'I'){
                    return_val += 1;
                }
                else if (s.charAt(str_len-1) == 'V'){
                    return_val += 5;
                }
                else if (s.charAt(str_len-1) == 'X'){
                    return_val += 10;
                }
                else if (s.charAt(str_len-1) == 'L'){
                    return_val += 50;
                }
                else if (s.charAt(str_len-1) == 'C'){
                    return_val += 100;
                }
                else if (s.charAt(str_len-1) == 'D'){
                    return_val += 500;
                }
                else if (s.charAt(str_len-1) == 'M') {
                    return_val += 1000;
                }
            }


        return return_val;
    }
}
