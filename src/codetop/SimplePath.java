package codetop;

import java.util.Deque;
import java.util.LinkedList;

public class SimplePath {
    public String simplifyPath(String path) {
        // 双端队列
        Deque<String> queue = new LinkedList<>();
        // 分割字符
        String[] res = path.split("/");
        for(int i = 0; i < res.length; i++){
            String s = res[i];
            //如果为"."，那就直接continue
            if(s.equals(".") || s.equals("")) continue;
            //字符串中包含双..的处理
            else if (s.equals("..")){
                if(!queue.isEmpty()){
                    //抽出最后的那个
                    queue.pollLast();
                }
            }else{
                queue.offer(s);
            }
        }
        // 拼接
        StringBuilder sb = new StringBuilder("/");
        while(!queue.isEmpty()){
            sb.append(queue.poll());
            if(!queue.isEmpty()){
                sb.append("/");
            }
        }
        // 判空
        return sb.toString().equals("") ? "/" : sb.toString();
    }
}
