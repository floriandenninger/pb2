package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ged {
    public final CharSequence a;
    public final arfr b;
    public final ammv c;
    public final ammv d;
    public final ammv e;
    public final avfc f;
    public final int g;
    public final int h;
    public final int i;

    public ged() {
    }

    public ged(CharSequence charSequence, arfr arfrVar, int i, int i2, ammv ammvVar, ammv ammvVar2, ammv ammvVar3, avfc avfcVar, int i3) {
        this.a = charSequence;
        this.b = arfrVar;
        this.g = i;
        this.h = i2;
        this.c = ammvVar;
        this.d = ammvVar2;
        this.e = ammvVar3;
        this.f = avfcVar;
        this.i = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gec a() {
        gec gecVar = new gec(null);
        gecVar.a(avfc.a);
        gecVar.i = 1;
        return gecVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ged) {
            ged gedVar = (ged) obj;
            if (this.a.equals(gedVar.a) && this.b.equals(gedVar.b)) {
                int i = this.g;
                int i2 = gedVar.g;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.h;
                    int i4 = gedVar.h;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4 && this.c.equals(gedVar.c) && this.d.equals(gedVar.d) && this.e.equals(gedVar.e) && this.f.equals(gedVar.f)) {
                        int i5 = this.i;
                        int i6 = gedVar.i;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == i6) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i = this.g;
        if (i == 0) {
            throw null;
        }
        int i2 = (hashCode ^ i) * 1000003;
        int i3 = this.h;
        if (i3 != 0) {
            int hashCode2 = (((((((((i2 ^ i3) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
            int i4 = this.i;
            if (i4 != 0) {
                return hashCode2 ^ i4;
            }
            throw null;
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.g;
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        int i2 = this.h;
        String num2 = i2 != 0 ? Integer.toString(i2 - 1) : "null";
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        int i3 = this.i;
        String num3 = i3 != 0 ? Integer.toString(i3 - 1) : "null";
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = num.length();
        int length4 = num2.length();
        int length5 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 149 + length2 + length3 + length4 + length5 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + num3.length());
        sb.append("ContentPillModel{text=");
        sb.append(valueOf);
        sb.append(", iconType=");
        sb.append(valueOf2);
        sb.append(", position=");
        sb.append(num);
        sb.append(", behavior=");
        sb.append(num2);
        sb.append(", onClickedCommand=");
        sb.append(valueOf3);
        sb.append(", transientUiCallback=");
        sb.append(valueOf4);
        sb.append(", actionListener=");
        sb.append(valueOf5);
        sb.append(", colorPalette=");
        sb.append(valueOf6);
        sb.append(", presentationStyle=");
        sb.append(num3);
        sb.append("}");
        return sb.toString();
    }
}
