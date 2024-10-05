package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dln implements dkf {
    private final dkf d;
    public final Deque a = new ArrayDeque();
    public int c = 1;
    public long b = 0;
    private final dlm e = new dlm(this);

    public dln(dkf dkfVar) {
        this.d = dkfVar;
    }

    @Override // defpackage.dkf
    public final void a(Runnable runnable) {
        if (this.a.isEmpty()) {
            return;
        }
        synchronized (this.a) {
            this.a.remove(runnable);
        }
    }

    @Override // defpackage.dkf
    public final void b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0056, code lost:
    
        if (r7.a.removeLastOccurrence(r1) != false) goto L41;
     */
    @Override // defpackage.dkf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Runnable r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            java.util.Deque r0 = r7.a
            monitor-enter(r0)
            int r1 = r7.c     // Catch: java.lang.Throwable -> L6b
            r2 = 4
            if (r1 == r2) goto L64
            r2 = 3
            if (r1 != r2) goto Lf
            goto L64
        Lf:
            long r3 = r7.b     // Catch: java.lang.Throwable -> L6b
            anik r1 = new anik     // Catch: java.lang.Throwable -> L6b
            r5 = 1
            r1.<init>(r8, r5)     // Catch: java.lang.Throwable -> L6b
            java.util.Deque r8 = r7.a     // Catch: java.lang.Throwable -> L6b
            r8.add(r1)     // Catch: java.lang.Throwable -> L6b
            r8 = 2
            r7.c = r8     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            dkf r0 = r7.d     // Catch: java.lang.Error -> L40 java.lang.RuntimeException -> L42
            dlm r6 = r7.e     // Catch: java.lang.Error -> L40 java.lang.RuntimeException -> L42
            r0.c(r6)     // Catch: java.lang.Error -> L40 java.lang.RuntimeException -> L42
            int r0 = r7.c
            if (r0 == r8) goto L2c
            return
        L2c:
            java.util.Deque r0 = r7.a
            monitor-enter(r0)
            long r5 = r7.b     // Catch: java.lang.Throwable -> L3d
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L3b
            int r1 = r7.c     // Catch: java.lang.Throwable -> L3d
            if (r1 != r8) goto L3b
            r7.c = r2     // Catch: java.lang.Throwable -> L3d
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return
        L3d:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r8
        L40:
            r0 = move-exception
            goto L43
        L42:
            r0 = move-exception
        L43:
            java.util.Deque r2 = r7.a
            monitor-enter(r2)
            int r3 = r7.c     // Catch: java.lang.Throwable -> L61
            r4 = 0
            if (r3 == r5) goto L50
            if (r3 != r8) goto L4e
            goto L50
        L4e:
            r5 = 0
            goto L58
        L50:
            java.util.Deque r8 = r7.a     // Catch: java.lang.Throwable -> L61
            boolean r8 = r8.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L61
            if (r8 == 0) goto L4e
        L58:
            boolean r8 = r0 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L61
            if (r8 == 0) goto L60
            if (r5 != 0) goto L60
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
            return
        L60:
            throw r0     // Catch: java.lang.Throwable -> L61
        L61:
            r8 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L61
            throw r8
        L64:
            java.util.Deque r1 = r7.a     // Catch: java.lang.Throwable -> L6b
            r1.add(r8)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            return
        L6b:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            goto L6f
        L6e:
            throw r8
        L6f:
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dln.c(java.lang.Runnable):void");
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("SequentialLithoHandler@");
        sb.append(identityHashCode);
        sb.append("{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
