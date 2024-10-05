package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aatb {
    public final Intent a;
    public final Throwable b;

    public aatb(Intent intent, Throwable th) {
        this.a = intent;
        this.b = th;
    }

    public static aatb a(Throwable th) {
        return new aatb(null, th);
    }

    public final boolean b() {
        return this.a != null;
    }
}
