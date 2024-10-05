package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acow {
    public final /* synthetic */ acoy a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ acow(acoy acoyVar, boolean z, boolean z2) {
        this.a = acoyVar;
        this.b = z;
        this.c = z2;
    }

    public final qli a(qli qliVar) {
        acoy acoyVar = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        if (z) {
            return null;
        }
        if (!z2) {
            return qliVar;
        }
        avfd a = avfe.a();
        String str = qliVar.j;
        a.copyOnWrite();
        avfe.c((avfe) a.instance, str);
        int a2 = qliVar.a();
        a.copyOnWrite();
        avfe.d((avfe) a.instance, a2);
        avfe avfeVar = (avfe) a.build();
        avff a3 = avfg.a();
        a3.copyOnWrite();
        avfg.c((avfg) a3.instance, avfeVar);
        avfg avfgVar = (avfg) a3.build();
        acpl acplVar = (acpl) acoyVar.a.get();
        arpn a4 = arpp.a();
        a4.copyOnWrite();
        ((arpp) a4.instance).dM(avfgVar);
        acplVar.c((arpp) a4.build());
        return qliVar;
    }
}
