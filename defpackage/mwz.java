package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwz extends ajpc implements lxw {
    final ajpd a;
    public lxx b;
    private final ajut c;
    private final ViewGroup d;
    private final YouTubeTextView e;
    private final ImageView f;
    private final fyl g;
    private final ImageView h;
    private final ajox i;
    private final int j;
    private final int k;
    private final ftd l;
    private final ViewGroup m;
    private mwy n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [ajos, java.lang.Object] */
    public mwz(Context context, ajut ajutVar, ajvb ajvbVar, fte fteVar, ajoy ajoyVar, ViewGroup viewGroup) {
        this.c = ajutVar;
        this.d = viewGroup;
        this.e = (YouTubeTextView) viewGroup.findViewById(R.id.title);
        this.h = (ImageView) viewGroup.findViewById(R.id.collapsed_icon);
        this.f = (ImageView) viewGroup.findViewById(R.id.chevron);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.sort_filter_sub_menu_container);
        this.m = viewGroup2;
        ajox a = ajoyVar.a(ajvbVar.get());
        this.i = a;
        ajpd ajpdVar = new ajpd();
        this.a = ajpdVar;
        a.h(ajpdVar);
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.drawer_results);
        recyclerView.af(new LinearLayoutManager());
        recyclerView.ac(a);
        Resources resources = context.getResources();
        fyl fylVar = new fyl(wbs.W(context, R.attr.ytSeparator).orElse(0), resources.getDimensionPixelSize(R.dimen.channel_list_sub_menu_bottom_separator_height));
        this.g = fylVar;
        viewGroup.setBackground(fylVar);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.section_list_drawer_chevron_padding_expanded);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.section_list_drawer_chevron_padding_collapsed);
        this.k = dimensionPixelSize2;
        this.j = dimensionPixelSize - dimensionPixelSize2;
        ftd c = fteVar.c(viewGroup);
        this.l = c;
        viewGroup2.addView(c.c);
    }

    private final void g(float f) {
        if (this.r) {
            this.f.setVisibility(0);
            int i = this.k + ((int) (this.j * f));
            jw.Y(this.f, i, 0, i, 0);
            this.f.setRotation((1.0f - f) * 180.0f);
        } else {
            this.f.setVisibility(8);
        }
        h(this.m, f, this.o);
        h(this.e, f, this.p);
        h(this.h, 1.0f - f, this.q);
    }

    private static final void h(View view, float f, boolean z) {
        view.setAlpha(f);
        boolean z2 = false;
        if (z && f != 0.0f) {
            z2 = true;
        }
        whu.I(view, z2);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.f.setOnClickListener(null);
        this.l.b(ajosVar);
        this.b.d(this);
        this.a.clear();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        auol auolVar;
        auol auolVar2;
        auwh auwhVar;
        auok auokVar = (auok) obj;
        auokVar.getClass();
        lxx lxxVar = (lxx) ajokVar.c("drawer_expansion_state_controller");
        this.b = lxxVar;
        lxxVar.b(this);
        boolean z = false;
        if (this.n == null) {
            mwy mwyVar = new mwy(ajokVar, 0);
            this.n = mwyVar;
            this.i.rU(mwyVar);
        }
        if (auokVar.d == 1) {
            auolVar = (auol) auokVar.e;
        } else {
            auolVar = auol.a;
        }
        this.o = auolVar.b == 76818770;
        Spanned b = ajcq.b(auokVar.d == 2 ? (aqyg) auokVar.e : null);
        this.p = (this.o || TextUtils.isEmpty(b)) ? false : true;
        boolean j = ajokVar.j("is_first_drawer_list", false);
        this.r = j;
        if (!j && (auokVar.c & 4) != 0) {
            z = true;
        }
        this.q = z;
        if (j) {
            this.f.setOnClickListener(new View.OnClickListener() { // from class: mwx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mwz.this.b.c();
                }
            });
            this.g.c(80);
        } else {
            this.g.c(48);
        }
        if (this.o) {
            if (auokVar.d == 1) {
                auolVar2 = (auol) auokVar.e;
            } else {
                auolVar2 = auol.a;
            }
            if (auolVar2.b == 76818770) {
                auwhVar = (auwh) auolVar2.c;
            } else {
                auwhVar = auwh.a;
            }
            this.l.oB(ajokVar, auwhVar);
        }
        if (this.p) {
            this.e.setText(b);
        }
        whu.I(this.h, this.q);
        if (this.q) {
            ajut ajutVar = this.c;
            arfs arfsVar = auokVar.f;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b2 = arfr.b(arfsVar.c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            this.h.setImageResource(ajutVar.a(b2));
            if (this.p) {
                this.h.setContentDescription(b);
            }
        }
        this.a.clear();
        for (auom auomVar : auokVar.g) {
            if (auomVar.b == 105604662) {
                this.a.add((auoi) auomVar.c);
            }
        }
        this.a.l();
        g(this.b.a());
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auok) obj).h.I();
    }

    @Override // defpackage.lxw
    public final void f(float f) {
        g(f);
    }
}
