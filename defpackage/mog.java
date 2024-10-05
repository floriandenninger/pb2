package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mog extends ajpc implements lxs, lxw {
    public final aahd a;
    public auoi b;
    private final ViewGroup c;
    private final ImageView d;
    private final View e;
    private final GradientDrawable f;
    private final Context g;
    private final ajjz h;
    private final ajut i;
    private final YouTubeTextView j;
    private final YouTubeTextView k;
    private final YouTubeTextView l;
    private final ajjv m;
    private final ImageView n;
    private final akbu o;
    private lxx p;
    private boolean q;
    private ColorDrawable r;
    private Drawable s;

    public mog(Context context, ViewGroup viewGroup, ajjz ajjzVar, ajut ajutVar, aahd aahdVar, akbu akbuVar, akbd akbdVar) {
        this.g = context;
        this.h = ajjzVar;
        this.i = ajutVar;
        this.a = aahdVar;
        this.o = akbuVar;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.drawer_avatar, viewGroup, false);
        this.c = viewGroup2;
        this.d = (ImageView) viewGroup2.findViewById(R.id.channel_avatar);
        this.l = (YouTubeTextView) viewGroup2.findViewById(R.id.channel_avatar_text);
        View findViewById = viewGroup2.findViewById(R.id.channel_status);
        this.e = findViewById;
        this.f = (GradientDrawable) findViewById.getBackground();
        this.j = (YouTubeTextView) viewGroup2.findViewById(R.id.channel_title);
        this.k = (YouTubeTextView) viewGroup2.findViewById(R.id.channel_count);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.selected_avatar_shim);
        this.n = imageView;
        if (this.s == null) {
            Resources resources = context.getResources();
            ColorDrawable colorDrawable = new ColorDrawable(wbs.W(context, R.attr.ytStaticBlue).orElse(0));
            this.s = colorDrawable;
            colorDrawable.setAlpha(resources.getInteger(R.integer.section_list_drawer_selected_avatar_color_alpha));
        }
        imageView.setBackground(this.s);
        ajju b = ajjzVar.c().b();
        b.b(R.drawable.missing_avatar);
        this.m = b.a();
        akbdVar.b(viewGroup2, akbdVar.a(viewGroup2, null));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.setOnClickListener(null);
        this.b = null;
        lxx lxxVar = this.p;
        if (lxxVar != null) {
            lxxVar.d(this);
            this.p = null;
        }
    }

    @Override // defpackage.lxs
    public final void c(auoi auoiVar, boolean z) {
        if (auoiVar == null || !auoiVar.equals(this.b)) {
            return;
        }
        if (!this.q || !z) {
            this.c.setSelected(z);
        }
        g(z);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        avgg avggVar;
        String str;
        aqyg aqygVar;
        arej arejVar;
        avgg avggVar2;
        auoi auoiVar = (auoi) obj;
        this.q = ajokVar.j("SECTION_LIST_DRAWER_COMPACT_MODE", false);
        auoiVar.getClass();
        this.b = auoiVar;
        ajun ajunVar = (ajun) ajokVar.c("avatar_selection_controller");
        if (ajunVar != null) {
            ajunVar.a.put(auoiVar, this);
        }
        ajjz ajjzVar = this.h;
        ImageView imageView = this.d;
        if (auoiVar.c == 1) {
            avggVar = (avgg) auoiVar.d;
        } else {
            avggVar = avgg.a;
        }
        ajjzVar.k(imageView, avggVar, this.m);
        this.l.setVisibility(8);
        if (!(auoiVar.c == 2 ? (String) auoiVar.d : "").isEmpty()) {
            if (auoiVar.c == 1) {
                avggVar2 = (avgg) auoiVar.d;
            } else {
                avggVar2 = avgg.a;
            }
            if (!ahbw.L(avggVar2)) {
                this.h.e(this.d);
                this.l.setVisibility(0);
                this.l.setText(auoiVar.c == 2 ? (String) auoiVar.d : "");
                ImageView imageView2 = this.d;
                Context context = this.g;
                if (this.r == null) {
                    this.r = new ColorDrawable(wbs.W(context, R.attr.ytGeneralBackgroundC).orElse(0));
                }
                imageView2.setImageDrawable(this.r);
            }
        }
        g(auoiVar.l);
        ViewGroup viewGroup = this.c;
        aott aottVar = auoiVar.k;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        aqyg aqygVar2 = null;
        if ((aottVar.b & 1) != 0) {
            aott aottVar2 = auoiVar.k;
            if (aottVar2 == null) {
                aottVar2 = aott.a;
            }
            aots aotsVar = aottVar2.c;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            str = aotsVar.c;
        } else {
            str = null;
        }
        viewGroup.setContentDescription(str);
        View view = this.e;
        GradientDrawable gradientDrawable = this.f;
        apqx b = apqx.b(auoiVar.g);
        if (b == null) {
            b = apqx.CHANNEL_STATUS_UNKNOWN;
        }
        esv.b(view, gradientDrawable, b, this.g.getResources());
        if (this.q) {
            this.j.setVisibility(8);
            this.k.setVisibility(8);
        } else {
            YouTubeTextView youTubeTextView = this.j;
            if ((auoiVar.b & 8) != 0) {
                aqygVar = auoiVar.h;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            whu.G(youTubeTextView, ajcq.b(aqygVar));
            YouTubeTextView youTubeTextView2 = this.k;
            if ((auoiVar.b & 16) != 0 && (aqygVar2 = auoiVar.i) == null) {
                aqygVar2 = aqyg.a;
            }
            whu.G(youTubeTextView2, ajcq.b(aqygVar2));
        }
        this.c.setOnClickListener(new moe(this, ajokVar, auoiVar));
        lxx lxxVar = (lxx) ajokVar.c("drawer_expansion_state_controller");
        this.p = lxxVar;
        if (lxxVar != null) {
            lxxVar.b(this);
            f(this.p.a());
        }
        if (!this.q) {
            this.c.setSelected(auoiVar.l);
        }
        auoh auohVar = auoiVar.n;
        if (auohVar == null) {
            auohVar = auoh.a;
        }
        if (auohVar.b == 102716411) {
            akbu akbuVar = this.o;
            auoh auohVar2 = auoiVar.n;
            if (auohVar2 == null) {
                auohVar2 = auoh.a;
            }
            if (auohVar2.b == 102716411) {
                arejVar = (arej) auohVar2.c;
            } else {
                arejVar = arej.a;
            }
            akbuVar.b(arejVar, this.d, auoiVar, ajokVar.a);
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auoi) obj).j.I();
    }

    @Override // defpackage.lxw
    public final void f(float f) {
        this.j.setAlpha(f);
        this.k.setAlpha(f);
    }

    private final void g(boolean z) {
        if (z) {
            auoi auoiVar = this.b;
            if ((auoiVar.b & 2048) != 0) {
                ImageView imageView = this.n;
                ajut ajutVar = this.i;
                arfs arfsVar = auoiVar.m;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                imageView.setImageResource(ajutVar.a(b));
                this.n.setVisibility(0);
                return;
            }
        }
        this.n.setVisibility(8);
    }
}
