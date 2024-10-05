package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agne {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final byte[] f;
    public final byte[] g;
    public final boolean h;

    public agne(String str, int i, String str2, int i2, int i3, byte[] bArr, byte[] bArr2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = bArr;
        this.g = bArr2;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agne) {
            agne agneVar = (agne) obj;
            if (this.a.equals(agneVar.a) && this.b == agneVar.b && ((str = this.c) != null ? str.equals(agneVar.c) : agneVar.c == null) && this.d == agneVar.d && this.e == agneVar.e) {
                if (Arrays.equals(this.f, agneVar instanceof agne ? agneVar.f : agneVar.f) && Arrays.equals(this.g, agneVar.g) && this.h == agneVar.h) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        String str = this.c;
        return ((((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ Arrays.hashCode(this.f)) * 1000003) ^ Arrays.hashCode(this.g)) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        int i2 = this.d;
        int i3 = this.e;
        String arrays = Arrays.toString(this.f);
        String arrays2 = Arrays.toString(this.g);
        boolean z = this.h;
        int length = str.length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 147 + length2 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append("OfflineHash{videoId=");
        sb.append(str);
        sb.append(", itag=");
        sb.append(i);
        sb.append(", storageId=");
        sb.append(str2);
        sb.append(", merkleLevel=");
        sb.append(i2);
        sb.append(", blockIndex=");
        sb.append(i3);
        sb.append(", digest=");
        sb.append(arrays);
        sb.append(", hashState=");
        sb.append(arrays2);
        sb.append(", matchesBytesOnDisk=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public agne() {
    }
}
