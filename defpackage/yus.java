package defpackage;

import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yus implements yvg {
    public final yuh a;
    private final aeg c = new aeg(10);

    public yus(yuh yuhVar) {
        this.a = yuhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r1.isEmpty() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r5.a((defpackage.yuq) r1.poll()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if (r1.isEmpty() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        r3.c.remove(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(defpackage.yvo r4, defpackage.yur r5) {
        /*
            r3 = this;
            java.lang.String r4 = f(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Lb
            return
        Lb:
            aeg r0 = r3.c
            monitor-enter(r0)
            aeg r1 = r3.c     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L3b
            java.util.Queue r1 = (java.util.Queue) r1     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L2c
        L18:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r2 != 0) goto L2c
            java.lang.Object r2 = r1.poll()     // Catch: java.lang.Throwable -> L3b
            yuq r2 = (defpackage.yuq) r2     // Catch: java.lang.Throwable -> L3b
            boolean r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L2c:
            if (r1 == 0) goto L34
            boolean r5 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L39
        L34:
            aeg r5 = r3.c     // Catch: java.lang.Throwable -> L3b
            r5.remove(r4)     // Catch: java.lang.Throwable -> L3b
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return
        L3b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3e:
            throw r4
        L3f:
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yus.e(yvo, yur):void");
    }

    private static final String f(yvo yvoVar) {
        if (yvoVar.h) {
            return yvoVar.l();
        }
        return null;
    }

    @Override // defpackage.yvg
    public final void a(yvo yvoVar) {
        e(yvoVar, new yur() { // from class: yup
            @Override // defpackage.yur
            public final boolean a(yuq yuqVar) {
                yus yusVar = yus.this;
                yuf yufVar = yuqVar.a;
                if (!yufVar.c()) {
                    yusVar.a.d(yuqVar.b, yufVar);
                    return true;
                }
                yufVar.d();
                return false;
            }
        });
    }

    @Override // defpackage.yvg
    public final void b(yvo yvoVar, final cnm cnmVar) {
        e(yvoVar, new yur() { // from class: yuo
            @Override // defpackage.yur
            public final boolean a(yuq yuqVar) {
                yuqVar.a.a(yuqVar.b, cnm.this);
                return false;
            }
        });
    }

    @Override // defpackage.yvg
    public final boolean c(yvo yvoVar) {
        String f = f(yvoVar);
        boolean z = false;
        if (TextUtils.isEmpty(f)) {
            return false;
        }
        synchronized (this.c) {
            Queue queue = (Queue) this.c.get(f);
            if (queue != null && !queue.isEmpty()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.yvg
    public final boolean d(yvo yvoVar, yuf yufVar) {
        String f = f(yvoVar);
        if (TextUtils.isEmpty(f)) {
            return false;
        }
        synchronized (this.c) {
            if (this.c.containsKey(f)) {
                Queue queue = (Queue) this.c.get(f);
                if (queue == null) {
                    queue = new ArrayDeque();
                    this.c.put(f, queue);
                }
                return queue.offer(new yuq(yufVar, yvoVar));
            }
            this.c.put(f, null);
            return false;
        }
    }
}
