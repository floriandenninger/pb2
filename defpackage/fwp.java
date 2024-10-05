package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fwp extends ajpc {
    private final ajjz a;
    private final ajop b;
    private final ajoi c;
    private final Resources d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final ajyf k;
    private final TextView l;

    public fwp(Context context, ajjz ajjzVar, ajoy ajoyVar, ajyg ajygVar, gma gmaVar, byte[] bArr) {
        this.c = ajoyVar.c(gmaVar);
        ajjzVar.getClass();
        this.a = ajjzVar;
        this.b = gmaVar;
        this.d = context.getResources();
        View inflate = View.inflate(context, R.layout.compact_movie_upsell, null);
        this.e = inflate;
        this.f = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.g = (TextView) inflate.findViewById(R.id.textual_call_to_action);
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.i = (TextView) inflate.findViewById(R.id.subtitle);
        this.j = (TextView) inflate.findViewById(R.id.top_metadata);
        TextView textView = (TextView) inflate.findViewById(R.id.offer_button_cta);
        this.l = textView;
        this.k = ajygVar.a(textView);
        gmaVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.b).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.c();
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        apmg apmgVar;
        aqcc aqccVar = (aqcc) obj;
        GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) this.f.getLayoutParams();
        int i = aqccVar.b;
        if ((i & 8) != 0) {
            layoutParams.width = this.d.getDimensionPixelSize(R.dimen.compact_movie_upsell_thumbnail_width);
            ajjz ajjzVar = this.a;
            ImageView imageView = this.f;
            avgg avggVar = aqccVar.f;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
        } else if ((i & 4) != 0) {
            layoutParams.width = this.d.getDimensionPixelSize(R.dimen.compact_show_upsell_thumbnail_width);
            ajjz ajjzVar2 = this.a;
            ImageView imageView2 = this.f;
            avgg avggVar2 = aqccVar.e;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            ajjzVar2.h(imageView2, avggVar2);
        }
        apxf apxfVar = null;
        whu.F(this.e, null, 0);
        TextView textView = this.g;
        if ((aqccVar.b & 256) != 0) {
            aqygVar = aqccVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.h;
        if ((aqccVar.b & 1) != 0) {
            aqygVar2 = aqccVar.c;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        TextView textView3 = this.i;
        if ((aqccVar.b & 2) != 0) {
            aqygVar3 = aqccVar.d;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(textView3, ajcq.b(aqygVar3));
        TextView textView4 = this.j;
        if ((aqccVar.b & 64) != 0) {
            aqygVar4 = aqccVar.h;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        whu.G(textView4, ajcq.b(aqygVar4));
        ajyf ajyfVar = this.k;
        apmh apmhVar = aqccVar.j;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) != 0) {
            apmh apmhVar2 = aqccVar.j;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
        } else {
            apmgVar = null;
        }
        ajyfVar.b(apmgVar, ajokVar.a);
        if ((aqccVar.b & 8) != 0) {
            whu.r(this.l, aii.a(this.l.getContext(), R.drawable.button_color_transparent_background));
        }
        ajoi ajoiVar = this.c;
        acra acraVar = ajokVar.a;
        if ((aqccVar.b & 16) != 0 && (apxfVar = aqccVar.g) == null) {
            apxfVar = apxf.a;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        this.b.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqcc) obj).k.I();
    }
}
