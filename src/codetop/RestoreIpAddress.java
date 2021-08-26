package codetop;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddress {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        dfs(s, 0, new ArrayList<>(), res);
        return res;
    }

    private void dfs(String s, int startIndex, List<String> path, List<String> res) {
        if (path.size() > 4) {
            return;
        }
        if (path.size() >= 4 && startIndex != s.length()) {
            return;
        }

        if (path.size() == 4) {
            res.add(String.join(".", path));
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            String newStr = s.substring(startIndex, i + 1);
            if ((newStr.length() > 1 && newStr.startsWith("0")) || newStr.length() > 3) {
                continue;
            }
            int value = Integer.valueOf(newStr);
            if (value < 0 || value > 255) {
                continue;
            }
        }
    }
}
