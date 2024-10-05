package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.MissingResourceException;
import java.util.Properties;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b {
    private static final Properties a;

    static {
        InputStream resourceAsStream;
        Properties properties = new Properties();
        a = properties;
        try {
            if (System.getSecurityManager() != null) {
                resourceAsStream = (InputStream) AccessController.doPrivileged(new c(d.class));
            } else {
                resourceAsStream = d.class.getResourceAsStream("/android/icumessageformat/ICUConfig.properties");
            }
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
            }
        } catch (IOException | MissingResourceException unused) {
        }
    }

    public static String a() {
        String str;
        if (System.getSecurityManager() != null) {
            try {
                str = (String) AccessController.doPrivileged(new a());
            } catch (AccessControlException unused) {
                str = null;
            }
        } else {
            str = System.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode");
        }
        return str == null ? a.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL") : str;
    }
}
