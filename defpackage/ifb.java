package defpackage;

import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ifb implements aaha {
    private final ysy a;
    private final lrw b;
    private final inp c;

    public ifb(ysy ysyVar, lrw lrwVar, inp inpVar) {
        this.a = ysyVar;
        this.b = lrwVar;
        this.c = inpVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Optional empty;
        amkq.E(apxfVar.pY(ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.showSfvElementsBottomSheetCommand));
        if (!this.a.o()) {
            this.b.b();
            return;
        }
        ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand = (ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand) apxfVar.pX(ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.showSfvElementsBottomSheetCommand);
        if (this.c.I()) {
            this.c.z();
        }
        if (map != null) {
            empty = Optional.ofNullable((ajok) map.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext"));
        } else {
            empty = Optional.empty();
        }
        inp inpVar = this.c;
        aulq aulqVar = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aqyg aqygVar = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        float f = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.d;
        float f2 = showSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.e;
        if (aulqVar == null || !aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
            afsi.b(2, 24, "Creation bottom sheet without valid renderer");
            return;
        }
        if (aqygVar == null) {
            afsi.b(2, 24, "Creation bottom sheet without valid title");
            return;
        }
        if (inpVar.i == 0) {
            inpVar.i = inpVar.d.b();
        }
        inpVar.D(f);
        inpVar.C(f2);
        inpVar.E(inpVar.f);
        inpVar.g = aqygVar;
        inpVar.G();
        aqrf aqrfVar = (aqrf) aulqVar.pX(ElementRendererOuterClass.elementRenderer);
        ajfh ajfhVar = inpVar.a;
        ajds a = ajds.a(aqrfVar);
        if (!empty.isPresent()) {
            empty = Optional.of(ahbw.o(inpVar.b.a()));
        }
        if (empty.isPresent() && ((ajok) empty.get()).a == acra.l) {
            ((ajok) empty.get()).a(inpVar.e.mM());
        }
        inpVar.b.oB((ajok) empty.get(), a);
        inpVar.c.removeAllViews();
        inpVar.c.addView(inpVar.b.a());
    }
}
