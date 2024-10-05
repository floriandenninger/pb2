package defpackage;

import android.app.Activity;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gku {
    private final ainy A;
    private final BroadcastReceiver C;
    private final gkj D;
    private boolean E;
    public final aioc a;
    public final gld b;
    public final ahez c;
    public final xjl d;
    public final gkj g;
    public final gkj h;
    public final gkj i;
    public final gkj j;
    public final gkj k;
    public final gkj l;
    public final gkj m;
    public final gkj n;
    public final gkj o;
    public final gkj p;
    public final xjj q;
    public ahew r;
    public ahej s;
    public xae t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public gkh y;
    private final Activity z;
    public final ayqw e = new ayqw();
    public final Map f = new HashMap();
    private final IntentFilter B = new IntentFilter();

    public gku(final Activity activity, ainy ainyVar, aioc aiocVar, final gld gldVar, ahez ahezVar, xjl xjlVar) {
        this.z = activity;
        this.A = ainyVar;
        this.a = aiocVar;
        this.b = gldVar;
        this.c = ahezVar;
        this.d = xjlVar;
        gkp gkpVar = gkp.f;
        gldVar.getClass();
        final int i = 0;
        this.g = h(gkpVar, new Runnable() { // from class: gko
            @Override // java.lang.Runnable
            public final void run() {
                if (i != 0) {
                    ahxd ahxdVar = gldVar.c;
                    if (ahxdVar == null) {
                        return;
                    }
                    ahxdVar.a();
                    return;
                }
                ahxd ahxdVar2 = gldVar.c;
                if (ahxdVar2 == null) {
                    return;
                }
                ahxdVar2.b();
            }
        }, activity);
        this.h = h(gkp.j, new Runnable() { // from class: gkn
            @Override // java.lang.Runnable
            public final void run() {
                gku gkuVar = gku.this;
                Activity activity2 = activity;
                gkh gkhVar = gkuVar.y;
                if (gkhVar != null) {
                    gkhVar.a.r = true;
                }
                activity2.moveTaskToBack(false);
            }
        }, activity);
        this.i = h(gkp.c, new gkr(ainyVar, i), activity);
        this.j = h(gkp.d, new gkr(ainyVar, 2), activity);
        this.k = h(gkp.g, new gkr(ainyVar, 3), activity);
        this.l = h(gkp.h, new gkr(ainyVar, 4), activity);
        gkp gkpVar2 = gkp.a;
        gldVar.getClass();
        final int i2 = 1;
        this.m = h(gkpVar2, new Runnable() { // from class: gko
            @Override // java.lang.Runnable
            public final void run() {
                if (i2 != 0) {
                    ahxd ahxdVar = gldVar.c;
                    if (ahxdVar == null) {
                        return;
                    }
                    ahxdVar.a();
                    return;
                }
                ahxd ahxdVar2 = gldVar.c;
                if (ahxdVar2 == null) {
                    return;
                }
                ahxdVar2.b();
            }
        }, activity);
        this.n = h(gkp.i, new Runnable() { // from class: gkm
            @Override // java.lang.Runnable
            public final void run() {
                xae xaeVar = gku.this.t;
                if (xaeVar == null || !etx.q(xaeVar)) {
                    return;
                }
                xaeVar.b().d(-1, -1);
            }
        }, activity);
        this.o = h(gkp.e, new gkq(ahezVar, 0), activity);
        gkp gkpVar3 = gkp.b;
        ahezVar.getClass();
        this.p = h(gkpVar3, new gkq(ahezVar, 1), activity);
        this.D = new gkj(activity, R.drawable.quantum_ic_error_white_24, R.string.pip_is_not_available_for_this_video, R.string.pip_is_not_available_for_this_video, "com.google.android.libraries.youtube.player.action.controller_notification_retry", bqc.b);
        this.C = new gks(this);
        this.q = new gkt(this);
    }

    private final RemoteAction e() {
        if (this.w) {
            return this.h.a();
        }
        RemoteAction a = this.g.a();
        boolean z = false;
        if (this.b.a && !this.v) {
            z = true;
        }
        a.setEnabled(z);
        return this.g.a();
    }

    private final RemoteAction f() {
        if (this.x) {
            ahej ahejVar = this.s;
            if (ahejVar != null) {
                int a = ahejVar.a();
                if (a == 7) {
                    return this.k.a();
                }
                if (a == 8) {
                    return this.l.a();
                }
                if (this.s.f() || this.s.c()) {
                    return this.i.a();
                }
                if (this.s.e()) {
                    return this.j.a();
                }
            }
            if (this.A.S()) {
                return this.i.a();
            }
            return this.j.a();
        }
        return this.D.a();
    }

    private final RemoteAction g() {
        if (this.v) {
            this.n.a().setEnabled(etx.q(this.t));
            return this.n.a();
        }
        this.m.a().setEnabled(this.b.b);
        return this.m.a();
    }

    private static gkj h(gkv gkvVar, Runnable runnable, Activity activity) {
        return gkvVar.a(activity, runnable);
    }

    public final amru a() {
        if (this.u) {
            return amru.s(this.o.a(), this.p.a());
        }
        if (this.z.getResources().getConfiguration().getLayoutDirection() == 1) {
            return amru.t(g(), f(), e());
        }
        return amru.t(e(), f(), g());
    }

    public final void b(gkj gkjVar) {
        this.B.addAction(gkjVar.a);
        this.f.put(gkjVar.a, gkjVar);
    }

    public final void c() {
        if (this.E || !this.z.isInPictureInPictureMode()) {
            return;
        }
        this.z.registerReceiver(this.C, this.B);
        this.E = true;
    }

    public final void d() {
        if (this.E) {
            this.z.unregisterReceiver(this.C);
            this.E = false;
        }
    }
}
