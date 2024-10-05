package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcu implements dct {
    private dcs a;
    private final dsm b;

    public dcu(int i) {
        this.b = new dsm(i);
    }

    @Override // defpackage.dct
    public final dcs a(int i, boolean z) {
        if (i == 5 || !z) {
            return dcq.a;
        }
        if (this.a == null) {
            this.a = new dcv(this.b, null);
        }
        return this.a;
    }
}
