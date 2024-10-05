package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mwl implements afwx {
    final /* synthetic */ mwn a;

    public mwl(mwn mwnVar) {
        this.a = mwnVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("Error requesting TopicPickerRenderer continuation.", cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        ajcf ajcfVar = (ajcf) obj;
        if (ajcfVar != null) {
            mwn mwnVar = this.a;
            if (ajcfVar.b() != null) {
                mwnVar.c.D(new acqx(ajcfVar.d()));
            }
            mwn mwnVar2 = this.a;
            avii aviiVar = (avii) ajcfVar.b();
            if (aviiVar != null) {
                mwnVar2.a.d(aviiVar.h);
            }
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
