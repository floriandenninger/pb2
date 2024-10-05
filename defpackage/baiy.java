package defpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baiy extends UrlRequest.Callback {
    final /* synthetic */ baiz a;

    public baiy(baiz baizVar) {
        this.a = baizVar;
    }

    private final void a(IOException iOException) {
        baiz baizVar = this.a;
        baizVar.f = iOException;
        bajb bajbVar = baizVar.c;
        if (bajbVar != null) {
            bajbVar.c = iOException;
            bajbVar.a = true;
            bajbVar.b = null;
        }
        bajc bajcVar = baizVar.d;
        if (bajcVar != null) {
            bajcVar.d = iOException;
            bajcVar.e = true;
        }
        baizVar.n = true;
        this.a.a.c();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.e = urlResponseInfo;
        a(new IOException("disconnect() called"));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (cronetException != null) {
            this.a.e = urlResponseInfo;
            a(cronetException);
            return;
        }
        throw new IllegalStateException("Exception cannot be null in onFailed.");
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        baiz baizVar = this.a;
        baizVar.e = urlResponseInfo;
        baizVar.a.c();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        URL url;
        boolean z;
        boolean z2;
        this.a.g = true;
        try {
            URL url2 = new URL(str);
            String protocol = url2.getProtocol();
            url = this.a.url;
            boolean equals = protocol.equals(url.getProtocol());
            z = this.a.instanceFollowRedirects;
            if (z) {
                this.a.url = url2;
            }
            z2 = this.a.instanceFollowRedirects;
            if (z2 && equals) {
                this.a.b.followRedirect();
                return;
            }
        } catch (MalformedURLException unused) {
        }
        baiz baizVar = this.a;
        baizVar.e = urlResponseInfo;
        baizVar.b.cancel();
        a(null);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        baiz baizVar = this.a;
        baizVar.e = urlResponseInfo;
        baizVar.n = true;
        this.a.a.c();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.e = urlResponseInfo;
        a(null);
    }
}
