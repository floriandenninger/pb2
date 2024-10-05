package defpackage;

import android.content.Intent;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aftg {
    public final boolean a;
    private final String b;
    private final Intent c;
    private final Exception d;

    protected aftg() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = false;
    }

    public aftg(String str, Intent intent, Exception exc, boolean z) {
        this.b = str;
        this.c = intent;
        this.d = exc;
        this.a = z;
    }

    public static aftg c(String str) {
        zhq.m(str);
        return new aftg(str, null, null, false);
    }

    public final Intent a() {
        if (g()) {
            throw new IllegalStateException("Cannot call getRecoveryIntent() on a successful fetch.");
        }
        if (f()) {
            return this.c;
        }
        throw new IllegalStateException("Cannot call getRecoveryIntent() on an unrecoverable fetch.");
    }

    public final Pair b() {
        if (!g()) {
            throw new IllegalStateException("Cannot call getAuthenticationHeaderInfo on an unsuccessful fetch.");
        }
        String valueOf = String.valueOf(this.b);
        return Pair.create("Authorization", valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
    }

    public final Exception d() {
        Exception exc = this.d;
        if (exc != null) {
            return exc;
        }
        throw new IllegalStateException("Cannot call getException() on a successful or recoverable fetch.");
    }

    public final String e() {
        if (g()) {
            return this.b;
        }
        throw new IllegalStateException("Cannot call getValue on an unsuccessful fetch.");
    }

    public final boolean f() {
        return this.c != null;
    }

    public final boolean g() {
        return this.b != null;
    }
}
