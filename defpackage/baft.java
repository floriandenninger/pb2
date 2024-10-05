package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baft extends baid {
    public baft(String str, int i, int i2) {
        super(str, i, i2);
    }

    @Override // defpackage.baid, org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        int i = this.b;
        if (i == -358 || i == -352) {
            return true;
        }
        return super.immediatelyRetryable();
    }
}
