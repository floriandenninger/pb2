package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jqi extends jqf implements ypd {
    public ypa a;
    public axpg ae;
    public juy af;
    public gad ag;
    public String ah;
    public CharSequence ai;
    public Future aj = anaf.M();
    public jlr ak;
    public agof al;
    public lwk am;
    public axzg an;
    private agsn ao;
    public ysy b;
    public aild c;
    public jsk d;
    public fjm e;

    @Override // defpackage.gir, defpackage.ce
    public final void Z() {
        super.Z();
        if (this.b.o()) {
            this.ao.l().j();
        }
    }

    @Override // defpackage.gir
    public final gad aL() {
        return this.ag;
    }

    @Override // defpackage.gir
    public final CharSequence aS() {
        if (this.an.m().booleanValue()) {
            this.ai = null;
        }
        return this.ai;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{agko.class};
        }
        if (i == 0) {
            if (!((agko) obj).a.equals(this.ah)) {
                return null;
            }
            this.at.c(true);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.gir
    public final gad lv() {
        if (this.aq == null) {
            gac a = this.ag.a();
            a.m(new amml() { // from class: jqg
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    fzf fzfVar = (fzf) obj;
                    fzfVar.a = jqi.this.aS();
                    return fzfVar;
                }
            });
            this.aq = a.a();
        }
        return this.aq;
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        this.aj.cancel(false);
        jlr jlrVar = this.ak;
        ykn yknVar = jlrVar.p;
        if (yknVar != null && !yknVar.e()) {
            jlrVar.p.d();
        }
        jlrVar.p = null;
        if (jlrVar.r != null) {
            ListView listView = jlrVar.n;
            listView.getClass();
            listView.reclaimViews(new ArrayList());
            ajos ajosVar = jlrVar.d;
            ajom ajomVar = jlrVar.r;
            ajomVar.getClass();
            ajosVar.b(ajomVar.a());
            jlrVar.r = null;
        }
        jlrVar.b.m(jlrVar);
        if (jlrVar.x.m().booleanValue()) {
            jlz jlzVar = jlrVar.t;
            if (jlzVar != null) {
                jlrVar.b.m(jlzVar);
            }
        } else {
            jlv jlvVar = jlrVar.s;
            if (jlvVar != null) {
                jlvVar.a();
                jlrVar.b.m(jlvVar);
            }
        }
        this.a.m(this.e);
        this.a.m(this.d);
        this.a.m(this);
    }

    @Override // defpackage.gir, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        String string = this.m.getString("playlist_id");
        zhq.m(string);
        this.ah = string;
    }

    @Override // defpackage.gir, defpackage.ce
    public final void mS() {
        super.mS();
        this.a.g(this);
        this.a.g(this.d);
        this.a.g(this.e);
        jlr jlrVar = this.ak;
        final int i = 1;
        jlrVar.a(true);
        jlrVar.b.g(jlrVar);
        final int i2 = 2;
        final int i3 = 0;
        if (jlrVar.x.m().booleanValue()) {
            final jlz jlzVar = jlrVar.t;
            if (jlzVar != null) {
                jlrVar.b.g(jlzVar);
                ogx ogxVar = jlzVar.t;
                String str = jlzVar.f;
                jlzVar.l = ogxVar.d(str, jlzVar.k, 1, jlzVar.u.s(str, null, null, new azrw() { // from class: jlx
                    @Override // defpackage.azrw
                    public final Object get() {
                        if (i == 0) {
                            jlz jlzVar2 = jlzVar;
                            return Boolean.valueOf(((agof) jlzVar2.c.get()).a().i().a(jlzVar2.f) > 0);
                        }
                        return Boolean.valueOf(Boolean.FALSE.equals(jlzVar.n));
                    }
                }, new azrw() { // from class: jlx
                    @Override // defpackage.azrw
                    public final Object get() {
                        if (i3 == 0) {
                            jlz jlzVar2 = jlzVar;
                            return Boolean.valueOf(((agof) jlzVar2.c.get()).a().i().a(jlzVar2.f) > 0);
                        }
                        return Boolean.valueOf(Boolean.FALSE.equals(jlzVar.n));
                    }
                }, jlzVar.d));
                if (jlzVar.h != null) {
                    jlzVar.c(jlzVar.e == asno.LIKE);
                    jlzVar.h.setEnabled(false);
                }
                ImageView imageView = jlzVar.i;
                if (imageView != null) {
                    whu.I(imageView, false);
                }
                ImageView imageView2 = jlzVar.h;
                if (imageView2 != null) {
                    imageView2.setOnClickListener(new jlw(jlzVar, 1));
                }
                ImageView imageView3 = jlzVar.i;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(new jlw(jlzVar, 0));
                }
                TextView textView = jlzVar.j;
                if (textView != null) {
                    textView.setOnClickListener(new jlw(jlzVar, 2));
                }
                agnh d = ((agof) jlzVar.c.get()).a().i().d(jlzVar.f);
                if (d != null) {
                    jlzVar.b(d.a);
                    jlzVar.e();
                }
            }
        } else {
            final jlv jlvVar = jlrVar.s;
            if (jlvVar != null) {
                jlrVar.b.g(jlvVar);
                jlvVar.g();
                ogx ogxVar2 = jlvVar.q;
                String str2 = jlvVar.f;
                jlvVar.l = ogxVar2.d(str2, jlvVar.k, 1, jlvVar.r.s(str2, null, null, new azrw() { // from class: jlt
                    @Override // defpackage.azrw
                    public final Object get() {
                        if (i3 == 0) {
                            return Boolean.valueOf(Boolean.FALSE.equals(jlvVar.n));
                        }
                        jlv jlvVar2 = jlvVar;
                        return Boolean.valueOf(((agof) jlvVar2.c.get()).a().i().a(jlvVar2.f) > 0);
                    }
                }, new azrw() { // from class: jlt
                    @Override // defpackage.azrw
                    public final Object get() {
                        if (i == 0) {
                            return Boolean.valueOf(Boolean.FALSE.equals(jlvVar.n));
                        }
                        jlv jlvVar2 = jlvVar;
                        return Boolean.valueOf(((agof) jlvVar2.c.get()).a().i().a(jlvVar2.f) > 0);
                    }
                }, jlvVar.d));
                if (jlvVar.h != null) {
                    jlvVar.d(jlvVar.e == asno.LIKE);
                    jlvVar.h.setEnabled(false);
                }
                ImageView imageView4 = jlvVar.i;
                if (imageView4 != null) {
                    whu.I(imageView4, false);
                }
                ImageView imageView5 = jlvVar.h;
                if (imageView5 != null) {
                    imageView5.setOnClickListener(new View.OnClickListener() { // from class: jls
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i;
                            if (i4 != 0) {
                                if (i4 == 1) {
                                    jlv jlvVar2 = jlvVar;
                                    jlvVar2.a.b(jlvVar2.o ? asno.INDIFFERENT : asno.LIKE, jlvVar2.f);
                                    return;
                                } else {
                                    jlv jlvVar3 = jlvVar;
                                    jlvVar3.b.f(jlvVar3.f, agyg.a(false));
                                    return;
                                }
                            }
                            jlv jlvVar4 = jlvVar;
                            kyo kyoVar = jlvVar4.a;
                            String str3 = jlvVar4.f;
                            agng agngVar = jlvVar4.m;
                            agngVar.getClass();
                            kyoVar.d(str3, agngVar.b);
                        }
                    });
                }
                ImageView imageView6 = jlvVar.i;
                if (imageView6 != null) {
                    imageView6.setOnClickListener(new View.OnClickListener() { // from class: jls
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i3;
                            if (i4 != 0) {
                                if (i4 == 1) {
                                    jlv jlvVar2 = jlvVar;
                                    jlvVar2.a.b(jlvVar2.o ? asno.INDIFFERENT : asno.LIKE, jlvVar2.f);
                                    return;
                                } else {
                                    jlv jlvVar3 = jlvVar;
                                    jlvVar3.b.f(jlvVar3.f, agyg.a(false));
                                    return;
                                }
                            }
                            jlv jlvVar4 = jlvVar;
                            kyo kyoVar = jlvVar4.a;
                            String str3 = jlvVar4.f;
                            agng agngVar = jlvVar4.m;
                            agngVar.getClass();
                            kyoVar.d(str3, agngVar.b);
                        }
                    });
                }
                TextView textView2 = jlvVar.j;
                if (textView2 != null) {
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: jls
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i2;
                            if (i4 != 0) {
                                if (i4 == 1) {
                                    jlv jlvVar2 = jlvVar;
                                    jlvVar2.a.b(jlvVar2.o ? asno.INDIFFERENT : asno.LIKE, jlvVar2.f);
                                    return;
                                } else {
                                    jlv jlvVar3 = jlvVar;
                                    jlvVar3.b.f(jlvVar3.f, agyg.a(false));
                                    return;
                                }
                            }
                            jlv jlvVar4 = jlvVar;
                            kyo kyoVar = jlvVar4.a;
                            String str3 = jlvVar4.f;
                            agng agngVar = jlvVar4.m;
                            agngVar.getClass();
                            kyoVar.d(str3, agngVar.b);
                        }
                    });
                }
                agnh d2 = ((agof) jlvVar.c.get()).a().i().d(jlvVar.f);
                if (d2 != null) {
                    jlvVar.c(d2.a);
                    jlvVar.h();
                }
            }
        }
        this.aj = this.af.b(this.ah, new jqh(this));
        this.d.b();
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.offline_playlist_fragment, viewGroup, false);
        this.ao = this.al.a();
        aild aildVar = this.c;
        ml mlVar = this.ap;
        mlVar.getClass();
        aildVar.d = new aila(mlVar, null);
        lwk lwkVar = this.am;
        acra mM = mM();
        String str = this.ah;
        boolean bd = bd();
        axzg axzgVar = (axzg) lwkVar.d.get();
        axzgVar.getClass();
        Activity activity = (Activity) lwkVar.h.get();
        activity.getClass();
        ypa ypaVar = (ypa) lwkVar.a.get();
        ypaVar.getClass();
        aaea aaeaVar = (aaea) lwkVar.c.get();
        aaeaVar.getClass();
        jzp jzpVar = (jzp) lwkVar.f.get();
        nmc nmcVar = (nmc) lwkVar.e.get();
        jvl jvlVar = (jvl) lwkVar.b.get();
        jvlVar.getClass();
        azrw azrwVar = lwkVar.i;
        ajoy ajoyVar = (ajoy) lwkVar.g.get();
        ajoyVar.getClass();
        ajos ajosVar = (ajos) lwkVar.l.get();
        ajosVar.getClass();
        jsg jsgVar = (jsg) lwkVar.j.get();
        azrw azrwVar2 = lwkVar.k;
        mM.getClass();
        str.getClass();
        final jlr jlrVar = new jlr(axzgVar, activity, ypaVar, aaeaVar, jzpVar, nmcVar, jvlVar, azrwVar, ajoyVar, ajosVar, jsgVar, azrwVar2, mM, str, bd, null, null, null, null);
        this.ak = jlrVar;
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) inflate.findViewById(R.id.loading_layout);
        loadingFrameLayout.getClass();
        jlrVar.m = loadingFrameLayout;
        ListView listView = (ListView) inflate.findViewById(R.id.videos);
        listView.getClass();
        jlrVar.n = listView;
        if (jlrVar.k) {
            fzr fzrVar = new fzr("");
            jlrVar.r = ahbw.r(jlrVar.d, fzrVar, null);
            jlrVar.r.oB(new ajok(), fzrVar);
            yny.B(jlrVar.r.a(), -1, -2);
            ListView listView2 = jlrVar.n;
            ajom ajomVar = jlrVar.r;
            ajomVar.getClass();
            listView2.addHeaderView(ajomVar.a());
        }
        if (jlrVar.x.m().booleanValue()) {
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.playlist_header_v2, (ViewGroup) jlrVar.n, false);
            jlrVar.n.addHeaderView(viewGroup2);
            nmc nmcVar2 = jlrVar.w;
            acra acraVar = jlrVar.i;
            asno asnoVar = asno.INDIFFERENT;
            String str2 = jlrVar.j;
            boolean z = jlrVar.k;
            Activity activity2 = (Activity) nmcVar2.i.get();
            activity2.getClass();
            ajjz ajjzVar = (ajjz) nmcVar2.f.get();
            ajjzVar.getClass();
            kyo kyoVar = (kyo) nmcVar2.b.get();
            kyoVar.getClass();
            agyr agyrVar = (agyr) nmcVar2.a.get();
            agyrVar.getClass();
            ogx ogxVar = (ogx) nmcVar2.g.get();
            ajyw ajywVar = (ajyw) nmcVar2.d.get();
            azrw azrwVar3 = nmcVar2.h;
            aaea aaeaVar2 = (aaea) nmcVar2.c.get();
            aaeaVar2.getClass();
            ajyg ajygVar = (ajyg) nmcVar2.e.get();
            ajygVar.getClass();
            asnoVar.getClass();
            viewGroup2.getClass();
            jlrVar.t = new jlz(activity2, ajjzVar, kyoVar, agyrVar, ogxVar, ajywVar, azrwVar3, aaeaVar2, ajygVar, acraVar, asnoVar, viewGroup2, str2, z, null, null, null, null, null, null);
        } else {
            ViewGroup viewGroup3 = (ViewGroup) layoutInflater.inflate(R.layout.playlist_header, (ViewGroup) jlrVar.n, false);
            jlrVar.n.addHeaderView(viewGroup3);
            jzp jzpVar2 = jlrVar.u;
            acra acraVar2 = jlrVar.i;
            asno asnoVar2 = asno.INDIFFERENT;
            String str3 = jlrVar.j;
            boolean z2 = jlrVar.k;
            Activity activity3 = (Activity) jzpVar2.j.get();
            activity3.getClass();
            ajjz ajjzVar2 = (ajjz) jzpVar2.e.get();
            ajjzVar2.getClass();
            kyo kyoVar2 = (kyo) jzpVar2.a.get();
            kyoVar2.getClass();
            agyr agyrVar2 = (agyr) jzpVar2.d.get();
            agyrVar2.getClass();
            jgp jgpVar = (jgp) jzpVar2.g.get();
            ogx ogxVar2 = (ogx) jzpVar2.i.get();
            ajyw ajywVar2 = (ajyw) jzpVar2.f.get();
            azrw azrwVar4 = jzpVar2.b;
            aaea aaeaVar3 = (aaea) jzpVar2.c.get();
            aaeaVar3.getClass();
            asnoVar2.getClass();
            viewGroup3.getClass();
            jlrVar.s = new jlv(activity3, ajjzVar2, kyoVar2, agyrVar2, jgpVar, ogxVar2, ajywVar2, azrwVar4, aaeaVar3, acraVar2, asnoVar2, viewGroup3, str3, z2, null, null, null, null, null, null);
        }
        ajnq ajnqVar = new ajnq();
        ajnqVar.f(agnp.class, jlrVar.e);
        ajnqVar.f(atdn.class, new ajou(jlrVar.f));
        ajoa e = jlrVar.v.e(ajnqVar);
        jlrVar.o = new ajpd();
        jlrVar.o.mK(new ajol() { // from class: jlo
            @Override // defpackage.ajol
            public final void a(ajok ajokVar, ajng ajngVar, int i) {
                ajokVar.f("OfflineVideoPresenter.playlistId", jlr.this.j);
            }
        });
        e.h(jlrVar.o);
        jlrVar.n.setAdapter((ListAdapter) e);
        jlrVar.q = (TextView) layoutInflater.inflate(R.layout.offline_videos_footer, (ViewGroup) jlrVar.n, false);
        jlrVar.q.setVisibility(8);
        jlrVar.n.addFooterView(jlrVar.q);
        return inflate;
    }
}
