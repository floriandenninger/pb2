package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class xkt {
    public Object b;
    public Object c;
    public boolean d;
    public boolean e = false;

    public xkt(Object obj) {
        this.b = obj;
    }

    public abstract void b(Object obj, boolean z);

    public final void c(Object obj) {
        this.e = true;
        this.c = obj;
        d();
        Object obj2 = this.b;
        if (obj2 != null) {
            e(obj2, this.d);
        }
    }

    public abstract void d();

    public final void e(Object obj, boolean z) {
        if (this.e) {
            b(obj, z);
        }
        this.b = obj;
        this.d = z;
    }
}
