package defpackage;

import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aaww implements aaha {
    public static final aawu a = aawr.a;
    public static final aawv b = new aawv() { // from class: aaws
        @Override // defpackage.aawv
        public final void a(arqe arqeVar, Object obj) {
            aawu aawuVar = aaww.a;
        }
    };
    public final ypa c;
    public final aahd d;
    public final aawu e;
    public final aawv f;
    public final zaw g;
    private final aaxn h;

    public aaww(aaxn aaxnVar, ypa ypaVar, aahd aahdVar, aawu aawuVar, aawv aawvVar, zaw zawVar, byte[] bArr) {
        aaxnVar.getClass();
        this.h = aaxnVar;
        ypaVar.getClass();
        this.c = ypaVar;
        aahdVar.getClass();
        this.d = aahdVar;
        aawuVar.getClass();
        this.e = aawuVar;
        aawvVar.getClass();
        this.f = aawvVar;
        this.g = zawVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(aomf aomfVar) {
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aawz f = this.h.f();
        aqwl aqwlVar = apxfVar.pY(FeedbackEndpointOuterClass.feedbackEndpoint) ? (aqwl) apxfVar.pX(FeedbackEndpointOuterClass.feedbackEndpoint) : null;
        f.d(aqwlVar != null ? aqwlVar.e : ((UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint) apxfVar.pX(UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.undoFeedbackEndpoint)).b);
        List list = (List) yjj.u(map, "feedback_token", List.class);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f.d((String) it.next());
            }
        }
        if (((Boolean) yjj.t(map, "feedback_merge_token", false)).booleanValue()) {
            f.e(true);
        }
        if (((Boolean) yjj.t(map, "feedback_unencrypted", false)).booleanValue()) {
            f.b = true;
        }
        if (aqwlVar != null) {
            f.a = aqwlVar.g;
            if (aqwlVar.c == 7) {
                f.c = Long.valueOf(((Long) aqwlVar.d).longValue());
            }
        }
        if (apxfVar.pY(aupg.b)) {
            aupf aupfVar = (aupf) apxfVar.pX(aupg.b);
            if (!aupfVar.c.isEmpty()) {
                f.n(aupfVar.c);
            }
        }
        f.m(whl.G(apxfVar).I());
        this.c.d(new aawy(apxfVar, yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
        this.h.b.e(f, new aawt(this, apxfVar, map, aqwlVar));
    }
}
