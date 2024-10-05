package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nme extends nld {
    public nme(aahd aahdVar, ohg ohgVar, ajyw ajywVar, acra acraVar, BrowseResponseModel browseResponseModel, auvc auvcVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(aahdVar, ohgVar, ajywVar, acraVar, browseResponseModel, auvcVar, null, null, null, null);
    }

    @Override // defpackage.nky
    public final CharSequence c() {
        aqyg aqygVar;
        auvc auvcVar = (auvc) this.a;
        if ((auvcVar.b & 1) != 0) {
            aqygVar = auvcVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.nld
    public final avsr f() {
        auvd auvdVar = ((auvc) this.a).d;
        if (auvdVar == null) {
            auvdVar = auvd.a;
        }
        if (auvdVar.b != 63096351) {
            return null;
        }
        auvd auvdVar2 = ((auvc) this.a).d;
        if (auvdVar2 == null) {
            auvdVar2 = auvd.a;
        }
        if (auvdVar2.b == 63096351) {
            return (avsr) auvdVar2.c;
        }
        return avsr.a;
    }
}
