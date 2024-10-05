package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahlu implements ahgb {
    final /* synthetic */ ahjp a;
    final /* synthetic */ ahkm b;

    public ahlu(ahjp ahjpVar, ahkm ahkmVar) {
        this.a = ahjpVar;
        this.b = ahkmVar;
    }

    @Override // defpackage.ahgb
    public final void a() {
        ahjp ahjpVar = this.a;
        boolean z = !ahjpVar.h;
        ahjpVar.h = z;
        ahkm ahkmVar = this.b;
        ahkmVar.g = z;
        ahja ahjaVar = ahkmVar.b;
        if (ahjaVar.o != z) {
            ahjaVar.o = z;
            if (ahjaVar.n && (ahjaVar.h == aapb.RECTANGULAR_3D || ahjaVar.h == aapb.RECTANGULAR_2D)) {
                ahjaVar.g();
            }
        }
        ahkmVar.k();
    }
}
