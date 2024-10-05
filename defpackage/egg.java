package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class egg {
    public final akpt a;
    public volatile int b;
    public final long c;
    public final AtomicInteger d;
    private final azrw e;
    private final azrw f;

    public egg(azrw azrwVar, azrw azrwVar2, akpt akptVar, eni eniVar) {
        this.e = azrwVar;
        this.f = azrwVar2;
        this.a = akptVar;
        long f = akptVar.a().f(yxx.F);
        this.c = f;
        if ((16 & f) != 0) {
            this.b = 1;
        } else if ((2 & f) != 0) {
            this.b = (f & 4) != 0 ? 2 : 0;
            eniVar.b().R(new ayrm() { // from class: ege
                @Override // defpackage.ayrm
                public final void a() {
                    egg.this.b = 1;
                }
            });
        } else {
            this.b = 1;
        }
        this.d = new AtomicInteger();
    }

    public final void a(int i) {
        if (i >= 5) {
            ((ajjs) this.f.get()).d();
        }
    }

    public final void b(int i) {
        if (i == 15 || ((this.c & 8) != 0 && i >= 15)) {
            ((cnd) this.e.get()).b();
        }
    }
}
