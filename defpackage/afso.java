package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afso implements ypd {
    private static final long a = TimeUnit.DAYS.toSeconds(1);
    private static final long b = TimeUnit.MINUTES.toSeconds(30);
    private final String c;
    private final ylf d;

    public afso(ylf ylfVar, String str) {
        ylfVar.getClass();
        this.d = ylfVar;
        zhq.m(str);
        this.c = str;
    }

    public final synchronized void a() {
        this.d.e(this.c, 0L, true, 1, null, null, false);
    }

    public final synchronized void b() {
        this.d.d(this.c, a, b, false, 1, false, null, null);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            a();
            return null;
        }
        if (i == 1) {
            a();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
