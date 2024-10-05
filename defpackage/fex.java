package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fex extends ynz {
    public fex(long j) {
        super(j);
        if (j < 0) {
            afsi.b(1, 18, String.format(Locale.US, "elapsedMillisTimestamp(%d) < 0", Long.valueOf(j)));
        }
    }
}
