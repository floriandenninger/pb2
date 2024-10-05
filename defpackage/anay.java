package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anay {
    private static final String[] a;
    private static final anbb b;

    static {
        anbb anbcVar;
        String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        a = strArr;
        int i = 0;
        while (true) {
            if (i >= 2) {
                anbcVar = new anbc();
                break;
            }
            try {
                anbcVar = (anbb) Class.forName(strArr[i]).asSubclass(anbb.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                anbcVar = null;
            }
            if (anbcVar != null) {
                break;
            } else {
                i++;
            }
        }
        b = anbcVar;
    }

    public static StackTraceElement a(Class cls) {
        anaf.d(cls, "target");
        return b.a(cls);
    }

    public static StackTraceElement[] b(Class cls, int i) {
        if (i > 0 || i == -1) {
            return b.b(cls, i);
        }
        throw new IllegalArgumentException("invalid maximum depth: 0");
    }
}
