package defpackage;

import android.net.Uri;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ailn implements HttpRequestHandler {
    protected abstract void a(Uri uri, Header header, HttpResponse httpResponse);

    @Override // org.apache.http.protocol.HttpRequestHandler
    public final void handle(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        try {
            String method = httpRequest.getRequestLine().getMethod();
            if (!whl.A(1).equalsIgnoreCase(method)) {
                String valueOf = String.valueOf(method);
                throw new MethodNotSupportedException(valueOf.length() != 0 ? "Method not supported: ".concat(valueOf) : new String("Method not supported: "));
            }
            a(Uri.parse(httpRequest.getRequestLine().getUri()), httpRequest.getLastHeader("Range"), httpResponse);
        } catch (RuntimeException e) {
            throw new HttpException("Internal error while handling request.", e);
        }
    }
}
