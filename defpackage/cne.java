package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cne implements cnn {
    public int a;
    private int b;
    private final int c;
    private final float d;

    public cne() {
        this(2500, 1, 1.0f);
    }

    public cne(int i, int i2, float f) {
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    @Override // defpackage.cnn
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cnn
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cnn
    public void c(cnq cnqVar) {
        int i = this.a + 1;
        this.a = i;
        int i2 = this.b;
        this.b = i2 + ((int) (i2 * this.d));
        if (i > this.c) {
            throw cnqVar;
        }
    }
}
