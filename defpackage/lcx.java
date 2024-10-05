package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lcx extends vw implements akdl, lal {
    public final ajjz d;
    public final Resources e;
    public final Context f;
    public final aaea g;
    public Typeface i;
    public final aadw j;
    public lbu k;
    private final LayoutInflater n;
    private boolean o;
    private Typeface p;
    private final aahd q;
    private acsx r;
    public int h = 0;
    private final ArrayList l = new ArrayList();
    private final SparseIntArray m = new SparseIntArray();

    public lcx(Context context, aadw aadwVar, aaea aaeaVar, aahd aahdVar, ajjz ajjzVar) {
        this.n = LayoutInflater.from(context);
        this.e = context.getResources();
        this.f = context;
        this.j = aadwVar;
        this.g = aaeaVar;
        this.q = aahdVar;
        this.d = ajjzVar;
    }

    private final void x(String str) {
        acsx acsxVar = this.r;
        if (acsxVar == null || !this.o) {
            return;
        }
        acsxVar.c(str);
    }

    @Override // defpackage.lal
    public final int a(int i) {
        if (i < 0 || i >= this.m.size()) {
            return -1;
        }
        return this.m.get(i);
    }

    @Override // defpackage.vw
    public final int b() {
        return this.l.size();
    }

    @Override // defpackage.vw
    public final int c(int i) {
        Object item = getItem(i);
        if (item instanceof akef) {
            return 0;
        }
        if (item instanceof lhg) {
            return 2;
        }
        return item instanceof lhh ? 1 : 0;
    }

    @Override // defpackage.lal
    public final List e() {
        ArrayList arrayList = new ArrayList(b());
        for (int i = 0; i < b(); i++) {
            Object item = getItem(i);
            if (item instanceof akef) {
                arrayList.add((akef) item);
            }
        }
        return arrayList;
    }

    @Override // defpackage.lal
    public final void g(Collection collection) {
        String str;
        this.m.clear();
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            akef akefVar = (akef) it.next();
            int i3 = akefVar.f;
            if (i3 != i) {
                if (i3 != 0 && i != 0) {
                    this.m.put(this.l.size(), i2);
                    this.l.add(new lhh(this.e.getDimension(R.dimen.suggestion_category_divider_height)));
                }
                if (i3 != 0 && (str = akefVar.g) != null && !str.isEmpty()) {
                    this.m.put(this.l.size(), i2);
                    this.l.add(new lhg(akefVar.g));
                }
                i = i3;
            }
            this.m.put(this.l.size(), i2);
            this.l.add(akefVar);
            i2++;
        }
        mw();
    }

    @Override // defpackage.lal
    public final int getCount() {
        return b();
    }

    @Override // defpackage.lal
    public final Object getItem(int i) {
        return this.l.get(i);
    }

    @Override // defpackage.lal
    public final void h() {
        this.l.clear();
        this.m.clear();
        mw();
    }

    @Override // defpackage.lal
    public final void i(Object obj) {
        this.l.remove(obj);
        this.m.clear();
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (arrayList.get(i3) instanceof akef) {
                this.m.put(i, i2);
                i++;
                i2++;
            } else {
                this.m.put(i, i2);
                i++;
            }
        }
        mw();
    }

    @Override // defpackage.akdl
    public final void j(acsx acsxVar) {
        this.r = acsxVar;
    }

    @Override // defpackage.lal
    public final void k(boolean z) {
        this.o = z;
    }

    @Override // defpackage.vw
    public final long mu(int i) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [ammv] */
    @Override // defpackage.vw
    public final void o(wv wvVar, int i) {
        x("ss_rds");
        int i2 = wvVar.f;
        if (i2 == 1) {
            ((lct) wvVar).t.getLayoutParams().height = Math.round(((lhh) this.l.get(i)).a);
        } else if (i2 == 2) {
            ((lcs) wvVar).t.setText(((lhg) this.l.get(i)).a);
        } else {
            lcw lcwVar = (lcw) wvVar;
            akef akefVar = (akef) this.l.get(i);
            lcwVar.y = akefVar;
            Spanned spanned = akefVar.h;
            if (spanned != null) {
                SpannableString spannableString = new SpannableString(akefVar.a);
                for (StyleSpan styleSpan : (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class)) {
                    if (styleSpan.getStyle() == 1) {
                        lcx lcxVar = lcwVar.z;
                        if (lcxVar.i == null) {
                            lcxVar.i = Typeface.create("sans-serif-medium", 0);
                        }
                        lcx lcxVar2 = lcwVar.z;
                        if (lcxVar2.i == null) {
                            lcxVar2.i = Typeface.create("sans-serif-medium", 0);
                        }
                        spannableString.setSpan(new ajcl(lcxVar2.i), spanned.getSpanStart(styleSpan), spanned.getSpanEnd(styleSpan), 33);
                        lcx lcxVar3 = lcwVar.z;
                        int i3 = lcxVar3.h;
                        if (i3 == 0) {
                            i3 = wbs.W(lcxVar3.f, R.attr.ytTextPrimary).orElse(0);
                            lcxVar3.h = i3;
                        }
                        spannableString.setSpan(new ForegroundColorSpan(i3), spanned.getSpanStart(styleSpan), spanned.getSpanEnd(styleSpan), 33);
                    }
                }
                lcwVar.u.setText(spannableString);
            } else {
                lcwVar.u.setText(akefVar.a);
            }
            lcwVar.v.setContentDescription(lcwVar.z.e.getString(R.string.accessibility_search_edit_suggestion, akefVar.a));
            if (akefVar.c()) {
                aswb aswbVar = lcwVar.z.g.a().e;
                if (aswbVar == null) {
                    aswbVar = aswb.a;
                }
                if (aswbVar.aq.equals("trending")) {
                    lcwVar.t.setImageResource(R.drawable.yt_outline_fire_black_24);
                    lcwVar.t.setTag(Integer.valueOf(R.drawable.yt_outline_fire_black_24));
                } else {
                    lcwVar.t.setImageResource(R.drawable.yt_outline_search_black_24);
                    lcwVar.t.setTag(Integer.valueOf(R.drawable.yt_outline_search_black_24));
                }
                lcwVar.t.setVisibility(0);
            } else if (akefVar.b()) {
                lcwVar.t.setImageResource(R.drawable.yt_outline_arrow_time_black_24);
                lcwVar.t.setVisibility(0);
            } else if (akefVar.a()) {
                lcwVar.t.setVisibility(4);
                lcwVar.t.setImageResource(0);
            } else {
                lcwVar.t.setImageResource(R.drawable.yt_outline_search_black_24);
                lcwVar.t.setTag(Integer.valueOf(R.drawable.yt_outline_search_black_24));
                lcwVar.t.setVisibility(0);
            }
            int i4 = akefVar.j;
            if (i4 == 1) {
                lcwVar.w.setVisibility(8);
                lcwVar.v.setVisibility(0);
                lcwVar.x.setMinimumHeight(yjk.K(lcwVar.z.e.getDisplayMetrics(), 48));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) lcwVar.t.getLayoutParams();
                layoutParams.width = yjk.K(lcwVar.z.e.getDisplayMetrics(), 48);
                layoutParams.height = -1;
                layoutParams.setMarginStart(yjk.K(lcwVar.z.e.getDisplayMetrics(), 0));
                lcwVar.t.setLayoutParams(layoutParams);
                jj.h(lcwVar.t, wbs.S(lcwVar.z.f, R.attr.ytTextPrimary));
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) lcwVar.w.getLayoutParams();
                layoutParams2.width = yjk.K(lcwVar.z.e.getDisplayMetrics(), 56);
                layoutParams2.height = yjk.K(lcwVar.z.e.getDisplayMetrics(), 32);
                layoutParams2.setMarginEnd(yjk.K(lcwVar.z.e.getDisplayMetrics(), 0));
                lcwVar.w.setLayoutParams(layoutParams2);
            } else if (i4 == 2) {
                int w = evr.w(lcwVar.z.g);
                if (w == 2) {
                    lcwVar.t.setVisibility(0);
                    lcwVar.x.setMinimumHeight(yjk.K(lcwVar.z.e.getDisplayMetrics(), 48));
                    lcwVar.v.setVisibility(0);
                    lcwVar.w.setVisibility(8);
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) lcwVar.t.getLayoutParams();
                    layoutParams3.width = yjk.K(lcwVar.z.e.getDisplayMetrics(), 56);
                    layoutParams3.height = yjk.K(lcwVar.z.e.getDisplayMetrics(), 32);
                    layoutParams3.setMarginStart(yjk.K(lcwVar.z.e.getDisplayMetrics(), 12));
                    lcwVar.t.setLayoutParams(layoutParams3);
                    jj.h(lcwVar.t, null);
                } else if (w == 3) {
                    lcwVar.t.setVisibility(0);
                    lcwVar.x.setMinimumHeight(yjk.K(lcwVar.z.e.getDisplayMetrics(), 48));
                    lcwVar.v.setVisibility(8);
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) lcwVar.w.getLayoutParams();
                    layoutParams4.width = yjk.K(lcwVar.z.e.getDisplayMetrics(), 56);
                    layoutParams4.height = yjk.K(lcwVar.z.e.getDisplayMetrics(), 32);
                    layoutParams4.setMarginEnd(yjk.K(lcwVar.z.e.getDisplayMetrics(), 12));
                    lcwVar.w.setLayoutParams(layoutParams4);
                    jj.h(lcwVar.t, wbs.S(lcwVar.z.f, R.attr.ytTextPrimary));
                } else if (w == 4) {
                    lcwVar.t.setVisibility(0);
                    lcwVar.x.setMinimumHeight(yjk.K(lcwVar.z.e.getDisplayMetrics(), 52));
                    lcwVar.v.setVisibility(0);
                    LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) lcwVar.w.getLayoutParams();
                    layoutParams5.width = yjk.K(lcwVar.z.e.getDisplayMetrics(), 64);
                    layoutParams5.height = yjk.K(lcwVar.z.e.getDisplayMetrics(), 36);
                    lcwVar.w.setLayoutParams(layoutParams5);
                    jj.h(lcwVar.t, wbs.S(lcwVar.z.f, R.attr.ytTextPrimary));
                } else {
                    lcwVar.t.setVisibility(0);
                    lcwVar.x.setMinimumHeight(yjk.K(lcwVar.z.e.getDisplayMetrics(), 48));
                    lcwVar.v.setVisibility(0);
                    LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) lcwVar.w.getLayoutParams();
                    layoutParams6.width = yjk.K(lcwVar.z.e.getDisplayMetrics(), 56);
                    layoutParams6.height = yjk.K(lcwVar.z.e.getDisplayMetrics(), 32);
                    lcwVar.w.setLayoutParams(layoutParams6);
                    jj.h(lcwVar.t, wbs.S(lcwVar.z.f, R.attr.ytTextPrimary));
                }
                if (!akefVar.i.isEmpty()) {
                    int K = yjk.K(lcwVar.z.e.getDisplayMetrics(), 44);
                    amlr amlrVar = amlr.a;
                    Iterator it = akefVar.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        akee akeeVar = (akee) it.next();
                        ?? r12 = akeeVar.a;
                        if (K < akeeVar.b) {
                            amlrVar = r12;
                            break;
                        }
                        amlrVar = r12;
                    }
                    if (amlrVar.h()) {
                        if (w == 2) {
                            lcwVar.t.setVisibility(0);
                            lcwVar.t.setImageDrawable(null);
                            lcwVar.z.d.g(lcwVar.t, Uri.parse((String) amlrVar.c()));
                        } else {
                            lcwVar.w.setVisibility(0);
                            lcwVar.w.setImageDrawable(null);
                            lcwVar.z.d.g(lcwVar.w, Uri.parse((String) amlrVar.c()));
                        }
                    } else if (w == 2) {
                        lcwVar.t.setImageDrawable(null);
                        lcwVar.t.setVisibility(4);
                    } else {
                        lcwVar.w.setImageDrawable(null);
                        lcwVar.w.setVisibility(4);
                    }
                } else if (w == 2) {
                    lcwVar.t.setImageDrawable(null);
                    lcwVar.t.setVisibility(4);
                } else {
                    lcwVar.w.setImageDrawable(null);
                    lcwVar.w.setVisibility(4);
                }
            }
            lcx lcxVar4 = lcwVar.z;
            lcwVar.u.setPaddingRelative(yjk.K(lcxVar4.e.getDisplayMetrics(), true != evr.aV(lcxVar4.j) ? 20 : 12), 0, yjk.K(lcxVar4.e.getDisplayMetrics(), 0), 0);
            lcx lcxVar5 = lcwVar.z;
            TextView textView = lcwVar.u;
            int O = yjk.O(lcxVar5.f);
            if (O == 3 || O == 4) {
                textView.setTypeface(lcxVar5.w(textView));
                textView.setTextColor(wbs.W(lcxVar5.f, R.attr.ytTextPrimary).orElse(0));
                textView.setTextSize(2, 20.0f);
            } else {
                textView.setTypeface(lcxVar5.w(textView));
                textView.setTextColor(wbs.W(lcxVar5.f, R.attr.ytTextPrimary).orElse(0));
                textView.setTextSize(2, 16.0f);
            }
        }
        x("ss_rdf");
        this.r = null;
    }

    @Override // defpackage.akdl
    public final acsx ob() {
        return this.r;
    }

    public final Typeface w(TextView textView) {
        if (this.p == null) {
            this.p = textView.getTypeface();
        }
        return this.p;
    }

    @Override // defpackage.vw
    public final wv f(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new lct(this.n.inflate(R.layout.search_suggestion_divider, viewGroup, false));
        }
        if (i == 2) {
            return new lcs(this.n.inflate(R.layout.search_suggestion_category, viewGroup, false), this.q, this.g);
        }
        View inflate = this.n.inflate(R.layout.search_suggestion_entry, viewGroup, false);
        inflate.setPaddingRelative(0, 0, 0, 0);
        return new lcw(this, inflate);
    }
}
