package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class axix {
    protected int a = 0;
    protected double b = 0.0d;

    public final synchronized double a() {
        return this.b;
    }

    public synchronized int b() {
        return this.a;
    }

    public void c(int i) {
    }

    public synchronized void d(int i, double d) {
        this.a = i;
        this.b = d;
    }
}
