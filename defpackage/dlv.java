package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dlv implements Runnable {
    public final Throwable b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dlv() {
        this(false);
        boolean z = doa.a;
    }

    public abstract void a(dlv dlvVar);

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a(this);
        } catch (Throwable th) {
            if (this.b != null) {
                Log.w("LithoThreadTracing", "--- start debug trace");
                Log.w("LithoThreadTracing", "Thread tracing stacktrace", this.b);
                Log.w("LithoThreadTracing", "--- end debug trace");
            }
            throw th;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dlv(defpackage.dlv r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            java.lang.Throwable r1 = r3.b
            if (r1 == 0) goto Lb
            r0 = 1
            goto Lb
        L9:
            boolean r1 = defpackage.doa.a
        Lb:
            r2.<init>(r0)
            java.lang.Throwable r0 = r2.b
            if (r0 == 0) goto L19
            if (r3 == 0) goto L19
            java.lang.Throwable r3 = r3.b
            r0.initCause(r3)
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlv.<init>(dlv):void");
    }

    private dlv(boolean z) {
        if (!z) {
            this.b = null;
            return;
        }
        Thread currentThread = Thread.currentThread();
        this.b = new Throwable("Runnable instantiated on thread id: " + currentThread.getId() + ", name: " + currentThread.getName());
    }
}
