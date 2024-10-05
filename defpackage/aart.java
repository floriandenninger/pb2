package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aart {
    private static final zfn d = new zfn(100, 10000, 3);
    private static final ammy e = wgw.h;
    public final ammy a;
    public final zfi b;
    public final zfo c;

    public aart() {
    }

    public aart(ammy ammyVar, zfi zfiVar, zfo zfoVar) {
        this.a = ammyVar;
        this.b = zfiVar;
        this.c = zfoVar;
    }

    public static aars a(zfm zfmVar) {
        aars aarsVar = new aars();
        aarsVar.b = zfmVar.b(d);
        aarsVar.b(e);
        return aarsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.b != null;
    }

    public final boolean equals(Object obj) {
        zfi zfiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aart) {
            aart aartVar = (aart) obj;
            if (this.a.equals(aartVar.a) && ((zfiVar = this.b) != null ? zfiVar.equals(aartVar.b) : aartVar.b == null) && this.c.equals(aartVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        zfi zfiVar = this.b;
        return ((hashCode ^ (zfiVar == null ? 0 : zfiVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 73 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("InnerTubeRetryPolicy{isErrorRetryable=");
        sb.append(valueOf);
        sb.append(", uriMutator=");
        sb.append(valueOf2);
        sb.append(", exponentialBackoff=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
