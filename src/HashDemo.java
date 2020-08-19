import java.util.Objects;

public class HashDemo {
    public static void main (String[] args) {

        String id = "com.ccos.padlauncher";
        String clazz = "com.ccos.padlauncher.plugin.HomePlugin";

        int hash1 = Objects.hash(id, clazz);
        int hash2 = Objects.hash("com.ccos.padlauncher", "com.ccos.padlauncher.plugin.HomePlugin");
        System.out.println("hash1: " + hash1 + "\nhash2: " + hash2);

    }
}
