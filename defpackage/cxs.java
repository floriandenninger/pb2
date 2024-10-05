package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxs extends cxu {
    @Override // defpackage.cxu
    public final float a(int i, int i2, int i3, int i4) {
        if (g) {
            return Math.min(i3 / i, i4 / i2);
        }
        if (Math.max(i2 / i4, i / i3) == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(r2);
    }

    @Override // defpackage.cxu
    public final int b(int i, int i2, int i3, int i4) {
        return g ? 2 : 1;
    }
}
