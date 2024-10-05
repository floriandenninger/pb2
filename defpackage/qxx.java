package defpackage;

import android.content.Context;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qxx {
    private static final HashMap c = new HashMap();
    public qxs a;
    public final Object b = new Object();
    private final Context d;
    private final qxe e;
    private final qux f;
    private final eaz g;

    public qxx(Context context, eaz eazVar, qxe qxeVar, qux quxVar) {
        this.d = context;
        this.g = eazVar;
        this.e = qxeVar;
        this.f = quxVar;
    }

    private static long c(long j) {
        return System.currentTimeMillis() - j;
    }

    private final synchronized Class d(qxt qxtVar) {
        String str = qxtVar.a.c;
        HashMap hashMap = c;
        Class cls = (Class) hashMap.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.f.a(qxtVar.b)) {
                try {
                    File file = qxtVar.c;
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    Class loadClass = new DexClassLoader(qxtVar.b.getAbsolutePath(), file.getAbsolutePath(), null, this.d.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(str, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                    throw new qxw(2008, e);
                }
            }
            throw new qxw(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e2) {
            throw new qxw(2026, e2);
        }
    }

    public final qxh a() {
        qxs qxsVar;
        synchronized (this.b) {
            qxsVar = this.a;
        }
        return qxsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[Catch: Exception -> 0x00e8, qxw -> 0x00f5, TryCatch #8 {qxw -> 0x00f5, Exception -> 0x00e8, blocks: (B:3:0x0005, B:30:0x007e, B:32:0x008d, B:34:0x0093, B:35:0x0095, B:41:0x00ab, B:51:0x00b9, B:52:0x00ba, B:53:0x00d4, B:54:0x00d5, B:55:0x00de, B:58:0x00e0, B:59:0x00e7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5 A[Catch: Exception -> 0x00e8, qxw -> 0x00f5, TryCatch #8 {qxw -> 0x00f5, Exception -> 0x00e8, blocks: (B:3:0x0005, B:30:0x007e, B:32:0x008d, B:34:0x0093, B:35:0x0095, B:41:0x00ab, B:51:0x00b9, B:52:0x00ba, B:53:0x00d4, B:54:0x00d5, B:55:0x00de, B:58:0x00e0, B:59:0x00e7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0064 A[Catch: Exception -> 0x00df, TryCatch #0 {Exception -> 0x00df, blocks: (B:6:0x000a, B:8:0x003c, B:14:0x004b, B:15:0x005c, B:21:0x0053, B:22:0x0056, B:18:0x0058, B:26:0x005e, B:29:0x0069, B:56:0x0064), top: B:5:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.qxt r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxx.b(qxt):boolean");
    }
}
