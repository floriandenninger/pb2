package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oqf {
    public final gje a;
    public final opq b;
    public amsx c = amvs.a;

    public oqf(final gje gjeVar, opq opqVar) {
        this.a = gjeVar;
        this.b = opqVar;
        gjeVar.k(new giz() { // from class: opr
            @Override // defpackage.giz
            public final void f(int i, int i2) {
                oqf oqfVar = oqf.this;
                gje gjeVar2 = gjeVar;
                if (oqfVar.c(i).isPresent()) {
                    return;
                }
                gjeVar2.q(i);
            }
        });
    }

    public static aypy a() {
        azie azieVar = new azie(nxd.n);
        ayrv ayrvVar = aynu.l;
        return azieVar;
    }

    public final Optional b(Predicate predicate) {
        return Collection.EL.stream(this.c).filter(predicate).findFirst();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Optional c(int i) {
        return b(new opy(i, 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Optional d(String str) {
        if (str.isEmpty()) {
            return Optional.empty();
        }
        return b(new opz(str, 0));
    }
}
