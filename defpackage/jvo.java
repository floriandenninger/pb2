package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jvo {
    static final long a = TimeUnit.SECONDS.toMillis(10);
    public final jvl b;
    public final Handler c;
    public final Map d = new HashMap();
    public jvn e;

    public jvo(jvl jvlVar, Handler handler) {
        this.b = jvlVar;
        this.c = handler;
    }
}
