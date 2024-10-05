package defpackage;

import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nmg extends nky {
    private final mad e;

    public nmg(mad madVar, avjy avjyVar) {
        super(avjyVar);
        this.e = madVar;
    }

    @Override // defpackage.nky
    public final amsx a(amsx amsxVar) {
        amru q;
        amsv i = amsx.i();
        avjy avjyVar = (avjy) this.a;
        aulq aulqVar = avjyVar.g;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(MenuRendererOuterClass.menuRenderer)) {
            mad madVar = this.e;
            aulq aulqVar2 = avjyVar.g;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            madVar.c((atdc) aulqVar2.pX(MenuRendererOuterClass.menuRenderer));
            q = amru.o(this.e.b());
        } else {
            q = amru.q();
        }
        i.j(q);
        i.j(amsxVar);
        return i.g();
    }

    @Override // defpackage.nky
    public final CharSequence c() {
        aqyg aqygVar = ((avjy) this.a).b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.nky
    public final boolean h() {
        return ((avjy) this.a).h;
    }

    @Override // defpackage.nky
    public final boolean i() {
        return ((((avjy) this.a).c >> 24) & PrivateKeyType.INVALID) < 255;
    }
}
