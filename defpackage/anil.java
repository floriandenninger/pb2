package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anil implements Runnable {
    Runnable a;
    final /* synthetic */ anim b;

    public anil(anim animVar) {
        this.b = animVar;
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
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE";
        StringBuilder sb2 = new StringBuilder(str.length() + 32);
        sb2.append("SequentialExecutorWorker{state=");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        r2 = r2 | java.lang.Thread.interrupted();
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        r11.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r4 = defpackage.anim.a;
        r5 = java.util.logging.Level.SEVERE;
        r3 = java.lang.String.valueOf(r11.a);
        r10 = new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 35);
        r10.append("Exception while executing runnable ");
        r10.append(r3);
        r4.logp(r5, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", r10.toString(), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            r2 = 0
        L3:
            anim r3 = r11.b     // Catch: java.lang.Throwable -> L52
            java.util.Deque r3 = r3.b     // Catch: java.lang.Throwable -> L52
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L25
            anim r0 = r11.b     // Catch: java.lang.Throwable -> L8a
            int r4 = r0.d     // Catch: java.lang.Throwable -> L8a
            r5 = 4
            if (r4 != r5) goto L1c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L41
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L97
            r0.interrupt()     // Catch: java.lang.Error -> L97
            return
        L1c:
            long r6 = r0.c     // Catch: java.lang.Throwable -> L8a
            r8 = 1
            long r6 = r6 + r8
            r0.c = r6     // Catch: java.lang.Throwable -> L8a
            r0.d = r5     // Catch: java.lang.Throwable -> L8a
        L25:
            anim r0 = r11.b     // Catch: java.lang.Throwable -> L8a
            java.util.Deque r0 = r0.b     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L8a
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L8a
            r11.a = r0     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L42
            anim r0 = r11.b     // Catch: java.lang.Throwable -> L8a
            r0.d = r1     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L41
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L97
            r0.interrupt()     // Catch: java.lang.Error -> L97
        L41:
            return
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8a
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L52
            r2 = r2 | r0
            r0 = 0
            java.lang.Runnable r3 = r11.a     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L56
            r3.run()     // Catch: java.lang.Throwable -> L54 java.lang.RuntimeException -> L56
            r11.a = r0     // Catch: java.lang.Throwable -> L52
        L50:
            r0 = 1
            goto L3
        L52:
            r0 = move-exception
            goto L8d
        L54:
            r3 = move-exception
            goto L87
        L56:
            r3 = move-exception
            r9 = r3
            java.util.logging.Logger r4 = defpackage.anim.a     // Catch: java.lang.Throwable -> L54
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = "com.google.common.util.concurrent.SequentialExecutor$QueueWorker"
            java.lang.String r7 = "workOnQueue"
            java.lang.Runnable r3 = r11.a     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L54
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L54
            int r8 = r8 + 35
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = "Exception while executing runnable "
            r10.append(r8)     // Catch: java.lang.Throwable -> L54
            r10.append(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L54
            r4.logp(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L54
            r11.a = r0     // Catch: java.lang.Throwable -> L52
            goto L50
        L87:
            r11.a = r0     // Catch: java.lang.Throwable -> L52
            throw r3     // Catch: java.lang.Throwable -> L52
        L8a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8a
            throw r0     // Catch: java.lang.Throwable -> L52
        L8d:
            if (r2 == 0) goto L96
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L97
            r2.interrupt()     // Catch: java.lang.Error -> L97
        L96:
            throw r0     // Catch: java.lang.Error -> L97
        L97:
            r0 = move-exception
            anim r2 = r11.b
            java.util.Deque r2 = r2.b
            monitor-enter(r2)
            anim r3 = r11.b     // Catch: java.lang.Throwable -> La3
            r3.d = r1     // Catch: java.lang.Throwable -> La3
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            throw r0
        La3:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            goto La7
        La6:
            throw r0
        La7:
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anil.run():void");
    }
}
