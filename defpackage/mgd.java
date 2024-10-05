package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgd implements ajom {
    public final aahd a;
    private final ajjz b;
    private final ajuw c;
    private final View d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final ImageView h;

    public mgd(Context context, aahd aahdVar, ajjz ajjzVar, ajuw ajuwVar, ViewGroup viewGroup) {
        this.a = aahdVar;
        this.b = ajjzVar;
        this.c = ajuwVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.suggested_videos_header, viewGroup, false);
        this.d = inflate;
        this.e = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.description);
        this.h = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
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
        final avbf avbfVar = (avbf) obj;
        this.d.setOnClickListener(new View.OnClickListener() { // from class: mgc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apxf apxfVar;
                mgd mgdVar = mgd.this;
                avbf avbfVar2 = avbfVar;
                aahd aahdVar = mgdVar.a;
                if ((avbfVar2.b & 32) != 0) {
                    apxfVar = avbfVar2.h;
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
        aqyg aqygVar2 = null;
        if ((avbfVar.b & 4) != 0) {
            avggVar = avbfVar.e;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.f;
        if ((avbfVar.b & 1) != 0) {
            aqygVar = avbfVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.g;
        if ((avbfVar.b & 2) != 0 && (aqygVar2 = avbfVar.d) == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        ajuw ajuwVar = this.c;
        View rootView = this.d.getRootView();
        ImageView imageView2 = this.h;
        aulq aulqVar = avbfVar.f;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        ajuwVar.e(rootView, imageView2, (atdc) ahbj.n(aulqVar, MenuRendererOuterClass.menuRenderer), avbfVar, acra.l);
    }
}
