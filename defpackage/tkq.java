package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tkq {
    public final boolean a;
    public final boolean b;
    public final ammv c;
    private final ammv d;
    private final ammv e;

    public tkq() {
    }

    public tkq(boolean z, boolean z2, ammv ammvVar, ammv ammvVar2, ammv ammvVar3) {
        this.a = z;
        this.b = z2;
        this.c = ammvVar;
        this.d = ammvVar2;
        this.e = ammvVar3;
    }

    public static tkp a() {
        tkp tkpVar = new tkp(null);
        tkpVar.b(false);
        tkpVar.a = false;
        return tkpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tkq) {
            tkq tkqVar = (tkq) obj;
            if (this.a == tkqVar.a && this.b == tkqVar.b && this.c.equals(tkqVar.c) && this.d.equals(tkqVar.d) && this.e.equals(tkqVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 137 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("GetFileGroupsByFilterRequest{includeAllGroups=");
        sb.append(z);
        sb.append(", groupWithNoAccountOnly=");
        sb.append(z2);
        sb.append(", groupNameOptional=");
        sb.append(valueOf);
        sb.append(", accountOptional=");
        sb.append(valueOf2);
        sb.append(", sourceOptional=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
