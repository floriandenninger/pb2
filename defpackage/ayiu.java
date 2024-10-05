package defpackage;

import io.grpc.Status;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayiu {
    public static final ayca a;
    public static final ayca b;
    public static final ayca c;
    public static final ayca d;
    public static final ayca e;
    static final ayca f;
    public static final ayca g;
    public static final ayca h;
    public static final ayca i;
    public static final aycx j;
    public static final axzn k;
    public static final aynx l;
    public static final aynx m;
    public static final amnv n;
    private static final Logger o = Logger.getLogger(ayiu.class.getName());
    private static final ayep p;

    static {
        Charset.forName("US-ASCII");
        a = ayca.c("grpc-timeout", new ayit(0));
        b = ayca.c("grpc-encoding", aycd.a);
        c = aybe.b("grpc-accept-encoding", new ayiw(1));
        d = ayca.c("content-encoding", aycd.a);
        e = aybe.b("accept-encoding", new ayiw(1));
        f = ayca.c("content-length", aycd.a);
        g = ayca.c("content-type", aycd.a);
        h = ayca.c("te", aycd.a);
        i = ayca.c("user-agent", aycd.a);
        amnm.b(',').e();
        TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        j = new ayma();
        k = axzn.a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        p = new ayep();
        l = new ayir();
        m = new ayis();
        n = new jgc(4);
    }

    private ayiu() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aygg b(aybm aybmVar, boolean z) {
        aygg ayggVar;
        aybq aybqVar = aybmVar.b;
        if (aybqVar != null) {
            amkq.O(aybqVar.g, "Subchannel is not started");
            ayggVar = aybqVar.f.a();
        } else {
            ayggVar = null;
        }
        if (ayggVar != null) {
            return ayggVar;
        }
        if (!aybmVar.c.f()) {
            if (aybmVar.d) {
                return new ayij(aybmVar.c, ayge.DROPPED);
            }
            if (!z) {
                return new ayij(aybmVar.c, ayge.PROCESSED);
            }
        }
        return null;
    }

    public static String c(String str, int i2) {
        try {
            return new URI(null, null, str, i2, null, null, null).getAuthority();
        } catch (URISyntaxException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
            sb.append("Invalid host or port: ");
            sb.append(str);
            sb.append(" ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }

    public static String d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(ayoc ayocVar) {
        while (true) {
            InputStream f2 = ayocVar.f();
            if (f2 == null) {
                return;
            } else {
                f(f2);
            }
        }
    }

    public static void f(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            o.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static boolean g(String str) {
        char charAt;
        if (str == null || str.length() < 16) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("application/grpc")) {
            return lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';';
        }
        return false;
    }

    public static boolean h(axzo axzoVar) {
        return !Boolean.TRUE.equals(axzoVar.e(k));
    }

    public static String i(String str) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append("grpc-java-cronet/1.42.0-SNAPSHOT");
        return sb.toString();
    }

    public static ThreadFactory j(String str) {
        anio anioVar = new anio();
        anioVar.c(true);
        anioVar.d(str);
        return anio.b(anioVar);
    }

    public static ayep[] k(axzo axzoVar, aycd aycdVar, int i2, boolean z) {
        ayep ayimVar;
        List list = axzoVar.d;
        int size = list.size() + 1;
        ayep[] ayepVarArr = new ayep[size];
        axzy axzyVar = new axzy();
        axzyVar.b(axzoVar);
        axzyVar.a = i2;
        axzyVar.b = z;
        axzz a2 = axzyVar.a();
        for (int i3 = 0; i3 < list.size(); i3++) {
            axzx axzxVar = (axzx) list.get(i3);
            if (axzxVar instanceof axzx) {
                ayimVar = axzxVar.a();
            } else {
                ayimVar = new ayim(axzxVar, a2);
            }
            ayepVarArr[i3] = ayimVar;
        }
        ayepVarArr[size - 1] = p;
        return ayepVarArr;
    }

    public static Status a(int i2) {
        Status.Code code;
        if (i2 < 100 || i2 >= 200) {
            if (i2 != 400) {
                if (i2 == 401) {
                    code = Status.Code.UNAUTHENTICATED;
                } else if (i2 == 403) {
                    code = Status.Code.PERMISSION_DENIED;
                } else if (i2 != 404) {
                    if (i2 != 429) {
                        if (i2 != 431) {
                            switch (i2) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    code = Status.Code.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    code = Status.Code.UNAVAILABLE;
                } else {
                    code = Status.Code.UNIMPLEMENTED;
                }
            }
            code = Status.Code.INTERNAL;
        } else {
            code = Status.Code.INTERNAL;
        }
        Status b2 = code.b();
        StringBuilder sb = new StringBuilder(28);
        sb.append("HTTP status code ");
        sb.append(i2);
        return b2.withDescription(sb.toString());
    }
}
