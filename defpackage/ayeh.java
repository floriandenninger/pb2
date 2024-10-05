package defpackage;

import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayeh extends Binder {
    private static final Logger b = Logger.getLogger(ayeh.class.getName());
    public ayeg a;

    public ayeh(ayeg ayegVar) {
        this.a = ayegVar;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ayeg ayegVar = this.a;
        if (ayegVar != null) {
            try {
                return ayegVar.q(i, parcel);
            } catch (RuntimeException e) {
                Logger logger = b;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder(39);
                sb.append("failure sending transaction ");
                sb.append(i);
                logger.logp(level, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", sb.toString(), (Throwable) e);
            }
        }
        return false;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        return this.a != null;
    }
}
