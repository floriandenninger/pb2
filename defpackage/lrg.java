package defpackage;

import android.util.Log;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lrg implements aaha {
    public static final /* synthetic */ int a = 0;
    private static final String b = "lrg";
    private final aahd c;
    private final jgp d;

    public lrg(jgp jgpVar, aahd aahdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.d = jgpVar;
        this.c = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        ShareEndpointOuterClass$ShareEntityEndpoint shareEndpointOuterClass$ShareEntityEndpoint = (ShareEndpointOuterClass$ShareEntityEndpoint) apxfVar.pX(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint);
        int bv = aobq.bv(shareEndpointOuterClass$ShareEntityEndpoint.e);
        if (bv == 0) {
            bv = 2;
        }
        int i = bv - 1;
        if (i == 0) {
            throw new AssertionError("Unspecified share panel type");
        }
        if (i == 1) {
            this.d.f(grj.a).kE(apxfVar, map);
            return;
        }
        if (i == 3) {
            throw new AssertionError("Web player share panel type not supported");
        }
        if ((shareEndpointOuterClass$ShareEntityEndpoint.b & 16) == 0) {
            Log.e(b, "Command not in share entity endpoint proto.");
            return;
        }
        aahd aahdVar = this.c;
        apxf apxfVar2 = shareEndpointOuterClass$ShareEntityEndpoint.f;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        aahdVar.a(apxfVar2);
    }
}
