package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ohv implements ajwv {
    private final /* synthetic */ int a;

    public ohv(int i) {
        this.a = i;
    }

    public static boolean d(Object obj) {
        return (obj instanceof auvw) || (obj instanceof aptm);
    }

    @Override // defpackage.ajwv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ajwv
    public final ammy e() {
        int i = this.a;
        return i != 0 ? i != 1 ? mjw.m : mjw.k : ammz.NOT_NULL;
    }

    @Override // defpackage.ajwv
    public final /* synthetic */ void b(Object obj, ajwu ajwuVar) {
        aooy m;
        aooy Z;
        int i = this.a;
        if (i == 0) {
            aulq aulqVar = (aulq) obj;
            if (aulqVar == null || (m = ahbj.m(aulqVar)) == null) {
                return;
            }
            ajwuVar.a(m);
            return;
        }
        if (i == 1) {
            return;
        }
        askg askgVar = (askg) obj;
        if (askgVar == null || (Z = whu.Z(askgVar)) == null) {
            return;
        }
        ajwuVar.a(Z);
    }
}
