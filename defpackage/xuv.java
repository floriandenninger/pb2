package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xuv {
    public final azrl a = azrl.e();
    private final Executor b;

    public xuv(Executor executor) {
        this.b = executor;
    }

    public final void a(final ammv ammvVar) {
        this.b.execute(new Runnable() { // from class: xut
            @Override // java.lang.Runnable
            public final void run() {
                xuv.this.a.c(xuu.b(ammvVar));
            }
        });
    }
}
