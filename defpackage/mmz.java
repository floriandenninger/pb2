package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmz extends mlb {
    public final Context n;
    private final ajop o;
    private final ajoi p;
    private final aahd q;
    private final ViewGroup r;
    private final TextView s;
    private final TextView t;
    private final ViewGroup u;
    private final ajyf v;

    public mmz(Context context, ajjz ajjzVar, ajut ajutVar, ajoy ajoyVar, aahd aahdVar, ajuw ajuwVar, ajyg ajygVar, gma gmaVar, byte[] bArr) {
        super(context, ajjzVar, ajuwVar);
        this.p = ajoyVar.c(gmaVar);
        this.q = aahdVar;
        this.n = context;
        ajutVar.getClass();
        this.o = gmaVar;
        this.r = (ViewGroup) this.d.findViewById(R.id.top_standalone_badges_container);
        this.s = (TextView) this.d.findViewById(R.id.top_metadata);
        this.t = (TextView) this.d.findViewById(R.id.bottom_metadata);
        this.u = (ViewGroup) this.d.findViewById(R.id.bottom_frame);
        this.v = ajygVar.a((TextView) this.d.findViewById(R.id.action_button));
        gmaVar.c(this.d);
    }

    private final CharSequence d(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(System.getProperty("line.separator"));
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            aqyg aqygVar = (aqyg) it.next();
            if (!z) {
                arrayList.add(spannableStringBuilder);
            }
            arrayList.add(aahk.a(aqygVar, this.q, false));
            z = false;
        }
        if (arrayList.size() > 0) {
            return TextUtils.concat((CharSequence[]) arrayList.toArray(new CharSequence[0]));
        }
        return null;
    }

    private final void e(int i) {
        int K = yjk.K(this.n.getResources().getDisplayMetrics(), i) / 2;
        f(this.i, 0, K);
        f(this.s, K, K);
        f(this.j, K, K);
        f(this.r, K, K);
        f(this.m, K, 0);
    }

    private static void f(View view, int i, int i2) {
        yny.z(view, yny.h(yny.v(i), yny.k(i2)), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.o).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.p.c();
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        int i;
        atdc atdcVar;
        apmg apmgVar;
        aqcb aqcbVar = (aqcb) obj;
        ajoi ajoiVar = this.p;
        acra acraVar = ajokVar.a;
        if ((aqcbVar.b & 131072) != 0) {
            apxfVar = aqcbVar.n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        ajokVar.a.u(new acqx(aqcbVar.q), null);
        aqyg aqygVar5 = aqcbVar.m;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(ajcq.b(aqygVar5));
            this.h.setContentDescription(ajcq.i(aqygVar5));
        }
        avgg avggVar = aqcbVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            this.b.h(imageView, avggVar);
        }
        if ((aqcbVar.b & 8) != 0) {
            aqygVar = aqcbVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        TextView textView2 = this.i;
        if (textView2 != null) {
            textView2.setText(b);
        }
        gae.e(this.n, this.r, aqcbVar.e);
        ViewGroup viewGroup = this.r;
        viewGroup.setVisibility(viewGroup.getChildCount() > 0 ? 0 : 8);
        if ((aqcbVar.b & 16) != 0) {
            aqygVar2 = aqcbVar.f;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        TextView textView3 = this.j;
        if (textView3 != null) {
            whu.G(textView3, b2);
        }
        TextView textView4 = this.s;
        if ((aqcbVar.b & 32) != 0) {
            aqygVar3 = aqcbVar.g;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(textView4, ajcq.b(aqygVar3));
        CharSequence d = d(aqcbVar.h);
        TextView textView5 = this.k;
        if (textView5 != null) {
            whu.G(textView5, d);
        }
        if ((aqcbVar.b & 64) != 0) {
            aqygVar4 = aqcbVar.i;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        Spanned b3 = ajcq.b(aqygVar4);
        TextView textView6 = this.l;
        if (textView6 != null) {
            whu.G(textView6, b3);
        }
        whu.G(this.t, d(aqcbVar.j));
        apmh apmhVar = aqcbVar.k;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((aqcbVar.b & 256) == 0 || apmhVar == null || (apmhVar.b & 1) == 0) {
            apkd[] apkdVarArr = (apkd[]) aqcbVar.l.toArray(new apkd[0]);
            ViewGroup viewGroup2 = this.m;
            if (viewGroup2 != null) {
                gae.d(this.a, viewGroup2, apkdVarArr);
                ViewGroup viewGroup3 = this.m;
                whu.I(viewGroup3, viewGroup3.getChildCount() > 0);
            }
            this.v.b(null, null);
            this.l.setMaxLines(4);
        } else {
            this.m.setVisibility(8);
            ajyf ajyfVar = this.v;
            if ((apmhVar.b & 1) != 0) {
                apmgVar = apmhVar.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
            } else {
                apmgVar = null;
            }
            ajyfVar.b(apmgVar, ajokVar.a);
            this.l.setMaxLines(3);
        }
        if (!aqcbVar.r) {
            this.f.setScaleType(ImageView.ScaleType.CENTER_CROP);
            e(2);
            f(this.u, yjk.K(this.n.getResources().getDisplayMetrics(), 2), 0);
            if (this.r.getChildCount() > 0) {
                this.s.setVisibility(8);
            }
            this.l.setVisibility(8);
            this.t.setVisibility(8);
            this.v.b(null, null);
            i = R.fraction.rounded_aspect_ratio_16_9;
        } else {
            this.f.setScaleType(ImageView.ScaleType.FIT_XY);
            e(8);
            i = R.fraction.movie_poster_aspect_ratio;
        }
        this.e.a = this.n.getResources().getFraction(i, 1, 1);
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) this.n.getResources().getDimension(R.dimen.list_item_thumbnail_width);
        }
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = this.e;
        fixedAspectRatioFrameLayout.getViewTreeObserver().addOnPreDrawListener(new mmy(this, fixedAspectRatioFrameLayout, aqcbVar));
        View view = ((gma) this.o).b;
        atdf atdfVar = aqcbVar.o;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        acra acraVar2 = ajokVar.a;
        whu.I(this.g, aqcbVar != null);
        ajuw ajuwVar = this.c;
        View view2 = this.g;
        if (atdfVar == null || (1 & atdfVar.b) == 0) {
            atdcVar = null;
        } else {
            atdcVar = atdfVar.c;
            if (atdcVar == null) {
                atdcVar = atdc.a;
            }
        }
        ajuwVar.e(view, view2, atdcVar, aqcbVar, acraVar2);
        this.o.e(ajokVar);
    }
}
