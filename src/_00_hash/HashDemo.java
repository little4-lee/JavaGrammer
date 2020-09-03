package _00_hash;

import java.util.Objects;

public class HashDemo {
    public static void main (String[] args) {

        String id = "com.ccos.padlauncher";
        String clazz = "com.ccos.padlauncher.plugin.HomePlugin";

        int hash1 = Objects.hash(id, clazz);
        //hash2 等于 hash1
        int hash2 = Objects.hash("com.ccos.padlauncher", "com.ccos.padlauncher.plugin.HomePlugin");
        //hash3 不等于 hash1 ==> 顺序会影响最终结果
        int hash3 = Objects.hash(clazz, id);
        System.out.println("hash1: " + hash1 + "\nhash2: " + hash2 + "\nhash3: " + hash3);

    }
}
