package Easy;

public class Goal_Parser_Interpretation {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') sb.append('G');
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    sb.append("o");
                    i++;
                } else if (command.charAt(i + 1) == 'a') {
                    sb.append("al");
                    i+=3;
                }
            }
        }
        return sb.toString();
    }
}
