package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nak implements ajom {
    private final fyl a;
    private final View b;
    private final nai c;
    private final nai d;
    private nai e;

    /* JADX INFO: Access modifiers changed from: protected */
    public nak(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_app_install_wrapper, viewGroup, false);
        this.b = inflate;
        this.c = new nai(context, ajjzVar, aahdVar, ajuwVar, wyzVar, tdvVar, wzqVar, euvVar, inflate, R.id.promoted_app_install_new_line_layout_stub);
        this.d = new nai(context, ajjzVar, aahdVar, ajuwVar, wyzVar, tdvVar, wzqVar, euvVar, inflate, R.id.promoted_app_install_right_align_layout_stub);
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
        nai naiVar = this.e;
        if (naiVar != null) {
            naiVar.o.c();
            this.e = null;
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aoxy aoxyVar;
        int i;
        aqyg aqygVar;
        int i2;
        int i3;
        nai naiVar;
        augd augdVar = (augd) obj;
        augdVar.getClass();
        this.e = null;
        if ((augdVar.b & 2048) != 0) {
            augc augcVar = augdVar.o;
            if (augcVar == null) {
                augcVar = augc.a;
            }
            int bt = anaf.bt(augcVar.b);
            if (bt == 0 || bt != 3) {
                augc augcVar2 = augdVar.o;
                if (augcVar2 == null) {
                    augcVar2 = augc.a;
                }
                int bt2 = anaf.bt(augcVar2.b);
                if (bt2 != 0 && bt2 == 2) {
                    naiVar = this.d;
                }
            } else {
                naiVar = this.c;
            }
            this.e = naiVar;
        }
        nai naiVar2 = this.e;
        if (naiVar2 != null) {
            if (naiVar2.p == null) {
                naiVar2.p = naiVar2.d.inflate();
                naiVar2.q = naiVar2.p.findViewById(R.id.content_layout);
                naiVar2.r = naiVar2.p.findViewById(R.id.click_overlay);
                naiVar2.z = (ImageView) naiVar2.q.findViewById(R.id.thumbnail);
                naiVar2.A = naiVar2.q.findViewById(R.id.contextual_menu_anchor);
                naiVar2.s = (TextView) naiVar2.q.findViewById(R.id.ad_attribution);
                naiVar2.t = (TextView) naiVar2.q.findViewById(R.id.title);
                naiVar2.u = (TextView) naiVar2.q.findViewById(R.id.rating_text);
                naiVar2.v = (RatingBar) naiVar2.q.findViewById(R.id.rating);
                naiVar2.w = (TextView) naiVar2.q.findViewById(R.id.byline);
                naiVar2.x = (TextView) naiVar2.q.findViewById(R.id.description);
                naiVar2.y = (TextView) naiVar2.q.findViewById(R.id.action);
                whu.E(naiVar2.q, null);
                naiVar2.A.setBackground(null);
                naiVar2.o = new ngv(naiVar2.e, naiVar2.g, naiVar2.k, naiVar2.i, naiVar2.j, naiVar2.l, naiVar2.p, naiVar2.q, naiVar2.r, naiVar2.A, naiVar2.m);
            }
            ngv ngvVar = naiVar2.o;
            acra acraVar = ajokVar.a;
            String str = augdVar.r;
            aony aonyVar = augdVar.i;
            apxf apxfVar = augdVar.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            apxf apxfVar2 = apxfVar;
            long j = augdVar.n;
            long j2 = augdVar.m;
            if ((augdVar.b & 4096) != 0) {
                aoxy aoxyVar2 = augdVar.p;
                if (aoxyVar2 == null) {
                    aoxyVar2 = aoxy.a;
                }
                aoxyVar = aoxyVar2;
            } else {
                aoxyVar = null;
            }
            ngvVar.w(acraVar, augdVar, str, aonyVar, apxfVar2, j, j2, aoxyVar, augdVar.q.I());
            if ((augdVar.b & 1) == 0) {
                naiVar2.z.setVisibility(8);
            } else {
                ajjz ajjzVar = naiVar2.f;
                ImageView imageView = naiVar2.z;
                avgg avggVar = augdVar.c;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                ajjzVar.h(imageView, avggVar);
                naiVar2.z.setVisibility(0);
            }
            if ((augdVar.b & 2048) != 0) {
                augc augcVar3 = augdVar.o;
                if (augcVar3 == null) {
                    augcVar3 = augc.a;
                }
                if (augcVar3.c > 0) {
                    augc augcVar4 = augdVar.o;
                    if (augcVar4 == null) {
                        augcVar4 = augc.a;
                    }
                    i3 = (int) augcVar4.c;
                } else {
                    i3 = 40;
                }
                int applyDimension = (int) TypedValue.applyDimension(1, i3, naiVar2.n.getDisplayMetrics());
                naiVar2.z.getLayoutParams().height = applyDimension;
                naiVar2.z.getLayoutParams().width = applyDimension;
            }
            augb augbVar = augdVar.l;
            if (augbVar == null) {
                augbVar = augb.a;
            }
            if ((augbVar.b & 1) == 0) {
                naiVar2.s.setVisibility(8);
            } else {
                naiVar2.s.setVisibility(0);
            }
            if ((augdVar.b & 2) == 0) {
                naiVar2.t.setVisibility(8);
            } else {
                TextView textView = naiVar2.t;
                aqyg aqygVar2 = augdVar.d;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                textView.setText(ajcq.b(aqygVar2));
                naiVar2.t.setVisibility(0);
            }
            float f = augdVar.e;
            if (Float.compare(f, 0.0f) > 0) {
                if (Float.compare(f, 5.0f) > 0) {
                    f = 5.0f;
                }
                TextView textView2 = naiVar2.u;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    naiVar2.u.setText(String.format("%1.1f", Float.valueOf(f)));
                }
                naiVar2.v.setVisibility(0);
                naiVar2.v.setRating(f);
                i = 8;
            } else {
                TextView textView3 = naiVar2.u;
                i = 8;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                naiVar2.v.setVisibility(8);
            }
            if ((augdVar.b & i) == 0) {
                naiVar2.w.setVisibility(8);
            } else {
                TextView textView4 = naiVar2.w;
                aqyg aqygVar3 = augdVar.f;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                textView4.setText(ajcq.b(aqygVar3));
                naiVar2.w.setVisibility(0);
            }
            if ((augdVar.b & 16) == 0) {
                naiVar2.x.setVisibility(8);
            } else {
                TextView textView5 = naiVar2.x;
                aqyg aqygVar4 = augdVar.g;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
                textView5.setText(ajcq.b(aqygVar4));
                naiVar2.x.setVisibility(0);
            }
            apmh apmhVar = augdVar.j;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            if ((apmhVar.b & 1) == 0) {
                naiVar2.y.setVisibility(8);
            } else {
                TextView textView6 = naiVar2.y;
                apmh apmhVar2 = augdVar.j;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmg apmgVar = apmhVar2.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
                if ((apmgVar.b & 256) != 0) {
                    apmh apmhVar3 = augdVar.j;
                    if (apmhVar3 == null) {
                        apmhVar3 = apmh.a;
                    }
                    apmg apmgVar2 = apmhVar3.c;
                    if (apmgVar2 == null) {
                        apmgVar2 = apmg.a;
                    }
                    aqygVar = apmgVar2.i;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                textView6.setText(ajcq.b(aqygVar));
                TextView textView7 = naiVar2.y;
                apmh apmhVar4 = augdVar.j;
                if (apmhVar4 == null) {
                    apmhVar4 = apmh.a;
                }
                apmg apmgVar3 = apmhVar4.c;
                if (apmgVar3 == null) {
                    apmgVar3 = apmg.a;
                }
                if (apmgVar3.c != 1 || (i2 = anaf.aJ(((Integer) apmgVar3.d).intValue())) == 0) {
                    i2 = 1;
                }
                if (i2 - 1 == 13) {
                    textView7.setTextColor(naiVar2.a);
                    textView7.setBackground(null);
                } else {
                    textView7.setTextColor(naiVar2.b);
                    if (naiVar2.B == null) {
                        naiVar2.B = new ColorDrawable(naiVar2.c);
                    }
                    textView7.setBackground(naiVar2.B);
                }
                naiVar2.y.setVisibility(0);
            }
            atdf atdfVar = augdVar.k;
            if (atdfVar == null) {
                atdfVar = atdf.a;
            }
            if ((atdfVar.b & 1) == 0) {
                naiVar2.A.setVisibility(8);
            } else {
                ajuw ajuwVar = naiVar2.h;
                View rootView = naiVar2.p.getRootView();
                View view = naiVar2.A;
                atdf atdfVar2 = augdVar.k;
                if (atdfVar2 == null) {
                    atdfVar2 = atdf.a;
                }
                atdc atdcVar = atdfVar2.c;
                if (atdcVar == null) {
                    atdcVar = atdc.a;
                }
                ajuwVar.e(rootView, view, atdcVar, augdVar, ajokVar.a);
                naiVar2.A.setClickable(false);
                naiVar2.A.setVisibility(0);
            }
            this.b.setVisibility(0);
            return;
        }
        this.b.setVisibility(8);
    }
}
