package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tbq {
    public final String a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Integer e;
    public final tbo f;

    public tbq() {
    }

    public tbq(String str, Long l, Long l2, Long l3, Integer num, tbo tboVar) {
        this.a = str;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = num;
        this.f = tboVar;
    }

    public static tbm a() {
        return new tbm();
    }

    public final boolean equals(Object obj) {
        Long l;
        Long l2;
        Long l3;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tbq) {
            tbq tbqVar = (tbq) obj;
            if (this.a.equals(tbqVar.a) && ((l = this.b) != null ? l.equals(tbqVar.b) : tbqVar.b == null) && ((l2 = this.c) != null ? l2.equals(tbqVar.c) : tbqVar.c == null) && ((l3 = this.d) != null ? l3.equals(tbqVar.d) : tbqVar.d == null) && ((num = this.e) != null ? num.equals(tbqVar.e) : tbqVar.e == null)) {
                tbo tboVar = this.f;
                tbo tboVar2 = tbqVar.f;
                if (tboVar != null ? tboVar.equals(tboVar2) : tboVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Long l = this.b;
        int hashCode2 = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.c;
        int hashCode3 = (hashCode2 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.d;
        int hashCode4 = (hashCode3 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Integer num = this.e;
        int hashCode5 = (hashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        tbo tboVar = this.f;
        return hashCode5 ^ (tboVar != null ? tboVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 82 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("TimeSpan{name=");
        sb.append(str);
        sb.append(", startTimeUs=");
        sb.append(valueOf);
        sb.append(", endTimeUs=");
        sb.append(valueOf2);
        sb.append(", spanLengthTimeUs=");
        sb.append(valueOf3);
        sb.append(", parentId=");
        sb.append(valueOf4);
        sb.append(", spanInfo=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
