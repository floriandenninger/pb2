package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class atn extends atf {
    public final ath b;
    public final int c;

    @Deprecated
    public atn(ath athVar, int i) {
        this(athVar, 2000, i);
    }

    private static int c(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public static atn rn(IOException iOException, ath athVar, int i) {
        String message = iOException.getMessage();
        int i2 = 2001;
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && amkq.c(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        }
        if (i2 == 2007) {
            return new atl(iOException, athVar);
        }
        return new atn(iOException, athVar, i2, i);
    }

    public atn(ath athVar, int i, int i2) {
        super(c(i, i2));
        this.b = athVar;
        this.c = i2;
    }

    public atn(IOException iOException, ath athVar, int i, int i2) {
        super(iOException, c(i, i2));
        this.b = athVar;
        this.c = i2;
    }

    @Deprecated
    public atn(String str, ath athVar, int i) {
        this(str, athVar, 2000, i);
    }

    public atn(String str, ath athVar, int i, int i2) {
        super(str, c(i, i2));
        this.b = athVar;
        this.c = i2;
    }

    public atn(String str, IOException iOException, ath athVar, int i) {
        super(str, iOException, c(i, 1));
        this.b = athVar;
        this.c = 1;
    }
}
