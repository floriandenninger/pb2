package defpackage;

import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ezd implements aaha {
    public static final /* synthetic */ int c = 0;
    public final azrw a;
    public ayqx b;
    private final nqy d;
    private final axpg e;
    private final axpg f;
    private final nth g;
    private final aadw h;

    public ezd(nqy nqyVar, aadw aadwVar, azrw azrwVar, axpg axpgVar, axpg axpgVar2, nth nthVar) {
        this.d = nqyVar;
        this.h = aadwVar;
        this.a = azrwVar;
        this.f = axpgVar2;
        this.e = axpgVar;
        this.g = nthVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqtn aqtnVar;
        aqts aqtsVar;
        aqts aqtsVar2;
        oba.h(this.b);
        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
        if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 4) == 0) {
            nqy nqyVar = this.d;
            if (showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c == 10) {
                aqtnVar = (aqtn) showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d;
            } else {
                aqtnVar = aqtn.a;
            }
            aqtm b = aqtm.b(aqtnVar.c);
            if (b == null) {
                b = aqtm.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
            }
            nqp a = nqyVar.a(b);
            if (oba.o(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint, a)) {
                return;
            }
            if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 64) != 0) {
                aqto aqtoVar = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.h;
                if (aqtoVar == null) {
                    aqtoVar = aqto.a;
                }
                if (aqtoVar.b == 138681066) {
                    aqto aqtoVar2 = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.h;
                    if (aqtoVar2 == null) {
                        aqtoVar2 = aqto.a;
                    }
                    if (aqtoVar2.b == 138681066) {
                        aqtsVar = (aqts) aqtoVar2.c;
                    } else {
                        aqtsVar = aqts.b;
                    }
                    if (!a.w(oba.i(aqtsVar))) {
                        if (aqtoVar2.b == 138681066) {
                            aqtsVar2 = (aqts) aqtoVar2.c;
                        } else {
                            aqtsVar2 = aqts.b;
                        }
                        a.p(aqtsVar2);
                    }
                }
            }
            oba.n(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.g, (nnc) this.a.get());
            String m = oba.m(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint);
            if (m == null) {
                m = (String) yjj.u(map, "engagement_panel_id_key", String.class);
            }
            oba.l(apxfVar, a, (nqd) yjj.u(map, "engagement_panel_close_listener_key", nqd.class), m, evr.aG(this.h) && ((Boolean) yjj.t(map, "triggered_on_ui_ready", false)).booleanValue(), map);
            if (evr.aI(this.h) && ((fgq) this.f.get()).g().equals(fhg.WATCH_WHILE_FULLSCREEN) && ((nuv) this.e.get()).b == nuu.PORTRAIT_WATCH_PANEL && a.c() != null) {
                this.b = a.h().l.s(eng.h).U().as(false).e().R(new ayrm() { // from class: ezc
                    @Override // defpackage.ayrm
                    public final void a() {
                        ((nnc) ezd.this.a.get()).p(false);
                    }
                });
                return;
            }
            return;
        }
        final nth nthVar = this.g;
        if (nth.a(apxfVar).isPresent()) {
            final ayqj as = aypy.m(nthVar.c.b(), aypy.W(apxfVar), knl.i).Y(mmt.o).as(Optional.empty());
            nthVar.a.f(new Callable() { // from class: ntg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final nth nthVar2 = nth.this;
                    return as.V(new ayrs() { // from class: ntf
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            String j;
                            aqts aqtsVar3;
                            byte[] bArr;
                            aqtn aqtnVar2;
                            aqtn aqtnVar3;
                            final nth nthVar3 = nth.this;
                            Optional optional = (Optional) obj;
                            if (optional.isPresent()) {
                                nqp nqpVar = (nqp) ((ammw) optional.get()).a;
                                apxf apxfVar2 = (apxf) ((ammw) optional.get()).b;
                                Optional a2 = nth.a(apxfVar2);
                                if (!a2.isPresent() || oba.o((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) a2.get(), nqpVar) || (j = oba.j((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) a2.get())) == null) {
                                    return;
                                }
                                oba.n(((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) a2.get()).g, (nnc) nthVar3.g.get());
                                autw autwVar = ((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) a2.get()).e;
                                if (autwVar == null) {
                                    autwVar = autw.a;
                                }
                                aqto aqtoVar3 = autwVar.c;
                                if (aqtoVar3 == null) {
                                    aqtoVar3 = aqto.a;
                                }
                                if (aqtoVar3.b == 138681066) {
                                    aqtsVar3 = (aqts) aqtoVar3.c;
                                } else {
                                    aqtsVar3 = aqts.b;
                                }
                                aone builder = aqtsVar3.toBuilder();
                                int i = aqtsVar3.d;
                                final int i2 = 1;
                                if (i != 1) {
                                    if (i == 18) {
                                        aqtnVar2 = (aqtn) aqtsVar3.e;
                                    } else {
                                        aqtnVar2 = aqtn.a;
                                    }
                                    if ((aqtnVar2.b & 2) == 0) {
                                        if (aqtsVar3.d == 18) {
                                            aqtnVar3 = (aqtn) aqtsVar3.e;
                                        } else {
                                            aqtnVar3 = aqtn.a;
                                        }
                                        aone builder2 = aqtnVar3.toBuilder();
                                        builder2.copyOnWrite();
                                        aqtn aqtnVar4 = (aqtn) builder2.instance;
                                        aqtnVar4.b |= 2;
                                        aqtnVar4.d = j;
                                        builder.copyOnWrite();
                                        aqts aqtsVar4 = (aqts) builder.instance;
                                        aqtn aqtnVar5 = (aqtn) builder2.build();
                                        aqtnVar5.getClass();
                                        aqtsVar4.e = aqtnVar5;
                                        aqtsVar4.d = 18;
                                    }
                                }
                                if ((aqtsVar3.c & 1024) == 0) {
                                    builder.copyOnWrite();
                                    aqts aqtsVar5 = (aqts) builder.instance;
                                    aqtsVar5.k = 1;
                                    aqtsVar5.c |= 1024;
                                }
                                aqts aqtsVar6 = (aqts) builder.build();
                                nqpVar.r(aqtsVar6, null, true, null, true);
                                final Optional l = oba.l(apxfVar2, nqpVar, null, oba.m((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) a2.get()), false, null);
                                if (l.isPresent()) {
                                    if ((aqtsVar6.c & 16) == 0) {
                                        nth.b((nqg) l.get(), true);
                                    }
                                    abal abalVar = nthVar3.d;
                                    ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2 = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) a2.get();
                                    if (apxfVar2 == null || (apxfVar2.b & 1) == 0) {
                                        bArr = aaef.b;
                                    } else {
                                        bArr = apxfVar2.c.I();
                                    }
                                    abak d = nthVar3.d.d();
                                    String j2 = oba.j(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2);
                                    j2.getClass();
                                    d.a = j2;
                                    autw autwVar2 = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2.e;
                                    if (autwVar2 == null) {
                                        autwVar2 = autw.a;
                                    }
                                    if ((autwVar2.b & 2) != 0) {
                                        autw autwVar3 = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2.e;
                                        if (autwVar3 == null) {
                                            autwVar3 = autw.a;
                                        }
                                        d.c = abak.i(autwVar3.d);
                                    }
                                    d.m(bArr);
                                    anhy g = abalVar.a.g(d, nthVar3.e);
                                    final int i3 = 0;
                                    ynm.n(nthVar3.b, g, new zfi() { // from class: nte
                                        @Override // defpackage.zfi
                                        public final void a(Object obj2) {
                                            aqts aqtsVar7;
                                            if (i3 != 0) {
                                                nth nthVar4 = nthVar3;
                                                Optional optional2 = l;
                                                attf attfVar = ((abaj) obj2).a;
                                                aahd aahdVar = nthVar4.h;
                                                apxf apxfVar3 = attfVar.e;
                                                if (apxfVar3 == null) {
                                                    apxfVar3 = apxf.a;
                                                }
                                                aahdVar.a(apxfVar3);
                                                nqg nqgVar = (nqg) optional2.get();
                                                nqgVar.j().D(new acqx(attfVar.f));
                                                attg attgVar = attfVar.c;
                                                if (attgVar == null) {
                                                    attgVar = attg.a;
                                                }
                                                if (attgVar.b == 138681066) {
                                                    aqtsVar7 = (aqts) attgVar.c;
                                                } else {
                                                    aqtsVar7 = aqts.b;
                                                }
                                                nqgVar.A(aqtsVar7, null, false);
                                                nth.b((nqg) optional2.get(), false);
                                                return;
                                            }
                                            nth nthVar5 = nthVar3;
                                            nqg nqgVar2 = (nqg) l.get();
                                            String b2 = nthVar5.f.b((Throwable) obj2);
                                            if (nqgVar2 instanceof noq) {
                                                ((noq) nqgVar2).a().b(b2, false);
                                            }
                                        }
                                    }, new zfi() { // from class: nte
                                        @Override // defpackage.zfi
                                        public final void a(Object obj2) {
                                            aqts aqtsVar7;
                                            if (i2 != 0) {
                                                nth nthVar4 = nthVar3;
                                                Optional optional2 = l;
                                                attf attfVar = ((abaj) obj2).a;
                                                aahd aahdVar = nthVar4.h;
                                                apxf apxfVar3 = attfVar.e;
                                                if (apxfVar3 == null) {
                                                    apxfVar3 = apxf.a;
                                                }
                                                aahdVar.a(apxfVar3);
                                                nqg nqgVar = (nqg) optional2.get();
                                                nqgVar.j().D(new acqx(attfVar.f));
                                                attg attgVar = attfVar.c;
                                                if (attgVar == null) {
                                                    attgVar = attg.a;
                                                }
                                                if (attgVar.b == 138681066) {
                                                    aqtsVar7 = (aqts) attgVar.c;
                                                } else {
                                                    aqtsVar7 = aqts.b;
                                                }
                                                nqgVar.A(aqtsVar7, null, false);
                                                nth.b((nqg) optional2.get(), false);
                                                return;
                                            }
                                            nth nthVar5 = nthVar3;
                                            nqg nqgVar2 = (nqg) l.get();
                                            String b2 = nthVar5.f.b((Throwable) obj2);
                                            if (nqgVar2 instanceof noq) {
                                                ((noq) nqgVar2).a().b(b2, false);
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    });
                }
            });
        }
    }
}
