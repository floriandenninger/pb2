package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rpv {
    public final rpx a = new rpx();

    public final void a(Exception exc) {
        this.a.s(exc);
    }

    public final void b(Object obj) {
        this.a.t(obj);
    }

    public final boolean c(Exception exc) {
        rpx rpxVar = this.a;
        qip.az(exc, "Exception must not be null");
        synchronized (rpxVar.a) {
            if (rpxVar.b) {
                return false;
            }
            rpxVar.b = true;
            rpxVar.e = exc;
            rpxVar.f.d(rpxVar);
            return true;
        }
    }

    public final boolean d(Object obj) {
        rpx rpxVar = this.a;
        synchronized (rpxVar.a) {
            if (rpxVar.b) {
                return false;
            }
            rpxVar.b = true;
            rpxVar.d = obj;
            rpxVar.f.d(rpxVar);
            return true;
        }
    }
}
