package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tzg {
    public final Long a;
    public final Long b;
    public final aohm c;
    public Long d = 0L;
    public Long e = 0L;
    public final Long f = 0L;
    public Long g = 0L;
    public final Long h = 0L;

    public tzg(Long l, Long l2, aohm aohmVar) {
        this.a = l;
        this.b = l2;
        this.c = aohmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzg)) {
            return false;
        }
        tzg tzgVar = (tzg) obj;
        return amkq.b(this.a, tzgVar.a) && amkq.b(this.b, tzgVar.b) && amkq.b(this.c, tzgVar.c) && amkq.b(this.d, tzgVar.d) && amkq.b(this.e, tzgVar.e) && amkq.b(this.f, tzgVar.f) && amkq.b(this.g, tzgVar.g) && amkq.b(this.h, tzgVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h});
    }
}
