package defpackage;

import android.util.Log;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bahs implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ bahu b;
    private final /* synthetic */ int c;

    public bahs(bahu bahuVar, UrlResponseInfo urlResponseInfo, int i) {
        this.c = i;
        this.b = bahuVar;
        this.a = urlResponseInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            try {
                bahu bahuVar = this.b;
                bahuVar.a.onSucceeded(bahuVar.d, this.a);
                return;
            } catch (Exception e) {
                Log.e(bahx.a, "Exception in onSucceeded method", e);
                return;
            }
        }
        try {
            bahu bahuVar2 = this.b;
            bahuVar2.a.onCanceled(bahuVar2.d, this.a);
        } catch (Exception e2) {
            Log.e(bahx.a, "Exception in onCanceled method", e2);
        }
    }
}
