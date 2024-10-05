package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.protos.youtube.api.innertube.SectionListRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yja implements ajom, ajxa, ajwk {
    public final RecyclerView a;
    private final ajwi b;
    private aamd c;

    /* JADX WARN: Type inference failed for: r10v0, types: [ajos, java.lang.Object] */
    public yja(Context context, acra acraVar, ajoy ajoyVar, aasm aasmVar, ypa ypaVar, ajvd ajvdVar, zaw zawVar, azrw azrwVar, aaea aaeaVar, aypn aypnVar) {
        RecyclerView recyclerView = new RecyclerView(context);
        this.a = recyclerView;
        recyclerView.af(new LinearLayoutManager());
        this.b = new ajwi(null, recyclerView, ajoyVar, new ajvq(), aasmVar, ypaVar, ajvdVar, zawVar, acraVar, ((ajvb) azrwVar.get()).get(), this, this, aaeaVar, aypnVar);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajwk
    public final void c(int i) {
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, auxf auxfVar) {
        acra acraVar = ajokVar.a;
        aulq aulqVar = auxfVar.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(SectionListRendererOuterClass.sectionListRenderer)) {
            aulq aulqVar2 = auxfVar.c;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            aamd aamdVar = new aamd((auov) aulqVar2.pX(SectionListRendererOuterClass.sectionListRenderer));
            this.c = aamdVar;
            this.b.M(aamdVar);
            acraVar.u(new acqx(auxfVar.d), null);
        }
    }

    @Override // defpackage.ajxa
    public final void lo() {
        this.b.lo();
    }

    @Override // defpackage.ajxa
    public final boolean lp() {
        return false;
    }
}
