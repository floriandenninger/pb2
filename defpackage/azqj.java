package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azqj implements Serializable {
    private static final long serialVersionUID = -7482590109178395495L;
    final ayqx a;

    public azqj(ayqx ayqxVar) {
        this.a = ayqxVar;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("NotificationLite.Disposable[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
