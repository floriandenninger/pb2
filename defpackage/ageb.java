package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ageb {
    static final int a;
    public static final aeqp b;

    static {
        int seconds = (int) TimeUnit.MINUTES.toSeconds(10L);
        a = seconds;
        TimeUnit.HOURS.toSeconds(3L);
        b = new aeqp(0, seconds);
    }

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("identityId", str);
        return bundle;
    }
}
