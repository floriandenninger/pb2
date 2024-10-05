package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dlh {
    public final int a;
    public int b = 0;
    private final hy c;

    public dlh(int i) {
        this.a = i;
        this.c = new ia(i);
    }

    public final void c(Object obj) {
        synchronized (this) {
            this.c.b(obj);
            this.b = Math.min(this.a, this.b + 1);
        }
    }

    public final Object d() {
        Object a;
        synchronized (this) {
            a = this.c.a();
            this.b = Math.max(0, this.b - 1);
        }
        return a;
    }
}
