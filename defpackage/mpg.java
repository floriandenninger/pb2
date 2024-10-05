package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpg implements ajom {
    public final View a;
    public final mpf b = new mpf(this);
    public RecyclerView c;
    private final akbu d;

    public mpg(Context context, akbu akbuVar) {
        this.d = akbuVar;
        View view = new View(context);
        this.a = view;
        view.setMinimumHeight(1);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.post(new mpe(this, 1));
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        area areaVar = (area) obj;
        aulq aulqVar = areaVar.b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        arej arejVar = (arej) ahbj.n(aulqVar, HintRendererOuterClass.hintRenderer);
        if (arejVar == null) {
            return;
        }
        Object c = ajokVar.c("sectionListController");
        RecyclerView recyclerView = c instanceof ajwi ? ((ajwi) c).K : null;
        this.c = recyclerView;
        if (recyclerView != null) {
            recyclerView.post(new mpe(this, 0));
        }
        this.d.b(arejVar, this.a, areaVar, ajokVar.a);
    }
}
