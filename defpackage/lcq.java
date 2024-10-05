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
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lcq extends BaseAdapter implements akdl, lal {
    public final ajjz a;
    public final Resources b;
    public final Context c;
    public final aaea d;
    public Typeface f;
    public final aadw g;
    public lbu h;
    private final LayoutInflater k;
    private boolean l;
    private Typeface m;
    private final aahd n;
    private acsx o;
    public int e = 0;
    private final ArrayList i = new ArrayList();
    private final SparseIntArray j = new SparseIntArray();

    public lcq(Context context, aadw aadwVar, aaea aaeaVar, aahd aahdVar, ajjz ajjzVar) {
        this.k = LayoutInflater.from(context);
        this.b = context.getResources();
        this.c = context;
        this.g = aadwVar;
        this.d = aaeaVar;
        this.n = aahdVar;
        this.a = ajjzVar;
    }

    private final void d(String str) {
        acsx acsxVar = this.o;
        if (acsxVar == null || !this.l) {
            return;
        }
        acsxVar.c(str);
    }

    @Override // defpackage.lal
    public final int a(int i) {
        if (i < 0 || i >= this.j.size()) {
            return -1;
        }
        return this.j.get(i);
    }

    public final Typeface b(TextView textView) {
        if (this.m == null) {
            this.m = textView.getTypeface();
        }
        return this.m;
    }

    @Override // defpackage.lal
    public final List e() {
        ArrayList arrayList = new ArrayList(getCount());
        for (int i = 0; i < getCount(); i++) {
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
        this.j.clear();
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            akef akefVar = (akef) it.next();
            int i3 = akefVar.f;
            if (i3 != i) {
                if (i3 != 0 && i != 0) {
                    this.j.put(this.i.size(), i2);
                    this.i.add(new lhh(this.b.getDimension(R.dimen.suggestion_category_divider_height)));
                }
                if (i3 != 0 && (str = akefVar.g) != null && !str.isEmpty()) {
                    this.j.put(this.i.size(), i2);
                    this.i.add(new lhg(akefVar.g));
                }
                i = i3;
            }
            this.j.put(this.i.size(), i2);
            this.i.add(akefVar);
            i2++;
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter, defpackage.lal
    public final int getCount() {
        return this.i.size();
    }

    @Override // android.widget.Adapter, defpackage.lal
    public final Object getItem(int i) {
        return this.i.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object item = getItem(i);
        if (item instanceof akef) {
            return 0;
        }
        if (item instanceof lhg) {
            return 2;
        }
        return item instanceof lhh ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [ammv] */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        d("ss_rds");
        Object item = getItem(i);
        if (item instanceof akef) {
            akef akefVar = (akef) item;
            if (view == null) {
                view2 = this.k.inflate(R.layout.search_suggestion_entry, viewGroup, false);
                view2.setPaddingRelative(0, 0, 0, 0);
            } else {
                view2 = view;
            }
            lcp lcpVar = (lcp) view2.getTag(R.id.search_suggestions_tag);
            if (lcpVar == null) {
                lcpVar = new lcp(this, view2);
                lcpVar.c.setOnClickListener(new lcm(this, lcpVar));
                view2.setTag(R.id.search_suggestions_tag, lcpVar);
            }
            lcpVar.f = akefVar;
            Spanned spanned = akefVar.h;
            int i2 = 1;
            if (spanned != null) {
                SpannableString spannableString = new SpannableString(akefVar.a);
                StyleSpan[] styleSpanArr = (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class);
                int length = styleSpanArr.length;
                int i3 = 0;
                while (i3 < length) {
                    StyleSpan styleSpan = styleSpanArr[i3];
                    if (styleSpan.getStyle() == i2) {
                        lcq lcqVar = lcpVar.g;
                        if (lcqVar.f == null) {
                            lcqVar.f = Typeface.create("sans-serif-medium", 0);
                        }
                        lcq lcqVar2 = lcpVar.g;
                        if (lcqVar2.f == null) {
                            lcqVar2.f = Typeface.create("sans-serif-medium", 0);
                        }
                        spannableString.setSpan(new ajcl(lcqVar2.f), spanned.getSpanStart(styleSpan), spanned.getSpanEnd(styleSpan), 33);
                        lcq lcqVar3 = lcpVar.g;
                        int i4 = lcqVar3.e;
                        if (i4 == 0) {
                            i4 = wbs.W(lcqVar3.c, R.attr.ytTextPrimary).orElse(0);
                            lcqVar3.e = i4;
                        }
                        spannableString.setSpan(new ForegroundColorSpan(i4), spanned.getSpanStart(styleSpan), spanned.getSpanEnd(styleSpan), 33);
                    }
                    i3++;
                    i2 = 1;
                }
                lcpVar.b.setText(spannableString);
            } else {
                lcpVar.b.setText(akefVar.a);
            }
            lcpVar.c.setContentDescription(lcpVar.g.b.getString(R.string.accessibility_search_edit_suggestion, akefVar.a));
            if (akefVar.c()) {
                aswb aswbVar = lcpVar.g.d.a().e;
                if (aswbVar == null) {
                    aswbVar = aswb.a;
                }
                if (aswbVar.aq.equals("trending")) {
                    lcpVar.a.setImageResource(R.drawable.yt_outline_fire_black_24);
                    lcpVar.a.setTag(Integer.valueOf(R.drawable.yt_outline_fire_black_24));
                } else {
                    lcpVar.a.setImageResource(R.drawable.yt_outline_search_black_24);
                    lcpVar.a.setTag(Integer.valueOf(R.drawable.yt_outline_search_black_24));
                }
                lcpVar.a.setVisibility(0);
            } else if (akefVar.b()) {
                lcpVar.a.setImageResource(R.drawable.yt_outline_arrow_time_black_24);
                lcpVar.a.setVisibility(0);
            } else if (akefVar.a()) {
                lcpVar.a.setVisibility(4);
                lcpVar.a.setImageResource(0);
            } else {
                lcpVar.a.setImageResource(R.drawable.yt_outline_search_black_24);
                lcpVar.a.setTag(Integer.valueOf(R.drawable.yt_outline_search_black_24));
                lcpVar.a.setVisibility(0);
            }
            int i5 = akefVar.j;
            if (i5 == 1) {
                lcpVar.d.setVisibility(8);
                lcpVar.c.setVisibility(0);
                lcpVar.e.setMinimumHeight(yjk.K(lcpVar.g.b.getDisplayMetrics(), 48));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) lcpVar.a.getLayoutParams();
                layoutParams.width = yjk.K(lcpVar.g.b.getDisplayMetrics(), 48);
                layoutParams.height = -1;
                layoutParams.setMarginStart(yjk.K(lcpVar.g.b.getDisplayMetrics(), 4));
                lcpVar.a.setLayoutParams(layoutParams);
                jj.h(lcpVar.a, wbs.S(lcpVar.g.c, R.attr.ytTextPrimary));
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) lcpVar.d.getLayoutParams();
                layoutParams2.width = yjk.K(lcpVar.g.b.getDisplayMetrics(), 56);
                layoutParams2.height = yjk.K(lcpVar.g.b.getDisplayMetrics(), 32);
                layoutParams2.setMarginEnd(yjk.K(lcpVar.g.b.getDisplayMetrics(), 0));
                lcpVar.d.setLayoutParams(layoutParams2);
            } else if (i5 == 2) {
                int w = evr.w(lcpVar.g.d);
                if (w == 2) {
                    lcpVar.a.setVisibility(0);
                    lcpVar.e.setMinimumHeight(yjk.K(lcpVar.g.b.getDisplayMetrics(), 48));
                    lcpVar.c.setVisibility(0);
                    lcpVar.d.setVisibility(8);
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) lcpVar.a.getLayoutParams();
                    layoutParams3.width = yjk.K(lcpVar.g.b.getDisplayMetrics(), 56);
                    layoutParams3.height = yjk.K(lcpVar.g.b.getDisplayMetrics(), 32);
                    layoutParams3.setMarginStart(yjk.K(lcpVar.g.b.getDisplayMetrics(), 12));
                    lcpVar.a.setLayoutParams(layoutParams3);
                    jj.h(lcpVar.a, null);
                } else if (w == 3) {
                    lcpVar.a.setVisibility(0);
                    lcpVar.e.setMinimumHeight(yjk.K(lcpVar.g.b.getDisplayMetrics(), 48));
                    lcpVar.c.setVisibility(8);
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) lcpVar.d.getLayoutParams();
                    layoutParams4.width = yjk.K(lcpVar.g.b.getDisplayMetrics(), 56);
                    layoutParams4.height = yjk.K(lcpVar.g.b.getDisplayMetrics(), 32);
                    layoutParams4.setMarginEnd(yjk.K(lcpVar.g.b.getDisplayMetrics(), 12));
                    lcpVar.d.setLayoutParams(layoutParams4);
                    jj.h(lcpVar.a, wbs.S(lcpVar.g.c, R.attr.ytTextPrimary));
                } else if (w == 4) {
                    lcpVar.a.setVisibility(0);
                    lcpVar.e.setMinimumHeight(yjk.K(lcpVar.g.b.getDisplayMetrics(), 52));
                    lcpVar.c.setVisibility(0);
                    LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) lcpVar.d.getLayoutParams();
                    layoutParams5.width = yjk.K(lcpVar.g.b.getDisplayMetrics(), 64);
                    layoutParams5.height = yjk.K(lcpVar.g.b.getDisplayMetrics(), 36);
                    lcpVar.d.setLayoutParams(layoutParams5);
                    jj.h(lcpVar.a, wbs.S(lcpVar.g.c, R.attr.ytTextPrimary));
                } else {
                    lcpVar.a.setVisibility(0);
                    lcpVar.e.setMinimumHeight(yjk.K(lcpVar.g.b.getDisplayMetrics(), 48));
                    lcpVar.c.setVisibility(0);
                    LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) lcpVar.d.getLayoutParams();
                    layoutParams6.width = yjk.K(lcpVar.g.b.getDisplayMetrics(), 56);
                    layoutParams6.height = yjk.K(lcpVar.g.b.getDisplayMetrics(), 32);
                    lcpVar.d.setLayoutParams(layoutParams6);
                    jj.h(lcpVar.a, wbs.S(lcpVar.g.c, R.attr.ytTextPrimary));
                }
                if (!akefVar.i.isEmpty()) {
                    int K = yjk.K(lcpVar.g.b.getDisplayMetrics(), 44);
                    amlr amlrVar = amlr.a;
                    Iterator it = akefVar.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        akee akeeVar = (akee) it.next();
                        ?? r11 = akeeVar.a;
                        if (K < akeeVar.b) {
                            amlrVar = r11;
                            break;
                        }
                        amlrVar = r11;
                    }
                    if (amlrVar.h()) {
                        if (w == 2) {
                            lcpVar.a.setVisibility(0);
                            lcpVar.a.setImageDrawable(null);
                            lcpVar.g.a.g(lcpVar.a, Uri.parse((String) amlrVar.c()));
                        } else {
                            lcpVar.d.setVisibility(0);
                            lcpVar.d.setImageDrawable(null);
                            lcpVar.g.a.g(lcpVar.d, Uri.parse((String) amlrVar.c()));
                        }
                    } else if (w == 2) {
                        lcpVar.a.setImageDrawable(null);
                        lcpVar.a.setVisibility(4);
                    } else {
                        lcpVar.d.setImageDrawable(null);
                        lcpVar.d.setVisibility(4);
                    }
                } else if (w == 2) {
                    lcpVar.a.setImageDrawable(null);
                    lcpVar.a.setVisibility(4);
                } else {
                    lcpVar.d.setImageDrawable(null);
                    lcpVar.d.setVisibility(4);
                }
            }
            lcq lcqVar4 = lcpVar.g;
            lcpVar.b.setPaddingRelative(yjk.K(lcqVar4.b.getDisplayMetrics(), true != evr.aV(lcqVar4.g) ? 20 : 12), 0, yjk.K(lcqVar4.b.getDisplayMetrics(), 0), 0);
            lcq lcqVar5 = lcpVar.g;
            TextView textView = lcpVar.b;
            int O = yjk.O(lcqVar5.c);
            if (O == 3 || O == 4) {
                textView.setTypeface(lcqVar5.b(textView));
                textView.setTextColor(wbs.W(lcqVar5.c, R.attr.ytTextPrimary).orElse(0));
                textView.setTextSize(2, 20.0f);
            } else {
                textView.setTypeface(lcqVar5.b(textView));
                textView.setTextColor(wbs.W(lcqVar5.c, R.attr.ytTextPrimary).orElse(0));
                textView.setTextSize(2, 16.0f);
            }
        } else if (item instanceof lhg) {
            lhg lhgVar = (lhg) item;
            view2 = view == null ? this.k.inflate(R.layout.search_suggestion_category, viewGroup, false) : view;
            lco lcoVar = (lco) view2.getTag(R.id.search_category_tag);
            if (lcoVar == null) {
                lcoVar = new lco(view2, this.n, this.d);
                view2.setTag(R.id.search_category_tag, lcoVar);
            }
            lcoVar.a.setText(lhgVar.a);
        } else if (item instanceof lhh) {
            lhh lhhVar = (lhh) item;
            view2 = view == null ? this.k.inflate(R.layout.search_suggestion_divider, viewGroup, false) : view;
            ((ImageView) view2.findViewById(R.id.divider)).getLayoutParams().height = Math.round(lhhVar.a);
        } else {
            view2 = null;
        }
        d("ss_rdf");
        this.o = null;
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }

    @Override // defpackage.lal
    public final void h() {
        this.i.clear();
        this.j.clear();
        notifyDataSetChanged();
    }

    @Override // defpackage.lal
    public final void i(Object obj) {
        this.i.remove(obj);
        this.j.clear();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (arrayList.get(i3) instanceof akef) {
                this.j.put(i, i2);
                i++;
                i2++;
            } else {
                this.j.put(i, i2);
                i++;
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        Object item = getItem(i);
        return ((item instanceof lhg) || (item instanceof lhh)) ? false : true;
    }

    @Override // defpackage.akdl
    public final void j(acsx acsxVar) {
        this.o = acsxVar;
    }

    @Override // defpackage.lal
    public final void k(boolean z) {
        this.l = z;
    }

    @Override // defpackage.akdl
    public final acsx ob() {
        return this.o;
    }
}
