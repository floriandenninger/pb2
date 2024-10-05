package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acoy {
    public final azrw a;
    private final azrw b;
    private final azrw c;
    private final aaea d;
    private final Executor e;
    private final yxx f;
    private volatile acow g;

    public acoy(Executor executor, yxx yxxVar, aaea aaeaVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        this.e = executor;
        this.f = yxxVar;
        this.d = aaeaVar;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public final void a() {
        b();
        c();
    }

    public final void b() {
        if (this.f.f(yxx.S) != 10) {
            ((afrw) this.b.get()).c((Set) this.c.get());
        }
    }

    public final void c() {
        this.d.a.Y(zcz.t).B().ab(azre.b(this.e)).ax(new ayrs() { // from class: acox
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                acoy.this.d((apto) obj);
            }
        });
    }

    public final synchronized void d(apto aptoVar) {
        boolean z = aptoVar.b;
        boolean z2 = aptoVar.c;
        if (this.g == null) {
            this.g = new acow(this, z, z2);
            qlm.c.add(0, this.g);
        } else {
            if (z || z2) {
                return;
            }
            qlm.c.remove(this.g);
            this.g = null;
        }
    }
}
