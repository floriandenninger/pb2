package defpackage;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public /* synthetic */ class usr {
    public static Object b(Callable callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static void c(Map map) {
        for (Map.Entry entry : ((amrz) map).entrySet()) {
            amil l = amjw.l((String) entry.getKey());
            try {
                ((uyo) ((azrw) entry.getValue()).get()).a();
                l.close();
            } catch (Throwable th) {
                try {
                    l.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
    }
}
