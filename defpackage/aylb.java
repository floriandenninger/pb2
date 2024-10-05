package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aylb extends aybw {
    public final List c;
    final aycu d;
    aycl e;
    final String f;
    public String g;
    public ayam h;
    public ayad i;
    public long j;
    final ayay k;
    public boolean l;
    public boolean m;
    final aynz n;
    public final aynz o;
    private final ayky s;
    private static final Logger p = Logger.getLogger(aylb.class.getName());
    static final long a = TimeUnit.MINUTES.toMillis(30);
    public static final long b = TimeUnit.SECONDS.toMillis(1);
    private static final aynz t = aynz.a(ayiu.l);
    private static final ayam q = ayam.b;
    private static final ayad r = ayad.a;

    public aylb(SocketAddress socketAddress, String str, ayky aykyVar) {
        aynz aynzVar = t;
        this.n = aynzVar;
        this.o = aynzVar;
        this.c = new ArrayList();
        aycu a2 = aycu.a();
        this.d = a2;
        this.e = a2.a;
        this.h = q;
        this.i = r;
        this.j = a;
        this.k = ayay.a;
        this.l = true;
        this.m = true;
        this.f = a(socketAddress);
        aykyVar.getClass();
        this.s = aykyVar;
        this.e = new ayla(socketAddress, str);
    }

    static String a(SocketAddress socketAddress) {
        try {
            String valueOf = String.valueOf(socketAddress);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
            sb.append("/");
            sb.append(valueOf);
            return new URI("directaddress", "", sb.toString(), null).toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.aybw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aybv c() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aylb.c():aybv");
    }
}
