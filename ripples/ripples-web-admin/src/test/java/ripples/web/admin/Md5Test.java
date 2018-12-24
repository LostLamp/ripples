package ripples.web.admin;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.junit.Test;

import java.security.MessageDigest;

public class Md5Test {
    @Test
    public void Random() {
        System.out.println((long)(((Math.random() * 9) + 1) * 100000));
    }
}
