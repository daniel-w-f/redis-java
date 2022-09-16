import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import nl.melp.redis.Redis;

/**
 * RedisJava
 */
public class RedisJava {

    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("Hello World");

        Redis r = new Redis(new Socket("127.0.0.1", 6379));
        r.call("SET", "foo", "123");
        r.call("INCRBY", "foo", "456");
        Object o = r.call("GET", "foo");
        System.out.println( o );
        // System.out.println(r.call("GET", "foo")); // will print '579'
        // how to convert char[] to proper string output to see
        // "579"
        // instead: [B@19e1023e

    }
}
