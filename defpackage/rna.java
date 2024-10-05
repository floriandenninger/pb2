package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rna implements qnu {
    public final int a;
    private final String b = null;

    public rna(ajbh ajbhVar, byte[] bArr, byte[] bArr2) {
        this.a = ajbhVar.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rna)) {
            return false;
        }
        rna rnaVar = (rna) obj;
        if (this.a == rnaVar.a) {
            String str = rnaVar.b;
            if (qar.j(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), null});
    }
}
