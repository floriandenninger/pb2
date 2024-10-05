package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import defpackage.ahdv;
import defpackage.ahef;
import defpackage.aigk;
import defpackage.aign;
import defpackage.aioa;
import defpackage.aioc;
import defpackage.apmg;
import defpackage.apmh;
import defpackage.apxf;
import defpackage.aqrt;
import defpackage.aqru;
import defpackage.aqrv;
import defpackage.aqrw;
import defpackage.aqrx;
import defpackage.aqyg;
import defpackage.aqyi;
import defpackage.aryl;
import defpackage.aseo;
import defpackage.atyk;
import defpackage.atzi;
import defpackage.atzr;
import defpackage.atzw;
import defpackage.aulq;
import defpackage.auzj;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.oba;
import defpackage.oqu;
import defpackage.ypd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class i implements aioa, ypd {
    final /* synthetic */ j a;

    public i(j jVar) {
        this.a = jVar;
    }

    private final void c() {
        j jVar = this.a;
        jVar.q.d(R.id.api_watch_in_youtube_button, jVar.o != null);
    }

    public final void a(ahdv ahdvVar) {
        atzr atzrVar;
        aqrw aqrwVar;
        apmg apmgVar;
        aqrw aqrwVar2;
        WatchNextResponseModel a = ahdvVar.a();
        if (ahdvVar.c() == aigk.VIDEO_WATCH_LOADED && a != null) {
            aseo aseoVar = a.a.f;
            if (aseoVar == null) {
                aseoVar = aseo.a;
            }
            if (aseoVar.b == 78882851) {
                atzrVar = (atzr) aseoVar.c;
            } else {
                atzrVar = atzr.a;
            }
            if ((atzrVar.b & 1048576) != 0) {
                j jVar = this.a;
                apmh apmhVar = atzrVar.o;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                apmg apmgVar2 = apmhVar.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                jVar.o = apmgVar2;
                c();
            } else {
                this.a.o = null;
                c();
            }
            boolean z = false;
            if ((atzrVar.b & 4096) != 0) {
                atzw atzwVar = atzrVar.i;
                if (atzwVar == null) {
                    atzwVar = atzw.a;
                }
                if (atzwVar.b == 149559471) {
                    aqrwVar2 = (aqrw) atzwVar.c;
                } else {
                    aqrwVar2 = aqrw.a;
                }
                aulq aulqVar = aqrwVar2.d;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                aqru aqruVar = (aqru) aulqVar.pX(aqrx.b);
                if (aqruVar != null) {
                    aqyg aqygVar = aqruVar.b;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    if (aqygVar.c.size() > 0) {
                        aqyg aqygVar2 = aqruVar.b;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                        if ((((aqyi) aqygVar2.c.get(0)).b & 512) != 0) {
                            j jVar2 = this.a;
                            aqyg aqygVar3 = aqruVar.b;
                            if (aqygVar3 == null) {
                                aqygVar3 = aqyg.a;
                            }
                            apxf apxfVar = ((aqyi) aqygVar3.c.get(0)).m;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            jVar2.p = apxfVar;
                        }
                    }
                }
                this.a.p = null;
            } else {
                this.a.p = null;
            }
            j jVar3 = this.a;
            aqrt D = oba.D(jVar3.n);
            if (D != null && D.k) {
                z = true;
            }
            jVar3.l.e = z;
            jVar3.d.p(z);
            if (z) {
                atzw atzwVar2 = atzrVar.i;
                if (atzwVar2 == null) {
                    atzwVar2 = atzw.a;
                }
                if (atzwVar2.b == 149559471) {
                    aqrwVar = (aqrw) atzwVar2.c;
                } else {
                    aqrwVar = aqrw.a;
                }
                j jVar4 = this.a;
                jVar4.e.a(aqrwVar, jVar4.d);
                aulq aulqVar2 = aqrwVar.e;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aulq aulqVar3 = ((aqrv) aulqVar2.pX(aqrx.c)).c;
                if (aulqVar3 == null) {
                    aulqVar3 = aulq.a;
                }
                auzj auzjVar = (auzj) aulqVar3.pX(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
                j jVar5 = this.a;
                jVar5.g.b(auzjVar, jVar5.f, jVar5.i, jVar5.h);
                com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.b bVar = this.a.k;
                atzi atziVar = atzrVar.f;
                if (atziVar == null) {
                    atziVar = atzi.a;
                }
                if (atziVar.b == 65153809) {
                    apmgVar = (apmg) atziVar.c;
                } else {
                    apmgVar = apmg.a;
                }
                bVar.b(apmgVar, this.a.j);
                return;
            }
            return;
        }
        j jVar6 = this.a;
        jVar6.o = null;
        jVar6.p = null;
        c();
    }

    public final void b(ahef ahefVar) {
        PlayerResponseModel b = ahefVar.b();
        if (ahefVar.c() != aign.PLAYBACK_LOADED || b == null) {
            if (ahefVar.c() == aign.VIDEO_PLAYING) {
                this.a.a.pt(false);
                return;
            }
            return;
        }
        aryl arylVar = b.a.C;
        if (arylVar == null) {
            arylVar = aryl.a;
        }
        atyk atykVar = arylVar.c;
        if (atykVar == null) {
            atykVar = atyk.a;
        }
        if ((atykVar.b & 32) == 0) {
            this.a.a.pt(false);
            return;
        }
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h hVar = this.a.a;
        atyk atykVar2 = arylVar.c;
        if (atykVar2 == null) {
            atykVar2 = atyk.a;
        }
        hVar.pt(atykVar2.g);
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 0;
        final int i2 = 1;
        return new ayqx[]{aiocVar.G().a.Y(new ayrs(this) { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.h
            public final /* synthetic */ i a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.a((ahdv) obj);
                } else {
                    this.a.b((ahef) obj);
                }
            }
        }, oqu.p), aiocVar.ao().Y(new ayrs(this) { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service.h
            public final /* synthetic */ i a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.a((ahdv) obj);
                } else {
                    this.a.b((ahef) obj);
                }
            }
        }, oqu.p)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahdv.class, ahef.class};
        }
        if (i == 0) {
            a((ahdv) obj);
            return null;
        }
        if (i == 1) {
            b((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
