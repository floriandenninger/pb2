package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class twz {
    public final Long a;
    public final byte[] b;
    private final Integer c;

    public twz() {
    }

    public twz(Long l, Integer num, byte[] bArr) {
        this.a = l;
        this.c = num;
        this.b = bArr;
    }

    public static twr a() {
        return new twr();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof twz) {
            twz twzVar = (twz) obj;
            if (this.a.equals(twzVar.a) && this.c.equals(twzVar.c)) {
                boolean z = twzVar instanceof twz;
                if (Arrays.equals(this.b, twzVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String arrays = Arrays.toString(this.b);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(valueOf2).length() + String.valueOf(arrays).length());
        sb.append("ChimeTaskData{id=");
        sb.append(valueOf);
        sb.append(", jobType=");
        sb.append(valueOf2);
        sb.append(", payload=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
