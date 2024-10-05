package defpackage;

import java.net.ServerSocket;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpRequestHandler;
import org.apache.http.protocol.HttpRequestHandlerRegistry;
import org.apache.http.protocol.HttpService;
import org.apache.http.protocol.ResponseContent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ailv {
    public final HttpParams a = new BasicHttpParams().setBooleanParameter("http.connection.stalecheck", false).setBooleanParameter("http.tcp.nodelay", true).setIntParameter("http.socket.buffer-size", 8192);
    public final HttpService b;
    public final aima c;
    public final boolean d;
    public ServerSocket e;
    public ExecutorService f;
    private final HttpRequestHandlerRegistry g;

    public ailv(Map map, boolean z) {
        aima b = b();
        this.c = b;
        this.d = z;
        BasicHttpProcessor basicHttpProcessor = new BasicHttpProcessor();
        basicHttpProcessor.addInterceptor(b);
        basicHttpProcessor.addInterceptor(new ResponseContent());
        basicHttpProcessor.addInterceptor(new ailo());
        this.g = new HttpRequestHandlerRegistry();
        for (Map.Entry entry : ((amrz) map).entrySet()) {
            this.g.register((String) entry.getKey(), (HttpRequestHandler) entry.getValue());
        }
        HttpService httpService = new HttpService(basicHttpProcessor, new NoConnectionReuseStrategy(), new DefaultHttpResponseFactory());
        this.b = httpService;
        httpService.setHandlerResolver(this.g);
        httpService.setParams(this.a);
    }

    private static aima b() {
        try {
            return new aima();
        } catch (NoSuchAlgorithmException e) {
            zga.n("NoSuchAlgorithmException starting MediaServer", e);
            return new aima();
        }
    }

    public final ailt a(String str, String str2, int i, String str3, long j, long j2) {
        ailt ailtVar = new ailt(this, str);
        ailtVar.b("v", str2);
        ailtVar.b("i", Integer.toString(i));
        ailtVar.b("x", str3);
        ailtVar.c("l", j);
        ailtVar.c("m", j2);
        return ailtVar;
    }
}
