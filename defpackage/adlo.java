package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlo {
    public adks a;
    public adgn b;
    private Optional c;
    private Long d;
    private String e;
    private String f;
    private Optional g;
    private String h;
    private Integer i;
    private int j;

    public adlo(byte[] bArr) {
        this.c = Optional.empty();
        this.g = Optional.empty();
    }

    public final adlp a() {
        Long l;
        int i = this.j;
        if (i == 0 || (l = this.d) == null || this.e == null || this.f == null || this.h == null || this.i == null) {
            StringBuilder sb = new StringBuilder();
            if (this.j == 0) {
                sb.append(" sessionType");
            }
            if (this.d == null) {
                sb.append(" startedTimeMs");
            }
            if (this.e == null) {
                sb.append(" mediaRouteId");
            }
            if (this.f == null) {
                sb.append(" screenName");
            }
            if (this.h == null) {
                sb.append(" sessionNonce");
            }
            if (this.i == null) {
                sb.append(" sessionIndex");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adlp(i, this.c, l.longValue(), this.a, this.e, this.f, this.g, this.b, this.h, this.i.intValue());
    }

    public final void b(adkq adkqVar) {
        this.c = Optional.of(adkqVar);
    }

    public final void c(atbi atbiVar) {
        this.g = Optional.of(atbiVar);
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null mediaRouteId");
        }
        this.e = str;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null screenName");
        }
        this.f = str;
    }

    public final void f(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null sessionNonce");
        }
        this.h = str;
    }

    public final void h(long j) {
        this.d = Long.valueOf(j);
    }

    public final void i(int i) {
        if (i == 0) {
            throw new NullPointerException("Null sessionType");
        }
        this.j = i;
    }

    public adlo(adlp adlpVar) {
        this.c = Optional.empty();
        this.g = Optional.empty();
        this.j = adlpVar.i;
        this.c = adlpVar.a;
        this.d = Long.valueOf(adlpVar.b);
        this.a = adlpVar.c;
        this.e = adlpVar.d;
        this.f = adlpVar.e;
        this.g = adlpVar.f;
        this.b = adlpVar.j;
        this.h = adlpVar.g;
        this.i = Integer.valueOf(adlpVar.h);
    }

    public adlo() {
    }
}
