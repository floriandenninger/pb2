package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jwb {
    public final jws a;
    public final jvz b;
    private final fiu c;

    public jwb(jws jwsVar, jvz jvzVar, fiu fiuVar) {
        this.a = jwsVar;
        this.b = jvzVar;
        this.c = fiuVar;
    }

    public final void a(final String str) {
        zhq.m(str);
        this.c.b().G(new fjx(str, 5)).V(new ayrs() { // from class: jwa
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                jwb jwbVar = jwb.this;
                String str2 = str;
                if (((Boolean) obj).booleanValue()) {
                    jwbVar.a.d(R.string.offline_actions_video_deleted_snackbar_text);
                    return;
                }
                jvz jvzVar = jwbVar.b;
                amkq.E(!TextUtils.isEmpty(str2));
                ci ciVar = jvzVar.a;
                aone createBuilder = atdc.a.createBuilder();
                aalw aalwVar = jvzVar.b;
                aone createBuilder2 = OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.a.createBuilder();
                createBuilder2.copyOnWrite();
                OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder2.instance;
                str2.getClass();
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c = 1;
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d = str2;
                OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint2 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder2.build();
                aone createBuilder3 = atda.a.createBuilder();
                aone createBuilder4 = atde.a.createBuilder();
                aong aongVar = (aong) apxf.a.createBuilder();
                aongVar.e(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, offlineVideoEndpointOuterClass$OfflineVideoEndpoint2);
                createBuilder4.copyOnWrite();
                atde atdeVar = (atde) createBuilder4.instance;
                apxf apxfVar = (apxf) aongVar.build();
                apxfVar.getClass();
                atdeVar.e = apxfVar;
                atdeVar.b |= 8;
                createBuilder3.copyOnWrite();
                atda atdaVar = (atda) createBuilder3.instance;
                atde atdeVar2 = (atde) createBuilder4.build();
                atdeVar2.getClass();
                atdaVar.d = atdeVar2;
                atdaVar.b |= 2;
                createBuilder.aD(aalwVar.a((atda) createBuilder3.build(), null));
                ajxw.c(ciVar, (atdc) createBuilder.build(), jvzVar.c, jvzVar.d, amvo.b);
            }
        });
    }
}
