package defpackage;

import com.google.protos.youtube.api.innertube.SectionListRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ifk implements aaha {
    private final ifz a;

    public ifk(ifz ifzVar) {
        this.a = ifzVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        auov auovVar;
        aulq aulqVar;
        if (apxfVar.pY(ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.showReelsCommentsOverlayCommand)) {
            if (((ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand) apxfVar.pX(ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.showReelsCommentsOverlayCommand)).b == 1) {
                ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand = (ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand) apxfVar.pX(ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.showReelsCommentsOverlayCommand);
                if (showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.b == 1) {
                    aulqVar = (aulq) showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.c;
                } else {
                    aulqVar = aulq.a;
                }
                auovVar = (auov) aulqVar.pX(SectionListRendererOuterClass.sectionListRenderer);
            } else {
                auovVar = null;
            }
            final ifz ifzVar = this.a;
            if (ifzVar.h.ar() || ifzVar.i != null) {
                return;
            }
            ifzVar.f.A(ifzVar.e.mM());
            ifzVar.g.h();
            ifzVar.d.c();
            ifzVar.g.M(new aamd(auovVar));
            ifzVar.i = ifzVar.a.getSupportFragmentManager().k();
            ifzVar.i.v(new Runnable() { // from class: ify
                @Override // java.lang.Runnable
                public final void run() {
                    ifz.this.i = null;
                }
            });
            ifzVar.h.aI(ifzVar.i, ifzVar.b, "REEL_COMMENT_VIEW_TAG");
            ifzVar.c.a();
            ifzVar.g.l();
        }
    }
}
