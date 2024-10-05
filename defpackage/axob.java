package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axob {
    public byte[] a = new byte[0];
    public axnw[] b = null;

    public final int a() {
        int length;
        int length2 = this.a.length;
        axnw[] axnwVarArr = this.b;
        return (axnwVarArr == null || (length = axnwVarArr.length) <= 0) ? length2 : length2 + 2 + (length * 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axob axobVar = (axob) obj;
        if (!new BigInteger(this.a).equals(new BigInteger(axobVar.a))) {
            return false;
        }
        axnw[] axnwVarArr = this.b;
        return axnwVarArr == null ? axobVar.b == null : Arrays.equals(axnwVarArr, axobVar.b);
    }

    public final int hashCode() {
        byte[] bArr = this.a;
        int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        axnw[] axnwVarArr = this.b;
        return hashCode + (axnwVarArr != null ? Arrays.hashCode(axnwVarArr) : 0);
    }

    public final String toString() {
        String a = ddy.a(this.a);
        String arrays = Arrays.toString(this.b);
        StringBuilder sb = new StringBuilder(a.length() + 18 + String.valueOf(arrays).length());
        sb.append("Entry{iv=");
        sb.append(a);
        sb.append(", pairs=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
