package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BackgroundPromoRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mrl extends ajpc {
    private final gma a;
    private final FrameLayout b;
    private final ajos c;
    private ajom d;
    private final TextView e;

    public mrl(Context context, gma gmaVar, ajos ajosVar) {
        this.a = gmaVar;
        context.getClass();
        this.c = ajosVar;
        FrameLayout frameLayout = (FrameLayout) View.inflate(context, R.layout.pending_uploads_item, null);
        this.b = frameLayout;
        this.e = (TextView) frameLayout.findViewById(R.id.no_uploads_text);
        gmaVar.c(frameLayout);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ajom ajomVar = this.d;
        if (ajomVar != null) {
            this.b.removeView(ajomVar.a());
            ahbw.u(this.d, ajosVar);
            this.d = null;
        }
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        atts attsVar = (atts) obj;
        TextView textView = this.e;
        if ((attsVar.b & 2) != 0) {
            aqygVar = attsVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        aulq aulqVar = attsVar.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(BackgroundPromoRendererOuterClass.backgroundPromoRenderer)) {
            aulq aulqVar2 = attsVar.d;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apib apibVar = (apib) aulqVar2.pX(BackgroundPromoRendererOuterClass.backgroundPromoRenderer);
            ammv s = ahbw.s(this.c, apibVar, this.b);
            if (s.h()) {
                ajom ajomVar = (ajom) s.c();
                this.d = ajomVar;
                ajomVar.oB(ajokVar, apibVar);
                this.b.addView(this.d.a());
                yny.B(this.b, -1, -1);
                this.b.setVisibility(0);
            }
        } else {
            yny.B(this.b, -1, -2);
        }
        this.a.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return new byte[0];
    }
}
