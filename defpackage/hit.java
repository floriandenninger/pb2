package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hit implements ayrs {
    public final /* synthetic */ hiw a;
    private final /* synthetic */ int b;

    public /* synthetic */ hit(hiw hiwVar, int i) {
        this.b = i;
        this.a = hiwVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            hiw hiwVar = this.a;
            hiwVar.b.g(Long.MIN_VALUE, jqr.c(hiwVar.a.g, apxf.a, 117497));
        } else if (i == 1) {
            hiw hiwVar2 = this.a;
            hiwVar2.a.i(hiwVar2.b.j() != null ? jqr.c(hiwVar2.b.j().a, apxf.a, 116666) : null);
        } else {
            hiw hiwVar3 = this.a;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            hiwVar3.c.setEnabled(booleanValue);
            wcy.x(hiwVar3.c.getContext(), hiwVar3.c, booleanValue);
        }
    }
}
