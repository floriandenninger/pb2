package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dlm implements Runnable {
    Runnable a;
    final /* synthetic */ dln b;

    public dlm(dln dlnVar) {
        this.b = dlnVar;
    }

    public final String toString() {
        Runnable runnable = this.a;
        if (runnable != null) {
            String valueOf = String.valueOf(runnable);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("SequentialLithoHandler{running=");
            sb.append(valueOf);
            sb.append("}");
            return sb.toString();
        }
        int i = this.b.c;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE";
        StringBuilder sb2 = new StringBuilder(str.length() + 30);
        sb2.append("SequentialLithoHandler{state=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        r2 = r2 | java.lang.Thread.interrupted();
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        r10.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        r5 = java.lang.String.valueOf(r10.a);
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 35);
        r7.append("Exception while executing runnable ");
        r7.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        throw new java.lang.RuntimeException(r7.toString(), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        r10.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            r2 = 0
        L3:
            dln r3 = r10.b     // Catch: java.lang.Throwable -> L52
            java.util.Deque r3 = r3.a     // Catch: java.lang.Throwable -> L52
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L25
            dln r0 = r10.b     // Catch: java.lang.Throwable -> L81
            int r4 = r0.c     // Catch: java.lang.Throwable -> L81
            r5 = 4
            if (r4 != r5) goto L1c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L41
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L8e
            r0.interrupt()     // Catch: java.lang.Error -> L8e
            return
        L1c:
            long r6 = r0.b     // Catch: java.lang.Throwable -> L81
            r8 = 1
            long r6 = r6 + r8
            r0.b = r6     // Catch: java.lang.Throwable -> L81
            r0.c = r5     // Catch: java.lang.Throwable -> L81
        L25:
            dln r0 = r10.b     // Catch: java.lang.Throwable -> L81
            java.util.Deque r0 = r0.a     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L81
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L81
            r10.a = r0     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L42
            dln r0 = r10.b     // Catch: java.lang.Throwable -> L81
            r0.c = r1     // Catch: java.lang.Throwable -> L81
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L41
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L8e
            r0.interrupt()     // Catch: java.lang.Error -> L8e
        L41:
            return
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L81
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L52
            r2 = r2 | r0
            r0 = 0
            java.lang.Runnable r3 = r10.a     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L56
            r3.run()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L56
            r10.a = r0     // Catch: java.lang.Throwable -> L52
            r0 = 1
            goto L3
        L52:
            r0 = move-exception
            goto L84
        L54:
            r3 = move-exception
            goto L7e
        L56:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L54
            java.lang.Runnable r5 = r10.a     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L54
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L54
            int r6 = r6 + 35
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = "Exception while executing runnable "
            r7.append(r6)     // Catch: java.lang.Throwable -> L54
            r7.append(r5)     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L54
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L54
            throw r4     // Catch: java.lang.Throwable -> L54
        L7e:
            r10.a = r0     // Catch: java.lang.Throwable -> L52
            throw r3     // Catch: java.lang.Throwable -> L52
        L81:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L81
            throw r0     // Catch: java.lang.Throwable -> L52
        L84:
            if (r2 == 0) goto L8d
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L8e
            r2.interrupt()     // Catch: java.lang.Error -> L8e
        L8d:
            throw r0     // Catch: java.lang.Error -> L8e
        L8e:
            r0 = move-exception
            dln r2 = r10.b
            java.util.Deque r2 = r2.a
            monitor-enter(r2)
            dln r3 = r10.b     // Catch: java.lang.Throwable -> L9a
            r3.c = r1     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9a
            throw r0
        L9a:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9a
            goto L9e
        L9d:
            throw r0
        L9e:
            goto L9d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlm.run():void");
    }
}
