package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeso {
    long a = -1;
    int b = -1;

    public final void a(long j) {
        boolean z = true;
        if (j < 0 && j != -1) {
            z = false;
        }
        afki.b(z);
        this.a = j;
    }

    public final void b(int i) {
        afki.b(i >= 0);
        afki.b(this.a >= 0);
        double d = this.a;
        Double.isNaN(d);
        double d2 = i;
        Double.isNaN(d2);
        this.b = (int) (((d / 1000000.0d) * d2) / 8.0d);
    }

    public final aeqp c() {
        return new aeqp(this.a, this.b);
    }
}
