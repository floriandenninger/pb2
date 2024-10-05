package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class orx implements fgp, faq, ypd {
    public final osq a;
    public final fgq b;
    public final adlt c;
    public final ainy d;
    public final aahd e;
    public final Handler f;
    public apxf g;
    public boolean h;
    public final rxm i;
    private final osm j;
    private final ypa k;
    private final gjz l;
    private final okf m;
    private final ayqi n;
    private final ayqw o = new ayqw();
    private boolean p;
    private final aadw q;

    public orx(osm osmVar, osq osqVar, aadw aadwVar, ypa ypaVar, fgq fgqVar, rxm rxmVar, adlt adltVar, gjz gjzVar, okf okfVar, ainy ainyVar, aahd aahdVar, Handler handler, ayqi ayqiVar, byte[] bArr) {
        this.j = osmVar;
        this.a = osqVar;
        this.q = aadwVar;
        this.k = ypaVar;
        this.b = fgqVar;
        this.i = rxmVar;
        this.c = adltVar;
        this.l = gjzVar;
        this.m = okfVar;
        this.d = ainyVar;
        this.e = aahdVar;
        this.f = handler;
        this.n = ayqiVar;
    }

    @Override // defpackage.faq
    public final void a(boolean z) {
        if (z) {
            this.a.e();
        } else if (this.d.d()) {
            this.a.d();
        }
    }

    public final void b() {
        if (this.p) {
            this.p = false;
            this.a.e();
            this.a.g();
            this.k.m(this);
            this.b.j(this);
            this.i.b(this);
            this.o.c();
        }
    }

    public final void c(boolean z) {
        int i;
        if (this.p) {
            return;
        }
        final int i2 = 1;
        this.p = true;
        osq osqVar = this.a;
        apwy b = this.q.b();
        asvu asvuVar = b.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if ((asvuVar.c & 262144) != 0) {
            asvu asvuVar2 = b.e;
            if (asvuVar2 == null) {
                asvuVar2 = asvu.a;
            }
            awbp awbpVar = asvuVar2.G;
            if (awbpVar == null) {
                awbpVar = awbp.a;
            }
            i = awbpVar.c;
        } else {
            i = 1800;
        }
        osqVar.f = TimeUnit.SECONDS.toMillis(i);
        this.a.c(this.j.a(), TimeUnit.MINUTES);
        this.a.a();
        this.k.g(this);
        this.b.i(this);
        this.i.a(this);
        final int i3 = 0;
        this.o.g(this.a.a.ax(new ayrs(this) { // from class: orv
            public final /* synthetic */ orx a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    orx orxVar = this.a;
                    int intValue = ((Integer) obj).intValue();
                    orxVar.a.b();
                    orxVar.a.c(intValue, TimeUnit.MINUTES);
                    orxVar.d.Z();
                    return;
                }
                orx orxVar2 = this.a;
                if (orxVar2.g == null) {
                    orxVar2.h = true;
                } else {
                    orxVar2.d();
                }
            }
        }), this.j.d.B().ab(this.n).ax(new ayrs(this) { // from class: orv
            public final /* synthetic */ orx a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i3 == 0) {
                    orx orxVar = this.a;
                    int intValue = ((Integer) obj).intValue();
                    orxVar.a.b();
                    orxVar.a.c(intValue, TimeUnit.MINUTES);
                    orxVar.d.Z();
                    return;
                }
                orx orxVar2 = this.a;
                if (orxVar2.g == null) {
                    orxVar2.h = true;
                } else {
                    orxVar2.d();
                }
            }
        }));
        if (this.i.a) {
            return;
        }
        if (this.d.d()) {
            this.a.d();
        }
        if (z && this.b.g().f()) {
            this.d.Z();
        }
    }

    public final void d() {
        this.h = false;
        fhg g = this.b.g();
        if (g == fhg.WATCH_WHILE_FULLSCREEN) {
            this.m.l(true);
        } else if (g == fhg.WATCH_WHILE_MINIMIZED) {
            this.l.h(2);
            this.m.l(true);
        } else if (g == fhg.VIRTUAL_REALITY_FULLSCREEN) {
            this.l.h(2);
            this.m.p();
        }
        this.d.a();
        this.e.c(this.g, amrz.k("engagement_panel_close_listener_key", new nqd() { // from class: oru
            @Override // defpackage.nqd
            public final void a() {
                orx.this.d.b();
            }
        }));
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        apxf apxfVar;
        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
        if (i == -1) {
            return new Class[]{aftm.class, afto.class, ahdv.class, ahej.class};
        }
        if (i == 0) {
            this.a.b();
            return null;
        }
        if (i == 1) {
            this.a.b();
            return null;
        }
        if (i == 2) {
            ahdv ahdvVar = (ahdv) obj;
            aigk c = ahdvVar.c();
            if (c == aigk.NEW || c == aigk.VIDEO_PLAYBACK_ERROR) {
                this.g = null;
                this.a.e();
                return null;
            }
            if (c != aigk.VIDEO_WATCH_LOADED) {
                return null;
            }
            if ((ahdvVar.a().a.b & 524288) != 0) {
                apxfVar = ahdvVar.a().a.w;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            } else {
                apxfVar = null;
            }
            this.g = apxfVar;
            if (!this.h || apxfVar == null) {
                return null;
            }
            this.f.post(new Runnable() { // from class: orw
                @Override // java.lang.Runnable
                public final void run() {
                    orx.this.d();
                }
            });
            return null;
        }
        if (i == 3) {
            if (((ahej) obj).a() != 2 || this.b.g().d() || this.i.a || this.c.f() != 2) {
                this.a.e();
                return null;
            }
            this.a.d();
            apxf apxfVar2 = this.g;
            if (apxfVar2 == null || (showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar2.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) == null) {
                return null;
            }
            aone createBuilder = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a.createBuilder();
            String str = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c == 1 ? (String) showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d : "";
            createBuilder.copyOnWrite();
            HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.instance;
            str.getClass();
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = str;
            HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2 = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.build();
            aong aongVar = (aong) apxf.a.createBuilder();
            aongVar.e(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2);
            this.e.c((apxf) aongVar.build(), null);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (!fhgVar.f() || fhgVar.d()) {
            this.a.e();
        } else if (this.d.d()) {
            this.a.d();
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }
}
