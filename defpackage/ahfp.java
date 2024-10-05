package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahfp {
    private long b;
    private long c;
    private boolean d = false;
    public int a = 200;

    public final float a() {
        float f = ((float) (this.b - this.c)) / this.a;
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        return this.d ? 1.0f - f : f;
    }

    public final void b(boolean z, long j) {
        this.c = j;
        if (this.d != z) {
            long j2 = this.b;
            if (j < j2) {
                this.b = ((this.a + j) + j) - j2;
            } else {
                this.b = j + this.a;
            }
        }
        this.d = z;
    }
}
