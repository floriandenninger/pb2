package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class twp {
    public Long a;
    public String b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    private String g;
    private twb h;
    private Integer i;

    public twp() {
    }

    public twp(twu twuVar) {
        this.a = twuVar.a;
        this.g = twuVar.b;
        this.b = twuVar.c;
        this.c = twuVar.d;
        this.d = twuVar.e;
        this.h = twuVar.f;
        this.e = twuVar.g;
        this.i = Integer.valueOf(twuVar.h);
        this.f = twuVar.i;
    }

    public final twu a() {
        Long l;
        Long l2;
        twb twbVar;
        Long l3;
        Integer num;
        String str = this.g;
        if (str == null || (l = this.c) == null || (l2 = this.d) == null || (twbVar = this.h) == null || (l3 = this.e) == null || (num = this.i) == null || this.f == null) {
            StringBuilder sb = new StringBuilder();
            if (this.g == null) {
                sb.append(" accountName");
            }
            if (this.c == null) {
                sb.append(" syncVersion");
            }
            if (this.d == null) {
                sb.append(" pageVersion");
            }
            if (this.h == null) {
                sb.append(" registrationStatus");
            }
            if (this.e == null) {
                sb.append(" lastRegistrationTimeMs");
            }
            if (this.i == null) {
                sb.append(" lastRegistrationRequestHash");
            }
            if (this.f == null) {
                sb.append(" firstRegistrationVersion");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new twu(this.a, str, this.b, l, l2, twbVar, l3, num.intValue(), this.f);
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null accountName");
        }
        this.g = str;
    }

    public final void c(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void d(twb twbVar) {
        if (twbVar == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.h = twbVar;
    }
}
