package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class xhe implements ayrs {
    public final /* synthetic */ xhf a;
    private final /* synthetic */ int b;

    public /* synthetic */ xhe(xhf xhfVar, int i) {
        this.b = i;
        this.a = xhfVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            xhf xhfVar = this.a;
            ahej ahejVar = (ahej) obj;
            if (xhfVar.e) {
                xhfVar.a.i(ahejVar.a());
                return;
            }
            return;
        }
        int i2 = 1;
        if (i == 1) {
            this.a.e = ((ahef) obj).c().c(aign.PLAYBACK_LOADED);
        } else {
            if (i == 2) {
                xhf xhfVar2 = this.a;
                ahem ahemVar = (ahem) obj;
                int i3 = 18;
                ahemVar.a().G().Y(new xhe(xhfVar2, 3), new oqu(i3));
                ahemVar.a().W().Y(new xhe(xhfVar2, 0), new oqu(i3));
                ahemVar.a().U().Y(new xhe(xhfVar2, i2), new oqu(i3));
                return;
            }
            this.a.a.i(8);
        }
    }
}
