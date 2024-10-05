package defpackage;

import com.google.protos.youtube.api.innertube.UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aawt implements afwx {
    final /* synthetic */ apxf a;
    final /* synthetic */ Map b;
    final /* synthetic */ aqwl c;
    final /* synthetic */ aaww d;

    public aawt(aaww aawwVar, apxf apxfVar, Map map, aqwl aqwlVar) {
        this.d = aawwVar;
        this.a = apxfVar;
        this.b = map;
        this.c = aqwlVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.d.c.d(new aawx(this.a, yjj.s(this.b, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
        aqwl aqwlVar = this.c;
        if (aqwlVar == null || (aqwlVar.b & 32) == 0) {
            this.d.g.e(cnqVar);
            return;
        }
        aahd aahdVar = this.d.d;
        apxf apxfVar = aqwlVar.h;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, this.b);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arqe arqeVar = (arqe) obj;
        this.d.c.d(new aawx(this.a, yjj.s(this.b, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
        Object s = yjj.s(this.b, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (s instanceof afwx) {
            ((afwx) s).kZ(arqeVar);
        }
        aqwl aqwlVar = this.c;
        if (aqwlVar != null) {
            if (aqwlVar.f.size() > 0) {
                for (apxf apxfVar : this.c.f) {
                    aaww aawwVar = this.d;
                    aawwVar.d.c(aawwVar.e.a(apxfVar, arqeVar), this.b);
                }
            }
            aqwm aqwmVar = this.c.i;
            if (aqwmVar == null) {
                aqwmVar = aqwm.a;
            }
            if (aqwmVar.b) {
                this.d.c.d(new aaxa(this.a, s));
            }
            if (arqeVar.d.size() > 0) {
                this.d.d.d(arqeVar.d, this.b);
            }
        } else if (this.a.pY(UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.undoFeedbackEndpoint)) {
            this.d.c.d(new aaxb(this.a, s, yjj.s(this.b, "feedback_undo")));
            aony aonyVar = ((UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint) this.a.pX(UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.undoFeedbackEndpoint)).c;
            if (aonyVar.size() > 0) {
                this.d.d.d(aonyVar, this.b);
            }
        }
        this.d.f.a(arqeVar, s);
        this.d.b(arqeVar.e);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
