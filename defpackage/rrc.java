package defpackage;

import android.accounts.Account;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rrc {
    public int a = 3;
    public Account b;

    public final rrd a() {
        return new rrd(this);
    }

    public final void b(int i) {
        if (i != 0 && i != 2 && i != 1 && i != 3) {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", 2));
        }
        this.a = i;
    }
}
