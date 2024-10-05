package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnb extends cnq {
    public Intent a;

    public cnb() {
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a != null ? "User needs to (re)enter credentials." : super.getMessage();
    }

    public cnb(Intent intent) {
        this.a = intent;
    }

    public cnb(cnh cnhVar) {
        super(cnhVar);
    }

    public cnb(String str) {
        super(str);
    }

    public cnb(String str, Exception exc) {
        super(str, exc);
    }
}
