package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anqy {
    public static final anqy a;
    public static final anqy b;
    public static final anqy c;
    public static final anqy d;
    public static final anqy e;
    public static final anqy f;
    public static final anqy g;
    private static final Logger h = Logger.getLogger(anqy.class.getName());
    private static final List i;
    private static final boolean j;
    private final anra k;

    static {
        if (anlt.a()) {
            i = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            j = false;
        } else if (aobq.K()) {
            i = b("GmsCore_OpenSSL", "AndroidOpenSSL");
            j = true;
        } else {
            i = new ArrayList();
            j = true;
        }
        a = new anqy(new anqz(1));
        b = new anqy(new anqz(4));
        c = new anqy(new anqz(6));
        d = new anqy(new anqz(5));
        e = new anqy(new anqz(0));
        f = new anqy(new anqz(3));
        g = new anqy(new anqz(2));
    }

    public anqy(anra anraVar) {
        this.k = anraVar;
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                h.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        Iterator it = i.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.k.a(str, (Provider) it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (j) {
            return this.k.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
