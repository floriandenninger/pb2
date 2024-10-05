package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahil implements ahfq {
    public float[] a;
    public float[] b;
    private final ahik c;
    private final ahfp d = new ahfp();

    public ahil(ahik ahikVar, float[] fArr, float[] fArr2) {
        this.c = ahikVar;
        this.a = fArr;
        this.b = fArr2;
    }

    public static float[] b(float f) {
        return new float[]{f, f, f};
    }

    @Override // defpackage.ahfq
    public final void a(boolean z, long j) {
        this.d.b(z, j);
        float a = this.d.a();
        ahik ahikVar = this.c;
        float[] fArr = this.b;
        float f = fArr[0];
        float f2 = 1.0f - a;
        float[] fArr2 = this.a;
        ahikVar.rJ((f * a) + (fArr2[0] * f2), (fArr[1] * a) + (fArr2[1] * f2), (a * fArr[2]) + (f2 * fArr2[2]));
    }
}
