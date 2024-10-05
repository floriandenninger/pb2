package com.google.android.apps.youtube.app.search;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController;
import com.google.android.libraries.youtube.innertube.model.SearchResponseModel;
import com.google.protos.youtube.api.innertube.EngagementPanelSectionListRendererOuterClass;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import defpackage.aahd;
import defpackage.abbx;
import defpackage.abcb;
import defpackage.acqx;
import defpackage.acrs;
import defpackage.acsb;
import defpackage.acsy;
import defpackage.afwu;
import defpackage.agcm;
import defpackage.ajjz;
import defpackage.ajmi;
import defpackage.ajss;
import defpackage.ajxe;
import defpackage.ajzi;
import defpackage.akcp;
import defpackage.akdz;
import defpackage.akec;
import defpackage.aksl;
import defpackage.amru;
import defpackage.any;
import defpackage.aok;
import defpackage.aone;
import defpackage.aong;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aptg;
import defpackage.apth;
import defpackage.apti;
import defpackage.aptj;
import defpackage.aptk;
import defpackage.apxf;
import defpackage.aqts;
import defpackage.arev;
import defpackage.asah;
import defpackage.asai;
import defpackage.askd;
import defpackage.askg;
import defpackage.asmn;
import defpackage.atmb;
import defpackage.atmc;
import defpackage.aulq;
import defpackage.aunn;
import defpackage.auoa;
import defpackage.auov;
import defpackage.auoy;
import defpackage.axpg;
import defpackage.axzg;
import defpackage.azrw;
import defpackage.evr;
import defpackage.fre;
import defpackage.fzj;
import defpackage.lar;
import defpackage.las;
import defpackage.lat;
import defpackage.law;
import defpackage.laz;
import defpackage.lba;
import defpackage.lbb;
import defpackage.lcg;
import defpackage.lci;
import defpackage.lcj;
import defpackage.lcl;
import defpackage.lcz;
import defpackage.lgl;
import defpackage.lgo;
import defpackage.lgs;
import defpackage.lhd;
import defpackage.mcy;
import defpackage.mdw;
import defpackage.mdx;
import defpackage.mec;
import defpackage.nqp;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.zaw;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OnlineSearchController extends lbb implements lgl, any, ypd {
    public static final Locale a = Locale.forLanguageTag("en-IN");
    private final lgs N;
    private final lci O;
    private final lcj P;
    private final HatsController Q;
    private final MealbarPromoController R;
    private final akcp S;
    private final fzj T;
    private final axpg U;
    private final nqp V;
    private final boolean W;
    private final int X;
    private ajxe Y;
    private final lcg Z;
    public final aksl b;
    public final ajss c;
    public SearchResponseModel d;
    public aptj e;
    public TextToSpeech f;
    public final abcb g;
    public final akdz h;
    public final akec i;
    public final ypa j;
    public final zaw k;
    public final lhd l;
    public final ajjz m;
    public final ajzi n;
    public final aahd o;
    public final azrw p;
    public ajmi q;
    public acsy r;
    public mdx s;
    String t;
    lgo u;
    arev v;
    fre w;
    public afwu x;
    public final axzg y;
    public final agcm z;

    /* JADX WARN: Removed duplicated region for block: B:39:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OnlineSearchController(defpackage.azrw r44, defpackage.mgs r45, defpackage.nrp r46, defpackage.ogx r47, defpackage.abcb r48, com.google.android.apps.youtube.app.common.ui.bottomui.HatsController r49, com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController r50, defpackage.akcp r51, defpackage.akdz r52, defpackage.akec r53, defpackage.ypa r54, final defpackage.zaw r55, defpackage.fzj r56, defpackage.lhd r57, defpackage.aadw r58, defpackage.aaea r59, defpackage.axpg r60, defpackage.ajjz r61, defpackage.ajzi r62, defpackage.acsy r63, defpackage.lgs r64, defpackage.sxw r65, defpackage.aahd r66, defpackage.aksl r67, defpackage.ohg r68, defpackage.ajoy r69, defpackage.azrw r70, defpackage.nqp r71, defpackage.axzg r72, defpackage.agcm r73, android.support.v7.widget.RecyclerView r74, com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout r75, android.app.Activity r76, final defpackage.acra r77, defpackage.lci r78, defpackage.lcj r79, defpackage.lcg r80, android.os.Bundle r81, defpackage.ajxe r82, byte[] r83, byte[] r84, byte[] r85, byte[] r86, byte[] r87) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.search.OnlineSearchController.<init>(azrw, mgs, nrp, ogx, abcb, com.google.android.apps.youtube.app.common.ui.bottomui.HatsController, com.google.android.apps.youtube.app.common.ui.bottomui.MealbarPromoController, akcp, akdz, akec, ypa, zaw, fzj, lhd, aadw, aaea, axpg, ajjz, ajzi, acsy, lgs, sxw, aahd, aksl, ohg, ajoy, azrw, nqp, axzg, agcm, android.support.v7.widget.RecyclerView, com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout, android.app.Activity, acra, lci, lcj, lcg, android.os.Bundle, ajxe, byte[], byte[], byte[], byte[], byte[]):void");
    }

    public static boolean p(asah asahVar) {
        auov auovVar;
        if ((asahVar.b & 8) != 0) {
            asai asaiVar = asahVar.e;
            if (asaiVar == null) {
                asaiVar = asai.a;
            }
            if (asaiVar.b == 49399797) {
                auovVar = (auov) asaiVar.c;
            } else {
                auovVar = auov.a;
            }
            askd askdVar = ((auoy) auovVar.d.get(0)).j;
            if (askdVar == null) {
                askdVar = askd.a;
            }
            Iterator it = askdVar.e.iterator();
            while (it.hasNext()) {
                if ((((askg) it.next()).k & 512) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void r(final String str, boolean z) {
        boolean z2 = false;
        s(false);
        if (z) {
            this.c.A();
            this.c.Q();
        } else {
            this.B.c();
            if (this.F != null) {
                arev arevVar = this.v;
                if (arevVar != null) {
                    this.u.a(arevVar);
                }
                j();
                asah asahVar = this.F;
                if ((asahVar.b & 512) != 0) {
                    this.C.D(new acqx(asahVar.h));
                }
                if (evr.aY(this.M)) {
                    this.c.c();
                    this.B.a();
                    return;
                } else {
                    i(new SearchResponseModel(this.F), false);
                    return;
                }
            }
        }
        lar larVar = new lar(this, z, str);
        mdx mdxVar = this.s;
        if (mdxVar != null && this.W) {
            int i = this.X;
            aone createBuilder = aptj.a.createBuilder();
            for (int i2 = 0; i2 < i; i2++) {
                aone createBuilder2 = aptg.a.createBuilder();
                aone createBuilder3 = apti.a.createBuilder();
                apth apthVar = apth.STYLE_HOME_FILTER;
                createBuilder3.copyOnWrite();
                apti aptiVar = (apti) createBuilder3.instance;
                aptiVar.c = apthVar.p;
                aptiVar.b |= 1;
                createBuilder2.copyOnWrite();
                aptg aptgVar = (aptg) createBuilder2.instance;
                apti aptiVar2 = (apti) createBuilder3.build();
                aptiVar2.getClass();
                aptgVar.e = aptiVar2;
                aptgVar.b |= 1;
                aptg aptgVar2 = (aptg) createBuilder2.build();
                aone createBuilder4 = aptk.a.createBuilder();
                createBuilder4.copyOnWrite();
                aptk aptkVar = (aptk) createBuilder4.instance;
                aptgVar2.getClass();
                aptkVar.c = aptgVar2;
                aptkVar.b = 91394224;
                aptk aptkVar2 = (aptk) createBuilder4.build();
                createBuilder.copyOnWrite();
                aptj aptjVar = (aptj) createBuilder.instance;
                aptkVar2.getClass();
                aony aonyVar = aptjVar.b;
                if (!aonyVar.c()) {
                    aptjVar.b = aonm.mutableCopy(aonyVar);
                }
                aptjVar.b.add(aptkVar2);
            }
            mdxVar.a(createBuilder);
        }
        if (evr.I(this.D) && this.r.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            z2 = true;
        }
        this.x = new afwu(larVar);
        final lgs lgsVar = this.N;
        final law lawVar = new law(this, str, z, z2);
        lgsVar.a.execute(new Runnable() { // from class: lgq
            @Override // java.lang.Runnable
            public final void run() {
                String str2;
                lgs lgsVar2 = lgs.this;
                String str3 = str;
                final lgr lgrVar = lawVar;
                byte[] bArr = lgsVar2.c;
                if (bArr == null || bArr.length == 0 || (str2 = lgsVar2.d) == null || !str2.equals(str3)) {
                    lgrVar.a(null);
                } else {
                    final asah asahVar2 = (asah) lgsVar2.e.a(lgsVar2.c, asah.a);
                    lgsVar2.b.post(new Runnable() { // from class: lgp
                        @Override // java.lang.Runnable
                        public final void run() {
                            lgr.this.a(asahVar2);
                        }
                    });
                }
            }
        });
    }

    private final void s(boolean z) {
        lci lciVar = this.O;
        if (lciVar != null) {
            lciVar.c(z);
        }
    }

    @Override // defpackage.lbb
    public final void a() {
        o();
        this.c.j();
        afwu afwuVar = this.x;
        if (afwuVar != null) {
            afwuVar.d();
        }
        this.j.m(this);
    }

    @Override // defpackage.lbb
    public final void b(String str, String str2) {
        aone createBuilder = atmc.a.createBuilder();
        createBuilder.copyOnWrite();
        atmc atmcVar = (atmc) createBuilder.instance;
        atmcVar.b |= 2;
        atmcVar.d = 22156;
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            atmc atmcVar2 = (atmc) createBuilder.instance;
            str.getClass();
            atmcVar2.b |= 1;
            atmcVar2.c = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            atmc atmcVar3 = (atmc) createBuilder.instance;
            str2.getClass();
            atmcVar3.b |= 32;
            atmcVar3.f = str2;
        }
        this.L = (atmc) createBuilder.build();
        j();
    }

    @Override // defpackage.lbb
    public final void c(Configuration configuration) {
        this.c.F(configuration);
    }

    @Override // defpackage.lbb
    public final void d(String str) {
        r(str, false);
    }

    public final void h(int i, String str, String str2) {
        Locale forLanguageTag;
        Activity activity = this.A;
        if (TextUtils.isEmpty(str2)) {
            forLanguageTag = Locale.getDefault();
        } else {
            forLanguageTag = Locale.forLanguageTag(str2);
        }
        this.f = new TextToSpeech(activity, new lat(this, i, str, forLanguageTag));
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.google.android.libraries.youtube.innertube.model.SearchResponseModel r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.search.OnlineSearchController.i(com.google.android.libraries.youtube.innertube.model.SearchResponseModel, boolean):void");
    }

    public final void j() {
        apxf apxfVar;
        if (this.F != null && this.L != null && (apxfVar = this.E) != null) {
            aong aongVar = (aong) apxfVar.toBuilder();
            aongVar.e(atmb.b, this.L);
            this.E = (apxf) aongVar.build();
        }
        this.C.G(acsb.b(4724), acrs.DEFAULT, this.E);
        this.C.n(new acqx(acsb.c(10349)));
        this.C.n(new acqx(acsb.c(64833)));
        this.C.n(new acqx(acsb.c(22156)));
        this.T.e(this.C.c().a);
        this.T.f();
    }

    @Override // defpackage.lgl
    public final void k(auoa auoaVar, int i) {
        apxf apxfVar = auoaVar.e;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (apxfVar.pY(SearchEndpointOuterClass.searchEndpoint)) {
            apxf apxfVar2 = auoaVar.e;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            String str = ((aunn) apxfVar2.pX(SearchEndpointOuterClass.searchEndpoint)).c;
            laz lazVar = this.K;
            if (lazVar != null) {
                lcl lclVar = (lcl) lazVar;
                lclVar.aw = str;
                lclVar.af.d(str);
                lclVar.ay.setText(lclVar.aw);
            }
            r(str, true);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{lcz.class};
        }
        if (i == 0) {
            i(this.d, ((lcz) obj).b());
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.lbb
    public final void l(Bundle bundle) {
        super.l(bundle);
        if (this.t != null && this.F != null) {
            final abbx abbxVar = (abbx) this.U.get();
            final String str = this.t;
            final asah asahVar = this.F;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Invalid cache key: cache key is empty");
            }
            abbxVar.c.execute(new Runnable() { // from class: abbv
                @Override // java.lang.Runnable
                public final void run() {
                    abbx abbxVar2 = abbx.this;
                    asah asahVar2 = asahVar;
                    String str2 = str;
                    HashMap hashMap = new HashMap();
                    cnc cncVar = new cnc();
                    cncVar.a = asahVar2.toByteArray();
                    cncVar.g = hashMap;
                    abbxVar2.a.d(str2, cncVar);
                }
            });
        }
        arev arevVar = this.v;
        if (arevVar != null) {
            lgo lgoVar = this.u;
            if (lgoVar != null) {
                arevVar = mcy.H(arevVar, lgoVar.a.c);
            }
            bundle.putByteArray("sticky_horizontal_card_list", arevVar.toByteArray());
        }
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        TextToSpeech textToSpeech = this.f;
        if (textToSpeech != null) {
            textToSpeech.stop();
            this.f.shutdown();
            this.f = null;
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    public final void m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aulq aulqVar = (aulq) it.next();
            if (aulqVar.pY(EngagementPanelSectionListRendererOuterClass.engagementPanelSectionListRenderer)) {
                this.V.p((aqts) aulqVar.pX(EngagementPanelSectionListRendererOuterClass.engagementPanelSectionListRenderer));
            }
        }
    }

    public final void n(asah asahVar) {
        this.o.b(amru.o(asahVar.k));
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    public final void o() {
        ajmi ajmiVar = this.q;
        if (ajmiVar != null) {
            ajmiVar.b();
            this.q = null;
        }
    }

    @Override // defpackage.lbb
    public final boolean oa() {
        return this.d != null;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }

    @Override // defpackage.lbb, defpackage.ajvz
    public final ajxe ph() {
        mdw mdwVar;
        lba lbaVar = new lba(this.F, this.c.p());
        mdx mdxVar = this.s;
        if (mdxVar != null) {
            mec mecVar = mdxVar.a;
            if (mecVar != null) {
                mdwVar = new mdw(mdxVar.c, mdxVar.b, mecVar.g);
            } else {
                mdwVar = new mdw(mdxVar.c, mdxVar.b, null);
            }
            this.Y = mdwVar;
        }
        if (evr.aY(this.M)) {
            return new las(lbaVar, this.c.ph(), this.e, this.Y);
        }
        return new las(lbaVar, null, this.e, this.Y);
    }
}
