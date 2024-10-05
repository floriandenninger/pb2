package defpackage;

import com.google.protos.youtube.api.innertube.StorageInfoRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nlj extends nky {
    public nlj(aqbd aqbdVar) {
        super(aqbdVar);
    }

    @Override // defpackage.nky
    public final amsx a(amsx amsxVar) {
        return ((aqbd) this.a).e ? amvs.a : amsxVar;
    }

    @Override // defpackage.nky
    public final CharSequence c() {
        aqyg aqygVar;
        aqbd aqbdVar = (aqbd) this.a;
        if ((aqbdVar.b & 1) != 0) {
            aqygVar = aqbdVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.nky
    public final /* bridge */ /* synthetic */ Object d() {
        aqbd aqbdVar = (aqbd) this.a;
        if ((aqbdVar.b & 2) == 0) {
            return null;
        }
        aulq aulqVar = aqbdVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return (auyi) aulqVar.pX(StorageInfoRendererOuterClass.storageInfoRenderer);
    }
}
