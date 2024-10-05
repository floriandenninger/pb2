package defpackage;

import android.text.TextUtils;
import java.util.UUID;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aixo {
    public final aixn n;
    public final aixn o;
    public final String p;
    public final int q;

    public aixo(long j, long j2, int i, String str) {
        amkq.E(j <= j2);
        this.n = new aixn(this, 1, j);
        this.o = new aixn(this, 2, j2);
        this.q = i;
        this.p = TextUtils.isEmpty(str) ? UUID.randomUUID().toString() : str;
    }

    public static aixn r(long j) {
        return new aixo(j, j, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, "\u0000").n;
    }

    public final long p() {
        return this.o.a;
    }

    public final long q() {
        return this.n.a;
    }

    public final boolean s(long j) {
        if (j >= q()) {
            if (j < p()) {
                return true;
            }
            if (j == p() && q() == p()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String l = Long.toString(q());
        String l2 = Long.toString(p());
        String str = q() == p() ? "]" : ")";
        StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 11 + String.valueOf(l2).length() + str.length());
        sb.append("Interval[");
        sb.append(l);
        sb.append(", ");
        sb.append(l2);
        sb.append(str);
        return sb.toString();
    }
}
