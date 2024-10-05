package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class twu {
    public final Long a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;
    public final twb f;
    public final Long g;
    public final int h;
    public final Long i;

    public twu() {
    }

    public twu(Long l, String str, String str2, Long l2, Long l3, twb twbVar, Long l4, int i, Long l5) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = twbVar;
        this.g = l4;
        this.h = i;
        this.i = l5;
    }

    public static twp a() {
        twp twpVar = new twp();
        twpVar.c = 0L;
        twpVar.d = 0L;
        twpVar.d(twb.UNKNOWN_STATUS);
        twpVar.e = 0L;
        twpVar.c(0);
        twpVar.f = 0L;
        return twpVar;
    }

    public final twp b() {
        return new twp(this);
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof twu) {
            twu twuVar = (twu) obj;
            Long l = this.a;
            if (l != null ? l.equals(twuVar.a) : twuVar.a == null) {
                if (this.b.equals(twuVar.b) && ((str = this.c) != null ? str.equals(twuVar.c) : twuVar.c == null) && this.d.equals(twuVar.d) && this.e.equals(twuVar.e) && this.f.equals(twuVar.f) && this.g.equals(twuVar.g) && this.h == twuVar.h && this.i.equals(twuVar.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("name", this.b);
        return Y.toString();
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = ((((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return ((((((((((((hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode();
    }
}
