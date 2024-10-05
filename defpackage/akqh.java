package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akqh extends akpy {
    private boolean a = false;
    private final axpg b;

    public akqh(axpg axpgVar) {
        this.b = axpgVar;
    }

    @Override // defpackage.akqj
    public final void d(avdy avdyVar) {
        avdw avdwVar = avdyVar.e;
        if (avdwVar == null) {
            avdwVar = avdw.a;
        }
        boolean z = false;
        if (avdwVar.b && (avdwVar.c || avdwVar.e || avdwVar.f || avdwVar.g || avdwVar.p || avdwVar.n || avdwVar.o || avdwVar.r)) {
            z = true;
        }
        this.a = z;
        if (z) {
            unf unfVar = (unf) this.b.get();
            if (avdwVar.f) {
                unfVar.a.c();
            }
            if (avdwVar.c) {
                avdp avdpVar = avdyVar.j;
                if (avdpVar == null) {
                    avdpVar = avdp.a;
                }
                if (avdpVar.b == 0) {
                    unfVar.a.b();
                }
            }
        }
    }

    @Override // defpackage.akqj
    public final boolean e() {
        return this.a;
    }

    @Override // defpackage.akqj
    public final boolean f(Context context, aone aoneVar) {
        return false;
    }
}
