package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahgd extends ahfr {
    final int i;
    private final azrw j;
    private ahkx k;
    private boolean m;
    private float[] n;

    public ahgd(ahku ahkuVar, ahkv ahkvVar, float[] fArr, azrw azrwVar) {
        super(ahkuVar, ahkvVar, azrwVar);
        this.n = null;
        int i = ahkuVar.f;
        this.i = i;
        int length = fArr.length >> 2;
        boolean z = length == i;
        StringBuilder sb = new StringBuilder(99);
        sb.append("Incorrect number of colors in color vertex array ");
        sb.append(length);
        sb.append(" doesn't match vertex count ");
        sb.append(i);
        amkq.F(z, sb.toString());
        this.j = azrwVar;
        this.k = new ahkx(fArr, 4);
    }

    public static float[] h(int i) {
        float[] fArr = new float[4];
        fArr[0] = ((i >> 16) & PrivateKeyType.INVALID) / 255.0f;
        fArr[1] = ((i >> 8) & PrivateKeyType.INVALID) / 255.0f;
        fArr[2] = (i & PrivateKeyType.INVALID) / 255.0f;
        int i2 = (i >> 24) & 127;
        if (i < 0) {
            i2 += 128;
        }
        fArr[3] = i2 / 255.0f;
        return fArr;
    }

    public static float[] s(float[] fArr, int i) {
        int i2 = i * 4;
        float[] fArr2 = new float[i2];
        for (int i3 = 0; i3 < i2; i3 += 4) {
            fArr2[i3] = fArr[0];
            fArr2[i3 + 1] = fArr[1];
            fArr2[i3 + 2] = fArr[2];
            fArr2[i3 + 3] = fArr[3];
        }
        return fArr2;
    }

    public final void g(int i) {
        this.n = s(h(i), this.i);
    }

    @Override // defpackage.ahfr, defpackage.ahim
    public final void i() {
        super.i();
        this.k.b();
    }

    @Override // defpackage.ahfr
    protected final boolean m() {
        return this.m || this.c < 0.99f;
    }

    @Override // defpackage.ahfr
    public final void n() {
        if (this.n != null) {
            this.k.b();
            this.k = new ahkx(this.n, 4);
            this.n = null;
        }
        this.k.a(((ahnp) this.j.get()).b);
    }

    public final void t() {
        this.m = true;
    }
}
