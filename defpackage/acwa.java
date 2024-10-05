package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acwa implements adqp, ypd {
    public static final String a = zga.a("MDX.CloudChannel");
    private Future A;
    private final axpg B;
    private adqn C;
    public final ypa b;
    public Future d;
    public adqo h;
    public acwk i;
    public adqs j;
    public int m;
    public final acsy s;
    public final acwh t;
    private final Context v;
    private final ScheduledExecutorService w;
    private final int x;
    private final ExecutorService y = Executors.newSingleThreadExecutor(new yna("mdxMsg"));
    private final ExecutorService z = Executors.newSingleThreadExecutor(new yna("mdxConnect"));
    public final ExecutorService c = Executors.newSingleThreadExecutor(new yna("mdxHangingGet"));
    public final Object e = new Object();
    public final Queue f = new LinkedBlockingQueue(10);
    public final Object g = new Object();
    protected int k = 0;
    public final Object l = new Object();
    public final Object n = new Object();
    public int o = 0;
    public final Object p = new Object();
    public boolean q = false;
    public final Object r = new Object();
    final acvy u = new acvy(this);

    public acwa(Context context, acwh acwhVar, ypa ypaVar, ScheduledExecutorService scheduledExecutorService, acsy acsyVar, axpg axpgVar, acun acunVar) {
        this.v = context;
        acwhVar.getClass();
        this.t = acwhVar;
        this.b = ypaVar;
        this.w = scheduledExecutorService;
        this.s = acunVar.z ? acsyVar : new acta();
        int i = acunVar.S;
        this.x = i <= 0 ? 2 : i;
        this.B = axpgVar;
    }

    @Override // defpackage.adqp
    public final int a() {
        int i;
        synchronized (this.l) {
            i = this.k;
        }
        return i;
    }

    @Override // defpackage.adqp
    public final void b(adqo adqoVar) {
        this.h = adqoVar;
        c();
    }

    public final void c() {
        synchronized (this.n) {
            this.m = 0;
        }
        synchronized (this.l) {
            final int i = this.k;
            if (i == 1) {
                zga.h(a, "Already in the process of connecting. Ignoring connect request");
                return;
            }
            this.k = 1;
            Future future = this.A;
            if (future != null && !future.isDone()) {
                this.A.cancel(true);
            }
            this.A = this.z.submit(new Runnable() { // from class: acvx
                @Override // java.lang.Runnable
                public final void run() {
                    acwk acwkVar;
                    acwd acwdVar;
                    IOException iOException;
                    String str;
                    adgg adggVar;
                    int i2;
                    acwa acwaVar = acwa.this;
                    int i3 = i;
                    synchronized (acwaVar.r) {
                        acwaVar.q = false;
                    }
                    if (i3 == 2) {
                        acwaVar.h("MDX_CLIENT_BROWSER_CHANNEL_DISCONNECT_REASON_CANCELLED");
                    }
                    try {
                        acwh acwhVar = acwaVar.t;
                        adqs adqsVar = acwaVar.j;
                        HashMap hashMap = new HashMap();
                        if (acwhVar.f.t) {
                            hashMap.put("x-use-alt-service", "true");
                        }
                        boolean z = acwhVar.f.H && (adggVar = adqsVar.c) != null && ((i2 = adggVar.b) == 3 || i2 == 2);
                        String str2 = ((adts) acwhVar.a.get()).f;
                        azrw azrwVar = acwhVar.b;
                        adkt adktVar = adqsVar.e;
                        acun acunVar = acwhVar.f;
                        HashMap hashMap2 = new HashMap((Map) acwhVar.e.get());
                        hashMap2.put("magmaKey", adqsVar.f);
                        if (adqsVar.a()) {
                            hashMap2.put("method", adqsVar.a.an);
                            if (adqsVar.b()) {
                                hashMap2.put("params", adqx.b(adqsVar.b).toString());
                            }
                        }
                        if (adqsVar.d) {
                            hashMap2.put("ui", "");
                        }
                        adgg adggVar2 = adqsVar.c;
                        if (adggVar2 != null) {
                            int i4 = adggVar2.b;
                            if (i4 == 4) {
                                str = "cast";
                            } else if (adggVar2.a) {
                                str = "in_app_dial";
                            } else {
                                if (i4 != 3 && i4 != 2) {
                                    str = "manual";
                                }
                                str = "dial";
                            }
                            hashMap2.put("pairing_type", str);
                        }
                        if (acunVar.aE) {
                            hashMap2.put("enableAsyncConnectionFlow", "true");
                        }
                        acwaVar.i = new acwg(str2, azrwVar, adktVar, hashMap2, hashMap, acwhVar.c, acwhVar.d, acwhVar.f.C, z);
                        acwk acwkVar2 = acwaVar.i;
                        ((acwg) acwkVar2).c.a = new acwj(acwkVar2, acwaVar.u);
                        acwkVar = acwaVar.i;
                        acwdVar = new acwd();
                        ((acwg) acwkVar).c(((acwg) acwkVar).e, acwdVar);
                        ((acwg) acwkVar).l = false;
                        iOException = acwdVar.b;
                    } catch (acwn e) {
                        String str3 = acwa.a;
                        String cc = adyu.cc(e.a);
                        StringBuilder sb = new StringBuilder(cc.length() + 37);
                        sb.append("Unauthorized error received on bind: ");
                        sb.append(cc);
                        zga.f(str3, sb.toString(), e);
                        int i5 = e.a;
                        int i6 = i5 - 1;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i6 == 0 || i6 == 1 || i6 == 2) {
                            acwaVar.i.b();
                            acwaVar.i(atbi.MDX_SESSION_DISCONNECT_REASON_LOUNGE_TOKEN_UNAUTHORIZED);
                            return;
                        } else if (i6 == 3) {
                            acwaVar.i.a();
                            acwaVar.l();
                            return;
                        }
                    } catch (acwo e2) {
                        String str4 = acwa.a;
                        int i7 = e2.b;
                        StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("Unexpected response when binding channel: ");
                        sb2.append(i7);
                        zga.f(str4, sb2.toString(), e2);
                        int i8 = e2.b;
                        if (i8 == 401) {
                            acwaVar.i.b();
                            acwaVar.i(atbi.MDX_SESSION_DISCONNECT_REASON_LOUNGE_TOKEN_UNAUTHORIZED);
                            return;
                        } else if (i8 == 403) {
                            acwaVar.i(atbi.MDX_SESSION_DISCONNECT_REASON_BROWSER_CHANNEL_ERROR);
                            return;
                        } else {
                            acwaVar.l();
                            return;
                        }
                    } catch (Exception e3) {
                        zga.f(acwa.a, "Error connecting to Remote Control server:", e3);
                        acwaVar.l();
                        return;
                    }
                    if (iOException == null) {
                        int i9 = acwdVar.a;
                        if (((acwg) acwkVar).f && i9 == 401) {
                            throw acwn.a(acwdVar.c);
                        }
                        acvu acvuVar = ((acwg) acwkVar).c;
                        acvu.a(i9);
                        if (i9 == 200) {
                            ((acwg) acwkVar).c.b(acwdVar.c.toCharArray());
                        }
                        synchronized (acwaVar.l) {
                            acwaVar.k = 2;
                        }
                        synchronized (acwaVar.p) {
                            acwaVar.o = 0;
                        }
                        synchronized (acwaVar.e) {
                            acwaVar.d = acwaVar.c.submit(new acvw(acwaVar, 1));
                        }
                        synchronized (acwaVar.l) {
                            if (acwaVar.k == 2) {
                                acwaVar.k();
                            }
                        }
                        return;
                    }
                    throw iOException;
                }
            });
        }
    }

    @Override // defpackage.adqp
    public final void d() {
        synchronized (this.l) {
            if (this.k == 2) {
                l();
            }
        }
    }

    @Override // defpackage.adqp
    public final void e(adgf adgfVar, adgj adgjVar) {
        this.b.d(new acxu(adgfVar, "cloud_bc"));
        this.s.r(asmn.LATENCY_ACTION_MDX_COMMAND);
        this.s.u("mdx_cs", asmn.LATENCY_ACTION_MDX_COMMAND);
        acsy acsyVar = this.s;
        asmn asmnVar = asmn.LATENCY_ACTION_MDX_COMMAND;
        aone createBuilder = asmb.a.createBuilder();
        aone createBuilder2 = asmg.a.createBuilder();
        createBuilder2.copyOnWrite();
        asmg asmgVar = (asmg) createBuilder2.instance;
        asmgVar.e = 1;
        asmgVar.b |= 4;
        String str = adgfVar.an;
        createBuilder2.copyOnWrite();
        asmg asmgVar2 = (asmg) createBuilder2.instance;
        str.getClass();
        asmgVar2.b = 1 | asmgVar2.b;
        asmgVar2.c = str;
        asmg asmgVar3 = (asmg) createBuilder2.build();
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmgVar3.getClass();
        asmbVar.x = asmgVar3;
        asmbVar.c |= 2097152;
        acsyVar.o(asmnVar, (asmb) createBuilder.build());
        this.f.offer(new acvz(adgfVar, adgjVar));
        k();
    }

    @Override // defpackage.adqp
    public final void g() {
        ((acwg) this.i).i = null;
    }

    public final void h(String str) {
        synchronized (this.e) {
            Future future = this.d;
            if (future != null && !future.isDone()) {
                this.d.cancel(true);
                this.d = null;
            }
        }
        acwk acwkVar = this.i;
        HashMap hashMap = new HashMap();
        hashMap.put("TYPE", "terminate");
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("clientDisconnectReason", str);
            if (atbi.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER.name().equals(str)) {
                hashMap.put("ui", "");
            }
        }
        try {
            ((acwg) acwkVar).c(hashMap, new acyv(1));
        } catch (IOException e) {
            zga.f(acwg.a, "Terminate request failed", e);
        }
        ((acwg) acwkVar).g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(atbi atbiVar) {
        synchronized (this.r) {
            String.valueOf(String.valueOf(atbiVar)).length();
            this.q = true;
        }
        this.f.clear();
        synchronized (this.l) {
            if (this.k == 2) {
                h(atbiVar.name());
            }
            this.k = 0;
        }
        adqn adqnVar = this.C;
        if (adqnVar != null) {
            adnd adndVar = (adnd) adqnVar;
            if (!adndVar.aG()) {
                adndVar.aP(atbiVar, Optional.empty());
            }
        }
        this.h = null;
        this.C = null;
    }

    @Override // defpackage.adqp
    public final void j(boolean z) {
        atbi atbiVar;
        if (z) {
            atbiVar = atbi.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER;
        } else {
            atbiVar = atbi.MDX_SESSION_DISCONNECT_REASON_BROWSER_CHANNEL_ERROR;
        }
        i(atbiVar);
    }

    public final void k() {
        this.y.submit(new Runnable() { // from class: acvv
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                acwa acwaVar = acwa.this;
                synchronized (acwaVar.g) {
                    acvz acvzVar = (acvz) acwaVar.f.peek();
                    if (acvzVar == null) {
                        return;
                    }
                    try {
                        if (System.currentTimeMillis() - acvzVar.c > 5000) {
                            String str2 = acwa.a;
                            Locale locale = Locale.US;
                            String valueOf = String.valueOf(acvzVar.a);
                            String valueOf2 = String.valueOf(acvzVar.b);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
                            sb.append(valueOf);
                            sb.append(": ");
                            sb.append(valueOf2);
                            zga.h(str2, String.format(locale, "Message: %s is older than %dms. Dropping.", sb.toString(), 5000));
                            acwaVar.f.poll();
                        } else {
                            adgf adgfVar = acvzVar.a;
                            adgj adgjVar = acvzVar.b;
                            synchronized (acwaVar.l) {
                                int i = acwaVar.k;
                                if (i == 1) {
                                    zga.h(acwa.a, String.format(Locale.US, "Attempting to send a message while still in CONNECTING or RECONNECTING state.", new Object[0]));
                                } else if (i != 2) {
                                    acwaVar.f.clear();
                                    zga.h(acwa.a, String.format(Locale.US, "Dropping all calls from the queue because not connected.", new Object[0]));
                                } else {
                                    String.valueOf(String.valueOf(adgfVar)).length();
                                    try {
                                        acwk acwkVar = acwaVar.i;
                                        acwf acwfVar = new acwf();
                                        int i2 = ((acwg) acwkVar).j;
                                        ((acwg) acwkVar).j = i2 + 1;
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("count", "1");
                                        hashMap.put(String.format("req%s__sc", String.valueOf(i2)), adgfVar.an);
                                        Iterator it = adgjVar.iterator();
                                        while (it.hasNext()) {
                                            adgi next = ((adgh) it).next();
                                            hashMap.put(String.format("req%s_%s", String.valueOf(i2), next.a), next.b);
                                        }
                                        String.valueOf(String.valueOf(hashMap)).length();
                                        ((acwg) acwkVar).c(hashMap, acwfVar);
                                        ((acwg) acwkVar).l = false;
                                        if (((acwg) acwkVar).f && acwfVar.a == 401 && (str = acwfVar.c) != null) {
                                            acwn a2 = acwn.a(str);
                                            int i3 = a2.a;
                                            int i4 = i3 - 1;
                                            if (i3 == 0) {
                                                throw null;
                                            }
                                            if (i4 == 0) {
                                                throw a2;
                                            }
                                            if (i4 == 1) {
                                                throw a2;
                                            }
                                            if (i4 == 2) {
                                                throw a2;
                                            }
                                            if (i4 == 3) {
                                                ((acwg) acwkVar).a();
                                            }
                                        }
                                        if (acwfVar.a == 200) {
                                            acwaVar.f.poll();
                                            synchronized (acwaVar.n) {
                                                acwaVar.m = 0;
                                            }
                                        }
                                    } catch (acwn e) {
                                        int i5 = e.a;
                                        int i6 = i5 - 1;
                                        if (i5 == 0) {
                                            throw null;
                                        }
                                        if (i6 == 0 || i6 == 1 || i6 == 2) {
                                            String str3 = acwa.a;
                                            String cc = adyu.cc(e.a);
                                            StringBuilder sb2 = new StringBuilder(cc.length() + 60);
                                            sb2.append("Unauthorized error received on send message, disconnecting: ");
                                            sb2.append(cc);
                                            zga.f(str3, sb2.toString(), e);
                                            acwaVar.i.b();
                                            acwaVar.i(atbi.MDX_SESSION_DISCONNECT_REASON_LOUNGE_TOKEN_UNAUTHORIZED);
                                        } else {
                                            String str4 = acwa.a;
                                            String cc2 = adyu.cc(e.a);
                                            StringBuilder sb3 = new StringBuilder(cc2.length() + 77);
                                            sb3.append("Unexpected UnauthorizedErrorException on send message that shouldn't happen: ");
                                            sb3.append(cc2);
                                            zga.f(str4, sb3.toString(), e);
                                        }
                                    } catch (Exception e2) {
                                        String str5 = acwa.a;
                                        String valueOf3 = String.valueOf(adgfVar);
                                        String valueOf4 = String.valueOf(adgjVar);
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 35 + String.valueOf(valueOf4).length());
                                        sb4.append("Exception while sending message: ");
                                        sb4.append(valueOf3);
                                        sb4.append(": ");
                                        sb4.append(valueOf4);
                                        zga.f(str5, sb4.toString(), e2);
                                    }
                                    synchronized (acwaVar.n) {
                                        int i7 = acwaVar.m + 1;
                                        acwaVar.m = i7;
                                        if (i7 < 2) {
                                            String str6 = acwa.a;
                                            int i8 = acwaVar.m;
                                            StringBuilder sb5 = new StringBuilder(50);
                                            sb5.append("Increasing recent errors and retrying: ");
                                            sb5.append(i8);
                                            zga.h(str6, sb5.toString());
                                        } else {
                                            String str7 = acwa.a;
                                            Locale locale2 = Locale.US;
                                            String valueOf5 = String.valueOf(adgfVar);
                                            String valueOf6 = String.valueOf(adgjVar);
                                            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 2 + String.valueOf(valueOf6).length());
                                            sb6.append(valueOf5);
                                            sb6.append(": ");
                                            sb6.append(valueOf6);
                                            zga.h(str7, String.format(locale2, "Too many errors on sending %s. Reconnecting...", sb6.toString()));
                                            acwaVar.l();
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        acwaVar.k();
                    }
                }
            }
        });
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{wjc.class};
        }
        if (i == 0) {
            if (((wjc) obj).a() != wjb.FINISHED) {
                return null;
            }
            l();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void l() {
        int i;
        synchronized (this.l) {
            i = 0;
            this.k = 0;
            h("MDX_CLIENT_BROWSER_CHANNEL_DISCONNECT_REASON_RECONNECT");
        }
        synchronized (this.r) {
            if (this.q) {
                return;
            }
            if (!((ysy) this.B.get()).p()) {
                this.v.sendBroadcast(adfr.CLOUD_SERVICE_NO_NETWORK.a());
                return;
            }
            synchronized (this.p) {
                if (this.o >= this.x) {
                    zga.c(a, "Reconnect Scheduler: Reconnecting for too long, abort");
                    this.v.sendBroadcast(adfr.LOUNGE_SERVER_CONNECTION_ERROR.a());
                    this.o = 0;
                } else {
                    float random = ((int) (Math.random() * 1000.0d)) + 2000;
                    this.o = this.o + 1;
                    this.w.schedule(new acvw(this, i), Math.scalb(random, r3), TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // defpackage.adqp
    public final void m(adqn adqnVar) {
        this.C = adqnVar;
    }

    @Override // defpackage.adqp
    public final void n(adqs adqsVar) {
        this.j = adqsVar;
    }
}
