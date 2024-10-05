package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wuv implements wuy {
    private final wob a;
    private final /* synthetic */ int b;

    public wuv(wob wobVar, int i) {
        this.b = i;
        this.a = wobVar;
    }

    @Override // defpackage.wuy
    public final String a() {
        return "";
    }

    @Override // defpackage.wuy
    public final String b(xcp xcpVar) {
        tdt j;
        tdt j2;
        tdt j3;
        int i = this.b;
        if (i == 0) {
            if (xcpVar.d(xcq.class)) {
                j = (tdt) xcpVar.c(xcq.class);
            } else {
                j = this.a.j();
            }
            return j != null ? j.c : "";
        }
        if (i != 1) {
            if (xcpVar.d(xcq.class)) {
                j3 = (tdt) xcpVar.c(xcq.class);
            } else {
                j3 = this.a.j();
            }
            return j3 != null ? j3.b : "";
        }
        if (xcpVar.d(xcq.class)) {
            j2 = (tdt) xcpVar.c(xcq.class);
        } else {
            j2 = this.a.j();
        }
        return j2 != null ? j2.a : "";
    }
}
