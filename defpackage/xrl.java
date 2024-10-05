package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.UpdateCommentEndpointOuterClass$UpdateCommentEndpoint;
import com.google.protos.youtube.api.innertube.UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xrl implements aaha {
    public static final /* synthetic */ int b = 0;
    public final xnm a;
    private final aavy c;
    private final acqz d;
    private final ci e;
    private final Executor f;
    private final /* synthetic */ int g;

    public xrl(aavy aavyVar, xnm xnmVar, acqz acqzVar, ci ciVar, Executor executor, int i, byte[] bArr) {
        this.g = i;
        aavyVar.getClass();
        this.c = aavyVar;
        xnmVar.getClass();
        this.a = xnmVar;
        this.d = acqzVar;
        this.e = ciVar;
        this.f = executor;
    }

    private final acra b() {
        return this.d.mM();
    }

    private final acra c() {
        return this.d.mM();
    }

    public xrl(aavy aavyVar, xnm xnmVar, acqz acqzVar, ci ciVar, Executor executor, int i) {
        this.g = i;
        aavyVar.getClass();
        this.c = aavyVar;
        xnmVar.getClass();
        this.a = xnmVar;
        this.d = acqzVar;
        this.e = ciVar;
        this.f = executor;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        final byte[] bArr = null;
        int i = 0;
        if (this.g == 0) {
            final xqk xqkVar = (xqk) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xqk.class);
            if (xqkVar == null || !TextUtils.isEmpty(xqkVar.b())) {
                aavy aavyVar = this.c;
                aawf aawfVar = new aawf(aavyVar.f, aavyVar.a.c(), null, null, null);
                UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint = (UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint) apxfVar.pX(UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.updateCommentReplyEndpoint);
                aawfVar.a = aawf.i(updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.b);
                aawfVar.l(whl.G(apxfVar));
                if (apxfVar.pY(aupg.b)) {
                    aupf aupfVar = (aupf) apxfVar.pX(aupg.b);
                    if (!aupfVar.c.isEmpty()) {
                        aawfVar.n(aupfVar.c);
                    }
                }
                if (xqkVar != null) {
                    aawfVar.d(xqkVar.b());
                } else if (updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.d) {
                    aqyg aqygVar = updateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.c;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    StringBuilder sb = new StringBuilder();
                    while (i < aqygVar.c.size()) {
                        sb.append(((aqyi) aqygVar.c.get(i)).c);
                        i++;
                    }
                    aawfVar.d(sb.toString());
                    if (b() != null) {
                        b().I(3, new acqx(acsb.c(104380)), null);
                    }
                }
                ynm.n(this.e, this.c.i.b(aawfVar, this.f), new zfi() { // from class: xrj
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        xqk xqkVar2 = xqk.this;
                        Throwable th = (Throwable) obj;
                        int i2 = xrl.b;
                        if (xqkVar2 != null) {
                            xqkVar2.e((cnq) th);
                        }
                    }
                }, new zfi() { // from class: xrk
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        arlj arljVar;
                        xrl xrlVar = xrl.this;
                        xqk xqkVar2 = xqkVar;
                        armf armfVar = (armf) obj;
                        if (xqkVar2 != null) {
                            xqkVar2.f(armfVar);
                            return;
                        }
                        xnm xnmVar = xrlVar.a;
                        if ((armfVar.b & 8) != 0) {
                            arljVar = armfVar.g;
                            if (arljVar == null) {
                                arljVar = arlj.a;
                            }
                        } else {
                            arljVar = null;
                        }
                        xnmVar.a(arljVar, null);
                    }
                });
                return;
            }
            xqkVar.e(null);
            return;
        }
        final xql xqlVar = (xql) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xql.class);
        aavy aavyVar2 = this.c;
        aawg aawgVar = new aawg(aavyVar2.f, aavyVar2.a.c(), null, null, null);
        UpdateCommentEndpointOuterClass$UpdateCommentEndpoint updateCommentEndpointOuterClass$UpdateCommentEndpoint = (UpdateCommentEndpointOuterClass$UpdateCommentEndpoint) apxfVar.pX(UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.updateCommentEndpoint);
        aawgVar.a = aawg.i(updateCommentEndpointOuterClass$UpdateCommentEndpoint.b);
        aawgVar.l(whl.G(apxfVar));
        boolean z = map.containsKey("com.google.android.libraries.youtube.comment.update_comment_ignore_text_key") && ((Boolean) map.get("com.google.android.libraries.youtube.comment.update_comment_ignore_text_key")).booleanValue();
        if (xqlVar != null) {
            aawgVar.d(xqlVar.b(), z);
            aawgVar.b = xqlVar.a();
        } else if (updateCommentEndpointOuterClass$UpdateCommentEndpoint.d) {
            aqyg aqygVar2 = updateCommentEndpointOuterClass$UpdateCommentEndpoint.c;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            StringBuilder sb2 = new StringBuilder();
            while (i < aqygVar2.c.size()) {
                sb2.append(((aqyi) aqygVar2.c.get(i)).c);
                i++;
            }
            aawgVar.d(sb2.toString(), z);
            if (c() != null) {
                c().I(3, new acqx(acsb.c(104380)), null);
            }
        }
        ynm.n(this.e, this.c.h.b(aawgVar, this.f), new zfi() { // from class: xrg
            @Override // defpackage.zfi
            public final void a(Object obj) {
                xql xqlVar2 = xql.this;
                Throwable th = (Throwable) obj;
                int i2 = xrl.b;
                if (xqlVar2 != null) {
                    xqlVar2.c((cnq) th);
                }
            }
        }, new zfi(xqlVar, bArr) { // from class: xrh
            public final /* synthetic */ xql a;

            @Override // defpackage.zfi
            public final void a(Object obj) {
                arlj arljVar;
                xrl xrlVar = xrl.this;
                xql xqlVar2 = this.a;
                armi armiVar = (armi) obj;
                if (xqlVar2 != null) {
                    xqlVar2.d(armiVar);
                    return;
                }
                xnm xnmVar = xrlVar.a;
                if ((armiVar.b & 4) != 0) {
                    arljVar = armiVar.f;
                    if (arljVar == null) {
                        arljVar = arlj.a;
                    }
                } else {
                    arljVar = null;
                }
                xnmVar.a(arljVar, null);
            }
        });
    }
}
