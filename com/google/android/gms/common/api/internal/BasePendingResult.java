package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.qip;
import defpackage.qof;
import defpackage.qoh;
import defpackage.qoi;
import defpackage.qoj;
import defpackage.qom;
import defpackage.qon;
import defpackage.qoo;
import defpackage.qpg;
import defpackage.qph;
import defpackage.qpi;
import defpackage.qpz;
import defpackage.qrg;
import defpackage.qsq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class BasePendingResult extends qoi {
    public static final ThreadLocal e = new qpg();
    private final CountDownLatch a;
    private final ArrayList b;
    private qon c;
    private final AtomicReference d;
    public final Object f;
    protected final qph g;
    public qom h;
    public boolean i;
    public qsq j;
    private Status k;
    private volatile boolean l;
    private boolean m;
    private qpi mResultGuardian;
    private boolean n;
    private volatile qoo o;

    @Deprecated
    BasePendingResult() {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.i = false;
        this.g = new qph(Looper.getMainLooper());
        new WeakReference(null);
    }

    private final void c(qom qomVar) {
        this.h = qomVar;
        this.k = qomVar.a();
        this.j = null;
        this.a.countDown();
        if (this.m) {
            this.c = null;
        } else {
            qon qonVar = this.c;
            if (qonVar == null) {
                if (this.h instanceof qoj) {
                    this.mResultGuardian = new qpi(this);
                }
            } else {
                this.g.removeMessages(2);
                this.g.a(qonVar, q());
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qoh) arrayList.get(i)).a(this.k);
        }
        this.b.clear();
    }

    public static void m(qom qomVar) {
        if (qomVar instanceof qoj) {
            try {
                ((qoj) qomVar).b();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(qomVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    private final qom q() {
        qom qomVar;
        synchronized (this.f) {
            qip.aw(!this.l, "Result has already been consumed.");
            qip.aw(p(), "Result is not ready.");
            qomVar = this.h;
            this.h = null;
            this.c = null;
            this.l = true;
        }
        qrg qrgVar = (qrg) this.d.getAndSet(null);
        if (qrgVar != null) {
            qrgVar.a();
        }
        qip.an(qomVar);
        return qomVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract qom a(Status status);

    @Override // defpackage.qoi
    public final void e(qoh qohVar) {
        qip.ap(qohVar != null, "Callback cannot be null.");
        synchronized (this.f) {
            if (!p()) {
                this.b.add(qohVar);
            } else {
                qohVar.a(this.k);
            }
        }
    }

    @Override // defpackage.qoi
    public final void f() {
        synchronized (this.f) {
            if (!this.m && !this.l) {
                qsq qsqVar = this.j;
                if (qsqVar != null) {
                    try {
                        qsqVar.pq(2, qsqVar.pn());
                    } catch (RemoteException unused) {
                    }
                }
                m(this.h);
                this.m = true;
                c(a(Status.e));
            }
        }
    }

    @Override // defpackage.qoi
    public final void g(qon qonVar) {
        synchronized (this.f) {
            if (qonVar == null) {
                this.c = null;
                return;
            }
            qip.aw(!this.l, "Result has already been consumed.");
            qip.aw(true, "Cannot set callbacks if then() has been called.");
            if (o()) {
                return;
            }
            if (p()) {
                this.g.a(qonVar, q());
            } else {
                this.c = qonVar;
            }
        }
    }

    @Override // defpackage.qoi
    public final qom h(TimeUnit timeUnit) {
        qip.aw(!this.l, "Result has already been consumed.");
        qip.aw(true, "Cannot await if then() has been called.");
        try {
            if (!this.a.await(0L, timeUnit)) {
                l(Status.d);
            }
        } catch (InterruptedException unused) {
            l(Status.b);
        }
        qip.aw(p(), "Result is not ready.");
        return q();
    }

    @Override // defpackage.qoi
    public final void i(qon qonVar, TimeUnit timeUnit) {
        synchronized (this.f) {
            qip.aw(!this.l, "Result has already been consumed.");
            qip.aw(true, "Cannot set callbacks if then() has been called.");
            if (o()) {
                return;
            }
            if (p()) {
                this.g.a(qonVar, q());
            } else {
                this.c = qonVar;
                qph qphVar = this.g;
                qphVar.sendMessageDelayed(qphVar.obtainMessage(2, this), timeUnit.toMillis(3L));
            }
        }
    }

    @Deprecated
    public final void l(Status status) {
        synchronized (this.f) {
            if (!p()) {
                n(a(status));
                this.n = true;
            }
        }
    }

    public final boolean o() {
        boolean z;
        synchronized (this.f) {
            z = this.m;
        }
        return z;
    }

    public final boolean p() {
        return this.a.getCount() == 0;
    }

    public final void n(qom qomVar) {
        synchronized (this.f) {
            if (this.n || this.m) {
                m(qomVar);
                return;
            }
            p();
            qip.aw(!p(), "Results have already been set");
            qip.aw(!this.l, "Result has already been consumed");
            c(qomVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public BasePendingResult(Looper looper) {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.i = false;
        this.g = new qph(looper);
        new WeakReference(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BasePendingResult(qof qofVar) {
        this.f = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.i = false;
        this.g = new qph(qofVar != null ? ((qpz) qofVar).a.B : Looper.getMainLooper());
        new WeakReference(qofVar);
    }
}
