package defpackage;

import com.google.protos.youtube.api.innertube.UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xrm implements aaha {
    private final xoh a;
    private final acqz b;
    private final aahv c;
    private final afsy d;

    public xrm(xoh xohVar, acqz acqzVar, aahv aahvVar, afsy afsyVar) {
        xohVar.getClass();
        this.a = xohVar;
        this.b = acqzVar;
        this.c = aahvVar;
        this.d = afsyVar;
    }

    private final acra b() {
        return this.b.mM();
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        apzd apzdVar;
        apzd apzdVar2;
        UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint = (UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint) apxfVar.pX(UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.updateCommentReplyDialogEndpoint);
        if (updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.d && b() != null) {
            b().I(3, new acqx(acsb.c(104381)), null);
        }
        avsa avsaVar = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.c;
        if (avsaVar == null) {
            avsaVar = avsa.a;
        }
        if (avsaVar.b != 97806346) {
            zga.b("Executed UpdateCommentReplyDialogEndpoint with no CommentReplyDialogRenderer.");
            return;
        }
        boolean z = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.d;
        Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (!(s instanceof xov) || !(s instanceof xnn)) {
            if ((updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.b & 16) != 0) {
                String str = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.e;
                this.a.k = str;
                wcy.v(this.c.a(this.d.c()), str, true);
            }
            xoh xohVar = this.a;
            avsa avsaVar2 = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.c;
            if (avsaVar2 == null) {
                avsaVar2 = avsa.a;
            }
            if (avsaVar2.b == 97806346) {
                apzdVar = (apzd) avsaVar2.c;
            } else {
                apzdVar = apzd.a;
            }
            xohVar.o(apzdVar, null, null, z);
            return;
        }
        xoh xohVar2 = this.a;
        avsa avsaVar3 = updateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.c;
        if (avsaVar3 == null) {
            avsaVar3 = avsa.a;
        }
        if (avsaVar3.b == 97806346) {
            apzdVar2 = (apzd) avsaVar3.c;
        } else {
            apzdVar2 = apzd.a;
        }
        xohVar2.o(apzdVar2, ((xov) s).e(), ((xnn) s).d(), false);
    }
}
