package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeyw implements affh {
    final /* synthetic */ afcu a;
    final /* synthetic */ aeyk b;
    final /* synthetic */ aeyl c;

    public aeyw(afcu afcuVar, aeyk aeykVar, aeyl aeylVar) {
        this.a = afcuVar;
        this.b = aeykVar;
        this.c = aeylVar;
    }

    @Override // defpackage.affh
    public final adyr a(adyq adyqVar) {
        if ((adyqVar.b & 1) != 0) {
            aeyh aeyhVar = this.b.a;
            ovw a = ovw.a(adyqVar.c);
            if (a == null) {
                a = ovw.TRACK_TYPE_AUDIO;
            }
            aeyhVar.c(a).d = true;
        }
        return adyr.a;
    }

    @Override // defpackage.affh
    public final adyt b(adys adysVar) {
        aeyl aeylVar = this.c;
        adww adwwVar = adysVar.b;
        if (adwwVar == null) {
            adwwVar = adww.a;
        }
        aeylVar.a(afih.e(adwwVar), this.b.c);
        return adyt.a;
    }

    @Override // defpackage.affh
    public final adyp c() {
        ovg a = this.a.a(this.b.c.a(), this.b.c.w(), -9223372036854775807L, this.b.c.a);
        aone createBuilder = adyp.a.createBuilder();
        createBuilder.copyOnWrite();
        adyp adypVar = (adyp) createBuilder.instance;
        a.getClass();
        adypVar.c = a;
        adypVar.b |= 1;
        return (adyp) createBuilder.build();
    }
}
