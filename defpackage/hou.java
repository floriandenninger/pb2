package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hou {
    public final String a;
    public final amru b;
    public final String c;

    public hou() {
    }

    public hou(String str, amru amruVar, String str2) {
        this.a = str;
        this.b = amruVar;
        this.c = str2;
    }

    public static hot a() {
        return new hot();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hou) {
            hou houVar = (hou) obj;
            String str = this.a;
            if (str != null ? str.equals(houVar.a) : houVar.a == null) {
                amru amruVar = this.b;
                if (amruVar != null ? amkq.aV(amruVar, houVar.b) : houVar.b == null) {
                    String str2 = this.c;
                    String str3 = houVar.c;
                    if (str2 != null ? str2.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(valueOf).length() + String.valueOf(str2).length());
        sb.append("ReshootProjectOptions{nonce=");
        sb.append(str);
        sb.append(", creationSurfaces=");
        sb.append(valueOf);
        sb.append(", title=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        amru amruVar = this.b;
        int hashCode2 = (hashCode ^ (amruVar == null ? 0 : amruVar.hashCode())) * 1000003;
        String str2 = this.c;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }
}
