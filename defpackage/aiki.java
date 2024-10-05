package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiki implements aivp, aika {
    public String a;
    public volatile List b;
    public adfi c;
    public adfi d;
    private final Context e;
    private final BroadcastReceiver f;
    private final IntentFilter g;
    private final aikd h;
    private final aivq i;
    private final aikl j;
    private final shf k;
    private final aikp l;
    private final Handler m;
    private volatile boolean n;
    private final List o;
    private final Map p;
    private long q;
    private boolean r;
    private final aigv s;

    public aiki(Context context, aivq aivqVar, aivo aivoVar, aigv aigvVar, aikd aikdVar, aikl aiklVar, shf shfVar, aikp aikpVar, List list) {
        context.getClass();
        this.e = context;
        aikdVar.getClass();
        this.h = aikdVar;
        aivqVar.getClass();
        this.i = aivqVar;
        aigvVar.getClass();
        this.s = aigvVar;
        this.j = aiklVar;
        shfVar.getClass();
        this.k = shfVar;
        this.l = aikpVar;
        this.m = new Handler(Looper.getMainLooper());
        IntentFilter intentFilter = new IntentFilter();
        this.g = intentFilter;
        intentFilter.addAction("noop");
        intentFilter.addAction("android.intent.action.MAIN");
        intentFilter.addAction("com.google.android.libraries.youtube.player.action.controller_notification_delete");
        this.o = list;
        this.b = list;
        this.f = new aikf(this, aivoVar, aikpVar);
        this.p = new HashMap();
        l(list);
    }

    private static void j(IntentFilter intentFilter, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((aikb) it.next()).e().iterator();
            while (it2.hasNext()) {
                intentFilter.addAction((String) it2.next());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
    
        if (r13 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void k(boolean r17) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiki.k(boolean):void");
    }

    private final void l(List list) {
        amru o = amru.o(list);
        j(this.g, o);
        List list2 = this.b;
        this.b = o;
        List list3 = this.b;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((aikb) it.next()).h(null);
            }
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            ((aikb) it2.next()).h(this);
        }
    }

    public final synchronized void a(boolean z) {
        if (!z) {
            if (!this.n || this.r) {
                return;
            }
        }
        long d = this.k.d();
        if (z) {
            k(true);
            return;
        }
        long j = this.q + 200;
        if (d > j) {
            c();
            return;
        }
        this.m.postDelayed(new aike(this), Math.max(0L, j - d));
        this.r = true;
    }

    public final synchronized void b(boolean z) {
        this.i.a.remove(this);
        if (z) {
            this.h.a();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((aikb) it.next()).g();
        }
        if (this.n) {
            this.n = false;
            this.e.unregisterReceiver(this.f);
            this.l.e();
        }
        if (this.r) {
            this.m.removeCallbacks(new aike(this));
            this.r = false;
        }
    }

    public final synchronized void c() {
        boolean z = false;
        this.r = false;
        if (this.n) {
            adfi adfiVar = this.d;
            if (adfiVar != null) {
                adlt adltVar = (adlt) adfiVar.a.j.get();
                if (adltVar.o() || adltVar.f() == 0 || adltVar.f() == 1) {
                    z = true;
                }
            } else {
                z = this.s.h();
            }
            k(z);
        }
    }

    @Override // defpackage.aivp
    public final void d(int i) {
        if ((i & 163) == 0) {
            return;
        }
        a(false);
    }

    public final void e() {
        f(this.o);
    }

    public final void f(List list) {
        if (this.b.equals(list)) {
            return;
        }
        l(list);
        a(false);
    }

    @Deprecated
    public final void g(aikb aikbVar, aikb aikbVar2) {
        this.p.put(aikbVar, aikbVar2);
        j(this.g, amru.r(aikbVar2));
    }

    public final synchronized void h() {
        i(false);
    }

    public final synchronized void i(boolean z) {
        if (!this.n) {
            this.n = true;
            this.e.registerReceiver(this.f, this.g);
        }
        this.i.c(this);
        a(z);
    }

    public aiki(Context context, aivq aivqVar, aivo aivoVar, aigv aigvVar, aikd aikdVar, aikl aiklVar, shf shfVar, List list) {
        this(context, aivqVar, aivoVar, aigvVar, aikdVar, aiklVar, shfVar, new aiko(), list);
    }
}
