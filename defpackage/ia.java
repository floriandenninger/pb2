package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ia extends hz {
    private final Object a;

    public ia(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.hz, defpackage.hy
    public final Object a() {
        Object a;
        synchronized (this.a) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.hz, defpackage.hy
    public final boolean b(Object obj) {
        boolean b;
        synchronized (this.a) {
            b = super.b(obj);
        }
        return b;
    }
}
