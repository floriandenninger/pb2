package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vmh {
    private final ammv a;
    private final ammv b;
    private final amru c;

    public vmh(ammv ammvVar, ammv ammvVar2, amru amruVar) {
        this.a = ammvVar;
        this.b = ammvVar2;
        if (amruVar == null) {
            throw new NullPointerException("Null events");
        }
        this.c = amruVar;
    }

    public static vmh a() {
        return new vmh(amlr.a, amlr.a, amru.q());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vmh) {
            vmh vmhVar = (vmh) obj;
            if (this.a.equals(vmhVar.a) && this.b.equals(vmhVar.b) && amkq.aV(this.c, vmhVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        vls.b(1);
        return this.c.hashCode() ^ (-599985098);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 60 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Resource{state=INITIALIZED, resource=");
        sb.append(valueOf);
        sb.append(", errorState=");
        sb.append(valueOf2);
        sb.append(", events=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public vmh() {
    }
}
