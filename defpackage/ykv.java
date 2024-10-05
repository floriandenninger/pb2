package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ykv {
    protected final azrj b = azrj.W();

    protected abstract void a();

    @Deprecated
    public final void b(Executor executor) {
        executor.execute(new Runnable() { // from class: yku
            @Override // java.lang.Runnable
            public final void run() {
                ykv.this.c();
            }
        });
    }

    public final synchronized void c() {
        azrj azrjVar = this.b;
        if (azrjVar.c.get() != azrj.b || azrjVar.e != null) {
            azrj azrjVar2 = this.b;
            if (azrjVar2.c.get() != azrj.b || azrjVar2.e == null) {
                try {
                    a();
                    this.b.sh();
                } catch (Throwable th) {
                    this.b.b(th);
                }
            }
        }
    }
}
