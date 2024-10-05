package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import io.grpc.Status;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aydy extends aydz implements aygo, ayds {
    public final aydr a;
    public final aydt b;
    public final AtomicInteger c;
    public aylh d;
    private final Executor p;
    private int q;
    private final aynz r;
    private final ayep s;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aydy(android.content.Context r6, defpackage.aydn r7, java.util.concurrent.Executor r8, defpackage.aynz r9, defpackage.aynz r10, defpackage.aydr r11, defpackage.axzj r12) {
        /*
            r5 = this;
            axzh r0 = defpackage.axzj.a()
            axzi r1 = defpackage.ayiq.a
            aycy r2 = defpackage.aycy.NONE
            r0.b(r1, r2)
            axzi r1 = defpackage.ayiq.b
            r0.b(r1, r12)
            axzi r12 = defpackage.ayar.b
            java.lang.Class r1 = r6.getClass()
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r6, r1)
            aydn r1 = defpackage.aydn.b(r2)
            r0.b(r12, r1)
            axzi r12 = defpackage.ayar.a
            r0.b(r12, r7)
            axzi r12 = defpackage.aydy.g
            r1 = 0
            r0.b(r12, r1)
            axzj r12 = r0.a()
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getSimpleName()
            android.content.ComponentName r1 = r7.a()
            java.lang.String r1 = r1.toShortString()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 2
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = "->"
            r4.append(r0)
            r4.append(r1)
            java.lang.Class<aydy> r0 = defpackage.aydy.class
            java.lang.String r1 = r4.toString()
            aybc r0 = defpackage.aybc.a(r0, r1)
            r5.<init>(r9, r12, r0)
            r9 = 1001(0x3e9, float:1.403E-42)
            r5.q = r9
            r5.r = r10
            r5.a = r11
            java.lang.Object r9 = r10.b()
            r5.p = r9
            java.util.concurrent.atomic.AtomicInteger r9 = new java.util.concurrent.atomic.AtomicInteger
            r9.<init>()
            r5.c = r9
            ayep r9 = new ayep
            r9.<init>()
            r5.s = r9
            ayen r9 = new ayen
            android.content.Intent r7 = r7.a
            android.content.Intent r7 = r7.cloneFilter()
            r9.<init>(r8, r6, r7, r5)
            r5.b = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aydy.<init>(android.content.Context, aydn, java.util.concurrent.Executor, aynz, aynz, aydr, axzj):void");
    }

    private static aygd u(Status status, axzj axzjVar, aycd aycdVar, ayep[] ayepVarArr) {
        ayoa.m(ayepVarArr, axzjVar, aycdVar).c();
        return new ayii(status, ayepVarArr, null, null, null);
    }

    @Override // defpackage.ayds
    public final synchronized void a(IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInt(1);
        obtain.writeStrongBinder(this.i);
        try {
            if (!iBinder.transact(1, obtain, null, 1)) {
                p(Status.o.withDescription("Failed sending SETUP_TRANSPORT transaction"), true);
            }
        } catch (RemoteException e) {
            p(aydz.n(e), true);
        }
        obtain.recycle();
    }

    @Override // defpackage.ayds
    public final synchronized void b(Status status) {
        p(status, true);
    }

    @Override // defpackage.ayli
    public final synchronized Runnable d(aylh aylhVar) {
        this.d = aylhVar;
        return new Runnable() { // from class: aydw
            @Override // java.lang.Runnable
            public final void run() {
                aydy aydyVar = aydy.this;
                synchronized (aydyVar) {
                    if (aydyVar.t(1)) {
                        aydyVar.s(2);
                        aydyVar.b.a();
                    }
                }
            }
        };
    }

    @Override // defpackage.aydz
    protected final void e(Parcel parcel) {
        ayep ayepVar = this.s;
        parcel.readInt();
        ayepVar.e();
    }

    @Override // defpackage.aydz
    protected final void f(Parcel parcel) {
        aycy aycyVar;
        axzj axzjVar = this.k;
        int callingUid = Binder.getCallingUid();
        axzh b = axzjVar.b();
        b.b(f, Integer.valueOf(callingUid));
        axzi axziVar = ayiq.a;
        if (callingUid == Process.myUid()) {
            aycyVar = aycy.PRIVACY_AND_INTEGRITY;
        } else {
            aycyVar = aycy.INTEGRITY;
        }
        b.b(axziVar, aycyVar);
        this.k = b.a();
        if (t(2)) {
            int readInt = parcel.readInt();
            final IBinder readStrongBinder = parcel.readStrongBinder();
            if (readInt != 1) {
                p(Status.o.withDescription("Wire format version mismatch"), true);
            } else if (readStrongBinder == null) {
                p(Status.o.withDescription("Malformed SETUP_TRANSPORT data"), true);
            } else {
                this.p.execute(new Runnable() { // from class: aydx
                    @Override // java.lang.Runnable
                    public final void run() {
                        Integer num;
                        Status a;
                        aydy aydyVar = aydy.this;
                        IBinder iBinder = readStrongBinder;
                        synchronized (aydyVar) {
                            num = (Integer) aydyVar.k.c(aydy.f);
                        }
                        if (num == null) {
                            a = Status.i.withDescription("No remote UID available");
                        } else {
                            a = aydyVar.a.a(num.intValue());
                        }
                        synchronized (aydyVar) {
                            if (aydyVar.t(2)) {
                                if (!a.f()) {
                                    aydyVar.p(a, true);
                                } else {
                                    aydyVar.m = iBinder;
                                    try {
                                        iBinder.linkToDeath(aydyVar, 0);
                                        if (!aydyVar.r()) {
                                            aydyVar.s(3);
                                            aydyVar.d.b();
                                        }
                                    } catch (RemoteException unused) {
                                        aydyVar.p(Status.o.withDescription("Failed to observe outgoing binder"), true);
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.aydz
    public final void g(Status status) {
        this.d.c(status);
    }

    @Override // defpackage.aydz
    public final void h() {
        if (this.c.getAndSet(0) > 0) {
            this.d.a(false);
        }
        ((ayen) this.b).c(Status.c);
        this.d.d();
    }

    @Override // defpackage.aydz
    public final void i() {
        this.o.c(this.h);
        this.r.c(this.p);
    }

    @Override // defpackage.ayli
    public final synchronized void j(Status status) {
        status.getClass();
        p(status, false);
    }

    @Override // defpackage.ayli
    public final synchronized void k(Status status) {
        status.getClass();
        p(status, true);
    }

    @Override // defpackage.aygg
    public final synchronized aygd l(aych aychVar, aycd aycdVar, axzo axzoVar, ayep[] ayepVarArr) {
        if (r()) {
            return u(this.l, this.k, aycdVar, ayepVarArr);
        }
        int i = this.q;
        int i2 = i + 1;
        this.q = i2;
        if (i2 == 16777215) {
            this.q = 1001;
        }
        ayoa m = ayoa.m(ayepVarArr, this.k, aycdVar);
        ayec ayecVar = new ayec(this, this.k, i, ayiu.h(axzoVar));
        if (this.j.putIfAbsent(Integer.valueOf(i), ayecVar) == null) {
            if (ayecVar.a && this.c.getAndIncrement() == 0) {
                this.d.a(true);
            }
            ayej ayejVar = new ayej(this, i, aychVar, aycdVar, m);
            if (aychVar.a.a()) {
                return new ayeo(ayecVar, ayejVar);
            }
            return new ayei(ayecVar, ayejVar);
        }
        Status withDescription = Status.n.withDescription("Clashing call IDs");
        p(withDescription, true);
        return u(withDescription, this.k, aycdVar, ayepVarArr);
    }
}
