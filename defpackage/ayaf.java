package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayaf {
    public final ayae a;
    public final Status b;

    public ayaf(ayae ayaeVar, Status status) {
        ayaeVar.getClass();
        this.a = ayaeVar;
        status.getClass();
        this.b = status;
    }

    public static ayaf a(ayae ayaeVar) {
        amkq.F(ayaeVar != ayae.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new ayaf(ayaeVar, Status.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ayaf)) {
            return false;
        }
        ayaf ayafVar = (ayaf) obj;
        return this.a.equals(ayafVar.a) && this.b.equals(ayafVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.b.f()) {
            return this.a.toString();
        }
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
