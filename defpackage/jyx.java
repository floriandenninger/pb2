package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jyx extends jzr {
    public gad a;
    private jqk ae;
    private jyw af;
    private boolean ag = true;
    public fze b;
    public aiqn c;
    private gad d;
    private jyp e;

    @Override // defpackage.gir
    public final gad aL() {
        return this.d;
    }

    @Override // defpackage.gir
    public final CharSequence aS() {
        ml mlVar = this.ap;
        return mlVar != null ? mlVar.getString(R.string.offline_videos_title) : "";
    }

    @Override // defpackage.gir
    public final Object aT() {
        jyp jypVar = this.e;
        if (jypVar == null) {
            return null;
        }
        jzo jzoVar = jypVar.t;
        return new jyw(new jyo(jzoVar != null ? jzoVar.ph() : null, jypVar.y));
    }

    @Override // defpackage.gir
    public final void aY(Object obj) {
        if (obj instanceof jyw) {
            jyw jywVar = (jyw) obj;
            this.af = jywVar;
            Object obj2 = jywVar.a;
        }
    }

    @Override // defpackage.gir
    public final void aZ(boolean z) {
        this.ag = z;
        jyp jypVar = this.e;
        if (jypVar == null) {
            return;
        }
        jypVar.c(z);
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        jyp jypVar = this.e;
        Object obj = jypVar.v;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            jypVar.v = null;
        }
        jypVar.y = false;
        jypVar.f.c(jypVar.o);
        jypVar.b.m(jypVar);
        jypVar.b.m(jypVar.c);
        jypVar.b.m(jypVar.e);
        jzo jzoVar = jypVar.t;
        jzoVar.getClass();
        jzoVar.j();
        jypVar.t = null;
        jqk jqkVar = jypVar.l;
        jqkVar.g = 0;
        jqkVar.d.clear();
        jqkVar.c.clear();
        jqkVar.e.clear();
        jqkVar.f.clear();
    }

    @Override // defpackage.gir, defpackage.ce
    public final void mS() {
        super.mS();
        this.ae.b.d(acsb.b(42352), aN(), null);
        final jyp jypVar = this.e;
        jyi jyiVar = jypVar.j;
        if (!jyiVar.d) {
            acsx d = ((acsy) jyiVar.a.get()).d(asmn.LATENCY_ACTION_DOWNLOADS);
            d.getClass();
            jyiVar.c = d;
            ajyw ajywVar = (ajyw) jyiVar.b.get();
            ajjz ajjzVar = (ajjz) ajywVar.b.get();
            ajjzVar.getClass();
            ajzi ajziVar = (ajzi) ajywVar.c.get();
            ajziVar.getClass();
            aksl akslVar = (aksl) ajywVar.a.get();
            akslVar.getClass();
            d.getClass();
            new ajmd(ajjzVar, ajziVar, akslVar, 6, 1, 0, false, false, d).k();
            d.c("br_s");
        }
        jzp jzpVar = jypVar.a;
        ajxe ajxeVar = jypVar.u;
        RecyclerView recyclerView = jypVar.s;
        recyclerView.getClass();
        jqk jqkVar = jypVar.l;
        ajoy ajoyVar = (ajoy) jzpVar.a.get();
        ajoyVar.getClass();
        ajvq ajvqVar = (ajvq) jzpVar.b.get();
        ajvqVar.getClass();
        jtz jtzVar = (jtz) jzpVar.c.get();
        jtzVar.getClass();
        ypa ypaVar = (ypa) jzpVar.d.get();
        ypaVar.getClass();
        zaw zawVar = (zaw) jzpVar.e.get();
        zawVar.getClass();
        ajpa ajpaVar = (ajpa) jzpVar.f.get();
        ajpaVar.getClass();
        ajxj ajxjVar = (ajxj) jzpVar.g.get();
        ajxjVar.getClass();
        aaea aaeaVar = (aaea) jzpVar.h.get();
        aaeaVar.getClass();
        aypn aypnVar = (aypn) jzpVar.i.get();
        aypnVar.getClass();
        axzf axzfVar = (axzf) jzpVar.j.get();
        axzfVar.getClass();
        recyclerView.getClass();
        jypVar.t = new jzo(ajoyVar, ajvqVar, jtzVar, ypaVar, zawVar, ajpaVar, ajxjVar, aaeaVar, aypnVar, axzfVar, ajxeVar, recyclerView, jqkVar, null, null, null, null);
        int i = 1;
        if (jypVar.u == null || !jypVar.y) {
            jtz jtzVar2 = jypVar.k;
            aqnf aqnfVar = aqnf.FILTER_TYPE_NONE;
            aone createBuilder = aqng.a.createBuilder();
            createBuilder.copyOnWrite();
            aqng aqngVar = (aqng) createBuilder.instance;
            aqngVar.c = aqnfVar.e;
            aqngVar.b |= 1;
            jypVar.v = ayqj.C(new jtx(jtzVar2, new jua("downloads_page_section_identifier_unknown", createBuilder, jtzVar2.b, amlr.a, null, null, null), i)).M(azre.b(jypVar.h)).I(azre.b(jypVar.i)).V(new ayrs() { // from class: jyj
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    jyp jypVar2 = jyp.this;
                    jty jtyVar = (jty) obj;
                    jzo jzoVar = jypVar2.t;
                    if (jzoVar != null) {
                        jzoVar.V(jtyVar.a);
                        jypVar2.a();
                    }
                }
            });
        } else {
            jypVar.i.execute(new Runnable() { // from class: jyk
                @Override // java.lang.Runnable
                public final void run() {
                    jyp.this.a();
                }
            });
        }
        jypVar.b.g(jypVar);
        jypVar.b.g(jypVar.c);
        jypVar.b.g(jypVar.e);
        jypVar.f.a(jypVar.o);
        jypVar.c.b();
        jypVar.d.b(jvt.c);
        if (jypVar.n) {
            jypVar.w = new ajpd();
            jypVar.x = new fzr(jypVar.m);
            jypVar.c(true);
            jzo jzoVar = jypVar.t;
            jzoVar.getClass();
            jzoVar.L(jypVar.w);
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.downloads_page_fragment, viewGroup, false);
        acra mM = mM();
        mM.getClass();
        this.ae = new jqk(mM);
        aiqn aiqnVar = this.c;
        jyw jywVar = this.af;
        ajxe ajxeVar = jywVar != null ? jywVar.b : null;
        jqk jqkVar = this.ae;
        CharSequence aS = aS();
        boolean bd = bd();
        jzp jzpVar = (jzp) aiqnVar.k.get();
        ypa ypaVar = (ypa) aiqnVar.m.get();
        ypaVar.getClass();
        jsk jskVar = (jsk) aiqnVar.q.get();
        jskVar.getClass();
        jvt jvtVar = (jvt) aiqnVar.p.get();
        jvtVar.getClass();
        fjm fjmVar = (fjm) aiqnVar.a.get();
        fjmVar.getClass();
        jhn jhnVar = (jhn) aiqnVar.l.get();
        jhnVar.getClass();
        aahv aahvVar = (aahv) aiqnVar.e.get();
        aahvVar.getClass();
        Executor executor = (Executor) aiqnVar.f.get();
        executor.getClass();
        Executor executor2 = (Executor) aiqnVar.o.get();
        executor2.getClass();
        jyi jyiVar = (jyi) aiqnVar.c.get();
        jyiVar.getClass();
        jtz jtzVar = (jtz) aiqnVar.b.get();
        jtzVar.getClass();
        yqw yqwVar = (yqw) aiqnVar.n.get();
        aadw aadwVar = (aadw) aiqnVar.g.get();
        aadwVar.getClass();
        fka fkaVar = (fka) aiqnVar.h.get();
        fkaVar.getClass();
        axzg axzgVar = (axzg) aiqnVar.i.get();
        axzgVar.getClass();
        shf shfVar = (shf) aiqnVar.d.get();
        shfVar.getClass();
        afsy afsyVar = (afsy) aiqnVar.j.get();
        afsyVar.getClass();
        jqkVar.getClass();
        aS.getClass();
        jyp jypVar = new jyp(jzpVar, ypaVar, jskVar, jvtVar, fjmVar, jhnVar, aahvVar, executor, executor2, jyiVar, jtzVar, yqwVar, aadwVar, fkaVar, axzgVar, shfVar, afsyVar, ajxeVar, jqkVar, aS, bd, null, null, null, null);
        this.e = jypVar;
        jypVar.r = (LoadingFrameLayout) inflate.findViewById(R.id.loading_layout);
        jypVar.s = (RecyclerView) inflate.findViewById(R.id.downloads_list);
        RecyclerView recyclerView = jypVar.s;
        recyclerView.getContext();
        recyclerView.af(new LinearLayoutManager());
        this.e.c(this.ag);
        gac a = this.a.a();
        a.m(new jyv(this, 1));
        this.d = a.a();
        return inflate;
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        jzo jzoVar;
        super.onConfigurationChanged(configuration);
        jyp jypVar = this.e;
        if (jypVar == null || (jzoVar = jypVar.t) == null) {
            return;
        }
        jzoVar.F(configuration);
    }
}
