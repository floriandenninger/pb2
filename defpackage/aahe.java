package defpackage;

import com.google.protos.youtube.api.innertube.AdFeedbackEndpointOuterClass$AdFeedbackEndpoint;
import com.google.protos.youtube.api.innertube.PingingEndpointOuterClass$PingingEndpoint;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aahe {
    static final List a = amru.s(atmb.b, aupg.b);

    /* JADX WARN: Multi-variable type inference failed */
    public static Object a(apxf apxfVar) {
        if (!apxfVar.pY(PingingEndpointOuterClass$PingingEndpoint.pingingEndpoint) || !apxfVar.pY(AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.adFeedbackEndpoint)) {
            amxe it = ((amru) a).iterator();
            aong aongVar = null;
            while (it.hasNext()) {
                aomu aomuVar = (aomu) it.next();
                if (apxfVar.pY(aomuVar)) {
                    if (aongVar == null) {
                        aongVar = (aong) apxfVar.toBuilder();
                    }
                    aongVar.d(aomuVar);
                }
            }
            apxf apxfVar2 = aongVar != null ? (apxf) aongVar.build() : apxfVar;
            if (apxfVar2.equals(apxf.a)) {
                return null;
            }
            try {
                return apxfVar.pX(aomw.b().d(apxf.a, amkq.cK(apxfVar2)));
            } catch (Exception unused) {
                return null;
            }
        }
        return apxfVar.pX(AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.adFeedbackEndpoint);
    }
}
