package com.google.android.apps.youtube.app.extensions.arcamera.faceviewer;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ajok;
import defpackage.ajom;
import defpackage.ajos;
import defpackage.ajoy;
import defpackage.akhk;
import defpackage.amml;
import defpackage.anaf;
import defpackage.anfq;
import defpackage.ansr;
import defpackage.anst;
import defpackage.ansu;
import defpackage.any;
import defpackage.aocz;
import defpackage.aogo;
import defpackage.aok;
import defpackage.aolo;
import defpackage.aone;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aqtq;
import defpackage.aqts;
import defpackage.aqvr;
import defpackage.askd;
import defpackage.askg;
import defpackage.auov;
import defpackage.auoy;
import defpackage.aweh;
import defpackage.gng;
import defpackage.gni;
import defpackage.gwx;
import defpackage.gwy;
import defpackage.gxa;
import defpackage.nqg;
import defpackage.nqp;
import defpackage.nun;
import defpackage.sbw;
import defpackage.sel;
import defpackage.seu;
import defpackage.sfi;
import defpackage.sfk;
import defpackage.yjj;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FaceViewerPresenter implements ajom, any, nun {
    private final Activity a;
    private final nqp b;
    private final gni c;
    private final ViewGroup d;
    private sbw e;
    private final gxa f;
    private final gwx g;

    public FaceViewerPresenter(Context context, nqp nqpVar, gni gniVar, ajoy ajoyVar, gwx gwxVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = nqpVar;
        this.c = gniVar;
        akhk akhkVar = (akhk) ajoyVar.a.get();
        akhkVar.getClass();
        this.f = new gxa(akhkVar);
        this.g = gwxVar;
        this.a = yjj.l(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof aok) {
            ((aok) componentCallbacks2).getLifecycle().c(this);
        }
        this.b.g().b(this);
        sbw sbwVar = this.e;
        if (sbwVar != null) {
            sbwVar.d.a();
            sbw sbwVar2 = this.e;
            Iterator it = sbwVar2.b.iterator();
            while (it.hasNext()) {
                ((seu) it.next()).b();
            }
            sbwVar2.b.clear();
            sbwVar2.c = null;
            this.e = null;
        }
    }

    @Override // defpackage.nun
    public final void g(nqg nqgVar) {
        aqts l;
        auov auovVar;
        auov auovVar2;
        if (this.e != null) {
            if (nqgVar != null && (l = nqgVar.l()) != null && (l.c & 16) != 0) {
                aqtq aqtqVar = l.g;
                if (aqtqVar == null) {
                    aqtqVar = aqtq.a;
                }
                if (aqtqVar.b == 49399797) {
                    aqtq aqtqVar2 = l.g;
                    if (aqtqVar2 == null) {
                        aqtqVar2 = aqtq.a;
                    }
                    if (aqtqVar2.b == 49399797) {
                        auovVar = (auov) aqtqVar2.c;
                    } else {
                        auovVar = auov.a;
                    }
                    if (auovVar.d.size() != 0) {
                        aqtq aqtqVar3 = l.g;
                        if (aqtqVar3 == null) {
                            aqtqVar3 = aqtq.a;
                        }
                        if (aqtqVar3.b == 49399797) {
                            auovVar2 = (auov) aqtqVar3.c;
                        } else {
                            auovVar2 = auov.a;
                        }
                        for (auoy auoyVar : auovVar2.d) {
                            if ((auoyVar.e & 1048576) == 0) {
                                if ((auoyVar.b & 16) != 0) {
                                    askd askdVar = auoyVar.j;
                                    if (askdVar == null) {
                                        askdVar = askd.a;
                                    }
                                    Iterator it = askdVar.e.iterator();
                                    while (it.hasNext()) {
                                        if ((((askg) it.next()).j & 512) != 0) {
                                        }
                                    }
                                }
                            }
                            this.e.d.e();
                            return;
                        }
                    }
                }
            }
            this.e.d.a();
        }
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        sbw sbwVar = this.e;
        if (sbwVar != null) {
            sbwVar.d.a();
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        sbw sbwVar = this.e;
        if (sbwVar != null) {
            sbwVar.d.e();
        }
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqvr aqvrVar = (aqvr) obj;
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof aok) {
            ((aok) componentCallbacks2).getLifecycle().b(this);
        }
        this.b.g().a(this);
        gwx gwxVar = this.g;
        gxa gxaVar = this.f;
        Context context = gwxVar.a;
        ScheduledExecutorService scheduledExecutorService = gwxVar.b;
        final sbw sbwVar = new sbw(context, new sel(context, scheduledExecutorService), gxaVar, scheduledExecutorService, scheduledExecutorService, context.getMainExecutor(), new sfk(context, 1), new aogo(null), new gwy(ajokVar.a));
        this.e = sbwVar;
        aone createBuilder = ansu.a.createBuilder();
        aone createBuilder2 = ansr.a.createBuilder();
        aony aonyVar = aqvrVar.b;
        createBuilder2.copyOnWrite();
        ansr ansrVar = (ansr) createBuilder2.instance;
        aony aonyVar2 = ansrVar.b;
        if (!aonyVar2.c()) {
            ansrVar.b = aonm.mutableCopy(aonyVar2);
        }
        aolo.addAll((Iterable) aonyVar, (List) ansrVar.b);
        createBuilder.copyOnWrite();
        ansu ansuVar = (ansu) createBuilder.instance;
        ansr ansrVar2 = (ansr) createBuilder2.build();
        ansrVar2.getClass();
        ansuVar.d = ansrVar2;
        ansuVar.c = 6;
        aone createBuilder3 = anst.a.createBuilder();
        String str = aqvrVar.d;
        createBuilder3.copyOnWrite();
        anst anstVar = (anst) createBuilder3.instance;
        str.getClass();
        anstVar.b |= 1;
        anstVar.c = str;
        aweh awehVar = aqvrVar.c;
        if (awehVar == null) {
            awehVar = aweh.a;
        }
        createBuilder3.copyOnWrite();
        anst anstVar2 = (anst) createBuilder3.instance;
        awehVar.getClass();
        anstVar2.d = awehVar;
        anstVar2.b |= 2;
        createBuilder.copyOnWrite();
        ansu ansuVar2 = (ansu) createBuilder.instance;
        anst anstVar3 = (anst) createBuilder3.build();
        anstVar3.getClass();
        ansuVar2.f = anstVar3;
        ansuVar2.e = 5;
        int aY = aocz.aY(aqvrVar.e);
        if (aY == 0) {
            aY = 1;
        }
        gng gngVar = gng.LIGHT;
        int i = aY + (-1) != 2 ? 3 : 2;
        createBuilder.copyOnWrite();
        ansu ansuVar3 = (ansu) createBuilder.instance;
        ansuVar3.h = i - 1;
        ansuVar3.b |= 32;
        createBuilder.copyOnWrite();
        ansu ansuVar4 = (ansu) createBuilder.instance;
        ansuVar4.b |= 8;
        ansuVar4.g = "Base Experience";
        if (!aqvrVar.f.isEmpty()) {
            String str2 = aqvrVar.f;
            createBuilder.copyOnWrite();
            ansu ansuVar5 = (ansu) createBuilder.instance;
            str2.getClass();
            ansuVar5.b |= 128;
            ansuVar5.i = str2;
        }
        final ansu ansuVar6 = (ansu) createBuilder.build();
        final int i2 = this.c.a().ordinal() != 1 ? 1 : 2;
        anaf.Y(anfq.h(sbwVar.k, new amml() { // from class: sbu
            @Override // defpackage.amml
            public final Object apply(Object obj2) {
                ansr ansrVar3;
                sbw sbwVar2 = sbw.this;
                ansu ansuVar7 = ansuVar6;
                int i3 = i2;
                Executor executor = sbwVar2.j;
                Executor executor2 = sbwVar2.i;
                Executor executor3 = sbwVar2.h;
                sev sevVar = new sev(sbwVar2.l, new sez(ansuVar7, i3), executor, executor2, executor3, (CronetEngine) obj2);
                Iterator it = sbwVar2.b.iterator();
                while (it.hasNext()) {
                    ((seu) it.next()).c(sevVar);
                }
                if (!sevVar.a.a()) {
                    sbwVar2.e.a();
                }
                sci sciVar = sevVar.e.a;
                ansh a = ansi.a();
                int i4 = ansuVar7.c;
                if (i4 == 1) {
                    String str3 = (String) ansuVar7.d;
                    a.copyOnWrite();
                    ((ansi) a.instance).h(str3);
                } else if (i4 == 6) {
                    aone createBuilder4 = anse.a.createBuilder();
                    if (ansuVar7.c == 6) {
                        ansrVar3 = (ansr) ansuVar7.d;
                    } else {
                        ansrVar3 = ansr.a;
                    }
                    aony aonyVar3 = ansrVar3.b;
                    createBuilder4.copyOnWrite();
                    anse anseVar = (anse) createBuilder4.instance;
                    aony aonyVar4 = anseVar.b;
                    if (!aonyVar4.c()) {
                        anseVar.b = aonm.mutableCopy(aonyVar4);
                    }
                    aolo.addAll((Iterable) aonyVar3, (List) anseVar.b);
                    a.copyOnWrite();
                    ((ansi) a.instance).g((anse) createBuilder4.build());
                }
                sev sevVar2 = sciVar.c;
                if (sevVar2 != null) {
                    ansd ansdVar = ((scj) sevVar2.e.b()).a;
                    a.copyOnWrite();
                    ((ansi) a.instance).f(ansdVar);
                }
                sbx sbxVar = sciVar.b;
                aone g = sciVar.g();
                ansi ansiVar = (ansi) a.build();
                g.copyOnWrite();
                ansq ansqVar = (ansq) g.instance;
                ansq ansqVar2 = ansq.a;
                ansiVar.getClass();
                ansqVar.d = ansiVar;
                ansqVar.c = 2;
                sbxVar.a(g);
                return null;
            }
        }, sbwVar.j), new sfi(1), sbwVar.h);
        this.d.removeAllViews();
        this.d.addView(this.e.c, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
