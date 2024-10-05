package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class isg {
    public final avuf a;
    public final avuf b;

    public isg() {
    }

    public isg(avuf avufVar, avuf avufVar2) {
        this.a = avufVar;
        this.b = avufVar2;
    }

    public static isg a(aakz aakzVar) {
        return new isg(b(aakzVar.b), b(aakzVar.c));
    }

    private static avuf b(aakt aaktVar) {
        if (aaktVar instanceof avuf) {
            return (avuf) aaktVar;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof isg) {
            isg isgVar = (isg) obj;
            avuf avufVar = this.a;
            if (avufVar != null ? avufVar.equals(isgVar.a) : isgVar.a == null) {
                avuf avufVar2 = this.b;
                avuf avufVar3 = isgVar.b;
                if (avufVar2 != null ? avufVar2.equals(avufVar3) : avufVar3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length());
        sb.append("UploadStatusEntityPair{previousEntity=");
        sb.append(valueOf);
        sb.append(", currentEntity=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        avuf avufVar = this.a;
        int hashCode = ((avufVar == null ? 0 : avufVar.hashCode()) ^ 1000003) * 1000003;
        avuf avufVar2 = this.b;
        return hashCode ^ (avufVar2 != null ? avufVar2.hashCode() : 0);
    }
}
