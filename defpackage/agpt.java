package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agpt implements ate {
    private final amnv a;

    public agpt(final agej agejVar, final afhe afheVar, final afhz afhzVar, final ate ateVar) {
        this.a = amkq.x(new amnv() { // from class: agps
            @Override // defpackage.amnv
            public final Object get() {
                ate ateVar2 = ate.this;
                agej agejVar2 = agejVar;
                afhe afheVar2 = afheVar;
                afhz afhzVar2 = afhzVar;
                ate agpvVar = new agpv(ateVar2);
                ate ateVar3 = agpvVar;
                for (agna agnaVar : agejVar2.g()) {
                    ateVar3 = new phj(agnaVar, ateVar3, afheVar2.a(agnaVar.n()), null, 4, afhzVar2);
                }
                return ateVar3;
            }
        });
    }

    @Override // defpackage.ate
    public final Map a() {
        return ((ate) this.a.get()).a();
    }

    @Override // defpackage.ate
    public final void b(att attVar) {
        ((ate) this.a.get()).b(attVar);
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        return ((ate) this.a.get()).g(bArr, i, i2);
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        return ((ate) this.a.get()).h(athVar);
    }

    @Override // defpackage.ate
    public final Uri i() {
        return ((ate) this.a.get()).i();
    }

    @Override // defpackage.ate
    public final void j() {
        ((ate) this.a.get()).j();
    }
}
