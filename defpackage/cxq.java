package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxq extends cxu {
    @Override // defpackage.cxu
    public final float a(int i, int i2, int i3, int i4) {
        return Math.min(1.0f, a.a(i, i2, i3, i4));
    }

    @Override // defpackage.cxu
    public final int b(int i, int i2, int i3, int i4) {
        if (a(i, i2, i3, i4) == 1.0f) {
            return 2;
        }
        return a.b(i, i2, i3, i4);
    }
}
