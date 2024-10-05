package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qrr {
    public Object d;
    public boolean e = false;
    final /* synthetic */ qrx f;

    public qrr(qrx qrxVar, Object obj) {
        this.f = qrxVar;
        this.d = obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void d();

    public final void e() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void f() {
        e();
        synchronized (this.f.w) {
            this.f.w.remove(this);
        }
    }
}
