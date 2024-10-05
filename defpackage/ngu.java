package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ngu implements ajom {
    private final fyl a;
    private final View b;
    private final ngs c;
    private final ngs d;
    private final ngs e;
    private ngs f;

    /* JADX INFO: Access modifiers changed from: protected */
    public ngu(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_text_banner_wrapper, viewGroup, false);
        this.b = inflate;
        this.c = new ngs(context, ajjzVar, aahdVar, ajutVar, ajuwVar, wyzVar, tdvVar, wzqVar, euvVar, inflate, R.id.promoted_text_banner_layout_one_stub, R.id.title_icon);
        this.d = new ngs(context, ajjzVar, aahdVar, ajutVar, ajuwVar, wyzVar, tdvVar, wzqVar, euvVar, inflate, R.id.promoted_text_banner_layout_two_stub, R.id.byline_icon);
        this.e = new ngs(context, ajjzVar, aahdVar, ajutVar, ajuwVar, wyzVar, tdvVar, wzqVar, euvVar, inflate, R.id.promoted_text_banner_layout_three_stub, R.id.icon);
        fyl h = nck.h(context);
        this.a = h;
        inflate.setBackground(h);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ngs ngsVar = this.f;
        if (ngsVar != null) {
            ngsVar.m.c();
            this.f = null;
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aoxy aoxyVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        ngs ngsVar;
        auhw auhwVar = (auhw) obj;
        auhwVar.getClass();
        this.f = null;
        if ((auhwVar.b & 128) != 0) {
            auhv auhvVar = auhwVar.k;
            if (auhvVar == null) {
                auhvVar = auhv.a;
            }
            int br = anaf.br(auhvVar.b);
            if (br != 0 && br == 2) {
                ngsVar = this.c;
            } else {
                auhv auhvVar2 = auhwVar.k;
                if (auhvVar2 == null) {
                    auhvVar2 = auhv.a;
                }
                int br2 = anaf.br(auhvVar2.b);
                if (br2 != 0 && br2 == 3) {
                    ngsVar = this.d;
                } else {
                    auhv auhvVar3 = auhwVar.k;
                    if (auhvVar3 == null) {
                        auhvVar3 = auhv.a;
                    }
                    int br3 = anaf.br(auhvVar3.b);
                    if (br3 != 0 && br3 == 4) {
                        ngsVar = this.e;
                    }
                }
            }
            this.f = ngsVar;
        }
        ngs ngsVar2 = this.f;
        if (ngsVar2 == null) {
            this.b.setVisibility(8);
            return;
        }
        if (ngsVar2.n == null) {
            ngsVar2.n = ngsVar2.a.inflate();
            ngsVar2.o = ngsVar2.n.findViewById(R.id.content_layout);
            ngsVar2.p = ngsVar2.n.findViewById(R.id.click_overlay);
            ngsVar2.q = (TextView) ngsVar2.o.findViewById(R.id.title);
            ngsVar2.r = (TextView) ngsVar2.o.findViewById(R.id.subtitle);
            ngsVar2.s = (TextView) ngsVar2.o.findViewById(R.id.byline);
            ngsVar2.t = (ImageView) ngsVar2.o.findViewById(R.id.thumbnail);
            ngsVar2.u = (ImageView) ngsVar2.o.findViewById(ngsVar2.l);
            ngsVar2.v = ngsVar2.o.findViewById(R.id.contextual_menu_anchor);
            whu.E(ngsVar2.o, null);
            ngsVar2.v.setBackground(null);
            ngsVar2.m = new ngv(ngsVar2.b, ngsVar2.d, ngsVar2.i, ngsVar2.g, ngsVar2.h, ngsVar2.j, ngsVar2.n, ngsVar2.o, ngsVar2.p, ngsVar2.v, ngsVar2.k);
        }
        ngv ngvVar = ngsVar2.m;
        acra acraVar = ajokVar.a;
        String str = auhwVar.p;
        aony aonyVar = auhwVar.i;
        apxf apxfVar = auhwVar.h;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        apxf apxfVar2 = apxfVar;
        long j = auhwVar.m;
        long j2 = auhwVar.l;
        if ((auhwVar.b & 1024) != 0) {
            aoxy aoxyVar2 = auhwVar.n;
            if (aoxyVar2 == null) {
                aoxyVar2 = aoxy.a;
            }
            aoxyVar = aoxyVar2;
        } else {
            aoxyVar = null;
        }
        ngvVar.w(acraVar, auhwVar, str, aonyVar, apxfVar2, j, j2, aoxyVar, auhwVar.o.I());
        TextView textView = ngsVar2.q;
        if ((auhwVar.b & 1) != 0) {
            aqygVar = auhwVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = ngsVar2.r;
        if ((auhwVar.b & 2) != 0) {
            aqygVar2 = auhwVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        TextView textView3 = ngsVar2.s;
        if ((auhwVar.b & 4) != 0) {
            aqygVar3 = auhwVar.e;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(textView3, ajcq.b(aqygVar3));
        ImageView imageView = ngsVar2.t;
        if (imageView != null && (auhwVar.b & 16) != 0) {
            ajjz ajjzVar = ngsVar2.c;
            avgg avggVar = auhwVar.g;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
            ngsVar2.t.setVisibility(0);
            ngsVar2.u.setVisibility(8);
        } else if ((auhwVar.b & 8) != 0) {
            ImageView imageView2 = ngsVar2.u;
            ajut ajutVar = ngsVar2.e;
            arfs arfsVar = auhwVar.f;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            imageView2.setImageResource(ajutVar.a(b));
            ImageView imageView3 = ngsVar2.t;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            ngsVar2.u.setVisibility(0);
        } else {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ngsVar2.u.setVisibility(8);
        }
        atdf atdfVar = auhwVar.j;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) != 0) {
            ngsVar2.v.setVisibility(0);
            ajuw ajuwVar = ngsVar2.f;
            View rootView = ngsVar2.n.getRootView();
            View view = ngsVar2.v;
            atdf atdfVar2 = auhwVar.j;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdc atdcVar = atdfVar2.c;
            if (atdcVar == null) {
                atdcVar = atdc.a;
            }
            ajuwVar.e(rootView, view, atdcVar, auhwVar, ajokVar.a);
            ngsVar2.v.setClickable(false);
        } else {
            ngsVar2.v.setVisibility(8);
        }
        this.b.setVisibility(0);
    }
}
