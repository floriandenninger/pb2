package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayma implements aycx {
    public final InetSocketAddress b;
    public static final Logger a = Logger.getLogger(ayma.class.getName());
    private static final ayeq d = new ayeq();
    private static final amnv c = new jgc(5);

    public ayma() {
        amnv amnvVar = c;
        ayeq ayeqVar = d;
        String str = System.getenv("GRPC_PROXY_EXP");
        amnvVar.getClass();
        ayeqVar.getClass();
        if (str == null) {
            this.b = null;
            return;
        }
        String[] split = str.split(":", 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.b = new InetSocketAddress(split[0], parseInt);
    }

    public static final aycw a(InetSocketAddress inetSocketAddress) {
        try {
            try {
                URI uri = new URI("https", null, ayiu.d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = ProxySelector.getDefault();
                if (proxySelector == null) {
                    a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication b = ayeq.b(ayiu.d(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                ayas a2 = ayat.a();
                a2.c(inetSocketAddress);
                a2.b(inetSocketAddress2);
                if (b == null) {
                    return a2.a();
                }
                a2.a = b.getUserName();
                a2.b = b.getPassword() != null ? new String(b.getPassword()) : null;
                return a2.a();
            } catch (URISyntaxException e) {
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
                return null;
            }
        } catch (Throwable th) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
