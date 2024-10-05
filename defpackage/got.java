package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class got extends gos {
    public final boolean e;
    public final int f;
    public final boolean g;

    private got(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5) {
        super(i2, i3, i4, i5);
        this.e = z;
        this.f = i;
        this.g = z2;
    }

    public static got a(bri briVar, int i, int i2, int i3, int i4) {
        boolean z = (briVar == null || briVar.b <= 0 || briVar.a == 0) ? false : true;
        int i5 = z ? briVar.b : 0;
        boolean z2 = z && i5 >= i;
        if (z) {
            i2 = briVar.a;
        }
        int i6 = i2;
        int D = fav.D(i6);
        if (z) {
            i4 = briVar.b();
        }
        int i7 = i4;
        if (z) {
            i3 = briVar.a();
        }
        return new got(z, i5, z2, D, i6, i7, i3);
    }
}
