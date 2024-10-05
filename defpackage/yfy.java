package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yfy extends ajpc {
    final int a;
    final int b;
    final int c;
    private final ajjz d;
    private final aahd e;
    private final Resources f;
    private final LayoutInflater g;
    private final ajtd h;
    private atkc i;
    private final ViewGroup j;
    private yfx k;
    private yfx l;

    public yfy(Context context, ajjz ajjzVar, aahd aahdVar, ajtd ajtdVar) {
        this.d = ajjzVar;
        this.e = aahdVar;
        this.h = ajtdVar;
        Resources resources = context.getResources();
        this.f = resources;
        this.a = resources.getColor(R.color.yt_black4);
        this.b = wbs.Q(context, R.attr.ytTextSecondary);
        this.c = wbs.Q(context, R.attr.ytCallToAction);
        this.g = LayoutInflater.from(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.j = frameLayout;
        frameLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    }

    private final void f(yfx yfxVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        CharSequence charSequence;
        CharSequence[] charSequenceArr;
        apkv apkvVar;
        int length;
        TextView textView = yfxVar.b;
        atkc atkcVar = this.i;
        if ((atkcVar.b & 32) != 0) {
            aqygVar = atkcVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = yfxVar.c;
        atkc atkcVar2 = this.i;
        if ((atkcVar2.b & 64) != 0) {
            aqygVar2 = atkcVar2.f;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        TextView textView3 = yfxVar.d;
        atkc atkcVar3 = this.i;
        if ((atkcVar3.b & 128) != 0) {
            aqygVar3 = atkcVar3.g;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(textView3, aahk.a(aqygVar3, this.e, false));
        TextView textView4 = yfxVar.e;
        CharSequence[] p = ajcq.p((aqyg[]) this.i.h.toArray(new aqyg[0]));
        if (p.length > 0) {
            String property = System.getProperty("line.separator");
            charSequence = null;
            for (CharSequence charSequence2 : p) {
                if (!TextUtils.isEmpty(charSequence2)) {
                    SpannableString spannableString = new SpannableString(charSequence2);
                    spannableString.setSpan(new BulletSpan(20), 0, charSequence2.length(), 0);
                    charSequence = charSequence == null ? spannableString : TextUtils.concat(charSequence, property, spannableString);
                }
            }
        } else {
            charSequence = null;
        }
        whu.G(textView4, charSequence);
        TextView textView5 = yfxVar.f;
        String property2 = System.getProperty("line.separator");
        aqyg[] aqygVarArr = (aqyg[]) this.i.i.toArray(new aqyg[0]);
        aahd aahdVar = this.e;
        if (aqygVarArr == null || (length = aqygVarArr.length) == 0) {
            charSequenceArr = aahk.a;
        } else {
            charSequenceArr = new CharSequence[length];
            for (int i = 0; i < aqygVarArr.length; i++) {
                charSequenceArr[i] = aahk.a(aqygVarArr[i], aahdVar, true);
            }
        }
        whu.G(textView5, ajcq.k(property2, charSequenceArr));
        atkc atkcVar4 = this.i;
        if ((atkcVar4.b & 2) != 0) {
            atkb atkbVar = atkcVar4.c;
            if (atkbVar == null) {
                atkbVar = atkb.a;
            }
            if (atkbVar.b == 118483990) {
                apkvVar = (apkv) atkbVar.c;
            } else {
                apkvVar = apkv.a;
            }
        } else {
            apkvVar = null;
        }
        ajte ajteVar = this.h.a;
        ajteVar.b();
        ajteVar.a = yfxVar.b;
        ajteVar.g(this.a);
        ajteVar.b = yfxVar.d;
        ajteVar.e(this.b);
        ajteVar.d(this.c);
        ajteVar.a().a(apkvVar);
        avgg avggVar = this.i.d;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        if (ahbw.L(avggVar)) {
            avgg avggVar2 = this.i.d;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            float A = ahbw.A(avggVar2);
            if (A > 0.0f) {
                yfxVar.h.a = A;
            }
            ajjz ajjzVar = this.d;
            ImageView imageView = yfxVar.g;
            avgg avggVar3 = this.i.d;
            if (avggVar3 == null) {
                avggVar3 = avgg.a;
            }
            ajjzVar.h(imageView, avggVar3);
            yfxVar.g.setVisibility(0);
        } else {
            this.d.e(yfxVar.g);
            yfxVar.g.setVisibility(8);
        }
        this.j.removeAllViews();
        this.j.addView(yfxVar.a);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.j;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        this.i = (atkc) obj;
        if (this.f.getConfiguration().orientation == 1) {
            if (this.k == null) {
                this.k = new yfx(this.g.inflate(R.layout.music_key_promo_feature_item, this.j, false));
            }
            f(this.k);
        } else {
            if (this.l == null) {
                this.l = new yfx(this.g.inflate(R.layout.music_key_promo_feature_item, this.j, false));
            }
            f(this.l);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atkc) obj).j.I();
    }
}
