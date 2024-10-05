package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.ads.AdHighlightLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kqu implements ajom {
    private final AdHighlightLayout a;
    private final axpg b;
    private final ajdw c;
    private final acra d;

    public kqu(Context context, axpg axpgVar, ajdw ajdwVar, acra acraVar, ViewGroup viewGroup) {
        axpgVar.getClass();
        this.b = axpgVar;
        this.c = ajdwVar;
        acraVar.getClass();
        this.d = acraVar;
        this.a = (AdHighlightLayout) LayoutInflater.from(context).inflate(R.layout.fullscreen_engagement_companion_layout, viewGroup, false);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.b(ajosVar);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqzi aqziVar = (aqzi) obj;
        this.c.b(null);
        this.a.removeAllViews();
        View a = this.c.a();
        ViewGroup viewGroup = (ViewGroup) a.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(a);
        }
        int i = aqziVar.b;
        if ((i & 1) != 0) {
            if ((i & 2) == 0) {
                this.a.a(true);
            } else {
                AdHighlightLayout adHighlightLayout = this.a;
                int i2 = (int) aqziVar.d;
                int i3 = R.style.FullscreenEngagementMetadataHighlightsTwoColumn;
                if (i2 == 1) {
                    i3 = R.style.FullscreenEngagementMetadataHighlightsOneColumn;
                } else if (i2 != 2 && i2 == 3) {
                    i3 = R.style.FullscreenEngagementMetadataHighlightsThreeColumn;
                }
                adHighlightLayout.b(i3);
                this.a.a(false);
            }
            aulq aulqVar = aqziVar.c;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aqrf aqrfVar = (aqrf) aulqVar.pX(ElementRendererOuterClass.elementRenderer);
            if (aqrfVar != null) {
                ajok ajokVar2 = new ajok();
                ajokVar2.g(new HashMap());
                ajokVar2.a(this.d);
                asht ashtVar = ajokVar.c;
                if (ashtVar != null) {
                    ajokVar2.c = ashtVar;
                }
                this.c.oB(ajokVar2, ajds.a(aqrfVar));
                this.a.addView(this.c.a());
            }
        }
    }
}
