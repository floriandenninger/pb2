package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amjq extends RuntimeException {
    public amjq(Throwable th, StackTraceElement[] stackTraceElementArr) {
        super("", th);
        setStackTrace(stackTraceElementArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0123, code lost:
    
        r17 = r0;
        r7 = r1;
        r18 = r9;
        r13 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0278, code lost:
    
        if (r5 == r8.d()) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027a, code lost:
    
        r5 = new defpackage.sis(r3);
        r5.initCause(new defpackage.amjq(null, f(r4, r8.a)));
        r3 = new java.util.ArrayList();
        r3.add(new java.lang.StackTraceElement(r5.getMessage(), "", null, 0));
        java.util.Collections.addAll(r3, r5.getStackTrace());
        r3 = (java.lang.StackTraceElement[]) r3.toArray(new java.lang.StackTraceElement[0]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.RuntimeException a(java.lang.Throwable r20) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amjq.a(java.lang.Throwable):java.lang.RuntimeException");
    }

    public static RuntimeException b(Thread thread) {
        amjv amjvVar;
        synchronized (amjw.a) {
            amjvVar = (amjv) amjw.a.get(thread);
        }
        return new amjq(null, f(amjvVar == null ? null : amjvVar.d, null));
    }

    public static RuntimeException c() {
        return new amjq(null, f(amjw.a(), null));
    }

    public static void d(Throwable th) {
        throw new amjq(th, f(amjw.a(), null));
    }

    public static void e(StackTraceElement[] stackTraceElementArr) {
        new amjp(stackTraceElementArr);
    }

    private static StackTraceElement[] f(amir amirVar, amir amirVar2) {
        ArrayList arrayList = new ArrayList();
        for (amir amirVar3 = amirVar; amirVar3 != amirVar2; amirVar3 = amirVar3.a()) {
            arrayList.add(new StackTraceElement("tk_trace", amirVar3.b(), null, 0));
        }
        if (amirVar instanceof amht) {
            arrayList.add(new StackTraceElement("tk_trace", "Missing root trace", null, 0));
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
