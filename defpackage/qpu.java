package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qpu implements qod, qoe {
    public final qnv b;
    public final qox c;
    public final qpm d;
    public final int g;
    public boolean h;
    public final /* synthetic */ qpy l;
    private final qqx m;
    public final Queue a = new LinkedList();
    public final Set e = new HashSet();
    public final Map f = new HashMap();
    public final List i = new ArrayList();
    public ConnectionResult j = null;
    public int k = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public qpu(qpy qpyVar, qob qobVar) {
        this.l = qpyVar;
        Looper looper = qpyVar.o.getLooper();
        qrz a = qobVar.r().a();
        qar qarVar = qobVar.y.c;
        qip.an(qarVar);
        qnv s = qarVar.s(qobVar.w, looper, a, qobVar.z, this, this);
        String str = qobVar.x;
        if (str != null) {
            ((qrx) s).B = str;
        }
        this.b = s;
        this.c = qobVar.A;
        this.d = new qpm();
        this.g = qobVar.C;
        if (s.j()) {
            this.m = new qqx(qpyVar.g, qpyVar.o, qobVar.r().a());
        } else {
            this.m = null;
        }
    }

    private final Feature p(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] y = this.b.y();
            if (y == null) {
                y = new Feature[0];
            }
            adz adzVar = new adz(y.length);
            for (Feature feature : y) {
                adzVar.put(feature.a, Long.valueOf(feature.a()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) adzVar.get(feature2.a);
                if (l == null || l.longValue() < feature2.a()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final Status q(ConnectionResult connectionResult) {
        return qpy.a(this.c, connectionResult);
    }

    private final void r(ConnectionResult connectionResult) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((qoy) it.next()).a(this.c, connectionResult, qar.j(connectionResult, ConnectionResult.a) ? this.b.s() : null);
        }
        this.e.clear();
    }

    private final void s(Status status, Exception exc, boolean z) {
        qip.ar(this.l.o);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            qow qowVar = (qow) it.next();
            if (!z || qowVar.c == 2) {
                if (status != null) {
                    qowVar.d(status);
                } else {
                    qowVar.e(exc);
                }
                it.remove();
            }
        }
    }

    private final void t(qow qowVar) {
        qowVar.g(this.d, o());
        try {
            qowVar.f(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.b.f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean u(qow qowVar) {
        if (!(qowVar instanceof qoq)) {
            t(qowVar);
            return true;
        }
        qoq qoqVar = (qoq) qowVar;
        Feature p = p(qoqVar.b(this));
        if (p == null) {
            t(qowVar);
            return true;
        }
        String name = this.b.getClass().getName();
        String str = p.a;
        long a = p.a();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(a);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.l.p || !qoqVar.a(this)) {
            qoqVar.e(new qop(p));
            return true;
        }
        qpv qpvVar = new qpv(this.c, p);
        int indexOf = this.i.indexOf(qpvVar);
        if (indexOf >= 0) {
            qpv qpvVar2 = (qpv) this.i.get(indexOf);
            this.l.o.removeMessages(15, qpvVar2);
            Handler handler = this.l.o;
            handler.sendMessageDelayed(Message.obtain(handler, 15, qpvVar2), 5000L);
            return false;
        }
        this.i.add(qpvVar);
        Handler handler2 = this.l.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, qpvVar), 5000L);
        Handler handler3 = this.l.o;
        handler3.sendMessageDelayed(Message.obtain(handler3, 16, qpvVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (v(connectionResult)) {
            return false;
        }
        this.l.i(connectionResult, this.g);
        return false;
    }

    private final boolean v(ConnectionResult connectionResult) {
        synchronized (qpy.c) {
            qpy qpyVar = this.l;
            if (qpyVar.m == null || !qpyVar.n.contains(this.c)) {
                return false;
            }
            this.l.m.a(connectionResult, this.g);
            return true;
        }
    }

    @Override // defpackage.qpj
    public final void a(int i) {
        if (Looper.myLooper() == this.l.o.getLooper()) {
            k(i);
        } else {
            this.l.o.post(new qpr(this, i));
        }
    }

    @Override // defpackage.qpj
    public final void b() {
        if (Looper.myLooper() == this.l.o.getLooper()) {
            h();
        } else {
            this.l.o.post(new qpq(this));
        }
    }

    public final void c() {
        qip.ar(this.l.o);
        this.j = null;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [rop, qnv] */
    public final void d() {
        qip.ar(this.l.o);
        if (this.b.w() || this.b.x()) {
            return;
        }
        try {
            qpy qpyVar = this.l;
            qso qsoVar = qpyVar.i;
            Context context = qpyVar.g;
            qnv qnvVar = this.b;
            qip.an(context);
            qip.an(qnvVar);
            qnvVar.A();
            int a = qnvVar.a();
            int b = qsoVar.b(a);
            if (b == -1) {
                b = 0;
                int i = 0;
                while (true) {
                    if (i >= qsoVar.a.size()) {
                        b = -1;
                        break;
                    }
                    int keyAt = qsoVar.a.keyAt(i);
                    if (keyAt > a && qsoVar.a.get(keyAt) == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (b == -1) {
                    b = qsoVar.b.h(context, a);
                }
                qsoVar.a.put(a, b);
            }
            if (b != 0) {
                ConnectionResult connectionResult = new ConnectionResult(b, null);
                String name = this.b.getClass().getName();
                String valueOf = String.valueOf(connectionResult);
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + String.valueOf(valueOf).length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(valueOf);
                Log.w("GoogleApiManager", sb.toString());
                i(connectionResult);
                return;
            }
            qpx qpxVar = new qpx(this.l, this.b, this.c);
            if (this.b.j()) {
                qqx qqxVar = this.m;
                qip.an(qqxVar);
                rop ropVar = qqxVar.e;
                if (ropVar != null) {
                    ropVar.l();
                }
                qqxVar.d.h = Integer.valueOf(System.identityHashCode(qqxVar));
                qar qarVar = qqxVar.g;
                Context context2 = qqxVar.a;
                Looper looper = qqxVar.b.getLooper();
                qrz qrzVar = qqxVar.d;
                qqxVar.e = qarVar.s(context2, looper, qrzVar, qrzVar.g, qqxVar, qqxVar);
                qqxVar.f = qpxVar;
                Set set = qqxVar.c;
                if (set == null || set.isEmpty()) {
                    qqxVar.b.post(new qqv(qqxVar));
                } else {
                    qrx qrxVar = (qrx) qqxVar.e;
                    qrxVar.v(new qru(qrxVar));
                }
            }
            try {
                this.b.v(qpxVar);
            } catch (SecurityException e) {
                j(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            j(new ConnectionResult(10), e2);
        }
    }

    public final void e(qow qowVar) {
        qip.ar(this.l.o);
        if (this.b.w()) {
            if (u(qowVar)) {
                l();
                return;
            } else {
                this.a.add(qowVar);
                return;
            }
        }
        this.a.add(qowVar);
        ConnectionResult connectionResult = this.j;
        if (connectionResult == null || !connectionResult.b()) {
            d();
        } else {
            i(this.j);
        }
    }

    public final void f(Status status) {
        qip.ar(this.l.o);
        s(status, null, false);
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qow qowVar = (qow) arrayList.get(i);
            if (!this.b.w()) {
                return;
            }
            if (u(qowVar)) {
                this.a.remove(qowVar);
            }
        }
    }

    public final void h() {
        c();
        r(ConnectionResult.a);
        n();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            qqt qqtVar = (qqt) it.next();
            if (p(qqtVar.a.b) != null) {
                it.remove();
            } else {
                try {
                    qqtVar.a.b(this.b, new rpv());
                } catch (DeadObjectException unused) {
                    a(3);
                    this.b.f("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        g();
        l();
    }

    @Override // defpackage.qqp
    public final void i(ConnectionResult connectionResult) {
        j(connectionResult, null);
    }

    public final void j(ConnectionResult connectionResult, Exception exc) {
        rop ropVar;
        qip.ar(this.l.o);
        qqx qqxVar = this.m;
        if (qqxVar != null && (ropVar = qqxVar.e) != null) {
            ropVar.l();
        }
        c();
        this.l.i.a();
        r(connectionResult);
        if ((this.b instanceof qti) && connectionResult.c != 24) {
            qpy qpyVar = this.l;
            qpyVar.f = true;
            Handler handler = qpyVar.o;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        if (connectionResult.c == 4) {
            f(qpy.b);
            return;
        }
        if (this.a.isEmpty()) {
            this.j = connectionResult;
            return;
        }
        if (exc != null) {
            qip.ar(this.l.o);
            s(null, exc, false);
            return;
        }
        if (!this.l.p) {
            f(q(connectionResult));
            return;
        }
        s(q(connectionResult), null, true);
        if (this.a.isEmpty() || v(connectionResult) || this.l.i(connectionResult, this.g)) {
            return;
        }
        if (connectionResult.c == 18) {
            this.h = true;
        }
        if (this.h) {
            Handler handler2 = this.l.o;
            handler2.sendMessageDelayed(Message.obtain(handler2, 9, this.c), 5000L);
        } else {
            f(q(connectionResult));
        }
    }

    public final void k(int i) {
        c();
        this.h = true;
        qpm qpmVar = this.d;
        String t = this.b.t();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (t != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(t);
        }
        qpmVar.a(true, new Status(20, sb.toString()));
        Handler handler = this.l.o;
        handler.sendMessageDelayed(Message.obtain(handler, 9, this.c), 5000L);
        Handler handler2 = this.l.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, this.c), 120000L);
        this.l.i.a();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            Runnable runnable = ((qqt) it.next()).c;
        }
    }

    public final void l() {
        this.l.o.removeMessages(12, this.c);
        Handler handler = this.l.o;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.c), this.l.e);
    }

    public final void m() {
        qip.ar(this.l.o);
        f(qpy.a);
        this.d.a(false, qpy.a);
        for (qqj qqjVar : (qqj[]) this.f.keySet().toArray(new qqj[0])) {
            e(new qov(qqjVar, new rpv()));
        }
        r(new ConnectionResult(4));
        if (this.b.w()) {
            this.b.z(new qpt(this));
        }
    }

    public final void n() {
        if (this.h) {
            this.l.o.removeMessages(11, this.c);
            this.l.o.removeMessages(9, this.c);
            this.h = false;
        }
    }

    public final boolean o() {
        return this.b.j();
    }
}
