package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbn implements actc {
    private final /* synthetic */ int a;

    public fbn(int i) {
        this.a = i;
    }

    @Override // defpackage.actc
    public final actb a(actg actgVar) {
        int i = this.a;
        if (i == 0) {
            return new fbo(actgVar.a().a(), actgVar.e().t());
        }
        if (i == 1) {
            return new faz(actgVar.a().a(), actgVar.e().t());
        }
        if (i == 2) {
            return new fet(actgVar.a().a(), actgVar.e().t());
        }
        if (i == 3) {
            return new acxn(actgVar.a().a(), actgVar.e().t());
        }
        if (i == 4) {
            return new acxr(actgVar.a().a(), actgVar.e().t());
        }
        if (i == 5) {
            return new fcq(actgVar.a().a(), actgVar.e().t(), null);
        }
        return new fcs(actgVar.a().a(), actgVar.e().t(), null);
    }
}
