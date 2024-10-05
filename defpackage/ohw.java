package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ohw extends ajsu implements fyw, ajus {
    public final aahd a;
    public final fyx b;
    public final auwd c;
    public boolean f;
    public boolean g;
    public boolean h;
    public awaj i;
    public awaq j;
    private final Context k;
    private final oja l;
    private final ajwt m;
    private final nyk n;
    private final aaea o;
    private final aahv p;
    private final ayqi q;
    private Configuration s;
    private ayqx t;
    private ayqx u;
    private final ajoc r = new ajoc();
    public final ajpd d = new ajpd();
    public final List e = new ArrayList();

    public ohw(Context context, aahd aahdVar, fyx fyxVar, oja ojaVar, ajwt ajwtVar, ohv ohvVar, ajfh ajfhVar, nyk nykVar, aaea aaeaVar, aahv aahvVar, ayqi ayqiVar, auwd auwdVar) {
        this.a = aahdVar;
        this.b = fyxVar;
        this.l = ojaVar;
        this.m = ajwtVar;
        this.n = nykVar;
        this.o = aaeaVar;
        this.p = aahvVar;
        this.q = ayqiVar;
        this.c = auwdVar;
        this.k = context;
        boolean z = true;
        if (!((Boolean) auwdVar.pX(auvx.b)).booleanValue() && !auwdVar.h) {
            z = false;
        }
        this.f = z;
        ajwtVar.b(ohvVar);
        ajwtVar.b(ajfhVar);
        this.s = context.getResources().getConfiguration();
    }

    public final String c() {
        return this.c.d;
    }

    @Override // defpackage.fyw
    public final void d(String str, awaj awajVar) {
        if (amkq.b(this.c.d, str)) {
            this.i = awajVar;
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((ohu) it.next()).oL();
            }
        }
    }

    public final void f() {
        this.d.addAll(this.m.a(this.c.c));
        this.d.mK(new ajve(this));
        final int i = 0;
        this.d.mK(new ldg(0));
        this.t = this.n.a.A(ohs.b).n().X(new ayrs(this) { // from class: ohr
            public final /* synthetic */ ohw a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    ohw ohwVar = this.a;
                    Boolean bool = (Boolean) obj;
                    if (ohwVar.h == bool.booleanValue()) {
                        return;
                    }
                    ohwVar.h = bool.booleanValue();
                    ohwVar.i();
                    return;
                }
                ohw ohwVar2 = this.a;
                ohwVar2.j = (awaq) obj;
                Iterator it = ohwVar2.e.iterator();
                while (it.hasNext()) {
                    ((ohu) it.next()).oL();
                }
            }
        });
        if (evr.Y(this.o)) {
            final int i2 = 1;
            this.u = this.p.c().h(aalt.f(194, this.c.d), true).L(oht.a).Y(ohs.a).k(awaq.class).ab(this.q).ax(new ayrs(this) { // from class: ohr
                public final /* synthetic */ ohw a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i2 == 0) {
                        ohw ohwVar = this.a;
                        Boolean bool = (Boolean) obj;
                        if (ohwVar.h == bool.booleanValue()) {
                            return;
                        }
                        ohwVar.h = bool.booleanValue();
                        ohwVar.i();
                        return;
                    }
                    ohw ohwVar2 = this.a;
                    ohwVar2.j = (awaq) obj;
                    Iterator it = ohwVar2.e.iterator();
                    while (it.hasNext()) {
                        ((ohu) it.next()).oL();
                    }
                }
            });
        }
        i();
    }

    public final void i() {
        Configuration configuration;
        if (this.h || (((configuration = this.s) != null && configuration.orientation != 2) || !yjk.aa(this.k) || this.c.h)) {
            if (this.r.isEmpty()) {
                this.r.m(this.d);
                return;
            }
            return;
        }
        this.r.t();
    }

    @Override // defpackage.ajsu, defpackage.zfk
    public final void j() {
        this.f = false;
        this.g = false;
        this.i = null;
        this.s = null;
        this.j = null;
        Object obj = this.t;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.t = null;
        }
        Object obj2 = this.u;
        if (obj2 != null) {
            ayrz.c((AtomicReference) obj2);
            this.u = null;
        }
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.r;
    }

    @Override // defpackage.ajsu, defpackage.ajvc
    public final void lE(Configuration configuration) {
        this.s = configuration;
        i();
    }

    @Override // defpackage.ajus
    public final String lx() {
        return this.c.f;
    }

    public final void h() {
        ojb ojbVar;
        nzc nzcVar;
        boolean z = !this.f;
        this.f = z;
        if (z && (ojbVar = this.l.a) != null && (nzcVar = ((DefaultWatchPanelViewController) ojbVar).i) != null) {
            nzcVar.g(1, true);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ohu) it.next()).oK();
        }
    }
}
