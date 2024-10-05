package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.PowerManager;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agur implements aguj, aguz {
    static final long a;
    private static final long m = TimeUnit.SECONDS.toMillis(10);
    private static final long n;
    private static final long o;
    private final agel A;
    private final agvf B;
    private final afsy C;
    private final azqw D;
    private final aguk E;
    private final agva F;
    private final agvc G;
    private final agvp H;
    private final String I;

    /* renamed from: J, reason: collision with root package name */
    private final PowerManager.WakeLock f51J;
    private final WifiManager.WifiLock K;
    private volatile afsx M;
    private boolean O;
    private final ylf S;
    private final ylf T;
    private final ajkn U;
    final aguh b;
    public final agvi c;
    public final agvg d;
    public final agui e;
    public volatile String f;
    boolean h;
    boolean i;
    boolean j;
    private final Context p;
    private final ScheduledExecutorService q;
    private final ysy r;
    private final shf s;
    private final agsq t;
    private final azrw u;
    private final agsm v;
    private final agmu w;
    private final aaea x;
    private final ypa y;
    private final agzr z;
    private awwg L = awwg.ANY;
    public final Object k = new Object();
    private final Queue P = new ArrayDeque();
    public anhy l = null;
    private final Map Q = new HashMap();
    private ScheduledFuture R = null;
    private volatile boolean N = false;
    public final Set g = new HashSet();

    static {
        long millis = TimeUnit.SECONDS.toMillis(30L);
        n = millis;
        o = TimeUnit.MINUTES.toMillis(1L);
        a = TimeUnit.MILLISECONDS.toSeconds(millis);
    }

    public agur(Context context, ScheduledExecutorService scheduledExecutorService, ysy ysyVar, shf shfVar, ajkn ajknVar, ylf ylfVar, agsq agsqVar, azrw azrwVar, agsm agsmVar, agmu agmuVar, aguh aguhVar, aaea aaeaVar, ypa ypaVar, agzr agzrVar, agel agelVar, agvf agvfVar, aguk agukVar, agva agvaVar, final agvc agvcVar, agvi agviVar, agvg agvgVar, afsy afsyVar, azqw azqwVar, ylf ylfVar2, agui aguiVar, String str, agvp agvpVar, byte[] bArr) {
        this.p = context;
        this.q = scheduledExecutorService;
        this.r = ysyVar;
        this.s = shfVar;
        this.U = ajknVar;
        this.S = ylfVar;
        this.t = agsqVar;
        this.u = azrwVar;
        this.v = agsmVar;
        this.w = agmuVar;
        this.b = aguhVar;
        this.x = aaeaVar;
        this.y = ypaVar;
        this.z = agzrVar;
        this.A = agelVar;
        this.B = agvfVar;
        this.E = agukVar;
        this.F = agvaVar;
        this.G = agvcVar;
        this.c = agviVar;
        this.d = agvgVar;
        this.C = afsyVar;
        this.D = azqwVar;
        this.T = ylfVar2;
        this.e = aguiVar;
        this.I = str;
        this.H = agvpVar;
        final int i = 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        powerManager.getClass();
        final int i2 = 1;
        this.f51J = powerManager.newWakeLock(1, getClass().getName());
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        wifiManager.getClass();
        this.K = wifiManager.createWifiLock(3, getClass().getName());
        ylfVar.b("transfer_dm2");
        agvaVar.a = this;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        context.registerReceiver(agvaVar, intentFilter);
        agvcVar.c = agvcVar.a.X(new ayrs() { // from class: agvb
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    agvcVar.a(this);
                } else {
                    agvcVar.a(this);
                }
            }
        });
        agvcVar.d = agvcVar.b.X(new ayrs() { // from class: agvb
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    agvcVar.a(this);
                } else {
                    agvcVar.a(this);
                }
            }
        });
        scheduledExecutorService.execute(new Runnable() { // from class: aguo
            @Override // java.lang.Runnable
            public final void run() {
                agvc.this.b();
            }
        });
    }

    private final boolean A() {
        return this.A.a() && this.r.q();
    }

    private final Bundle t() {
        Bundle bundle = new Bundle();
        bundle.putString("servicePath", this.I);
        bundle.putString("intentAction", "com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup");
        return bundle;
    }

    private final void u() {
        synchronized (this.k) {
            ScheduledFuture scheduledFuture = this.R;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.R = null;
        }
    }

    private final void v() {
        synchronized (this.k) {
            u();
            if (e() <= 0 && !this.i) {
                if (!this.N && !this.h) {
                    long j = this.j ? n : m;
                    TimeUnit.MILLISECONDS.toSeconds(j);
                    this.R = this.q.schedule(new agum(this, 2), j, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x03c0, code lost:
    
        if (r5 != false) goto L201;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w() {
        /*
            Method dump skipped, instructions count: 1203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agur.w():void");
    }

    private final void x(agtu agtuVar, int i) {
        boolean z;
        agnf m2;
        boolean z2 = true;
        if (agtuVar.j != avjo.TRANSFER_STATE_TRANSFER_IN_QUEUE) {
            agtuVar.j = avjo.TRANSFER_STATE_TRANSFER_IN_QUEUE;
            z = true;
        } else {
            z = false;
        }
        String str = agtuVar.a;
        aguf b = this.d.b(str);
        if (b != null) {
            b.a(i);
        }
        agtuVar.i = 0;
        if (this.g.remove(str)) {
            agtw.v(agtuVar.e, this.s.c());
            z = true;
        }
        if (agtuVar.b != i) {
            agtuVar.b = i;
        } else {
            z2 = z;
        }
        this.b.g(agtuVar);
        if (z2) {
            agui aguiVar = this.e;
            agnz a2 = agtuVar.a();
            atqs atqsVar = atqs.UNKNOWN_FAILURE_REASON;
            if ((agtuVar.b & 384) != 0) {
                m2 = agnf.PAUSED;
            } else {
                m2 = agtw.m(agtuVar.e);
            }
            aguiVar.l(a2, atqsVar, m2);
        }
    }

    private final boolean y() {
        return this.z.f() ? !this.r.p() : !this.r.o();
    }

    private final boolean z() {
        if (this.L == awwg.ANY) {
            return false;
        }
        return y() || !this.r.r() || this.r.i();
    }

    @Override // defpackage.ague
    public final void a(String str, agmx agmxVar) {
        agup a2 = aguq.a(8);
        a2.f(str);
        a2.d = agmxVar;
        p(a2.a());
    }

    @Override // defpackage.ague
    public final void b(String str, long j, double d, boolean z) {
        agup a2 = aguq.a(7);
        a2.f(str);
        a2.b(j);
        a2.h(d);
        a2.i(z);
        p(a2.a());
    }

    @Override // defpackage.ague
    public final void c(String str, long j) {
        agup a2 = aguq.a(6);
        a2.f(str);
        a2.g(j);
        p(a2.a());
    }

    @Override // defpackage.ague
    public final void d(String str, agug agugVar, agmx agmxVar) {
        agtu a2 = this.c.a(str);
        if (a2 == null) {
            return;
        }
        agmx agmxVar2 = a2.e;
        int i = a2.i + 1;
        atqs atqsVar = agugVar.c;
        boolean z = agugVar.a;
        if (atqsVar == atqs.STREAM_VERIFICATION_FAILED) {
            agmxVar.i("stream_verification_attempts", agtw.b(agmxVar) + 1);
        }
        if (!z) {
            if (aedn.J(agmxVar2)) {
                aone K = aedn.K(a2.a());
                K.copyOnWrite();
                atqv atqvVar = (atqv) K.instance;
                atqv atqvVar2 = atqv.a;
                atqvVar.h = 13;
                atqvVar.b |= 16;
                K.copyOnWrite();
                atqv atqvVar3 = (atqv) K.instance;
                atqvVar3.i = atqsVar.H;
                atqvVar3.b |= 32;
                K.copyOnWrite();
                atqv atqvVar4 = (atqv) K.instance;
                atqvVar4.g = 3;
                atqvVar4.b |= 8;
                boolean z2 = ahac.a;
                K.copyOnWrite();
                atqv atqvVar5 = (atqv) K.instance;
                atqvVar5.c |= 64;
                atqvVar5.A = z2;
                if (agugVar.getCause() != null && atqsVar == atqs.OFFLINE_DISK_ERROR) {
                    String simpleName = agugVar.getCause().getClass().getSimpleName();
                    K.copyOnWrite();
                    atqv atqvVar6 = (atqv) K.instance;
                    simpleName.getClass();
                    atqvVar6.b |= 128;
                    atqvVar6.j = simpleName;
                }
                this.w.c((atqv) K.build());
            }
            long g = agtw.g(agmxVar2);
            atph atphVar = this.z.a.a().g;
            if (atphVar == null) {
                atphVar = atph.a;
            }
            long millis = TimeUnit.HOURS.toMillis(atphVar.A);
            if (agtw.e(agmxVar2) == 0) {
                atqsVar = atqs.RETRY_NOT_ALLOWED;
            } else if (i > agtw.a(agmxVar2) || (millis > 0 && g >= millis)) {
                atqsVar = atqs.TOO_MANY_RETRIES;
            } else if (agtw.b(agmxVar) > 2) {
                atqsVar = atqs.TOO_MANY_FAILED_STREAM_VERIFICATIONS;
            }
            z = true;
        }
        if (atqsVar == atqs.OFFLINE_DISK_ERROR) {
            agej b = ((agof) this.u.get()).a().b();
            agmm e = ((agof) this.u.get()).a().e();
            if (b != null && e != null && b.c() != null && e.w()) {
                agtw.C(agmxVar, true);
            }
        }
        agup a3 = aguq.a(17);
        a3.f(str);
        a3.d = agmxVar;
        p(a3.a());
        if (agugVar.getCause() == null || !(agugVar.getCause() instanceof agtx)) {
            if (z) {
                agup a4 = aguq.a(10);
                a4.f(str);
                a4.d(agugVar.b);
                a4.c(atqsVar);
                p(a4.a());
                return;
            }
            agup a5 = aguq.a(9);
            a5.f(str);
            p(a5.a());
            return;
        }
        agtx agtxVar = (agtx) agugVar.getCause();
        atph atphVar2 = this.z.a.a().g;
        if (atphVar2 == null) {
            atphVar2 = atph.a;
        }
        if (!atphVar2.C || agtxVar.a <= a2.d - a2.c) {
            agup a6 = aguq.a(13);
            a6.f(str);
            a6.e(4096);
            p(a6.a());
            r();
            this.t.c(this.I, agtxVar.a);
            return;
        }
        agup a7 = aguq.a(10);
        a7.f(str);
        a7.d(agugVar.b);
        a7.c(atqsVar);
        p(a7.a());
    }

    @Override // defpackage.aguj
    public final int e() {
        int size;
        synchronized (this.k) {
            size = this.P.size() + this.Q.size();
        }
        return size;
    }

    @Override // defpackage.aguj
    public final void f(String str, String str2, int i, agmx agmxVar) {
        agtu agtuVar = new agtu(str, str2, i, agmxVar, 0);
        agup a2 = aguq.a(2);
        a2.b = ammv.j(agtuVar);
        p(a2.a());
    }

    @Override // defpackage.aguj
    public final void g(String str, Bundle bundle) {
        char c;
        String string;
        if (str == null) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 1134224607) {
            if (hashCode == 1897312741 && str.equals("com.google.android.libraries.youtube.offline.transfer.service.ActionDelayedMessage")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return;
            }
            p(aguq.a(4).a());
        } else {
            if (bundle == null || bundle.getInt("messageId") != 10 || (string = bundle.getString("messageData")) == null) {
                return;
            }
            agup a2 = aguq.a(11);
            a2.f(string);
            p(a2.a());
        }
    }

    @Override // defpackage.aguj
    public final void h() {
        p(aguq.a(12).a());
    }

    @Override // defpackage.aguj
    public final void i(String str) {
        agup a2 = aguq.a(19);
        a2.f(str);
        p(a2.a());
    }

    @Override // defpackage.aguj
    public final void j() {
        this.N = true;
        this.O = false;
        agva agvaVar = this.F;
        try {
            this.p.unregisterReceiver(agvaVar);
        } catch (IllegalArgumentException unused) {
            String valueOf = String.valueOf(agvaVar.getClass().getSimpleName());
            if (valueOf.length() != 0) {
                "[Offline] No need to unregister receiver which was not registered or already unregistered: ".concat(valueOf);
            }
        }
        agvaVar.a = null;
        agvc agvcVar = this.G;
        Object obj = agvcVar.c;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
        }
        Object obj2 = agvcVar.d;
        if (obj2 != null) {
            azqb.f((AtomicReference) obj2);
        }
        p(aguq.a(14).a());
    }

    @Override // defpackage.aguj
    public final void k(String str, int i) {
        agup a2 = aguq.a(3);
        a2.f(str);
        a2.e(i);
        p(a2.a());
    }

    @Override // defpackage.aguj
    public final void l(String str) {
        agup a2 = aguq.a(1);
        a2.a = ammv.j(str);
        p(a2.a());
    }

    @Override // defpackage.aguj
    public final void m(String str) {
        agup a2 = aguq.a(20);
        a2.f(str);
        p(a2.a());
    }

    @Override // defpackage.aguj
    public final void n(String str) {
        synchronized (this.k) {
            if (this.g.contains(str)) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) this.Q.remove(str);
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                agup a2 = aguq.a(11);
                a2.f(str);
                p(a2.a());
            }
        }
    }

    @Override // defpackage.aguj
    public final void o(awwg awwgVar) {
        agup a2 = aguq.a(21);
        a2.c = ammv.j(awwgVar);
        p(a2.a());
    }

    public final void p(aguq aguqVar) {
        if (this.h) {
            return;
        }
        synchronized (this.k) {
            u();
            this.P.add(aguqVar);
            q();
        }
    }

    public final void q() {
        anhy anhyVar;
        synchronized (this.k) {
            if (!this.P.isEmpty() && ((anhyVar = this.l) == null || anhyVar.isDone())) {
                anhy R = anaf.R(new agum(this, 1), this.q);
                this.l = R;
                R.d(new agum(this, 0), this.q);
            }
        }
    }

    @Override // defpackage.aguz
    public final void r() {
        p(aguq.a(4).a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x072e, code lost:
    
        return true;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0040. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() {
        /*
            Method dump skipped, instructions count: 1950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agur.s():boolean");
    }
}
