package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qnz {
    public Looper a;
    private qqy b;

    public final qoa a() {
        if (this.b == null) {
            this.b = new ante(1);
        }
        if (this.a == null) {
            this.a = Looper.getMainLooper();
        }
        return new qoa(this.b, this.a);
    }

    public final void b(qqy qqyVar) {
        qip.az(qqyVar, "StatusExceptionMapper must not be null.");
        this.b = qqyVar;
    }
}
