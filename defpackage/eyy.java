package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyy implements aaha {
    public final akbu a;

    public eyy(akbu akbuVar) {
        this.a = akbuVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        ajwx ajwxVar = (ajwx) yjj.u(map, "sectionListController", ajwx.class);
        if (ajwxVar == null) {
            return;
        }
        final ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint = (ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint) apxfVar.pX(ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.scrollToSectionEndpoint);
        Runnable runnable = (scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.b & 2) != 0 ? new Runnable() { // from class: eyx
            @Override // java.lang.Runnable
            public final void run() {
                eyy eyyVar = eyy.this;
                ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint2 = scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint;
                akbu akbuVar = eyyVar.a;
                String str = scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint2.d;
                akbuVar.a();
                akbt akbtVar = (akbt) akbuVar.d.get(str);
                if (akbtVar == null) {
                    return;
                }
                View view = (View) akbtVar.d.get();
                arej arejVar = (arej) akbtVar.a.get();
                acra acraVar = (acra) akbtVar.b.get();
                akbl akblVar = (akbl) akbtVar.c.get();
                if (view != null && arejVar != null && view.isShown() && view.isAttachedToWindow()) {
                    akbuVar.e(arejVar, view, null, acraVar, akbuVar.b, true, akblVar);
                } else {
                    akbuVar.d.remove(str);
                }
            }
        } : null;
        if (ajwxVar.v(scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.c, scrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.e, runnable) || runnable == null) {
            return;
        }
        runnable.run();
    }
}
