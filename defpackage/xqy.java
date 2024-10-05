package defpackage;

import com.google.protos.youtube.api.innertube.CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xqy implements aaha {
    private final xqx a;
    private final acqz b;
    private final aahv c;
    private final aahd d;
    private final afsy e;

    public xqy(xqx xqxVar, acqz acqzVar, afsy afsyVar, aahv aahvVar, aahd aahdVar) {
        this.a = xqxVar;
        this.b = acqzVar;
        this.e = afsyVar;
        this.c = aahvVar;
        this.d = aahdVar;
    }

    private final acra b() {
        return this.b.mM();
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aoti aotiVar;
        CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint = (CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint) apxfVar.pX(CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.createCommentReplyDialogEndpoint);
        aahu a = this.c.a(this.e.c());
        if ((createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.b & 64) == 0 || createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.g.isEmpty() || (aotiVar = (aoti) a.f(createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.g).g(aoti.class).X()) == null || !aotiVar.getShouldRequireViewerAck().booleanValue()) {
            boolean z = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.f;
            if (z && b() != null) {
                b().q(new acqx(acsb.c(103918)), null);
                b().I(3, new acqx(acsb.c(104381)), null);
            }
            if ((createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.b & 128) != 0) {
                String str = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.i;
                this.a.a = str;
                wcy.v(a, str, true);
            }
            xqx xqxVar = this.a;
            xou xouVar = (xou) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xou.class);
            aqgt aqgtVar = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.c;
            if (aqgtVar == null) {
                aqgtVar = aqgt.a;
            }
            aqgt aqgtVar2 = aqgtVar;
            apxl apxlVar = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.d;
            if (apxlVar == null) {
                apxlVar = apxl.a;
            }
            apxl apxlVar2 = apxlVar;
            apxl apxlVar3 = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.e;
            if (apxlVar3 == null) {
                apxlVar3 = apxl.a;
            }
            xqxVar.a(xouVar, aqgtVar2, apxlVar2, apxlVar3, z);
            return;
        }
        aahd aahdVar = this.d;
        apxf apxfVar2 = createCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.h;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        aahdVar.a(apxfVar2);
    }
}
