package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zkf {
    public final Uri a;
    public final zke b;

    public zkf(Uri uri, zke zkeVar) {
        if (uri == null) {
            throw new NullPointerException("Null subscribed");
        }
        this.a = uri;
        if (zkeVar != null) {
            this.b = zkeVar;
            return;
        }
        throw new NullPointerException("Null observer");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zkf) {
            zkf zkfVar = (zkf) obj;
            if (this.a.equals(zkfVar.a) && this.b.equals(zkfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52 + String.valueOf(valueOf2).length());
        sb.append("DataSyncObserverNotification{subscribed=");
        sb.append(valueOf);
        sb.append(", observer=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public zkf() {
    }
}
