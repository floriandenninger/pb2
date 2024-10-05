package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aakz {
    public final String a;
    public final aakt b;
    public final aakt c;
    public final aaku d;
    public final aaky e;
    private final aaku f;

    public aakz() {
    }

    public aakz(String str, aakt aaktVar, aakt aaktVar2, aaku aakuVar, aaku aakuVar2, aaky aakyVar) {
        this.a = str;
        this.b = aaktVar;
        this.c = aaktVar2;
        this.d = aakuVar;
        this.f = aakuVar2;
        this.e = aakyVar;
    }

    public static aakx a() {
        return new aakx();
    }

    public final Class b() {
        aakt aaktVar = this.c;
        aakt aaktVar2 = this.b;
        if (aaktVar != null) {
            return aaktVar.getClass();
        }
        aaktVar2.getClass();
        return aaktVar2.getClass();
    }

    public final boolean equals(Object obj) {
        aakt aaktVar;
        aakt aaktVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aakz) {
            aakz aakzVar = (aakz) obj;
            if (this.a.equals(aakzVar.a) && ((aaktVar = this.b) != null ? aaktVar.equals(aakzVar.b) : aakzVar.b == null) && ((aaktVar2 = this.c) != null ? aaktVar2.equals(aakzVar.c) : aakzVar.c == null) && this.d.equals(aakzVar.d) && this.f.equals(aakzVar.f) && this.e.equals(aakzVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        aakt aaktVar = this.b;
        int hashCode2 = (hashCode ^ (aaktVar == null ? 0 : aaktVar.hashCode())) * 1000003;
        aakt aaktVar2 = this.c;
        return ((((((hashCode2 ^ (aaktVar2 != null ? aaktVar2.hashCode() : 0)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 103 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("EntityUpdate{entityKey=");
        sb.append(str);
        sb.append(", previousEntity=");
        sb.append(valueOf);
        sb.append(", currentEntity=");
        sb.append(valueOf2);
        sb.append(", previousMetadata=");
        sb.append(valueOf3);
        sb.append(", currentMetadata=");
        sb.append(valueOf4);
        sb.append(", reason=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
