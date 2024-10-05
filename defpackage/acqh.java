package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqh implements ypb {
    final /* synthetic */ acql a;
    private final /* synthetic */ int b;

    public acqh(acql acqlVar, int i) {
        this.b = i;
        this.a = acqlVar;
    }

    @Override // defpackage.ypb
    public final /* synthetic */ void a(Object obj) {
        if (this.b != 0) {
            acql acqlVar = this.a;
            if (acqlVar.c) {
                acqlVar.d();
                return;
            } else {
                ynm.m(acqlVar.a(), abbr.e);
                return;
            }
        }
        afto aftoVar = (afto) obj;
        acql acqlVar2 = this.a;
        if (acqlVar2.c) {
            if (aftoVar.a()) {
                return;
            }
            this.a.d();
            return;
        }
        ynm.m(acqlVar2.a(), abbr.f);
    }
}
