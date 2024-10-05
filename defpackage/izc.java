package defpackage;

import com.google.protos.youtube.api.innertube.ShowContentPillActionOuterClass$ShowContentPillAction;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class izc implements aaha {
    private final gdz a;

    public izc(gdz gdzVar) {
        this.a = gdzVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqet aqetVar;
        autr autrVar = ((ShowContentPillActionOuterClass$ShowContentPillAction) apxfVar.pX(ShowContentPillActionOuterClass$ShowContentPillAction.showContentPillAction)).c;
        if (autrVar == null) {
            autrVar = autr.a;
        }
        if (autrVar.b == 127508420 && this.a.d()) {
            gdz gdzVar = this.a;
            if (autrVar.b == 127508420) {
                aqetVar = (aqet) autrVar.c;
            } else {
                aqetVar = aqet.a;
            }
            this.a.f(gdzVar.g(aqetVar), true);
        }
    }
}
