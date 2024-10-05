package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class odk implements ayrv {
    public final /* synthetic */ aypy a;
    private final /* synthetic */ int b;

    public /* synthetic */ odk(aypy aypyVar, int i) {
        this.b = i;
        this.a = aypyVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        if (this.b != 0) {
            return this.a.L(new opx((amsx) obj, 1)).Y(eoe.q).av().G(fiv.a);
        }
        return ((Boolean) obj).booleanValue() ? this.a : aypy.W(odl.UNFORCED);
    }
}
