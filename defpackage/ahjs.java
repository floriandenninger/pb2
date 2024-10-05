package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahjs implements ahfq {
    public float[] a;
    private final ahim b;
    private final ahfp c;
    private final float[] d;

    public ahjs(ahim ahimVar, float[] fArr, float[] fArr2) {
        ahimVar.getClass();
        this.b = ahimVar;
        this.d = fArr;
        this.a = fArr2;
        this.c = new ahfp();
    }

    @Override // defpackage.ahfq
    public final void a(boolean z, long j) {
        float a = this.c.a();
        this.c.b(z, j);
        float a2 = this.c.a() - a;
        ahim ahimVar = this.b;
        float[] fArr = this.a;
        float f = fArr[0];
        float f2 = 1.0f - a2;
        float[] fArr2 = this.d;
        ahimVar.l((f * a2) + (fArr2[0] * f2), (fArr[1] * a2) + (fArr2[1] * f2), (a2 * fArr[2]) + (f2 * fArr2[2]));
    }
}
