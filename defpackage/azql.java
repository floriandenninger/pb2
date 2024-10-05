package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azql implements Serializable {
    private static final long serialVersionUID = -1322257508628817540L;
    final banx a;

    public azql(banx banxVar) {
        this.a = banxVar;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("NotificationLite.Subscription[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
