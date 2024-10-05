package defpackage;

import java.lang.Thread;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sis extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sis(java.lang.Thread r2) {
        /*
            r1 = this;
            java.lang.String r0 = a(r2)
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            r1.<init>(r0)
            r1.setStackTrace(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sis.<init>(java.lang.Thread):void");
    }

    public static String a(Thread thread) {
        String sb;
        Object blocker = LockSupport.getBlocker(thread);
        Thread.State state = thread.getState();
        String thread2 = thread.toString();
        String str = "";
        if (state == null) {
            sb = "";
        } else {
            String valueOf = String.valueOf(state);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 10);
            sb2.append(" in state ");
            sb2.append(valueOf);
            sb = sb2.toString();
        }
        if (blocker != null) {
            String valueOf2 = String.valueOf(blocker.toString());
            str = valueOf2.length() != 0 ? " blocked on ".concat(valueOf2) : new String(" blocked on ");
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(thread2).length() + String.valueOf(sb).length() + String.valueOf(str).length());
        sb3.append(thread2);
        sb3.append(sb);
        sb3.append(str);
        return sb3.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
