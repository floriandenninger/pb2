package defpackage;

import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nlu extends nky {
    private final mad e;

    public nlu(mad madVar, asiw asiwVar) {
        super(asiwVar);
        this.e = madVar;
    }

    @Override // defpackage.nky
    public final amsx a(amsx amsxVar) {
        Iterable iterable;
        amsv i = amsx.i();
        asiw asiwVar = (asiw) this.a;
        aulq aulqVar = asiwVar.l;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (!aulqVar.pY(MenuRendererOuterClass.menuRenderer)) {
            iterable = amvs.a;
        } else {
            mad madVar = this.e;
            aulq aulqVar2 = asiwVar.l;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            madVar.c((atdc) aulqVar2.pX(MenuRendererOuterClass.menuRenderer));
            iterable = amsx.p(this.e.b());
        }
        i.j(iterable);
        i.j(amsxVar);
        return i.g();
    }

    @Override // defpackage.nky
    public final CharSequence c() {
        aqyg aqygVar;
        asiw asiwVar = (asiw) this.a;
        if ((asiwVar.b & 2) != 0) {
            aqygVar = asiwVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return zhq.d(ajcq.b(aqygVar));
    }
}
