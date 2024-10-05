package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amzl {
    public static final amzn a;

    static {
        String[] strArr;
        strArr = amzn.d;
        a = a(strArr);
    }

    private static amzn a(String[] strArr) {
        amzn amznVar;
        try {
            amznVar = amkq.ad();
        } catch (NoClassDefFoundError unused) {
            amznVar = null;
        }
        if (amznVar != null) {
            return amznVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (amzn) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
