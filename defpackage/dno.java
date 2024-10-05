package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dno {
    public final dmi a;
    public final dng b;

    public dno(dmi dmiVar, dng dngVar) {
        this.a = dmiVar;
        this.b = dngVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dno dnoVar = (dno) obj;
            if (this.a.equals(dnoVar.a) && this.b.equals(dnoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.d * 31) + this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("PropertyHandle{ mTransitionId='");
        sb.append(valueOf);
        sb.append("', mProperty=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
