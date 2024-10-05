package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aydn extends SocketAddress {
    private static final long serialVersionUID = 0;
    public final Intent a;

    protected aydn(Intent intent) {
        amkq.F(intent.getComponent() != null, "Missing required component");
        this.a = intent;
    }

    public static aydn b(ComponentName componentName) {
        return new aydn(new Intent("grpc.io.action.BIND").setComponent(componentName));
    }

    public final ComponentName a() {
        return this.a.getComponent();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aydn) {
            return this.a.filterEquals(((aydn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.filterHashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("AndroidComponentAddress[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
