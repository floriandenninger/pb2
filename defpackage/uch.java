package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uch {
    public final byte[] a;
    private final Integer b;
    private final Map c;
    private final byte[] d;
    private final Exception e;

    public uch() {
    }

    public uch(Integer num, Map map, byte[] bArr, byte[] bArr2, Exception exc) {
        this.b = num;
        this.c = map;
        this.d = bArr;
        this.a = bArr2;
        this.e = exc;
    }

    public static ucg a() {
        ucg ucgVar = new ucg();
        ucgVar.c = new HashMap();
        return ucgVar;
    }

    public final Throwable b() {
        Integer num;
        return (this.e != null || (num = this.b) == null || num.intValue() == 200) ? this.e : new uci(this.b.intValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uch) {
            uch uchVar = (uch) obj;
            Integer num = this.b;
            if (num != null ? num.equals(uchVar.b) : uchVar.b == null) {
                if (this.c.equals(uchVar.c)) {
                    boolean z = uchVar instanceof uch;
                    if (Arrays.equals(this.d, z ? uchVar.d : uchVar.d)) {
                        if (Arrays.equals(this.a, z ? uchVar.a : uchVar.a)) {
                            Exception exc = this.e;
                            Exception exc2 = uchVar.e;
                            if (exc != null ? exc.equals(exc2) : exc2 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String arrays = Arrays.toString(this.d);
        String arrays2 = Arrays.toString(this.a);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = "null".length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(length + 83 + length2 + length3 + length4 + String.valueOf(arrays2).length() + String.valueOf(valueOf3).length());
        sb.append("GnpHttpResponse{statusCode=");
        sb.append(valueOf);
        sb.append(", statusMessage=null, headers=");
        sb.append(valueOf2);
        sb.append(", rawBody=");
        sb.append(arrays);
        sb.append(", body=");
        sb.append(arrays2);
        sb.append(", exception=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = ((((((((num == null ? 0 : num.hashCode()) ^ 1000003) * (-721379959)) ^ this.c.hashCode()) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003) ^ Arrays.hashCode(this.a)) * 1000003;
        Exception exc = this.e;
        return hashCode ^ (exc != null ? exc.hashCode() : 0);
    }
}
