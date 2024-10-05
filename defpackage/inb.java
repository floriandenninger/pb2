package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class inb implements afwx {
    public final afwx a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public inb(afwx afwxVar) {
        this.a = afwxVar;
    }

    private final void d(Runnable runnable) {
        if (!this.b.get() && this.b.compareAndSet(false, true)) {
            runnable.run();
        }
    }

    @Override // defpackage.cnk
    public final void kY(final cnq cnqVar) {
        d(new Runnable() { // from class: imz
            @Override // java.lang.Runnable
            public final void run() {
                inb inbVar = inb.this;
                inbVar.a.kY(cnqVar);
            }
        });
    }

    @Override // defpackage.cnl
    public final void kZ(final Object obj) {
        d(new Runnable() { // from class: ina
            @Override // java.lang.Runnable
            public final void run() {
                inb inbVar = inb.this;
                inbVar.a.kZ(obj);
            }
        });
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
