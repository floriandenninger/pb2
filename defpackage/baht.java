package defpackage;

import android.util.Log;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baht implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ CronetException b;
    final /* synthetic */ bahu c;

    public baht(bahu bahuVar, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.c = bahuVar;
        this.a = urlResponseInfo;
        this.b = cronetException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bahu bahuVar = this.c;
            bahuVar.a.onFailed(bahuVar.d, this.a, this.b);
        } catch (Exception e) {
            Log.e(bahx.a, "Exception in onFailed method", e);
        }
    }
}
