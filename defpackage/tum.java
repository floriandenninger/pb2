package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tum implements anfz {
    public final /* synthetic */ tus a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ tum(tus tusVar, int i, int i2) {
        this.c = i2;
        this.a = tusVar;
        this.b = i;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.c == 0) {
            final tus tusVar = this.a;
            int i = this.b;
            final tvb tvbVar = (tvb) obj;
            if (!tus.l(tvbVar) || !tus.k(tvbVar)) {
                return anaf.O(tusVar.g());
            }
            tvd tvdVar = tusVar.a;
            tva tvaVar = tvbVar.c;
            if (tvaVar == null) {
                tvaVar = tva.a;
            }
            return amka.c(tvdVar.a(tvaVar, i)).h(tqf.r, angq.a).a(Exception.class, tqf.s, angq.a).i(new anfz() { // from class: tuo
                @Override // defpackage.anfz
                public final anhy a(Object obj2) {
                    tus tusVar2 = tus.this;
                    tvb tvbVar2 = tvbVar;
                    ammv ammvVar = (ammv) obj2;
                    if (ammvVar.h()) {
                        if (!tus.m(tvbVar2)) {
                            rwh.ao((InputStream) ammvVar.c());
                            return anaf.N(new tui());
                        }
                        return anaf.O(ammvVar);
                    }
                    return anaf.O(tusVar2.g());
                }
            }, angq.a);
        }
        tus tusVar2 = this.a;
        int i2 = this.b;
        tvb tvbVar2 = (tvb) obj;
        if (!tus.m(tvbVar2)) {
            return anaf.N(new tui());
        }
        tvd tvdVar2 = tusVar2.a;
        tva tvaVar2 = tvbVar2.c;
        if (tvaVar2 == null) {
            tvaVar2 = tva.a;
        }
        return tvdVar2.a(tvaVar2, i2);
    }
}
