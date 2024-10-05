package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qpy implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    public static qpy d;
    public final Context g;
    public final qmy h;
    public final qso i;
    public final Handler o;
    public volatile boolean p;
    private TelemetryData q;
    private qtb r;
    public long e = 10000;
    public boolean f = false;
    public final AtomicInteger j = new AtomicInteger(1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final Map l = new ConcurrentHashMap(5, 0.75f, 1);
    public qpn m = null;
    public final Set n = new aeb();
    private final Set s = new aeb();

    private qpy(Context context, Looper looper, qmy qmyVar) {
        this.p = true;
        this.g = context;
        amcc amccVar = new amcc(looper, this);
        this.o = amccVar;
        this.h = qmyVar;
        this.i = new qso(qmyVar);
        PackageManager packageManager = context.getPackageManager();
        if (oba.c == null) {
            oba.c = Boolean.valueOf(oba.aa() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (oba.c.booleanValue()) {
            this.p = false;
        }
        amccVar.sendMessage(amccVar.obtainMessage(6));
    }

    public static Status a(qox qoxVar, ConnectionResult connectionResult) {
        String a2 = qoxVar.a();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(a2.length() + 63 + String.valueOf(valueOf).length());
        sb.append("API: ");
        sb.append(a2);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString(), 17);
    }

    public static qpy c(Context context) {
        qpy qpyVar;
        HandlerThread handlerThread;
        synchronized (c) {
            if (d == null) {
                synchronized (qsi.a) {
                    if (qsi.b != null) {
                        handlerThread = qsi.b;
                    } else {
                        qsi.b = new HandlerThread("GoogleApiHandler", 9);
                        qsi.b.start();
                        handlerThread = qsi.b;
                    }
                }
                d = new qpy(context.getApplicationContext(), handlerThread.getLooper(), qmy.a);
            }
            qpyVar = d;
        }
        return qpyVar;
    }

    private final qpu j(qob qobVar) {
        qox qoxVar = qobVar.A;
        qpu qpuVar = (qpu) this.l.get(qoxVar);
        if (qpuVar == null) {
            qpuVar = new qpu(this, qobVar);
            this.l.put(qoxVar, qpuVar);
        }
        if (qpuVar.o()) {
            this.s.add(qoxVar);
        }
        qpuVar.d();
        return qpuVar;
    }

    private final qtb k() {
        if (this.r == null) {
            this.r = new qth(this.g, qtc.a);
        }
        return this.r;
    }

    private final void l() {
        TelemetryData telemetryData = this.q;
        if (telemetryData != null) {
            if (telemetryData.a > 0 || h()) {
                k().a(telemetryData);
            }
            this.q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final qpu b(qox qoxVar) {
        return (qpu) this.l.get(qoxVar);
    }

    public final void d(rpv rpvVar, int i, qob qobVar) {
        if (i != 0) {
            qox qoxVar = qobVar.A;
            qqn qqnVar = null;
            if (h()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = qta.a().a;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.b) {
                        boolean z2 = rootTelemetryConfiguration.c;
                        qpu b2 = b(qoxVar);
                        if (b2 != null) {
                            Object obj = b2.b;
                            if (obj instanceof qrx) {
                                qrx qrxVar = (qrx) obj;
                                if (qrxVar.K() && !qrxVar.x()) {
                                    ConnectionTelemetryConfiguration b3 = qqn.b(b2, qrxVar, i);
                                    if (b3 != null) {
                                        b2.k++;
                                        z = b3.c;
                                    }
                                }
                            }
                        }
                        z = z2;
                    }
                }
                qqnVar = new qqn(this, i, qoxVar, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            }
            if (qqnVar != null) {
                rpx rpxVar = rpvVar.a;
                Handler handler = this.o;
                handler.getClass();
                rpxVar.m(new bok(handler, 2), qqnVar);
            }
        }
    }

    public final void e(ConnectionResult connectionResult, int i) {
        if (i(connectionResult, i)) {
            return;
        }
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void f() {
        Handler handler = this.o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void g(qpn qpnVar) {
        synchronized (c) {
            if (this.m != qpnVar) {
                this.m = qpnVar;
                this.n.clear();
            }
            this.n.addAll(qpnVar.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        if (this.f) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = qta.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int b2 = this.i.b(203400000);
        return b2 == -1 || b2 == 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Status status;
        Feature[] b2;
        qpu qpuVar = null;
        switch (message.what) {
            case 1:
                this.e = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.o.removeMessages(12);
                for (qox qoxVar : this.l.keySet()) {
                    Handler handler = this.o;
                    handler.sendMessageDelayed(handler.obtainMessage(12, qoxVar), this.e);
                }
                return true;
            case 2:
                qoy qoyVar = (qoy) message.obj;
                Iterator it = qoyVar.a.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        qox qoxVar2 = (qox) it.next();
                        qpu qpuVar2 = (qpu) this.l.get(qoxVar2);
                        if (qpuVar2 != null) {
                            if (!qpuVar2.b.w()) {
                                qip.ar(qpuVar2.l.o);
                                ConnectionResult connectionResult = qpuVar2.j;
                                if (connectionResult == null) {
                                    qip.ar(qpuVar2.l.o);
                                    qpuVar2.e.add(qoyVar);
                                    qpuVar2.d();
                                } else {
                                    qoyVar.a(qoxVar2, connectionResult, null);
                                }
                            } else {
                                qoyVar.a(qoxVar2, ConnectionResult.a, qpuVar2.b.s());
                            }
                        } else {
                            qoyVar.a(qoxVar2, new ConnectionResult(13), null);
                        }
                    }
                }
                return true;
            case 3:
                for (qpu qpuVar3 : this.l.values()) {
                    qpuVar3.c();
                    qpuVar3.d();
                }
                return true;
            case 4:
            case 8:
            case 13:
                qqq qqqVar = (qqq) message.obj;
                qpu qpuVar4 = (qpu) this.l.get(qqqVar.c.A);
                if (qpuVar4 == null) {
                    qpuVar4 = j(qqqVar.c);
                }
                if (!qpuVar4.o() || this.k.get() == qqqVar.b) {
                    qpuVar4.e(qqqVar.a);
                } else {
                    qqqVar.a.d(a);
                    qpuVar4.m();
                }
                return true;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult2 = (ConnectionResult) message.obj;
                Iterator it2 = this.l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        qpu qpuVar5 = (qpu) it2.next();
                        if (qpuVar5.g == i) {
                            qpuVar = qpuVar5;
                        }
                    }
                }
                if (qpuVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                } else if (connectionResult2.c != 13) {
                    qpuVar.f(a(qpuVar.c, connectionResult2));
                } else {
                    String j = qnm.j();
                    String str = connectionResult2.e;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 69 + String.valueOf(str).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(j);
                    sb2.append(": ");
                    sb2.append(str);
                    qpuVar.f(new Status(17, sb2.toString()));
                }
                return true;
            case 6:
                if (this.g.getApplicationContext() instanceof Application) {
                    qpa.b((Application) this.g.getApplicationContext());
                    qpa.a.a(new qpp(this));
                    qpa qpaVar = qpa.a;
                    if (!qpaVar.c.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!qpaVar.c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            qpaVar.b.set(true);
                        }
                    }
                    if (!qpaVar.b.get()) {
                        this.e = 300000L;
                    }
                }
                return true;
            case 7:
                j((qob) message.obj);
                return true;
            case 9:
                if (this.l.containsKey(message.obj)) {
                    qpu qpuVar6 = (qpu) this.l.get(message.obj);
                    qip.ar(qpuVar6.l.o);
                    if (qpuVar6.h) {
                        qpuVar6.d();
                    }
                }
                return true;
            case 10:
                Iterator it3 = this.s.iterator();
                while (it3.hasNext()) {
                    qpu qpuVar7 = (qpu) this.l.remove((qox) it3.next());
                    if (qpuVar7 != null) {
                        qpuVar7.m();
                    }
                }
                this.s.clear();
                return true;
            case 11:
                if (this.l.containsKey(message.obj)) {
                    qpu qpuVar8 = (qpu) this.l.get(message.obj);
                    qip.ar(qpuVar8.l.o);
                    if (qpuVar8.h) {
                        qpuVar8.n();
                        qpy qpyVar = qpuVar8.l;
                        if (qpyVar.h.g(qpyVar.g) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        qpuVar8.f(status);
                        qpuVar8.b.f("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.l.containsKey(message.obj)) {
                    qpu qpuVar9 = (qpu) this.l.get(message.obj);
                    qip.ar(qpuVar9.l.o);
                    if (qpuVar9.b.w() && qpuVar9.f.size() == 0) {
                        qpm qpmVar = qpuVar9.d;
                        if (!qpmVar.a.isEmpty() || !qpmVar.b.isEmpty()) {
                            qpuVar9.l();
                        } else {
                            qpuVar9.b.f("Timing out service connection.");
                        }
                    }
                }
                return true;
            case 14:
                throw null;
            case 15:
                qpv qpvVar = (qpv) message.obj;
                if (this.l.containsKey(qpvVar.a)) {
                    qpu qpuVar10 = (qpu) this.l.get(qpvVar.a);
                    if (qpuVar10.i.contains(qpvVar) && !qpuVar10.h) {
                        if (qpuVar10.b.w()) {
                            qpuVar10.g();
                        } else {
                            qpuVar10.d();
                        }
                    }
                }
                return true;
            case 16:
                qpv qpvVar2 = (qpv) message.obj;
                if (this.l.containsKey(qpvVar2.a)) {
                    qpu qpuVar11 = (qpu) this.l.get(qpvVar2.a);
                    if (qpuVar11.i.remove(qpvVar2)) {
                        qpuVar11.l.o.removeMessages(15, qpvVar2);
                        qpuVar11.l.o.removeMessages(16, qpvVar2);
                        Feature feature = qpvVar2.b;
                        ArrayList arrayList = new ArrayList(qpuVar11.a.size());
                        for (qow qowVar : qpuVar11.a) {
                            if ((qowVar instanceof qoq) && (b2 = ((qoq) qowVar).b(qpuVar11)) != null && oba.aj(b2, feature)) {
                                arrayList.add(qowVar);
                            }
                        }
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            qow qowVar2 = (qow) arrayList.get(i2);
                            qpuVar11.a.remove(qowVar2);
                            qowVar2.e(new qop(feature));
                        }
                    }
                }
                return true;
            case 17:
                l();
                return true;
            case 18:
                qqo qqoVar = (qqo) message.obj;
                if (qqoVar.c == 0) {
                    k().a(new TelemetryData(qqoVar.b, Arrays.asList(qqoVar.a)));
                } else {
                    TelemetryData telemetryData = this.q;
                    if (telemetryData != null) {
                        List list = telemetryData.b;
                        if (telemetryData.a != qqoVar.b || (list != null && list.size() >= qqoVar.d)) {
                            this.o.removeMessages(17);
                            l();
                        } else {
                            TelemetryData telemetryData2 = this.q;
                            MethodInvocation methodInvocation = qqoVar.a;
                            if (telemetryData2.b == null) {
                                telemetryData2.b = new ArrayList();
                            }
                            telemetryData2.b.add(methodInvocation);
                        }
                    }
                    if (this.q == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(qqoVar.a);
                        this.q = new TelemetryData(qqoVar.b, arrayList2);
                        Handler handler2 = this.o;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), qqoVar.c);
                    }
                }
                return true;
            case 19:
                this.f = false;
                return true;
            default:
                int i3 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i3);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(ConnectionResult connectionResult, int i) {
        qmy qmyVar = this.h;
        Context context = this.g;
        if (!oba.X(context)) {
            PendingIntent j = connectionResult.b() ? connectionResult.d : qmyVar.j(context, connectionResult.c, null);
            if (j != null) {
                qmyVar.e(context, connectionResult.c, rai.a(context, 0, GoogleApiActivity.a(context, j, i, true), rai.a | 134217728));
                return true;
            }
        }
        return false;
    }
}
