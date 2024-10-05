package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayzw extends AtomicReference implements Runnable, ayrs {
    private static final long serialVersionUID = -4552101107598366241L;
    final ayzy a;
    ayqx b;
    long c;
    boolean d;
    boolean e;

    public ayzw(ayzy ayzyVar) {
        this.a = ayzyVar;
    }

    @Override // defpackage.ayrs
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ayqx ayqxVar = (ayqx) obj;
        ayrz.i(this, ayqxVar);
        synchronized (this.a) {
            if (this.e) {
                ((aysc) this.a.b).sl(ayqxVar);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this);
    }
}
