package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agvx implements agui {
    public static final CountDownLatch a = new CountDownLatch(0);
    private static final Pair k = new Pair("", 17);
    private ayqx A;
    protected volatile String b;
    public final Map c = new HashMap();
    public final Context d;
    public final azrw e;
    public final azrw f;
    public final agoo g;
    public agur h;
    protected boolean i;
    public CountDownLatch j;
    private final Executor l;
    private final azrw m;
    private final SharedPreferences n;
    private final agus o;
    private final agmq p;
    private final agtr q;
    private final Executor r;
    private final agvp s;
    private final agsd t;
    private final String u;
    private final agzr v;
    private agvo w;
    private Set x;
    private Executor y;
    private agvw z;

    public agvx(Context context, Executor executor, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, SharedPreferences sharedPreferences, agus agusVar, agmq agmqVar, agtr agtrVar, Executor executor2, agvp agvpVar, agsd agsdVar, String str, agoo agooVar, agzr agzrVar) {
        this.d = context;
        this.l = executor;
        this.m = azrwVar;
        this.e = azrwVar2;
        this.f = azrwVar3;
        this.n = sharedPreferences;
        this.o = agusVar;
        this.p = agmqVar;
        this.q = agtrVar;
        this.r = executor2;
        this.s = agvpVar;
        this.t = agsdVar;
        this.u = str;
        this.g = agooVar;
        this.v = agzrVar;
    }

    private final void q(zfi zfiVar) {
        for (agtv agtvVar : this.x) {
            if (agtvVar != null) {
                zfiVar.a(agtvVar);
            }
        }
    }

    private final void r() {
        agtw.B(this.n, ((agof) this.e.get()).d(), true);
    }

    public final void b() {
        agur agurVar = this.h;
        if (agurVar != null) {
            agurVar.o(((agsg) this.m.get()).w());
        }
    }

    @Override // defpackage.agui
    public final void c(boolean z) {
        agur agurVar = this.h;
        if (agurVar != null && agurVar.e() <= 0) {
            q(adpt.f);
            agoo agooVar = this.g;
            synchronized (agooVar.b) {
                for (Pair pair : agooVar.b()) {
                    String str = (String) pair.first;
                    String valueOf = String.valueOf(pair.second);
                    String.valueOf(str).length();
                    String.valueOf(valueOf).length();
                    int intValue = ((Integer) pair.second).intValue();
                    if (intValue != 15 && intValue != 17) {
                        switch (intValue) {
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                continue;
                        }
                    }
                    agooVar.a.cancel((String) pair.first, ((Integer) pair.second).intValue());
                }
                agooVar.b.clear();
            }
            if (this.v.e()) {
                try {
                    Class<?> cls = Class.forName(this.u);
                    Context context = this.d;
                    context.stopService(new Intent(context, cls));
                } catch (ClassNotFoundException unused) {
                    String str2 = this.u;
                    zga.b(str2.length() != 0 ? "[Offline] Cannot find class: ".concat(str2) : new String("[Offline] Cannot find class: "));
                    return;
                }
            }
            agur agurVar2 = this.h;
            if (agurVar2 != null) {
                agurVar2.j();
            }
            CountDownLatch countDownLatch = this.j;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            this.h = null;
            agvw agvwVar = this.z;
            if (agvwVar != null) {
                this.n.unregisterOnSharedPreferenceChangeListener(agvwVar);
            }
            if (z) {
                agtw.B(this.n, ((agof) this.e.get()).d(), false);
            }
            Object obj = this.A;
            if (obj != null) {
                azqb.f((AtomicReference) obj);
                this.A = null;
            }
        }
    }

    @Override // defpackage.agui
    public final void d(Map map) {
        this.i = true;
        q(adpt.e);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (((agnz) it.next()).c()) {
                r();
                return;
            }
        }
    }

    @Override // defpackage.agui
    public final void e(agnz agnzVar) {
        this.c.put(agnzVar.a, agnzVar);
        q(new agvu(agnzVar, 1));
        r();
    }

    @Override // defpackage.agui
    public final void f(agnz agnzVar) {
        this.c.put(agnzVar.a, agnzVar);
        q(new agvu(agnzVar, 0));
    }

    @Override // defpackage.agui
    public final void g(final agnz agnzVar, final boolean z) {
        this.c.put(agnzVar.a, agnzVar);
        q(new agvu(agnzVar, 2));
        this.y.execute(new Runnable() { // from class: agvt
            @Override // java.lang.Runnable
            public final void run() {
                agvx.this.n(agnzVar, z);
            }
        });
    }

    @Override // defpackage.agui
    public final void h(agnz agnzVar) {
        this.c.remove(agnzVar.a);
        q(new agvu(agnzVar, 3));
        if (agtw.ai(agnzVar) && agnzVar.a.equals(this.b)) {
            this.b = null;
        }
        this.y.execute(new agvs(this, agnzVar, 1));
    }

    @Override // defpackage.agui
    public final void i(agnz agnzVar) {
        this.c.put(agnzVar.a, agnzVar);
        q(new agvu(agnzVar, 4));
    }

    @Override // defpackage.agui
    public final void j(agnz agnzVar) {
        this.c.put(agnzVar.a, agnzVar);
        q(new agvu(agnzVar, 5));
    }

    @Override // defpackage.agui
    public final void k(agnz agnzVar) {
        this.c.put(agnzVar.a, agnzVar);
        q(new agvu(agnzVar, 6));
    }

    @Override // defpackage.agui
    public final void l(final agnz agnzVar, final atqs atqsVar, final agnf agnfVar) {
        this.c.put(agnzVar.a, agnzVar);
        q(new zfi() { // from class: agvv
            @Override // defpackage.zfi
            public final void a(Object obj) {
                agnz agnzVar2 = agnz.this;
                atqs atqsVar2 = atqsVar;
                agnf agnfVar2 = agnfVar;
                agtv agtvVar = (agtv) obj;
                CountDownLatch countDownLatch = agvx.a;
                agtvVar.getClass();
                agtvVar.k(agnzVar2, atqsVar2, agnfVar2);
            }
        });
        if (agtw.ai(agnzVar)) {
            if (agnzVar.b == avjo.TRANSFER_STATE_COMPLETE) {
                if (agnzVar.a.equals(this.b)) {
                    this.b = null;
                }
            } else if (agnzVar.b == avjo.TRANSFER_STATE_TRANSFERRING) {
                this.b = agnzVar.a;
            }
        }
        this.y.execute(new agvs(this, agnzVar, 0));
    }

    @Override // defpackage.agui
    public final void m(agnz agnzVar) {
        this.c.put(agnzVar.a, agnzVar);
        q(new agvu(agnzVar, 7));
    }

    public final void n(agnz agnzVar, boolean z) {
        ((agon) this.f.get()).C(agnzVar, z);
    }

    public final void o(agtv agtvVar) {
        Set set = this.x;
        agtvVar.getClass();
        if (set.add(agtvVar) && this.i) {
            agtvVar.g();
        }
    }

    public final boolean p(Notification notification) {
        if (!this.g.b().contains(k)) {
            return false;
        }
        this.g.d(null, 17, notification);
        return true;
    }

    public final aguj a() {
        agus agusVar = this.o;
        agmq agmqVar = this.p;
        agtr agtrVar = this.q;
        Executor executor = this.r;
        agvp agvpVar = this.s;
        agsd agsdVar = this.t;
        String str = this.u;
        if (this.h == null) {
            this.j = new CountDownLatch(1);
            agvo agvoVar = new agvo(this, executor);
            this.w = agvoVar;
            this.h = agusVar.a(agvoVar, str, agvpVar);
            this.l.execute(new Runnable() { // from class: agvr
                @Override // java.lang.Runnable
                public final void run() {
                    agvx agvxVar = agvx.this;
                    String d = ((agof) agvxVar.e.get()).d();
                    if (agvxVar.h == null || "NO_OP_STORE_TAG".equals(d)) {
                        return;
                    }
                    agvxVar.h.l(d);
                }
            });
            this.x = new CopyOnWriteArraySet();
            agvw agvwVar = new agvw(this);
            this.z = agvwVar;
            this.n.registerOnSharedPreferenceChangeListener(agvwVar);
            this.A = agsdVar.a(new ayrs() { // from class: agvq
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    agvx.this.b();
                }
            });
            b();
            o(agmqVar);
            o(agtrVar);
            this.y = executor;
            agvo agvoVar2 = this.w;
            if (agvoVar2 != null) {
                agvoVar2.b = executor;
            }
        }
        agur agurVar = this.h;
        agurVar.getClass();
        return agurVar;
    }
}
