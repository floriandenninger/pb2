package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mga implements ajom {
    public final aahd a;
    private final ajjz b;
    private final ajuw c;
    private final View d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final WrappingTextView h;
    private final ImageView i;
    private final View j;

    public mga(Context context, aahd aahdVar, ajjz ajjzVar, ajuw ajuwVar, ViewGroup viewGroup) {
        this.a = aahdVar;
        this.b = ajjzVar;
        this.c = ajuwVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.suggested_video, viewGroup, false);
        this.d = inflate;
        this.e = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.f = (TextView) inflate.findViewById(R.id.duration);
        this.g = (TextView) inflate.findViewById(R.id.headline);
        this.h = (WrappingTextView) inflate.findViewById(R.id.details);
        this.i = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
        this.j = inflate.findViewById(R.id.separator);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.e(this.e);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        avgg avggVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        final avbd avbdVar = (avbd) obj;
        this.d.setOnClickListener(new View.OnClickListener() { // from class: mfy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apxf apxfVar;
                mga mgaVar = mga.this;
                avbd avbdVar2 = avbdVar;
                aahd aahdVar = mgaVar.a;
                if ((avbdVar2.b & 128) != 0) {
                    apxfVar = avbdVar2.j;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                } else {
                    apxfVar = null;
                }
                aahdVar.c(apxfVar, null);
            }
        });
        ajjz ajjzVar = this.b;
        ImageView imageView = this.e;
        aqyg aqygVar4 = null;
        if ((avbdVar.b & 8) != 0) {
            avggVar = avbdVar.f;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.f;
        if ((avbdVar.b & 16) != 0) {
            aqygVar = avbdVar.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.g;
        if ((avbdVar.b & 1) != 0) {
            aqygVar2 = avbdVar.c;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        amrp f = amru.f();
        if ((avbdVar.b & 4) != 0) {
            aqygVar3 = avbdVar.e;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        Spanned b = ajcq.b(aqygVar3);
        if (b != null) {
            f.h(fav.y(b));
        }
        if ((avbdVar.b & 2) != 0 && (aqygVar4 = avbdVar.d) == null) {
            aqygVar4 = aqyg.a;
        }
        Spanned b2 = ajcq.b(aqygVar4);
        if (b2 != null) {
            f.h(fav.y(b2));
        }
        amru g = f.g();
        if (g.isEmpty()) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.h.a(g);
        }
        ajuw ajuwVar = this.c;
        View rootView = this.d.getRootView();
        ImageView imageView2 = this.i;
        aulq aulqVar = avbdVar.h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        ajuwVar.e(rootView, imageView2, (atdc) ahbj.n(aulqVar, MenuRendererOuterClass.menuRenderer), avbdVar, acra.l);
        whu.I(this.j, !ajokVar.j("isLastVideo", false));
    }
}
