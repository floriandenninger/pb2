package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amca implements Runnable {
    Runnable a;
    final /* synthetic */ amcb b;

    public amca(amcb amcbVar) {
        this.b = amcbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r3 = r3 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r6.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r6.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        throw r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035 A[Catch: all -> 0x0060, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0001, B:26:0x0035, B:42:0x0058, B:43:0x005f, B:6:0x0007, B:7:0x000b, B:12:0x003e, B:16:0x0049, B:19:0x0050, B:20:0x0052, B:32:0x0055), top: B:2:0x0001, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            defpackage.uqq.j()     // Catch: java.lang.Throwable -> L60
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            amcb r4 = r6.b     // Catch: java.lang.Throwable -> L4d
            java.util.Deque r4 = r4.a     // Catch: java.lang.Throwable -> L4d
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L4d
            if (r2 != 0) goto L20
            amcb r2 = r6.b     // Catch: java.lang.Throwable -> L53
            int r2 = r2.d     // Catch: java.lang.Throwable -> L53
            r5 = 2
            if (r2 != r5) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            defpackage.amkq.N(r2)     // Catch: java.lang.Throwable -> L53
            amcb r2 = r6.b     // Catch: java.lang.Throwable -> L53
            r5 = 3
            r2.d = r5     // Catch: java.lang.Throwable -> L53
        L20:
            amcb r2 = r6.b     // Catch: java.lang.Throwable -> L53
            java.util.Deque r2 = r2.a     // Catch: java.lang.Throwable -> L53
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L53
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L53
            r6.a = r2     // Catch: java.lang.Throwable -> L53
            if (r2 != 0) goto L3d
            amcb r1 = r6.b     // Catch: java.lang.Throwable -> L53
            r1.d = r0     // Catch: java.lang.Throwable -> L53
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L3c
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L60
            r1.interrupt()     // Catch: java.lang.Throwable -> L60
        L3c:
            return
        L3d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L53
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4d
            r3 = r3 | r2
            r2 = 0
            java.lang.Runnable r4 = r6.a     // Catch: java.lang.Throwable -> L4f
            r4.run()     // Catch: java.lang.Throwable -> L4f
            r6.a = r2     // Catch: java.lang.Throwable -> L4d
            r2 = 1
            goto L7
        L4d:
            r1 = move-exception
            goto L56
        L4f:
            r1 = move-exception
            r6.a = r2     // Catch: java.lang.Throwable -> L4d
            throw r1     // Catch: java.lang.Throwable -> L4d
        L53:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L53
            throw r1     // Catch: java.lang.Throwable -> L4d
        L56:
            if (r3 == 0) goto L5f
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L60
            r2.interrupt()     // Catch: java.lang.Throwable -> L60
        L5f:
            throw r1     // Catch: java.lang.Throwable -> L60
        L60:
            r1 = move-exception
            amcb r2 = r6.b
            java.util.Deque r2 = r2.a
            monitor-enter(r2)
            amcb r3 = r6.b     // Catch: java.lang.Throwable -> L6c
            r3.d = r0     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            throw r1
        L6c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            goto L70
        L6f:
            throw r0
        L70:
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amca.run():void");
    }

    public final String toString() {
        Runnable runnable = this.a;
        if (runnable != null) {
            String valueOf = String.valueOf(runnable);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("SequentialExecutorWorker{running=");
            sb.append(valueOf);
            sb.append("}");
            return sb.toString();
        }
        int i = this.b.d;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "RUNNING" : "QUEUED" : "IDLE";
        StringBuilder sb2 = new StringBuilder(str.length() + 32);
        sb2.append("SequentialExecutorWorker{state=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
