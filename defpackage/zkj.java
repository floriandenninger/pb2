package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zkj {
    public final zke a;
    public final Collection b;

    public zkj(zke zkeVar, Collection collection) {
        this.a = zkeVar;
        if (collection == null) {
            throw new NullPointerException("Null paths");
        }
        this.b = collection;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zkj) {
            zkj zkjVar = (zkj) obj;
            if (this.a.equals(zkjVar.a) && this.b.equals(zkjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("DataSyncSubscription{observer=");
        sb.append(valueOf);
        sb.append(", active=true, paths=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public zkj() {
    }
}
