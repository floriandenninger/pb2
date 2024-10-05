package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atw extends atn {
    public final int d;

    public atw(ath athVar) {
        super(athVar, 2008, 1);
        this.d = 14;
    }

    @Deprecated
    public atw(IOException iOException, ath athVar) {
        super(iOException, athVar, 2000, 1);
        this.d = -1;
    }

    public atw(IOException iOException, ath athVar, int i, int i2) {
        super(iOException, athVar, i, 1);
        this.d = i2;
    }

    @Deprecated
    public atw(ath athVar, byte[] bArr) {
        super("OnesieRetryingDataSource time out.", athVar, 2000, 1);
        this.d = -1;
    }

    public atw(ath athVar, char[] cArr) {
        super("HTTP request with non-empty body must set Content-Type", athVar, 1004, 1);
        this.d = 0;
    }
}
