package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.CommentUserFeedbackEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UserFeedbackEndpointOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xqq implements aaha {
    public final Activity a;
    public final aloh b;
    private final akrh c;
    private final /* synthetic */ int d;

    public xqq(Activity activity, aloh alohVar, akrh akrhVar, int i, byte[] bArr) {
        this.d = i;
        this.a = activity;
        this.b = alohVar;
        this.c = akrhVar;
    }

    private final acra b() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof acqz) {
            return ((acqz) componentCallbacks2).mM();
        }
        return null;
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, Map map) {
        final byte[] bArr = null;
        if (this.d == 0) {
            final aqad aqadVar = (aqad) apxfVar.pX(CommentUserFeedbackEndpointOuterClass.commentUserFeedbackEndpoint);
            if (aqadVar.e && b() != null) {
                b().I(3, new acqx(acsb.c(104382)), null);
            }
            this.c.b(new akrg() { // from class: xqp
                @Override // defpackage.akrg
                public final void a(Bundle bundle) {
                    xqq xqqVar = xqq.this;
                    aqad aqadVar2 = aqadVar;
                    for (avur avurVar : aqadVar2.b) {
                        avus avusVar = avurVar.c;
                        if (avusVar == null) {
                            avusVar = avus.a;
                        }
                        if ((avurVar.b & 1) != 0) {
                            bundle.putString(avusVar.b, avusVar.c);
                        }
                    }
                    String str = aqadVar2.d;
                    if (str != null && !str.isEmpty()) {
                        str = str.concat("\n \n");
                    }
                    xqqVar.b.d(yjk.Q(xqqVar.a), bundle, aqadVar2.c, str);
                }
            });
            return;
        }
        this.c.b(new akrg(apxfVar, bArr) { // from class: ezs
            public final /* synthetic */ apxf a;

            @Override // defpackage.akrg
            public final void a(Bundle bundle) {
                xqq xqqVar = xqq.this;
                avuq avuqVar = (avuq) this.a.pX(UserFeedbackEndpointOuterClass.userFeedbackEndpoint);
                for (avur avurVar : avuqVar.b) {
                    avus avusVar = avurVar.c;
                    if (avusVar == null) {
                        avusVar = avus.a;
                    }
                    if ((avurVar.b & 1) != 0) {
                        bundle.putString(avusVar.b, avusVar.c);
                    }
                }
                xqqVar.b.c(yjk.Q(xqqVar.a), bundle, avuqVar.c);
            }
        });
    }
}
