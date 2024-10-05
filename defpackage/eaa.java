package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eaa implements ead {
    private static eaa m;
    public final Context a;
    public final qxu b;
    public final qxv c;
    public final qxx d;
    public final qxe e;
    public volatile boolean i;
    public final dzy k;
    public final int l;
    private final eaz n;
    private final Executor o;
    volatile long g = 0;
    public final Object h = new Object();
    public volatile boolean j = false;
    public final CountDownLatch f = new CountDownLatch(1);

    public eaa(Context context, qxe qxeVar, qxu qxuVar, qxv qxvVar, qxx qxxVar, eaz eazVar, Executor executor, qux quxVar, int i) {
        this.a = context;
        this.e = qxeVar;
        this.b = qxuVar;
        this.c = qxvVar;
        this.d = qxxVar;
        this.n = eazVar;
        this.o = executor;
        this.l = i;
        this.k = new dzy(quxVar);
    }

    public static synchronized eaa a(String str, Context context, boolean z, boolean z2) {
        eaa b;
        synchronized (eaa.class) {
            b = b(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return b;
    }

    @Deprecated
    public static synchronized eaa b(String str, Context context, Executor executor, boolean z, boolean z2) {
        eaa eaaVar;
        Boolean bool;
        synchronized (eaa.class) {
            if (m == null) {
                qxf qxfVar = new qxf();
                final int i = 0;
                qxfVar.a(false);
                final int i2 = 1;
                qxfVar.c = true;
                if (str != null) {
                    qxfVar.a = str;
                    qxfVar.a(z);
                    String str2 = qxfVar.a;
                    if (str2 != null && (bool = qxfVar.b) != null && qxfVar.c != null) {
                        qxg qxgVar = new qxg(str2, bool.booleanValue(), qxfVar.c.booleanValue());
                        qxe a = qxe.a(context, executor, z2);
                        eao a2 = ((Boolean) pyi.u.e()).booleanValue() ? eao.a(context) : null;
                        dvo dvoVar = qxm.a;
                        dvo dvoVar2 = qxn.a;
                        final qxo qxoVar = new qxo(context, executor, a, qxgVar);
                        if (!qxoVar.c.b) {
                            qxoVar.d = rqr.c(qxm.a);
                        } else {
                            qxoVar.d = qxoVar.b(new Callable() { // from class: qxl
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    if (i2 == 0) {
                                        Context context2 = qxoVar.a;
                                        return oba.H(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                                    }
                                    Context context3 = qxoVar.a;
                                    aone createBuilder = dvo.a.createBuilder();
                                    pvg a3 = pvh.a(context3);
                                    String str3 = a3.a;
                                    if (str3 != null && str3.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                                        UUID fromString = UUID.fromString(str3);
                                        byte[] bArr = new byte[16];
                                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                                        wrap.putLong(fromString.getMostSignificantBits());
                                        wrap.putLong(fromString.getLeastSignificantBits());
                                        str3 = Base64.encodeToString(bArr, 11);
                                    }
                                    if (str3 != null) {
                                        createBuilder.copyOnWrite();
                                        dvo dvoVar3 = (dvo) createBuilder.instance;
                                        dvoVar3.d |= 512;
                                        dvoVar3.ab = str3;
                                        boolean z3 = a3.b;
                                        createBuilder.copyOnWrite();
                                        dvo dvoVar4 = (dvo) createBuilder.instance;
                                        dvoVar4.d |= 2048;
                                        dvoVar4.ad = z3;
                                        createBuilder.copyOnWrite();
                                        dvo dvoVar5 = (dvo) createBuilder.instance;
                                        dvoVar5.ac = 5;
                                        dvoVar5.d |= 1024;
                                    }
                                    return (dvo) createBuilder.build();
                                }
                            });
                        }
                        qxoVar.e = qxoVar.b(new Callable() { // from class: qxl
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                if (i == 0) {
                                    Context context2 = qxoVar.a;
                                    return oba.H(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                                }
                                Context context3 = qxoVar.a;
                                aone createBuilder = dvo.a.createBuilder();
                                pvg a3 = pvh.a(context3);
                                String str3 = a3.a;
                                if (str3 != null && str3.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                                    UUID fromString = UUID.fromString(str3);
                                    byte[] bArr = new byte[16];
                                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                                    wrap.putLong(fromString.getMostSignificantBits());
                                    wrap.putLong(fromString.getLeastSignificantBits());
                                    str3 = Base64.encodeToString(bArr, 11);
                                }
                                if (str3 != null) {
                                    createBuilder.copyOnWrite();
                                    dvo dvoVar3 = (dvo) createBuilder.instance;
                                    dvoVar3.d |= 512;
                                    dvoVar3.ab = str3;
                                    boolean z3 = a3.b;
                                    createBuilder.copyOnWrite();
                                    dvo dvoVar4 = (dvo) createBuilder.instance;
                                    dvoVar4.d |= 2048;
                                    dvoVar4.ad = z3;
                                    createBuilder.copyOnWrite();
                                    dvo dvoVar5 = (dvo) createBuilder.instance;
                                    dvoVar5.ac = 5;
                                    dvoVar5.d |= 1024;
                                }
                                return (dvo) createBuilder.build();
                            }
                        });
                        eay eayVar = new eay(context);
                        eaz eazVar = new eaz(qxgVar, qxoVar, new ebk(context, eayVar), eayVar, a2);
                        int n = rbd.n(context, a);
                        qux quxVar = new qux();
                        eaa eaaVar2 = new eaa(context, a, new qxu(context, n), new qxv(context, n, new dzx(a), ((Boolean) pyi.b.e()).booleanValue()), new qxx(context, eazVar, a, quxVar), eazVar, executor, quxVar, n);
                        m = eaaVar2;
                        eaaVar2.j();
                        m.l();
                    }
                    StringBuilder sb = new StringBuilder();
                    if (qxfVar.a == null) {
                        sb.append(" clientVersion");
                    }
                    if (qxfVar.b == null) {
                        sb.append(" shouldGetAdvertisingId");
                    }
                    if (qxfVar.c == null) {
                        sb.append(" isGooglePlayServicesAvailable");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                throw new NullPointerException("Null clientVersion");
            }
            eaaVar = m;
        }
        return eaaVar;
    }

    @Override // defpackage.ead
    public final String c(Context context, String str) {
        return d(context, str, null, null);
    }

    @Override // defpackage.ead
    public final String d(Context context, String str, View view, Activity activity) {
        l();
        qxh a = this.d.a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = a.a(context, str, view, activity);
        this.e.f(5000, System.currentTimeMillis() - currentTimeMillis, a2);
        return a2;
    }

    @Override // defpackage.ead
    public final String e(Context context) {
        l();
        qxh a = this.d.a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String c = a.c(context);
        this.e.f(5001, System.currentTimeMillis() - currentTimeMillis, c);
        return c;
    }

    @Override // defpackage.ead
    public final String f(Context context, byte[] bArr) {
        return null;
    }

    @Override // defpackage.ead
    public final String g(Context context, View view, Activity activity) {
        l();
        qxh a = this.d.a();
        if (a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String b = a.b(context, view, activity);
        this.e.f(5002, System.currentTimeMillis() - currentTimeMillis, b);
        return b;
    }

    @Override // defpackage.ead
    public final void h(MotionEvent motionEvent) {
        qxh a = this.d.a();
        if (a != null) {
            try {
                a.d(motionEvent);
            } catch (qxw e) {
                this.e.c(e.a, -1L, e);
            }
        }
    }

    @Override // defpackage.ead
    public final void i(int i, int i2, int i3) {
    }

    final synchronized void j() {
        long currentTimeMillis = System.currentTimeMillis();
        qxt p = p();
        if (p != null) {
            if (this.d.b(p)) {
                this.j = true;
                this.f.countDown();
                return;
            }
            return;
        }
        this.e.d(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // defpackage.ead
    public final void k(View view) {
        this.n.c.d(view);
    }

    public final void l() {
        qxt qxtVar;
        if (this.i) {
            return;
        }
        synchronized (this.h) {
            if (!this.i) {
                if ((System.currentTimeMillis() / 1000) - this.g < 3600) {
                    return;
                }
                qxx qxxVar = this.d;
                synchronized (qxxVar.b) {
                    qxs qxsVar = qxxVar.a;
                    qxtVar = qxsVar != null ? qxsVar.a : null;
                }
                if ((qxtVar == null || qxtVar.a.e - (System.currentTimeMillis() / 1000) < 3600) && rbd.m(this.l)) {
                    this.o.execute(new dzz(this));
                }
            }
        }
    }

    @Override // defpackage.ead
    public final boolean m() {
        return n();
    }

    public final synchronized boolean n() {
        return this.j;
    }

    @Override // defpackage.ead
    public final boolean o() {
        try {
            this.f.await();
        } catch (InterruptedException unused) {
        }
        return n();
    }

    public final qxt p() {
        qxt qxtVar = null;
        if (!rbd.m(this.l)) {
            return null;
        }
        if (((Boolean) pyi.a.e()).booleanValue()) {
            qxv qxvVar = this.c;
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (qxv.a) {
                eco g = qxvVar.g(1);
                if (g != null) {
                    File a = qxvVar.a(g.c);
                    File file = new File(a, "pcam.jar");
                    if (!file.exists()) {
                        file = new File(a, "pcam");
                    }
                    File file2 = new File(a, "pcbc");
                    File file3 = new File(a, "pcopt");
                    qxvVar.e(5016, currentTimeMillis);
                    qxtVar = new qxt(g, file, file2, file3);
                } else {
                    qxvVar.e(4022, currentTimeMillis);
                }
            }
            return qxtVar;
        }
        qxu qxuVar = this.b;
        eco e = qxuVar.e(1);
        if (e == null) {
            return null;
        }
        String str = e.c;
        File h = rbd.h(str, "pcam.jar", qxuVar.a());
        if (!h.exists()) {
            h = rbd.h(str, "pcam", qxuVar.a());
        }
        return new qxt(e, h, rbd.h(str, "pcbc", qxuVar.a()), rbd.h(str, "pcopt", qxuVar.a()));
    }
}
