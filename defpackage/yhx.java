package defpackage;

import com.google.protos.youtube.api.innertube.WebviewAuthCommand$WebViewAuthCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yhx implements aaha {
    private final yhk a;

    public yhx(yhk yhkVar) {
        this.a = yhkVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(WebviewAuthCommand$WebViewAuthCommand.webViewAuthCommand)) {
            WebviewAuthCommand$WebViewAuthCommand webviewAuthCommand$WebViewAuthCommand = (WebviewAuthCommand$WebViewAuthCommand) apxfVar.pX(WebviewAuthCommand$WebViewAuthCommand.webViewAuthCommand);
            int K = awxr.K(webviewAuthCommand$WebViewAuthCommand.c);
            if (K == 0) {
                K = 1;
            }
            int i = K - 1;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.a.a();
            } else if ((webviewAuthCommand$WebViewAuthCommand.b & 2) != 0) {
                this.a.b(webviewAuthCommand$WebViewAuthCommand.d, null, null);
            }
        }
    }
}
