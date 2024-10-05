package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fme {
    public final fmd a;

    public fme(final fgq fgqVar, aok aokVar, yqw yqwVar, aivz aivzVar) {
        this.a = new fmd(aokVar, aivzVar);
        yqwVar.f(new Callable() { // from class: fmc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fme fmeVar = fme.this;
                aypy Y = fgqVar.h().Y(fiv.k);
                final fmd fmdVar = fmeVar.a;
                return Y.E(new ayrm() { // from class: fmb
                    @Override // defpackage.ayrm
                    public final void a() {
                        fmd.this.b();
                    }
                }).ax(fmeVar.a);
            }
        });
    }
}
