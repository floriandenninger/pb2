package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sqr {
    public final svt a;
    public final aoam b;

    public sqr() {
    }

    public sqr(aoam aoamVar, svt svtVar) {
        this.b = aoamVar;
        this.a = svtVar;
    }

    public static sqr a(aoam aoamVar, svt svtVar) {
        return new sqr(aoamVar, svtVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sqr) {
            sqr sqrVar = (sqr) obj;
            if (this.b.equals(sqrVar.b)) {
                svt svtVar = this.a;
                svt svtVar2 = sqrVar.a;
                if (svtVar != null ? svtVar.equals(svtVar2) : svtVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        svt svtVar = this.a;
        return hashCode ^ (svtVar == null ? 0 : svtVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(valueOf2).length());
        sb.append("ResolvedElement{element=");
        sb.append(valueOf);
        sb.append(", debuggerInfo=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
