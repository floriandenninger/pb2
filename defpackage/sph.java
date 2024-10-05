package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sph {
    final List a = new ArrayList();
    String b = null;
    String c;

    public sph() {
        String str = spi.a;
        int incrementAndGet = spi.b.incrementAndGet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(incrementAndGet);
        this.c = sb.toString();
    }
}
