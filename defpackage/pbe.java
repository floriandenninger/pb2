package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pbe {
    public final String a;
    public final byte[] b;

    public pbe(String str, byte[] bArr) {
        this.a = str;
        this.b = (byte[]) opn.h(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pbe)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        pbe pbeVar = (pbe) obj;
        return this.a.equals(pbeVar.a) && Arrays.equals(this.b, pbeVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Arrays.hashCode(this.b) * 31);
    }
}
