package Easy;

public class License_Key_Formatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                if (sb.length() % (k + 1) == k) {
                    sb.append('-');
                }
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
        }
        return sb.reverse().toString();
    }
}
