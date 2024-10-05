package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tft {
    public final String a;
    public final aooy b;
    public final ancf c;
    public final Integer d;
    public final int[] e;
    public final int[] f;
    public final int g;

    public tft() {
    }

    public tft(String str, aooy aooyVar, ancf ancfVar, int[] iArr, int[] iArr2) {
        this.a = str;
        this.b = aooyVar;
        this.c = ancfVar;
        this.d = null;
        this.g = 1;
        this.e = iArr;
        this.f = iArr2;
    }

    public static tfs a() {
        tfs tfsVar = new tfs();
        tfsVar.c();
        return tfsVar;
    }

    public final boolean equals(Object obj) {
        ancf ancfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tft) {
            tft tftVar = (tft) obj;
            if (this.a.equals(tftVar.a) && this.b.equals(tftVar.b) && ((ancfVar = this.c) != null ? ancfVar.equals(tftVar.c) : tftVar.c == null)) {
                Integer num = tftVar.d;
                int i = this.g;
                int i2 = tftVar.g;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1) {
                    if (Arrays.equals(this.e, tftVar instanceof tft ? tftVar.e : tftVar.e) && Arrays.equals(this.f, tftVar.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        ancf ancfVar = this.c;
        int hashCode2 = (hashCode ^ (ancfVar == null ? 0 : ancfVar.hashCode())) * 1525764945;
        if (this.g != 0) {
            return ((((hashCode2 ^ 1) * (-721379959)) ^ Arrays.hashCode(this.e)) * 1000003) ^ Arrays.hashCode(this.f);
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String num = this.g != 0 ? Integer.toString(0) : "null";
        String arrays = Arrays.toString(this.e);
        String arrays2 = Arrays.toString(this.f);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = "null".length();
        int length5 = "null".length();
        int length6 = "null".length();
        int length7 = num.length();
        StringBuilder sb = new StringBuilder(length + 140 + length2 + length3 + length4 + length5 + length6 + length7 + "null".length() + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append("ClearcutData{logSource=");
        sb.append(str);
        sb.append(", message=");
        sb.append(valueOf);
        sb.append(", visualElements=");
        sb.append(valueOf2);
        sb.append(", eventCode=");
        sb.append("null");
        sb.append(", wallTime=");
        sb.append("null");
        sb.append(", elapsedTime=");
        sb.append("null");
        sb.append(", qosTier=");
        sb.append(num);
        sb.append(", logVerifier=");
        sb.append("null");
        sb.append(", experimentIds=");
        sb.append(arrays);
        sb.append(", testCodes=");
        sb.append(arrays2);
        sb.append("}");
        return sb.toString();
    }
}
