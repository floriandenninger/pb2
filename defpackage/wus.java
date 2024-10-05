package defpackage;

/* compiled from: PG */
@wux(a = xct.class)
/* loaded from: classes4.dex */
public final class wus implements wuy {
    private final /* synthetic */ int a;

    public wus(int i) {
        this.a = i;
    }

    @Override // defpackage.wuy
    public final String a() {
        return this.a != 2 ? "0" : "";
    }

    @Override // defpackage.wuy
    public final String b(xcp xcpVar) {
        int i = this.a;
        if (i == 0) {
            return Integer.toString(((xbm) xcpVar.c(xct.class)).b());
        }
        if (i == 1) {
            return true != ((xbm) xcpVar.c(xct.class)).e() ? "0" : "1";
        }
        if (i == 2) {
            String str = ((xbm) xcpVar.c(xct.class)).b;
            return str != null ? str : "";
        }
        if (i == 3) {
            return Integer.toString(((xbm) xcpVar.c(xct.class)).a());
        }
        return Integer.toString(((xbm) xcpVar.c(xct.class)).c());
    }
}
