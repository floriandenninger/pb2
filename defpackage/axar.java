package defpackage;

import j$.util.Objects;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axar {
    public final long a;
    public final MessageDigest b;
    private final long c = 0;
    private final boolean d = false;

    public axar(axaq axaqVar) {
        this.a = axaqVar.a;
        this.b = axaqVar.b;
    }

    public static axaq a() {
        return new axaq();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof axar)) {
            return false;
        }
        axar axarVar = (axar) obj;
        if (this.a == axarVar.a) {
            long j = axarVar.c;
            if (Objects.equals(this.b, axarVar.b)) {
                boolean z = axarVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 0L, this.b, false});
    }

    public final String toString() {
        return String.format(Locale.US, "TransferOptions[idleTimeout %d sec, resumableTransferThreshold=%d, digest=%s, forceMultipart=%s]", Long.valueOf(this.a), 0L, this.b, false);
    }
}
