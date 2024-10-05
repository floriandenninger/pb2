package defpackage;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_BELOW_PLAYER)
/* loaded from: classes4.dex */
public final class wxg implements wxl {
    private final wxk a;
    private final xgh b;
    private final wxm c;

    public wxg(wxk wxkVar, wxm wxmVar, xgh xghVar) {
        this.a = wxkVar;
        this.c = wxmVar;
        this.b = xghVar;
    }

    @Override // defpackage.wxl
    public final void a() {
        wom womVar = this.c.a;
        if (womVar == null) {
            this.a.k(this.b, new wxf("No belowPlayerSpaceAcquirerApi available"));
            return;
        }
        oii oiiVar = (oii) womVar;
        oiiVar.a.clear();
        oiiVar.b = new frp();
        oiiVar.a.add(oiiVar.b);
        this.a.i(this.b);
    }

    @Override // defpackage.wxl
    public final void b() {
        wom womVar = this.c.a;
        if (womVar == null) {
            whu.l(this.b, "No belowPlayerSpaceAcquirerApi when trying to exit slot");
        } else {
            oii oiiVar = (oii) womVar;
            oiiVar.a.remove(oiiVar.b);
            oiiVar.b = null;
        }
        this.a.l(this.b);
    }
}
