package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class xuz implements ajom {
    public final Context a;
    public final xoh b;
    public final ajoy c;
    public final ajvb d;
    public final View e;
    public final View f;
    public final int g;
    public final TextView h;
    public final View i;
    public final RecyclerView j;
    private final ajjz k;
    private final View l;
    private final TextView m;
    private final TextView n;
    private final ViewGroup o;
    private final ImageView p;
    private final TextView q;
    private final ImageView r;
    private final xqg s;

    /* JADX INFO: Access modifiers changed from: protected */
    public xuz(Context context, ajjz ajjzVar, ajvb ajvbVar, ajoy ajoyVar, xoh xohVar, ajoy ajoyVar2, akcy akcyVar, aahd aahdVar, gnn gnnVar, aadw aadwVar, acra acraVar, ajun ajunVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        context.getClass();
        this.a = context;
        ajjzVar.getClass();
        this.k = ajjzVar;
        xohVar.getClass();
        this.b = xohVar;
        this.d = ajvbVar;
        this.c = ajoyVar2;
        View inflate = View.inflate(context, R.layout.comments_header, null);
        this.e = inflate;
        this.l = inflate.findViewById(R.id.comment_section_title);
        this.m = (TextView) inflate.findViewById(R.id.title_text);
        this.n = (TextView) inflate.findViewById(R.id.comments_count);
        this.o = (ViewGroup) inflate.findViewById(R.id.simplebox_container);
        this.p = (ImageView) inflate.findViewById(R.id.simplebox_avatar);
        this.q = (TextView) inflate.findViewById(R.id.simplebox);
        this.r = (ImageView) inflate.findViewById(R.id.simplebox_divider);
        View findViewById = inflate.findViewById(R.id.sort_menu_anchor);
        this.f = findViewById;
        this.s = new xqg(context, ajvbVar, ajoyVar, findViewById, new akbu(akcyVar, aahdVar, gnnVar, aadwVar), acraVar, ajunVar, null, null, null, null);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.sort_menu_anchor_padding);
        this.h = (TextView) inflate.findViewById(R.id.red_member_comments_only);
        this.i = inflate.findViewById(R.id.red_member_comments_only_divider);
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new xuy(this));
        this.j = (RecyclerView) inflate.findViewById(R.id.sub_header_tab);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajom
    public void b(ajos ajosVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(ajok ajokVar, auwh auwhVar) {
        Object c = ajokVar.c("sectionController");
        xqg xqgVar = this.s;
        final ajtz ajtzVar = c instanceof ajtz ? (ajtz) c : null;
        xqgVar.d = new xqf() { // from class: xqd
            @Override // defpackage.xqf
            public final void a(ajce ajceVar) {
                ajtz.this.lt(ajceVar);
            }
        };
        if (c != null) {
            this.s.e = amrz.k("sectionController", c);
        }
        this.s.a(auwhVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(CharSequence charSequence, CharSequence charSequence2) {
        this.m.setText(charSequence);
        this.n.setText(charSequence2);
        boolean z = false;
        if (TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(charSequence2)) {
            z = true;
        }
        whu.I(this.l, !z);
    }

    public final void g() {
        this.l.setVisibility(8);
        this.p.setVisibility(8);
        this.q.setVisibility(8);
        this.o.setVisibility(8);
        this.r.setVisibility(8);
        this.i.setVisibility(8);
        this.h.setVisibility(8);
        this.s.a(null);
        this.j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(int i) {
        this.q.setVisibility(i);
        this.r.setVisibility(i);
        this.p.setVisibility(i);
        this.o.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(avgg avggVar, int i, CharSequence charSequence, View.OnClickListener onClickListener) {
        String str;
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.comment_avatar_size);
        int dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.comment_layout_margin_left);
        int dimensionPixelSize3 = this.a.getResources().getDimensionPixelSize(R.dimen.simplebox_margin_top);
        int dimensionPixelSize4 = this.a.getResources().getDimensionPixelSize(R.dimen.simplebox_margin_bottom);
        int i2 = i - 1;
        if (i2 == 2) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.reply_avatar_size);
            dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.reply_layout_margin_left);
        } else if (i2 == 3) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.backstage_avatar_size);
            dimensionPixelSize3 = this.a.getResources().getDimensionPixelSize(R.dimen.backstage_simple_box_margin_top);
            dimensionPixelSize4 = this.a.getResources().getDimensionPixelSize(R.dimen.backstage_simple_box_margin_bottom);
        }
        yny.z(this.p, yny.h(yny.y(dimensionPixelSize, dimensionPixelSize), yny.o(dimensionPixelSize2), yny.r(dimensionPixelSize2)), ViewGroup.MarginLayoutParams.class);
        yny.z(this.o, yny.h(yny.v(dimensionPixelSize3), yny.k(dimensionPixelSize4)), ViewGroup.MarginLayoutParams.class);
        Uri D = ahbw.D(avggVar, dimensionPixelSize);
        if (D != null) {
            this.p.setVisibility(0);
            this.p.setTag(D);
            ImageView imageView = this.p;
            if ((4 & avggVar.b) != 0) {
                aott aottVar = avggVar.d;
                if (aottVar == null) {
                    aottVar = aott.a;
                }
                aots aotsVar = aottVar.c;
                if (aotsVar == null) {
                    aotsVar = aots.a;
                }
                str = aotsVar.c;
            } else {
                str = null;
            }
            imageView.setContentDescription(str);
            this.k.g(this.p, D);
        } else {
            this.p.setVisibility(4);
        }
        this.q.setVisibility(0);
        this.r.setVisibility(0);
        this.o.setVisibility(0);
        this.q.setText(charSequence);
        this.q.setOnClickListener(onClickListener);
    }
}
