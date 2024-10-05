package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qrx {
    private static final Feature[] a = new Feature[0];
    public final int A;
    public volatile String B;
    public ConnectionResult C;
    public boolean D;
    public volatile ConnectionInfo E;
    protected AtomicInteger F;
    public qsv G;
    private volatile String b;
    private final qsi c;
    private final qmz d;
    private IInterface e;
    private qrt f;
    private final String g;
    qsn p;
    public final Context q;
    public final Looper r;
    final Handler s;
    public final Object t;
    public final Object u;
    protected qrs v;
    public final ArrayList w;
    public int x;
    public final qro y;
    public final qrp z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qrx(android.content.Context r10, android.os.Looper r11, int r12, defpackage.qro r13, defpackage.qrp r14) {
        /*
            r9 = this;
            qsi r3 = defpackage.qsi.a(r10)
            qmz r4 = defpackage.qmz.d
            defpackage.qip.an(r13)
            defpackage.qip.an(r14)
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrx.<init>(android.content.Context, android.os.Looper, int, qro, qrp):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(int i, IInterface iInterface) {
        qsn qsnVar;
        qip.ao((i == 4) == (iInterface != null));
        synchronized (this.t) {
            this.x = i;
            this.e = iInterface;
            if (i == 1) {
                qrt qrtVar = this.f;
                if (qrtVar != null) {
                    qsi qsiVar = this.c;
                    qsn qsnVar2 = this.p;
                    String str = qsnVar2.a;
                    String str2 = qsnVar2.b;
                    int i2 = qsnVar2.c;
                    E();
                    qsiVar.e(str, qrtVar, this.p.d);
                    this.f = null;
                }
            } else if (i == 2 || i == 3) {
                qrt qrtVar2 = this.f;
                if (qrtVar2 != null && (qsnVar = this.p) != null) {
                    String str3 = qsnVar.a;
                    String str4 = qsnVar.b;
                    StringBuilder sb = new StringBuilder(str3.length() + 70 + str4.length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str3);
                    sb.append(" on ");
                    sb.append(str4);
                    Log.e("GmsClient", sb.toString());
                    qsi qsiVar2 = this.c;
                    qsn qsnVar3 = this.p;
                    String str5 = qsnVar3.a;
                    String str6 = qsnVar3.b;
                    int i3 = qsnVar3.c;
                    E();
                    qsiVar2.e(str5, qrtVar2, this.p.d);
                    this.F.incrementAndGet();
                }
                qrt qrtVar3 = new qrt(this, this.F.get());
                this.f = qrtVar3;
                qsn qsnVar4 = new qsn(d(), g());
                this.p = qsnVar4;
                if (qsnVar4.d && a() < 17895000) {
                    String str7 = this.p.a;
                    throw new IllegalStateException(str7.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(str7) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                qsi qsiVar3 = this.c;
                qsn qsnVar5 = this.p;
                String str8 = qsnVar5.a;
                String str9 = qsnVar5.b;
                int i4 = qsnVar5.c;
                String E = E();
                boolean z = this.p.d;
                O();
                if (!qsiVar3.b(new qsh(str8, z), qrtVar3, E)) {
                    qsn qsnVar6 = this.p;
                    String str10 = qsnVar6.a;
                    String str11 = qsnVar6.b;
                    StringBuilder sb2 = new StringBuilder(str10.length() + 34 + str11.length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str10);
                    sb2.append(" on ");
                    sb2.append(str11);
                    Log.w("GmsClient", sb2.toString());
                    P(16, this.F.get());
                }
            } else if (i == 4) {
                qip.an(iInterface);
                System.currentTimeMillis();
            }
        }
    }

    public final void A() {
    }

    public final void B(qsp qspVar, Set set) {
        Bundle i = i();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.A, this.B);
        getServiceRequest.d = this.q.getPackageName();
        getServiceRequest.g = i;
        if (set != null) {
            getServiceRequest.f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (j()) {
            Account C = C();
            if (C == null) {
                C = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.h = C;
            if (qspVar != null) {
                getServiceRequest.e = qspVar.a;
            }
        } else if (L()) {
            getServiceRequest.h = C();
        }
        getServiceRequest.i = M();
        getServiceRequest.j = h();
        if (R()) {
            getServiceRequest.m = true;
        }
        try {
            synchronized (this.u) {
                qsv qsvVar = this.G;
                if (qsvVar != null) {
                    qsu qsuVar = new qsu(this, this.F.get());
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        obtain.writeStrongBinder(qsuVar);
                        obtain.writeInt(1);
                        qmu.a(getServiceRequest, obtain, 0);
                        qsvVar.a.transact(46, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            I(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m(8, null, null, this.F.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m(8, null, null, this.F.get());
        }
    }

    public Account C() {
        return null;
    }

    public final IInterface D() {
        IInterface iInterface;
        synchronized (this.t) {
            if (this.x == 5) {
                throw new DeadObjectException();
            }
            H();
            iInterface = this.e;
            qip.az(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    protected final String E() {
        String str = this.g;
        return str == null ? this.q.getClass().getName() : str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Set F() {
        return Collections.emptySet();
    }

    public final void G() {
        int h = this.d.h(this.q, a());
        if (h != 0) {
            k(1, null);
            this.v = new qru(this);
            Handler handler = this.s;
            handler.sendMessage(handler.obtainMessage(3, this.F.get(), h, null));
            return;
        }
        v(new qru(this));
    }

    public final void H() {
        if (!w()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final void I(int i) {
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(6, this.F.get(), i));
    }

    public final boolean J(int i, int i2, IInterface iInterface) {
        synchronized (this.t) {
            if (this.x != i) {
                return false;
            }
            k(i2, iInterface);
            return true;
        }
    }

    public final boolean K() {
        return this.E != null;
    }

    public boolean L() {
        return false;
    }

    public Feature[] M() {
        return a;
    }

    protected void O() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void P(int i, int i2) {
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new qrw(this, i)));
    }

    public boolean R() {
        return false;
    }

    public int a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract IInterface b(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String c();

    protected abstract String d();

    public void f(String str) {
        this.b = str;
        l();
    }

    protected boolean g() {
        return false;
    }

    public Feature[] h() {
        return a;
    }

    protected Bundle i() {
        return new Bundle();
    }

    public boolean j() {
        return false;
    }

    public void l() {
        this.F.incrementAndGet();
        synchronized (this.w) {
            int size = this.w.size();
            for (int i = 0; i < size; i++) {
                ((qrr) this.w.get(i)).e();
            }
            this.w.clear();
        }
        synchronized (this.u) {
            this.G = null;
        }
        k(1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.s;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new qrv(this, i, iBinder, bundle)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        System.currentTimeMillis();
    }

    public void r() {
    }

    public final String s() {
        qsn qsnVar;
        if (!w() || (qsnVar = this.p) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return qsnVar.b;
    }

    public final String t() {
        return this.b;
    }

    public final void v(qrs qrsVar) {
        qip.az(qrsVar, "Connection progress callbacks cannot be null.");
        this.v = qrsVar;
        k(2, null);
    }

    public final boolean w() {
        boolean z;
        synchronized (this.t) {
            z = this.x == 4;
        }
        return z;
    }

    public final boolean x() {
        boolean z;
        synchronized (this.t) {
            int i = this.x;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final Feature[] y() {
        ConnectionInfo connectionInfo = this.E;
        if (connectionInfo == null) {
            return null;
        }
        return connectionInfo.b;
    }

    public final void z(qpt qptVar) {
        qptVar.a.l.o.post(new qps(qptVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public qrx(Context context, Looper looper, qsi qsiVar, qmz qmzVar, int i, qro qroVar, qrp qrpVar, String str) {
        this.b = null;
        this.t = new Object();
        this.u = new Object();
        this.w = new ArrayList();
        this.x = 1;
        this.C = null;
        this.D = false;
        this.E = null;
        this.F = new AtomicInteger(0);
        qip.az(context, "Context must not be null");
        this.q = context;
        qip.az(looper, "Looper must not be null");
        this.r = looper;
        qip.az(qsiVar, "Supervisor must not be null");
        this.c = qsiVar;
        qip.az(qmzVar, "API availability must not be null");
        this.d = qmzVar;
        this.s = new qrq(this, looper);
        this.A = i;
        this.y = qroVar;
        this.z = qrpVar;
        this.g = str;
    }
}
