package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ytq extends UrlRequest.Callback {
    public final ytz a;
    public boolean b;
    public Object c;
    public boolean d;
    public boolean e;
    private final boolean f;
    private final ytt g;
    private yuc h;
    private IOException i;

    /* JADX INFO: Access modifiers changed from: protected */
    public ytq(ytz ytzVar, boolean z, ytt yttVar) {
        this.a = ytzVar;
        this.f = z;
        this.g = yttVar;
    }

    protected static /* synthetic */ Object b(UrlResponseInfo urlResponseInfo, InputStream inputStream) {
        Integer num;
        abgu c = yse.c();
        c.c(urlResponseInfo.getAllHeadersAsList());
        yse a = c.a();
        ysp yspVar = new ysp();
        yspVar.b = Integer.valueOf(urlResponseInfo.getHttpStatusCode());
        String httpStatusText = urlResponseInfo.getHttpStatusText();
        if (httpStatusText != null) {
            yspVar.c = httpStatusText;
            abgu c2 = yse.c();
            c2.c(urlResponseInfo.getAllHeadersAsList());
            yspVar.d = c2.a();
            String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
            if (negotiatedProtocol == null || negotiatedProtocol.isEmpty()) {
                negotiatedProtocol = "HTTP/1.1";
            }
            yspVar.a = negotiatedProtocol;
            if (inputStream != null) {
                String a2 = a.a("Content-Type");
                String a3 = a.a("content-encoding");
                String str = "-1";
                if ((a3 == null || "identity".equals(a3)) && a.a("transfer-encoding") == null) {
                    str = a.a("content-length");
                }
                yso ysoVar = new yso(a2, str);
                ysoVar.b = inputStream;
                yspVar.e = ysoVar;
            } else {
                yspVar.e = yso.a;
            }
            String str2 = yspVar.a;
            if (str2 == null || (num = yspVar.b) == null || yspVar.c == null || yspVar.d == null) {
                StringBuilder sb = new StringBuilder();
                if (yspVar.a == null) {
                    sb.append(" protocol");
                }
                if (yspVar.b == null) {
                    sb.append(" statusCode");
                }
                if (yspVar.c == null) {
                    sb.append(" reasonPhrase");
                }
                if (yspVar.d == null) {
                    sb.append(" headers");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            return new ysq(str2, num.intValue(), yspVar.c, yspVar.d, yspVar.e);
        }
        throw new NullPointerException("Null reasonPhrase");
    }

    private final void c(IOException iOException) {
        this.a.a();
        this.d = true;
        this.i = iOException;
        yuc yucVar = this.h;
        if (yucVar != null) {
            yucVar.a = null;
        }
    }

    public final void a() {
        IOException iOException = this.i;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.a();
        c(this.e ? null : yua.a);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.a();
        Throwable cause = cronetException.getCause();
        IOException iOException = cronetException;
        if (cause instanceof IOException) {
            iOException = (IOException) cause;
        }
        c(iOException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.a.a();
        if (this.h == null) {
            c(new IOException());
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        try {
            if (this.f) {
                if (this.g.d != null) {
                    whl.z(str);
                }
                urlRequest.followRedirect();
            } else {
                this.a.a();
                this.c = b(urlResponseInfo, null);
                this.b = true;
                this.e = true;
                urlRequest.cancel();
            }
        } catch (IOException e) {
            c(e);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.a();
        yuc yucVar = new yuc(urlRequest, this);
        this.h = yucVar;
        this.c = b(urlResponseInfo, yucVar);
        this.b = true;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.a();
        c(null);
    }
}
