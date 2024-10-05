package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class nbw {
    protected final View a;
    protected final View b;
    protected final TextView c;
    protected final TextView d;
    protected final View e;
    protected final View f;
    protected final View g;
    protected final View h;
    protected final GradientDrawable i;
    protected final Drawable j;
    protected final LayerDrawable k;
    protected boolean l;
    private final Context m;
    private final ajuw n;
    private final boolean o;
    private final akbd p;

    /* JADX INFO: Access modifiers changed from: protected */
    public nbw(Context context, ajuw ajuwVar, View view, View view2, boolean z, akbd akbdVar) {
        this.n = ajuwVar;
        this.a = view;
        this.b = view2;
        this.m = context;
        this.o = z;
        this.p = akbdVar;
        view2.findViewById(R.id.content_background);
        this.c = (TextView) view2.findViewById(R.id.title);
        this.d = (TextView) view2.findViewById(R.id.description);
        this.e = view2.findViewById(R.id.ad_attribution);
        View findViewById = view2.findViewById(R.id.close_button);
        this.f = findViewById;
        this.g = view2.findViewById(R.id.contextual_menu_anchor);
        this.h = view2.findViewById(R.id.static_contextual_menu_anchor);
        whu.E(view2, null);
        findViewById.setBackground(null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.i = gradientDrawable;
        gradientDrawable.setShape(0);
        Drawable x = whu.x(view2.getContext(), 0);
        this.j = x;
        this.k = new LayerDrawable(new Drawable[]{gradientDrawable, x});
    }

    private final void a(acra acraVar, Object obj, boolean z, View view, atdc atdcVar) {
        Context context;
        if (atdcVar == null || z) {
            return;
        }
        this.n.e(this.a, view, atdcVar, obj, acraVar);
        if (this.o && (context = this.m) != null && muf.l(context)) {
            return;
        }
        view.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(acra acraVar, Object obj, augh aughVar) {
        aqyg aqygVar;
        aughVar.getClass();
        atdc atdcVar = null;
        if ((aughVar.b & 1) != 0) {
            aqygVar = aughVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        aulq aulqVar = aughVar.m;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aulqVar.pY(ButtonRendererOuterClass.buttonRenderer);
        aulq aulqVar2 = aughVar.m;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        if (aulqVar2.pY(MenuRendererOuterClass.menuRenderer)) {
            aulq aulqVar3 = aughVar.m;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            atdcVar = (atdc) aulqVar3.pX(MenuRendererOuterClass.menuRenderer);
        }
        e(acraVar, obj, b, null, null, false, atdcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(acra acraVar, Object obj, augy augyVar, atlt atltVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        augyVar.getClass();
        augn augnVar = null;
        if ((augyVar.b & 8) != 0) {
            aqygVar = augyVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((augyVar.b & 16) != 0) {
            aqygVar2 = augyVar.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        if ((augyVar.b & 131072) != 0 && (augnVar = augyVar.u) == null) {
            augnVar = augn.a;
        }
        augn augnVar2 = augnVar;
        aulq aulqVar = augyVar.p;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        boolean z = aulqVar.pY(ButtonRendererOuterClass.buttonRenderer) && atltVar != null;
        aulq aulqVar2 = augyVar.p;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        e(acraVar, obj, b, b2, augnVar2, z, (atdc) ahbj.n(aulqVar2, MenuRendererOuterClass.menuRenderer));
    }

    public final void e(acra acraVar, Object obj, Spanned spanned, Spanned spanned2, augn augnVar, boolean z, atdc atdcVar) {
        whu.G(this.c, spanned);
        if (TextUtils.isEmpty(spanned)) {
            this.c.setText((CharSequence) null);
        }
        TextView textView = this.d;
        if (textView != null) {
            whu.G(textView, spanned2);
            if (TextUtils.isEmpty(spanned2)) {
                this.d.setText((CharSequence) null);
            }
        }
        if (augnVar != null) {
            this.i.setColor(augnVar.b);
            this.l = true;
            f(true);
        } else {
            this.l = false;
            f(true);
        }
        whu.I(this.f, z);
        View view = this.g;
        if (view != null) {
            a(acraVar, obj, z, view, atdcVar);
            whu.I(this.g, false);
        }
        View view2 = this.h;
        if (view2 != null) {
            a(acraVar, obj, z, view2, atdcVar);
            whu.I(this.h, (atdcVar == null || z) ? false : true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(boolean z) {
        if (!z) {
            whu.r(this.b, this.l ? this.i : null);
        } else {
            if (this.p.d()) {
                akbd akbdVar = this.p;
                View view = this.b;
                akbdVar.b(view, akbdVar.a(view, this.l ? this.i : null));
                return;
            }
            whu.r(this.b, this.l ? this.k : this.j);
        }
    }
}
