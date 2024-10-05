package defpackage;

import android.view.View;
import android.view.ViewStub;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jru implements ypd {
    public String a;
    public String b;
    anhy c;
    anhy d;
    public final agof e;
    public final fiu f;
    private final ViewStub g;
    private final ScheduledExecutorService h;
    private final Executor i;
    private final ypa j;
    private final agzz k;
    private final jsi l;
    private final fjm m;
    private final fjl n = new fjl() { // from class: jro
        @Override // defpackage.fjl
        public final void a() {
            jru.this.c();
        }
    };
    private View o;
    private boolean p;

    public jru(ScheduledExecutorService scheduledExecutorService, Executor executor, agof agofVar, ypa ypaVar, agzz agzzVar, fjm fjmVar, fiu fiuVar, ViewStub viewStub, jsi jsiVar) {
        this.h = scheduledExecutorService;
        this.i = executor;
        this.e = agofVar;
        this.j = ypaVar;
        this.k = agzzVar;
        this.m = fjmVar;
        this.g = viewStub;
        this.l = jsiVar;
        this.f = fiuVar;
    }

    private final void e() {
        anhy anhyVar = this.c;
        if (anhyVar != null) {
            anhyVar.cancel(false);
            this.c = null;
        }
        anhy anhyVar2 = this.d;
        if (anhyVar2 != null) {
            anhyVar2.cancel(false);
            this.d = null;
        }
    }

    public final void a() {
        e();
        this.a = null;
        this.b = null;
        this.j.m(this);
        this.m.b(this.n);
        d(false);
    }

    public final void b(ajok ajokVar) {
        if (!this.k.c()) {
            d(false);
            return;
        }
        this.a = ajokVar.k("VideoPresenterConstants.VIDEO_ID");
        this.b = ajokVar.k("PlaylistPresenterConstants.PLAYLIST_ID");
        if (!ammx.e(this.a) || !ammx.e(this.b)) {
            this.j.g(this);
            this.m.a(this.n);
            c();
            return;
        }
        d(false);
    }

    public final void c() {
        e();
        String str = this.a;
        String str2 = this.b;
        final int i = 0;
        final int i2 = 1;
        if (ammx.e(str)) {
            if (ammx.e(str2)) {
                return;
            }
            anhy i3 = anfq.i(anaf.T(new anfy(this) { // from class: jrp
                public final /* synthetic */ jru a;

                {
                    this.a = this;
                }

                @Override // defpackage.anfy
                public final anhy a() {
                    if (i == 0) {
                        return anaf.O(this.a.e.a());
                    }
                    return anaf.O(this.a.e.a());
                }
            }, this.h), new jrq(str2, 0), this.h);
            this.d = i3;
            anaf.Y(i3, new jrt(this, 1), this.i);
            return;
        }
        anhy i4 = anfq.i(anaf.T(new anfy(this) { // from class: jrp
            public final /* synthetic */ jru a;

            {
                this.a = this;
            }

            @Override // defpackage.anfy
            public final anhy a() {
                if (i2 == 0) {
                    return anaf.O(this.a.e.a());
                }
                return anaf.O(this.a.e.a());
            }
        }, this.h), new jrq(str, 1), this.h);
        this.c = i4;
        anaf.Y(i4, new jrt(this, 0), this.i);
    }

    public final void d(boolean z) {
        yjk.f();
        if (z && this.o == null) {
            View inflate = this.g.inflate();
            final jsi jsiVar = this.l;
            if (jsiVar != null && inflate != null) {
                jsiVar.a = inflate;
                inflate.setOnClickListener(new View.OnClickListener() { // from class: jrn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        jsi.this.e();
                    }
                });
            }
            this.o = inflate;
        }
        View view = this.o;
        if (view != null && z != this.p) {
            whu.I(view, z);
        }
        this.p = z;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{jqc.class, jqd.class, agko.class, agla.class, aglb.class};
        }
        if (i == 0) {
            if (!((jqc) obj).a.equals(this.a)) {
                return null;
            }
            d(false);
            return null;
        }
        if (i == 1) {
            c();
            return null;
        }
        if (i == 2) {
            if (!((agko) obj).a.equals(this.b)) {
                return null;
            }
            d(false);
            return null;
        }
        if (i == 3) {
            final agla aglaVar = (agla) obj;
            this.f.b().G(new ayrv() { // from class: jrs
                @Override // defpackage.ayrv
                public final Object a(Object obj2) {
                    return Boolean.valueOf(((amsx) obj2).contains(agla.this.a.m()));
                }
            }).V(new ayrs() { // from class: jrr
                @Override // defpackage.ayrs
                public final void a(Object obj2) {
                    jru jruVar = jru.this;
                    agla aglaVar2 = aglaVar;
                    if (((Boolean) obj2).booleanValue()) {
                        return;
                    }
                    if (!aglaVar2.a.m().equals(jruVar.a) || aglaVar2.a.i() != agnq.PLAYABLE) {
                        if (ammx.e(jruVar.b) || !jruVar.e.a().i().n(aglaVar2.a.m()).contains(jruVar.b)) {
                            return;
                        }
                        jruVar.d(true);
                        return;
                    }
                    jruVar.d(true);
                }
            });
            return null;
        }
        if (i == 4) {
            if (!((aglb) obj).a.equals(this.a)) {
                return null;
            }
            d(false);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
