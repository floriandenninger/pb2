package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajk implements Runnable {
    private final Callable a;
    private final hw b;
    private final Handler c;

    public ajk(Handler handler, Callable callable, hw hwVar) {
        this.a = callable;
        this.b = hwVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ajd ajdVar;
        try {
            ajdVar = ((ajb) this.a).call();
        } catch (Exception unused) {
            ajdVar = null;
        }
        this.c.post(new ajj(this.b, ajdVar));
    }
}
