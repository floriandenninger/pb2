package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class atx extends UrlRequest.Callback {
    final /* synthetic */ aty a;

    public atx(aty atyVar) {
        this.a = atyVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (urlRequest != this.a.e) {
            return;
        }
        if ((cronetException instanceof NetworkException) && ((NetworkException) cronetException).getErrorCode() == 1) {
            this.a.h = new UnknownHostException();
        } else {
            this.a.h = cronetException;
        }
        this.a.j.e();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        aty atyVar = this.a;
        if (urlRequest != atyVar.e) {
            return;
        }
        atyVar.j.e();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        UrlRequest urlRequest2 = this.a.e;
        if (urlRequest != urlRequest2) {
            return;
        }
        pse.c(urlRequest2);
        ath athVar = this.a.f;
        pse.c(athVar);
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        String str2 = null;
        if (athVar.c == 2) {
            if (httpStatusCode != 307) {
                if (httpStatusCode == 308) {
                    httpStatusCode = 308;
                }
            }
            aty atyVar = this.a;
            urlResponseInfo.getHttpStatusText();
            Map allHeaders = urlResponseInfo.getAllHeaders();
            int i = pts.a;
            atyVar.h = new atp(httpStatusCode, null, allHeaders, athVar);
            this.a.j.e();
            return;
        }
        aty atyVar2 = this.a;
        if (atyVar2.c) {
            atyVar2.p();
        }
        if (!this.a.d || athVar.c != 2 || httpStatusCode != 302) {
            urlRequest.followRedirect();
            return;
        }
        List list = (List) urlResponseInfo.getAllHeaders().get("Set-Cookie");
        if (list != null && !list.isEmpty()) {
            str2 = TextUtils.join(";", list);
        }
        urlRequest2.cancel();
        try {
            UrlRequest.Builder o = this.a.o(athVar.d(Uri.parse(str)));
            if (!TextUtils.isEmpty(str2)) {
                o.addHeader("Cookie", str2);
            }
            this.a.e = o.build();
            this.a.e.start();
        } catch (IOException e) {
            this.a.h = e;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        aty atyVar = this.a;
        if (urlRequest != atyVar.e) {
            return;
        }
        atyVar.g = urlResponseInfo;
        atyVar.j.e();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        aty atyVar = this.a;
        if (urlRequest != atyVar.e) {
            return;
        }
        atyVar.i = true;
        atyVar.j.e();
    }
}
