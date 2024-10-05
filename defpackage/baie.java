package defpackage;

import org.chromium.net.QuicException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baie extends QuicException {
    private final int a;
    private final baid b;

    public baie(String str, int i, int i2, int i3) {
        super(str, null);
        this.b = new baid(str, i, i2);
        this.a = i3;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return this.b.b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.b.a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b.getMessage() + ", QuicDetailedErrorCode=" + this.a;
    }

    @Override // org.chromium.net.QuicException
    public final int getQuicDetailedErrorCode() {
        return this.a;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.b.immediatelyRetryable();
    }
}
