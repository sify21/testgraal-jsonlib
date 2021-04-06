import net.sf.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        // json-lib 有个optional的oro依赖，不加这个的话必须用--allow-incomplete-classpath才能打成native-image
        JSONObject jb = new JSONObject();
        jb.put("a", new int[]{1, 2, 3, 4});
        jb.put("b", new int[]{5, 6, 7, 8});
        System.out.println(jb.toString());
    }
}
