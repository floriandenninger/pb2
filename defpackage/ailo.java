package defpackage;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ailo implements HttpResponseInterceptor {
    @Override // org.apache.http.HttpResponseInterceptor
    public final void process(HttpResponse httpResponse, HttpContext httpContext) {
        httpResponse.setHeader("Connection", "Close");
    }
}
