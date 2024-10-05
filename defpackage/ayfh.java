package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayfh implements aylj {
    public aygr a;
    public final Object b = new Object();
    public final ayoj c;
    public final aylm d;
    public int e;
    public boolean f;
    public boolean g;
    public final ayoa h;
    public aygf i;
    public ayam j;
    public volatile boolean k;
    public boolean l;
    private boolean m;
    private boolean n;
    private Runnable o;
    private boolean p;

    /* JADX INFO: Access modifiers changed from: protected */
    public ayfh(int i, ayoa ayoaVar, ayoj ayojVar) {
        this.c = ayojVar;
        aylm aylmVar = new aylm(this, ayaa.a, i, ayoaVar, ayojVar);
        this.d = aylmVar;
        this.a = aylmVar;
        this.j = ayam.b;
        this.n = false;
        this.h = ayoaVar;
    }

    @Override // defpackage.aylj
    public final void a(ayoc ayocVar) {
        this.i.d(ayocVar);
    }

    public final void b() {
        boolean c;
        synchronized (this.b) {
            c = c();
        }
        if (c) {
            this.i.e();
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.f && this.e < 32768 && !this.g) {
                z = true;
            }
        }
        return z;
    }

    public final void d(Status status, ayge aygeVar, aycd aycdVar) {
        if (this.m) {
            return;
        }
        this.m = true;
        this.h.l(status);
        this.i.a(status, aygeVar, aycdVar);
        ayoj ayojVar = this.c;
        if (status.f()) {
            ayojVar.c++;
        } else {
            ayojVar.d++;
        }
    }

    @Override // defpackage.aylj
    public final void e(boolean z) {
        amkq.O(this.l, "status should have been reported on deframer closed");
        this.n = true;
        if (this.p && z) {
            f(Status.n.withDescription("Encountered end-of-stream mid-frame"), true, new aycd());
        }
        Runnable runnable = this.o;
        if (runnable != null) {
            runnable.run();
            this.o = null;
        }
    }

    public final void f(Status status, boolean z, aycd aycdVar) {
        ayge aygeVar = ayge.PROCESSED;
        status.getClass();
        aycdVar.getClass();
        if (this.l) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.l = true;
        this.p = status.f();
        synchronized (this.b) {
            this.g = true;
        }
        if (this.n) {
            this.o = null;
            d(status, aygeVar, aycdVar);
            return;
        }
        this.o = new ayfc(this, status, aygeVar, aycdVar);
        if (z) {
            this.a.close();
            return;
        }
        aylm aylmVar = (aylm) this.a;
        if (aylmVar.b()) {
            return;
        }
        if (aylmVar.c()) {
            aylmVar.close();
        } else {
            aylmVar.f = true;
        }
    }
}
