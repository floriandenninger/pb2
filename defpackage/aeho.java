package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeho extends afja {
    private final aeht b;
    private final shf c;
    private final aenf d;
    private final afeu e;
    private aehn f;

    public aeho(atr atrVar, aeht aehtVar, shf shfVar, aenf aenfVar, afeu afeuVar) {
        super(atrVar);
        this.b = aehtVar;
        this.c = shfVar;
        this.d = aenfVar;
        this.e = afeuVar;
    }

    static void c(StringBuilder sb, int i, int i2) {
        sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".charAt((i >> 6) & 63));
        sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".charAt(i & 63));
        sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".charAt((i2 >> 6) & 63));
        sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".charAt(i2 & 63));
    }

    private final void d() {
        aehn aehnVar = this.f;
        this.f = null;
        if (aehnVar == null || aehnVar.a == -1) {
            return;
        }
        long d = this.c.d();
        long min = Math.min(4095L, (aehnVar.h - (aehnVar.g * 1024)) / 1024);
        long min2 = Math.min(4095L, d - aehnVar.f);
        if (min > 0) {
            c(aehnVar.c, (int) min2, (int) min);
        }
        aehnVar.j = d - aehnVar.b;
        this.b.a(aehnVar);
    }

    private final void e(atn atnVar) {
        aehn aehnVar = this.f;
        if (aehnVar == null || aehnVar.a == -1) {
            return;
        }
        aehnVar.l = this.e.b(atnVar).i();
        d();
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        try {
            long e = this.c.e();
            int g = super.g(bArr, i, i2);
            aehn aehnVar = this.f;
            if (aehnVar != null && aehnVar.a != -1) {
                long e2 = this.c.e();
                aehnVar.h += g;
                long min = Math.min(4095L, Duration.ofNanos(e2).minusMillis(aehnVar.f).toMillis());
                long min2 = Math.min(4095L, (aehnVar.h - (aehnVar.g * 1024)) / 1024);
                if (Duration.ofNanos(e2 - e).toMillis() > 0 && min2 > 0) {
                    c(aehnVar.c, (int) min, (int) min2);
                    aehnVar.g += min2;
                    aehnVar.f += min;
                }
            }
            return g;
        } catch (atn e3) {
            e(e3);
            throw e3;
        }
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.ate
    public final long h(ath athVar) {
        String queryParameter;
        d();
        Uri uri = athVar.a;
        int i = -1;
        if (uri != null && (queryParameter = uri.getQueryParameter("rn")) != null) {
            try {
                i = Integer.parseInt(queryParameter);
            } catch (NumberFormatException unused) {
            }
        }
        aehn aehnVar = new aehn(i, this.c.d());
        this.f = aehnVar;
        try {
            long h = super.h(athVar);
            long d = this.c.d();
            aehnVar.f = d;
            aehnVar.k = d - aehnVar.b;
            aehnVar.i = this.d.j();
            Object obj = athVar.k;
            if (true != (obj instanceof aehx)) {
                obj = null;
            }
            if (obj != null) {
                Long l = ((aehx) obj).b;
                Long l2 = ((aehx) obj).c;
                if (l != null && l2 != null) {
                    long j = athVar.h;
                    if (j == -1) {
                        j = ((l2.longValue() / 8) * l.longValue()) / 1000;
                    }
                    aehnVar.e = j;
                    aehnVar.d = l.longValue();
                }
            }
            return h;
        } catch (atn e) {
            e(e);
            throw e;
        }
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.ate
    public final void j() {
        try {
            super.j();
            d();
            super.j();
        } catch (atn e) {
            e(e);
            throw e;
        }
    }
}
