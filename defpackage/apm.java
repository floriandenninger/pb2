package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class apm {
    public final Map w = new HashMap();
    public volatile boolean x = false;

    public static void s(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(Object obj) {
        Object obj2;
        synchronized (this.w) {
            obj2 = this.w.get("androidx.lifecycle.savedstate.vm.tag");
            if (obj2 == null) {
                this.w.put("androidx.lifecycle.savedstate.vm.tag", obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.x) {
            s(obj);
        }
    }
}
