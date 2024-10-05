package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pow extends atb implements atr {
    private static final Pattern c = Pattern.compile("(^|&)rn=[0-9]+");
    private static final AtomicInteger d = new AtomicInteger();
    public int b;
    private final atr e;
    private final long f;
    private long g;
    private Uri h;
    private ath i;
    private Uri j;
    private long k;
    private boolean l;

    public pow(atr atrVar, int i, long j) {
        super(true);
        pse.c(atrVar);
        this.e = atrVar;
        this.b = i;
        this.f = j;
    }

    private final void n() {
        this.j = null;
        this.k = 0L;
    }

    private final void o() {
        this.j = null;
        this.k = 0L;
    }

    @Override // defpackage.atb, defpackage.ate
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        try {
            if (this.b > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.g;
                if (elapsedRealtime > this.b) {
                    ath athVar = this.i;
                    pse.c(athVar);
                    throw new pov(athVar, elapsedRealtime);
                }
            }
            int g = this.e.g(bArr, i, i2);
            if (g != -1) {
                c(g);
            }
            return g;
        } catch (atn e) {
            o();
            throw e;
        }
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.g = elapsedRealtime;
        if (this.j != null && elapsedRealtime - this.k > this.f) {
            n();
        }
        if (!athVar.a.equals(this.h)) {
            n();
            this.h = athVar.a;
        }
        Uri uri = athVar.a;
        Uri uri2 = this.j;
        if (uri2 != null) {
            uri = uri2;
        }
        String encodedQuery = uri.getEncodedQuery();
        int incrementAndGet = d.incrementAndGet();
        StringBuilder sb = new StringBuilder(14);
        sb.append("rn=");
        sb.append(incrementAndGet);
        String sb2 = sb.toString();
        if (encodedQuery != null) {
            Matcher matcher = c.matcher(encodedQuery);
            if (matcher.find()) {
                String valueOf = String.valueOf(sb2);
                sb2 = matcher.replaceFirst(valueOf.length() != 0 ? "$1".concat(valueOf) : new String("$1"));
            } else if (!encodedQuery.isEmpty()) {
                StringBuilder sb3 = new StringBuilder(encodedQuery.length() + 1 + String.valueOf(sb2).length());
                sb3.append(encodedQuery);
                sb3.append("&");
                sb3.append(sb2);
                sb2 = sb3.toString();
            }
        }
        ath d2 = athVar.d(uri.buildUpon().encodedQuery(sb2).build());
        e(d2);
        this.i = d2;
        try {
            long h = this.e.h(d2);
            if (this.j == null) {
                this.j = this.e.i();
                this.k = SystemClock.elapsedRealtime();
            }
            f(d2);
            this.l = true;
            return h;
        } catch (atn e) {
            o();
            throw e;
        }
    }

    @Override // defpackage.ate
    public final Uri i() {
        return this.e.i();
    }

    @Override // defpackage.ate
    public final void j() {
        try {
            try {
                this.e.j();
                if (this.l) {
                    d();
                    this.l = false;
                }
            } catch (atn e) {
                o();
                throw e;
            }
        } catch (Throwable th) {
            if (this.l) {
                d();
                this.l = false;
            }
            throw th;
        }
    }

    @Override // defpackage.atr
    public final int k() {
        return this.e.k();
    }

    @Override // defpackage.atr
    public final void l() {
        this.e.l();
    }

    @Override // defpackage.atr
    public final void m(String str, String str2) {
        this.e.m(str, str2);
    }
}
