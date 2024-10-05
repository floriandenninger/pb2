package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dkb {
    public final int a;
    public final int b;
    public final int c;

    public dkb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public dkb(int i, int i2, int i3, byte[] bArr) {
        this.c = i;
        this.a = i2;
        this.b = i3;
    }

    public dkb(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.c = i2;
        this.a = i3;
    }

    public dkb(cul culVar) {
        int i = culVar.b.isLowRamDevice() ? culVar.f >> 1 : culVar.f;
        this.a = i;
        int round = Math.round(r2.getMemoryClass() * 1048576 * (true != culVar.b.isLowRamDevice() ? 0.4f : culVar.e));
        float f = culVar.g.a.widthPixels * culVar.g.a.heightPixels * 4;
        int round2 = Math.round(culVar.d * f);
        int round3 = Math.round(f * culVar.c);
        int i2 = round - i;
        if (round3 + round2 <= i2) {
            this.c = round3;
            this.b = round2;
            return;
        }
        float f2 = culVar.d;
        float f3 = culVar.c;
        float f4 = i2 / (f2 + f3);
        this.c = Math.round(f3 * f4);
        this.b = Math.round(f4 * culVar.d);
    }

    public final int a() {
        return this.b + this.a;
    }

    public final int b() {
        return this.c + this.a;
    }
}
