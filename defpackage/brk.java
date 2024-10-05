package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brk {
    public static final brk a;
    public static final brk b;
    public static final brk c;
    public static final brk d;
    public static final brk e;
    public static final brk f;
    final float[] g;
    final float[] h;
    final float[] i;
    final boolean j = true;

    static {
        brk brkVar = new brk();
        a = brkVar;
        e(brkVar);
        h(brkVar);
        brk brkVar2 = new brk();
        b = brkVar2;
        g(brkVar2);
        h(brkVar2);
        brk brkVar3 = new brk();
        c = brkVar3;
        d(brkVar3);
        h(brkVar3);
        brk brkVar4 = new brk();
        d = brkVar4;
        e(brkVar4);
        f(brkVar4);
        brk brkVar5 = new brk();
        e = brkVar5;
        g(brkVar5);
        f(brkVar5);
        brk brkVar6 = new brk();
        f = brkVar6;
        d(brkVar6);
        f(brkVar6);
    }

    public brk() {
        float[] fArr = new float[3];
        this.g = fArr;
        float[] fArr2 = new float[3];
        this.h = fArr2;
        this.i = r0;
        i(fArr);
        i(fArr2);
        float[] fArr3 = {0.24f, 0.52f, 0.24f};
    }

    private static void d(brk brkVar) {
        float[] fArr = brkVar.h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void e(brk brkVar) {
        float[] fArr = brkVar.h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void f(brk brkVar) {
        float[] fArr = brkVar.g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void g(brk brkVar) {
        float[] fArr = brkVar.h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void h(brk brkVar) {
        float[] fArr = brkVar.g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void i(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public final float a() {
        return this.i[1];
    }

    public final float b() {
        return this.i[2];
    }

    public final float c() {
        return this.i[0];
    }
}
