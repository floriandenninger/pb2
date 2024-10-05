package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfz {
    public static final aeqp d = new aeqp(2, -9223372036854775807L, (short[]) null);
    public static final aeqp e = new aeqp(3, -9223372036854775807L, (short[]) null);
    public final ExecutorService a;
    public bfu b;
    public IOException c;

    public bfz(String str) {
        this.a = pts.M(str.length() != 0 ? "ExoPlayer:Loader:".concat(str) : new String("ExoPlayer:Loader:"));
    }

    public static aeqp h(boolean z, long j) {
        return new aeqp(z ? 1 : 0, j, (short[]) null);
    }

    public final void a() {
        bfu bfuVar = this.b;
        pse.d(bfuVar);
        bfuVar.a(false);
    }

    public final void b() {
        this.c = null;
    }

    public final void c(int i) {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        bfu bfuVar = this.b;
        if (bfuVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = bfuVar.a;
            }
            IOException iOException2 = bfuVar.b;
            if (iOException2 != null && bfuVar.c > i) {
                throw iOException2;
            }
        }
    }

    public final void d(bfw bfwVar) {
        bfu bfuVar = this.b;
        if (bfuVar != null) {
            bfuVar.a(true);
        }
        if (bfwVar != null) {
            this.a.execute(new bfx(bfwVar));
        }
        this.a.shutdown();
    }

    public final boolean e() {
        return this.c != null;
    }

    public final boolean f() {
        return this.b != null;
    }

    public final void g(bfv bfvVar, bft bftVar, int i) {
        Looper myLooper = Looper.myLooper();
        pse.d(myLooper);
        this.c = null;
        SystemClock.elapsedRealtime();
        new bfu(this, myLooper, bfvVar, bftVar, i).b(0L);
    }
}
