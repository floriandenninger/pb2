package defpackage;

import android.text.TextUtils;
import com.google.android.apps.youtube.app.search.OnlineSearchController;
import com.google.android.libraries.youtube.innertube.model.SearchResponseModel;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lar extends afww {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;
    final /* synthetic */ OnlineSearchController c;

    public lar(OnlineSearchController onlineSearchController, boolean z, String str) {
        this.c = onlineSearchController;
        this.a = z;
        this.b = str;
    }

    @Override // defpackage.afww, defpackage.cnk
    public final void kY(cnq cnqVar) {
        OnlineSearchController onlineSearchController = this.c;
        onlineSearchController.H = null;
        zfl a = onlineSearchController.k.a(cnqVar);
        this.c.B.b(a.a, true);
        if (!this.a) {
            this.c.j();
        }
        evr.bX(this.c.C, a.b);
        this.c.r.v("sr_e", asmn.LATENCY_ACTION_SEARCH_UI);
    }

    @Override // defpackage.afww, defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        auov auovVar;
        ajsq ajsqVar;
        ajvq ajvqVar;
        SearchResponseModel searchResponseModel = (SearchResponseModel) obj;
        if (evr.I(this.c.D) && this.c.r.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.c.r.u("sr_r", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        } else {
            this.c.r.u("sr_r", asmn.LATENCY_ACTION_SEARCH_UI);
        }
        if (this.a && (ajvqVar = (ajsqVar = this.c.c.k).a) != null) {
            ajsqVar.b = null;
            ajsqVar.c.f.q(ajvqVar);
        }
        OnlineSearchController onlineSearchController = this.c;
        onlineSearchController.H = null;
        if (!this.a) {
            onlineSearchController.j();
        }
        if (OnlineSearchController.p(searchResponseModel.a)) {
            OnlineSearchController onlineSearchController2 = this.c;
            asai asaiVar = searchResponseModel.a.e;
            if (asaiVar == null) {
                asaiVar = asai.a;
            }
            askd askdVar = ((auoy) (asaiVar.b == 49399797 ? (auov) asaiVar.c : auov.a).d.get(0)).j;
            if (askdVar == null) {
                askdVar = askd.a;
            }
            int i = 0;
            for (askg askgVar : askdVar.e) {
                if ((askgVar.k & 512) != 0) {
                    aptj aptjVar = askgVar.aw;
                    if (aptjVar == null) {
                        aptjVar = aptj.a;
                    }
                    onlineSearchController2.e = aptjVar;
                    if (askdVar.e.size() == 1) {
                        asai asaiVar2 = searchResponseModel.a.e;
                        if (asaiVar2 == null) {
                            asaiVar2 = asai.a;
                        }
                        aone builder = (asaiVar2.b == 49399797 ? (auov) asaiVar2.c : auov.a).toBuilder();
                        builder.copyOnWrite();
                        auov auovVar2 = (auov) builder.instance;
                        auovVar2.a();
                        auovVar2.d.remove(0);
                        auovVar = (auov) builder.build();
                    } else {
                        aong aongVar = (aong) askdVar.toBuilder();
                        aongVar.copyOnWrite();
                        askd askdVar2 = (askd) aongVar.instance;
                        askdVar2.a();
                        askdVar2.e.remove(i);
                        askd askdVar3 = (askd) aongVar.build();
                        asai asaiVar3 = searchResponseModel.a.e;
                        if (asaiVar3 == null) {
                            asaiVar3 = asai.a;
                        }
                        aone builder2 = ((auoy) (asaiVar3.b == 49399797 ? (auov) asaiVar3.c : auov.a).d.get(0)).toBuilder();
                        builder2.copyOnWrite();
                        auoy auoyVar = (auoy) builder2.instance;
                        askdVar3.getClass();
                        auoyVar.j = askdVar3;
                        auoyVar.b |= 16;
                        auoy auoyVar2 = (auoy) builder2.build();
                        asai asaiVar4 = searchResponseModel.a.e;
                        if (asaiVar4 == null) {
                            asaiVar4 = asai.a;
                        }
                        aone builder3 = (asaiVar4.b == 49399797 ? (auov) asaiVar4.c : auov.a).toBuilder();
                        builder3.copyOnWrite();
                        auov auovVar3 = (auov) builder3.instance;
                        auoyVar2.getClass();
                        auovVar3.a();
                        auovVar3.d.set(0, auoyVar2);
                        auovVar = (auov) builder3.build();
                    }
                    asai asaiVar5 = searchResponseModel.a.e;
                    if (asaiVar5 == null) {
                        asaiVar5 = asai.a;
                    }
                    aone builder4 = asaiVar5.toBuilder();
                    builder4.copyOnWrite();
                    asai asaiVar6 = (asai) builder4.instance;
                    auovVar.getClass();
                    asaiVar6.c = auovVar;
                    asaiVar6.b = 49399797;
                    asai asaiVar7 = (asai) builder4.build();
                    aone builder5 = searchResponseModel.a.toBuilder();
                    builder5.copyOnWrite();
                    asah asahVar = (asah) builder5.instance;
                    asaiVar7.getClass();
                    asahVar.e = asaiVar7;
                    asahVar.b |= 8;
                    onlineSearchController2.F = (asah) builder5.build();
                    onlineSearchController2.d = new SearchResponseModel(onlineSearchController2.F);
                }
                i++;
            }
        } else {
            OnlineSearchController onlineSearchController3 = this.c;
            onlineSearchController3.F = searchResponseModel.a;
            onlineSearchController3.d = searchResponseModel;
        }
        final akev a = this.c.l.a();
        if (a.a.d()) {
            a.d.schedule(new Runnable() { // from class: akes
                @Override // java.lang.Runnable
                public final void run() {
                    akev.this.i();
                }
            }, a.a.i, TimeUnit.MILLISECONDS);
        }
        akdz akdzVar = this.c.h;
        String str = this.b;
        if (str == null) {
            akdzVar.a();
        } else {
            try {
                akdzVar.b = URLEncoder.encode(str, "UTF-8");
                akdzVar.c = akdzVar.a.c();
            } catch (UnsupportedEncodingException e) {
                akmq.e("Unsupported encoding of previous query ", e);
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Unsupported encoding of previous query ");
                sb.append(valueOf);
                zga.b(sb.toString());
                akdzVar.a();
            }
        }
        OnlineSearchController onlineSearchController4 = this.c;
        asah asahVar2 = onlineSearchController4.F;
        if (asahVar2 != null) {
            akec akecVar = onlineSearchController4.i;
            String str2 = this.b;
            aony aonyVar = asahVar2.m;
            if (TextUtils.isEmpty(str2) || aonyVar == null || aonyVar.isEmpty()) {
                akecVar.a();
            } else {
                akecVar.a = str2;
                akecVar.b = new ArrayList();
                Iterator it = aonyVar.iterator();
                while (it.hasNext()) {
                    akecVar.b.add((String) it.next());
                }
            }
        }
        OnlineSearchController onlineSearchController5 = this.c;
        onlineSearchController5.C.D(new acqx(onlineSearchController5.d.d()));
        OnlineSearchController onlineSearchController6 = this.c;
        onlineSearchController6.n(onlineSearchController6.d.a);
        OnlineSearchController onlineSearchController7 = this.c;
        onlineSearchController7.i(onlineSearchController7.d, this.a);
        if (evr.I(this.c.D) && this.c.r.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.c.r.v("sr_p", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        } else {
            this.c.r.v("sr_p", asmn.LATENCY_ACTION_SEARCH_UI);
        }
        asvu asvuVar = this.c.M.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.l) {
            this.c.o();
            asvu asvuVar2 = this.c.M.b().e;
            if (asvuVar2 == null) {
                asvuVar2 = asvu.a;
            }
            int i2 = asvuVar2.m;
            asvu asvuVar3 = this.c.M.b().e;
            if (asvuVar3 == null) {
                asvuVar3 = asvu.a;
            }
            boolean z = asvuVar3.ak;
            boolean aw = evr.aw(this.c.M);
            boolean ax = evr.ax(this.c.M);
            OnlineSearchController onlineSearchController8 = this.c;
            onlineSearchController8.q = ajmi.a(onlineSearchController8.j, onlineSearchController8.m, onlineSearchController8.n, 2, i2, 0, z, onlineSearchController8.r, aw, ax, onlineSearchController8.b);
        }
        OnlineSearchController onlineSearchController9 = this.c;
        asah asahVar3 = onlineSearchController9.d.a;
        if ((asahVar3.b & 8192) != 0) {
            aahd aahdVar = onlineSearchController9.o;
            arzz arzzVar = asahVar3.l;
            if (arzzVar == null) {
                arzzVar = arzz.a;
            }
            apxf apxfVar = arzzVar.b;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
        }
    }
}
