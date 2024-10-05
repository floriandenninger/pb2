package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abje extends ahvw implements abjb, ypd {
    public final Context a;
    public final abjc b;
    public final abjf c;
    public final aahd d;
    public final acra e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public apmp i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private atzf t;

    public abje(Context context, abjc abjcVar, abjf abjfVar, aypy aypyVar, aahd aahdVar, axpg axpgVar, ajdw ajdwVar, acra acraVar, abiy abiyVar) {
        super(abjcVar, axpgVar, ajdwVar, acraVar);
        this.a = context;
        this.b = abjcVar;
        this.c = abjfVar;
        this.d = aahdVar;
        this.e = acraVar;
        boolean a = abiyVar.a();
        this.f = a;
        aspg aspgVar = abiyVar.a;
        this.g = aspgVar.k;
        this.h = aspgVar.j.equals("lean-back");
        g(a ? 1 : 0);
        new ayqw().d(aypyVar.ax(new ayrs() { // from class: abjd
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                abje abjeVar = abje.this;
                boolean z = ((abja) obj).a;
                if (abjeVar.f) {
                    apmp apmpVar = abjeVar.i;
                    if (apmpVar != null) {
                        aone createBuilder = asht.a.createBuilder();
                        aone createBuilder2 = asio.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        asio asioVar = (asio) createBuilder2.instance;
                        asioVar.c = 1;
                        asioVar.b = 1 | asioVar.b;
                        createBuilder2.copyOnWrite();
                        asio asioVar2 = (asio) createBuilder2.instance;
                        asioVar2.b |= 2;
                        asioVar2.d = z;
                        createBuilder.copyOnWrite();
                        asht ashtVar = (asht) createBuilder.instance;
                        asio asioVar3 = (asio) createBuilder2.build();
                        asioVar3.getClass();
                        ashtVar.H = asioVar3;
                        ashtVar.c |= 134217728;
                        abjeVar.e.I(3, new acqx(apmpVar.v.I()), (asht) createBuilder.build());
                    }
                    if (z) {
                        apmp apmpVar2 = abjeVar.i;
                        if (apmpVar2 == null || (apmpVar2.b & 512) == 0) {
                            return;
                        }
                        aahd aahdVar2 = abjeVar.d;
                        apxf apxfVar = apmpVar2.k;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar2.a(apxfVar);
                        return;
                    }
                    apmp apmpVar3 = abjeVar.i;
                    if (apmpVar3 == null || (apmpVar3.b & 16384) == 0) {
                        return;
                    }
                    aahd aahdVar3 = abjeVar.d;
                    apxf apxfVar2 = apmpVar3.p;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar3.a(apxfVar2);
                }
            }
        }));
    }

    @Override // defpackage.abjb
    public final void a(boolean z, boolean z2) {
        this.l = z;
        this.m = z2;
        if (e()) {
            if (z) {
                g(1);
            } else if (this.c.a() == 1) {
                g(2);
                this.b.n();
            }
            if (!this.g) {
                this.c.d(true == z2 ? 1 : 2);
            } else if (z2) {
                this.c.d(1);
            }
        }
    }

    public final void b() {
        aong aongVar = (aong) apxf.a.createBuilder();
        aonk aonkVar = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint;
        aone createBuilder = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.instance;
        hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
        hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = "live-chat-item-section";
        aongVar.e(aonkVar, (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.build());
        this.d.a((apxf) aongVar.build());
    }

    public final void c() {
        atzf atzfVar = this.t;
        if (atzfVar == null || (atzfVar.b & 1) == 0 || this.k) {
            return;
        }
        aahd aahdVar = this.d;
        apxf apxfVar = atzfVar.c;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.a(apxfVar);
    }

    public final boolean e() {
        return this.f && this.i != null && this.j && !this.k;
    }

    @Override // defpackage.ahvw
    public final void d(ahdv ahdvVar) {
        atzr atzrVar;
        WatchNextResponseModel a;
        atzr atzrVar2;
        if (this.f) {
            if (this.s != 0 && (a = ahdvVar.a()) != null) {
                aseo aseoVar = a.a.f;
                if (aseoVar == null) {
                    aseoVar = aseo.a;
                }
                if (aseoVar.b == 78882851) {
                    atzrVar2 = (atzr) aseoVar.c;
                } else {
                    atzrVar2 = atzr.a;
                }
                if ((atzrVar2.b & 67108864) != 0) {
                    aulq aulqVar = atzrVar2.s;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    if (aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
                        aulq aulqVar2 = atzrVar2.s;
                        if (aulqVar2 == null) {
                            aulqVar2 = aulq.a;
                        }
                        aqrf aqrfVar = (aqrf) aulqVar2.pX(ElementRendererOuterClass.elementRenderer);
                        ajok ajokVar = new ajok();
                        ajokVar.a(this.q);
                        this.p.oB(ajokVar, ajds.a(aqrfVar));
                        this.n.c = this.p.a();
                    }
                }
            }
            WatchNextResponseModel a2 = ahdvVar.a();
            if (a2 == null) {
                return;
            }
            aseo aseoVar2 = a2.a.f;
            if (aseoVar2 == null) {
                aseoVar2 = aseo.a;
            }
            if (aseoVar2.b == 78882851) {
                atzrVar = (atzr) aseoVar2.c;
            } else {
                atzrVar = atzr.a;
            }
            Iterator it = atzrVar.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.i = null;
                    break;
                }
                atzh atzhVar = (atzh) it.next();
                if ((atzhVar.b & 8) != 0) {
                    atzf atzfVar = atzhVar.c;
                    if (atzfVar == null) {
                        atzfVar = atzf.a;
                    }
                    this.t = atzfVar;
                    apmh apmhVar = atzfVar.d;
                    if (apmhVar == null) {
                        apmhVar = apmh.a;
                    }
                    if ((apmhVar.b & 2) != 0) {
                        apmh apmhVar2 = this.t.d;
                        if (apmhVar2 == null) {
                            apmhVar2 = apmh.a;
                        }
                        apmp apmpVar = apmhVar2.d;
                        if (apmpVar == null) {
                            apmpVar = apmp.a;
                        }
                        this.i = apmpVar;
                    }
                }
            }
            apmp apmpVar2 = this.i;
            if (apmpVar2 != null) {
                this.c.c(apmpVar2);
                if (this.j) {
                    c();
                    this.c.d(true == this.m ? 1 : 2);
                    return;
                }
                return;
            }
            this.c.d(0);
            g(1);
        }
    }

    @Override // defpackage.ahvw, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls != abje.class) {
            if (i == -1) {
                return new Class[]{ahdv.class};
            }
            if (i == 0) {
                d((ahdv) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        int i2 = 2;
        switch (i) {
            case -1:
                return new Class[]{abix.class, ahcu.class, ahcx.class, ahdv.class, ahee.class, ahef.class};
            case 0:
                abix abixVar = (abix) obj;
                if (((ammv) abixVar.h()).h() || !e()) {
                    return null;
                }
                boolean b = abixVar.b();
                if (b && this.l) {
                    return null;
                }
                this.c.d(true != b ? 2 : 1);
                if (b) {
                    g(2);
                    this.b.n();
                    return null;
                }
                g(1);
                b();
                return null;
            case 1:
                this.c.d(0);
                this.i = null;
                g(1);
                this.b.m(false);
                return null;
            case 2:
                ahcx ahcxVar = (ahcx) obj;
                if (!this.f) {
                    return null;
                }
                int i3 = this.a.getResources().getConfiguration().orientation;
                if (!ahcxVar.c().equals(aigf.FULLSCREEN)) {
                    if (ahcxVar.c().equals(aigf.DEFAULT) && this.s == 2) {
                        aong aongVar = (aong) apxf.a.createBuilder();
                        aonk aonkVar = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint;
                        aone createBuilder = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a.createBuilder();
                        createBuilder.copyOnWrite();
                        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.instance;
                        showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c = 1;
                        showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d = "live-chat-item-section";
                        aongVar.e(aonkVar, (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.build());
                        this.d.a((apxf) aongVar.build());
                    }
                    this.j = false;
                    this.c.d(0);
                    g(1);
                    this.b.m(false);
                    return null;
                }
                if (this.j) {
                    return null;
                }
                this.j = true;
                if (this.i == null) {
                    return null;
                }
                abjf abjfVar = this.c;
                if (this.m && (i3 != 1 || this.g)) {
                    i2 = 1;
                }
                abjfVar.d(i2);
                if ((this.h || i3 == 1) && !this.k) {
                    b();
                }
                c();
                return null;
            case 3:
                d((ahdv) obj);
                return null;
            case 4:
                ahee aheeVar = (ahee) obj;
                if (!this.f) {
                    return null;
                }
                this.b.m(aheeVar.a);
                return null;
            case 5:
                boolean z = this.k;
                boolean a = ((ahef) obj).c().a(aign.PLAYBACK_INTERRUPTED, aign.INTERSTITIAL_REQUESTED, aign.INTERSTITIAL_PLAYING, aign.ENDED);
                this.k = a;
                if (a) {
                    g(1);
                    return null;
                }
                if (!z) {
                    return null;
                }
                if (e() && !this.l && this.c.a() == 1) {
                    g(2);
                }
                if (!this.m) {
                    return null;
                }
                this.c.d(1);
                return null;
            default:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("unsupported op code: ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
        }
    }
}
