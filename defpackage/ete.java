package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ete extends ajpc implements ajvz {
    public final aahd a;
    public final View b;
    public final RecyclerView c;
    public final azrl d;
    public ammv e;
    public apqv f;
    private final fwi g;
    private final ajyf h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final ajpd m;
    private final ajnw n;
    private final etc o;
    private final LinearLayoutManager p;
    private final Context q;
    private int r;
    private int s;
    private ajwx t;
    private fyl u;
    private int v;
    private final lo x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [ajos, java.lang.Object] */
    public ete(Context context, aahd aahdVar, fwi fwiVar, ajvb ajvbVar, akht akhtVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.q = context;
        fwiVar.getClass();
        this.g = fwiVar;
        this.a = aahdVar;
        this.d = azrl.e();
        View inflate = LayoutInflater.from(context).inflate(R.layout.channel_list_sub_menu, (ViewGroup) null);
        this.b = inflate;
        this.k = inflate.findViewById(R.id.gradient_overlay);
        this.i = inflate.findViewById(R.id.show_channels);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.channels_list);
        this.c = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.p = linearLayoutManager;
        linearLayoutManager.ab(0);
        recyclerView.af(linearLayoutManager);
        ajpd ajpdVar = new ajpd();
        this.m = ajpdVar;
        ajox a = ajoyVar.a(ajvbVar.get());
        a.h(ajpdVar);
        ajnw ajnwVar = new ajnw();
        this.n = ajnwVar;
        a.rU(ajnwVar);
        etc etcVar = new etc();
        this.o = etcVar;
        a.rU(etcVar);
        this.e = amlr.a;
        a.rU(new ajol() { // from class: esz
            @Override // defpackage.ajol
            public final void a(ajok ajokVar, ajng ajngVar, final int i) {
                final ete eteVar = ete.this;
                if (eteVar.k()) {
                    ajokVar.f("CHANNEL_LIST_SUB_MENU_AVATAR_ON_CLICK_INTERCEPT_KEY", new ajof() { // from class: esy
                        @Override // defpackage.ajof
                        public final boolean h(View view) {
                            ete eteVar2 = ete.this;
                            int i2 = i;
                            if (!eteVar2.k()) {
                                return false;
                            }
                            if (!eteVar2.e.h() || ((Integer) eteVar2.e.c()).intValue() != i2) {
                                eteVar2.h(ammv.j(Integer.valueOf(i2)));
                                return false;
                            }
                            eteVar2.j();
                            return true;
                        }
                    });
                    ajokVar.f("CHANNEL_LIST_SUB_MENU_AVATAR_CURRENT_STATE_KEY", ete.f(i, eteVar.e));
                    ajokVar.f("CHANNEL_LIST_SUB_MENU_AVATAR_STATE_CHANGED_OBSERVABLE_KEY", eteVar.d.Y(new fih(i, 1)));
                }
            }
        });
        recyclerView.ac(a);
        this.x = new eta(this);
        View findViewById = inflate.findViewById(R.id.channels_button);
        this.j = findViewById;
        gno h = akhtVar.h((TextView) findViewById);
        this.h = h;
        h.e(R.dimen.text_button_icon_padding);
        h.f();
        this.l = inflate.findViewById(R.id.channels_navigation_layout);
        this.s = -1;
        this.r = -1;
    }

    public static est f(int i, ammv ammvVar) {
        if (!ammvVar.h()) {
            return est.DEFAULT;
        }
        if (((Integer) ammvVar.c()).intValue() == i) {
            return est.SELECTED;
        }
        return est.UNDERSTATED;
    }

    private static void m(View view, int i) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), i);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        int i;
        int i2;
        apqt apqtVar;
        final apqv apqvVar = (apqv) obj;
        this.f = apqvVar;
        apmg apmgVar = null;
        this.t = null;
        this.n.a = ajokVar.a;
        if (ajokVar.c("sectionListController") instanceof ajwx) {
            ajwx ajwxVar = (ajwx) ajokVar.c("sectionListController");
            this.t = ajwxVar;
            this.o.a = new ajwy(ajwxVar);
        }
        apqu apquVar = apqvVar.f;
        if (apquVar == null) {
            apquVar = apqu.a;
        }
        aone builder = apqvVar.toBuilder();
        for (int i3 = 0; i3 < apqvVar.e.size(); i3++) {
            if (((apqw) apqvVar.e.get(i3)).b == 48474525) {
                aone builder2 = ((apqw) apqvVar.e.get(i3)).toBuilder();
                apqw apqwVar = (apqw) builder2.instance;
                if (apqwVar.b == 48474525) {
                    apqtVar = (apqt) apqwVar.c;
                } else {
                    apqtVar = apqt.a;
                }
                aong aongVar = (aong) apqtVar.toBuilder();
                aongVar.e(apqq.b, apquVar);
                builder2.copyOnWrite();
                apqw apqwVar2 = (apqw) builder2.instance;
                apqt apqtVar2 = (apqt) aongVar.build();
                apqtVar2.getClass();
                apqwVar2.c = apqtVar2;
                apqwVar2.b = 48474525;
                builder.copyOnWrite();
                apqv apqvVar2 = (apqv) builder.instance;
                apqw apqwVar3 = (apqw) builder2.build();
                apqwVar3.getClass();
                aony aonyVar = apqvVar2.e;
                if (!aonyVar.c()) {
                    apqvVar2.e = aonm.mutableCopy(aonyVar);
                }
                apqvVar2.e.set(i3, apqwVar3);
            }
        }
        apqv apqvVar3 = (apqv) builder.build();
        this.m.clear();
        Object obj2 = null;
        for (apqw apqwVar4 : apqvVar3.e) {
            if (apqwVar4.b == 48474525) {
                apqt apqtVar3 = (apqt) apqwVar4.c;
                if (obj2 != null && obj2 != apqt.class) {
                    this.m.add(new esv());
                }
                this.m.add(apqtVar3);
                obj2 = apqt.class;
            }
        }
        RecyclerView recyclerView = this.c;
        int ay = anaf.ay(apqvVar3.j);
        int i4 = -2;
        if (ay == 0 || ay != 3) {
            recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), 0, recyclerView.getPaddingBottom());
            yny.B(recyclerView, -1, -2);
            if (recyclerView.d() > 0) {
                recyclerView.aw();
            }
        } else {
            Resources resources = recyclerView.getResources();
            recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_horizontal_margin), recyclerView.getPaddingBottom());
            yny.z(recyclerView, yny.h(yny.y(-2, -2), yny.m(17)), FrameLayout.LayoutParams.class);
            if (recyclerView.d() > 0) {
                recyclerView.aw();
            }
            DisplayMetrics displayMetrics = recyclerView.getContext().getResources().getDisplayMetrics();
            int b = recyclerView.m.b();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_min_item_space);
            int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_max_item_space);
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_larger_avatar_size);
            int dimensionPixelOffset4 = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_container_larger_width) - dimensionPixelOffset3;
            int min = Math.min(Math.max(((displayMetrics.widthPixels - (b * dimensionPixelOffset3)) / (b + 1)) - dimensionPixelOffset3, dimensionPixelOffset), dimensionPixelOffset2);
            int integer = resources.getInteger(R.integer.channel_list_sub_menu_horizontal_spacing_factor);
            recyclerView.aB(new etf(yjk.K(displayMetrics, integer * (yjk.P(displayMetrics, min + dimensionPixelOffset4) / integer)) - dimensionPixelOffset4));
        }
        if (k()) {
            this.b.setBackground(null);
            m(this.c, 0);
        } else {
            if (this.u == null) {
                this.v = this.q.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_bottom_separator_height);
                this.u = new fyl(wbs.W(this.q, R.attr.ytSeparator).orElse(0), this.v);
            }
            this.b.setBackground(this.u);
            m(this.c, this.v);
        }
        apqu apquVar2 = apqvVar.f;
        if (apquVar2 == null) {
            apquVar2 = apqu.a;
        }
        int az = anaf.az(apquVar2.b);
        if (az == 0) {
            az = 1;
        }
        if (az == 4) {
            Resources resources2 = this.l.getResources();
            i2 = this.s;
            if (i2 == -1) {
                i2 = resources2.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_container_larger_avatar_top_margin);
                this.s = i2;
            }
            int i5 = this.r;
            if (i5 == -1) {
                int dimensionPixelOffset5 = resources2.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_larger_avatar_size);
                this.r = dimensionPixelOffset5;
                i4 = dimensionPixelOffset5;
            } else {
                i4 = i5;
            }
            i = 48;
        } else {
            i = 16;
            i2 = 0;
        }
        yny.z(this.l, yny.h(yny.v(i2), yny.n(i4), yny.p(i)), LinearLayout.LayoutParams.class);
        int i6 = apqvVar.c;
        if (i6 != 3) {
            ajyf ajyfVar = this.h;
            if (i6 == 6 && (apmgVar = ((apmh) apqvVar.d).c) == null) {
                apmgVar = apmg.a;
            }
            ajyfVar.b(apmgVar, ajokVar.a);
            this.g.a(apqvVar, this.j);
            this.c.aF(this.x);
            this.k.setVisibility(8);
            this.i.setVisibility(8);
            return;
        }
        this.i.setVisibility(0);
        this.i.setOnClickListener(new View.OnClickListener() { // from class: esx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ete eteVar = ete.this;
                apqv apqvVar4 = apqvVar;
                eteVar.a.c(apqvVar4.c == 3 ? (apxf) apqvVar4.d : apxf.a, null);
            }
        });
        this.g.a(apqvVar, this.i);
        this.c.aD(this.x);
        i();
        this.h.b(null, ajokVar.a);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apqv) obj).g.I();
    }

    public final void h(ammv ammvVar) {
        this.e = ammvVar;
        this.d.c(etb.b(ammvVar));
        if (ammvVar.h()) {
            int intValue = ((Integer) ammvVar.c()).intValue();
            int computeHorizontalScrollOffset = this.c.computeHorizontalScrollOffset();
            wv i = this.c.i(intValue);
            if (i != null) {
                int measuredWidth = i.a.getMeasuredWidth();
                this.c.getGlobalVisibleRect(new Rect());
                this.c.ai((jw.e(this.b) == 1 ? (this.c.computeHorizontalScrollRange() - ((intValue - 2) * measuredWidth)) - this.c.computeHorizontalScrollExtent() : (intValue - 2) * measuredWidth) - computeHorizontalScrollOffset, 0);
            }
        }
    }

    public final void i() {
        whu.I(this.k, this.p.K() < this.m.size() + (-1));
    }

    public final boolean j() {
        apqv apqvVar = this.f;
        if (apqvVar == null || (apqvVar.b & 64) == 0 || !this.e.h() || this.t == null) {
            return false;
        }
        h(amlr.a);
        HashMap aJ = amkq.aJ(1);
        aJ.put("sectionListController", this.t);
        aahd aahdVar = this.a;
        apxf apxfVar = this.f.i;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, aJ);
        return true;
    }

    public final boolean k() {
        int aA;
        apqv apqvVar = this.f;
        return (apqvVar == null || (apqvVar.b & 32) == 0 || (aA = anaf.aA(apqvVar.h)) == 0 || aA != 2) ? false : true;
    }

    @Override // defpackage.ajpc
    protected final boolean l() {
        return true;
    }

    @Override // defpackage.ajvz
    public final ajxe ph() {
        throw null;
    }
}
