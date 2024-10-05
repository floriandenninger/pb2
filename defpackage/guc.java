package defpackage;

import com.google.protos.youtube.api.innertube.OpenAdsWebViewInBrowserCommandOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class guc implements aaha {
    private final amsj a;

    public guc(amsj amsjVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        amsjVar.getClass();
        this.a = amsjVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(OpenAdsWebViewInBrowserCommandOuterClass.openAdsWebViewInBrowserCommand)) {
            atso atsoVar = (atso) apxfVar.pX(OpenAdsWebViewInBrowserCommandOuterClass.openAdsWebViewInBrowserCommand);
            amsj amsjVar = this.a;
            euh euhVar = (euh) amsjVar.a.get(atsoVar.b);
            if (euhVar == null) {
                return;
            }
            euhVar.d();
        }
    }
}
