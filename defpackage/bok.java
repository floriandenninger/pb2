package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bok implements Executor {
    public final /* synthetic */ Handler a;
    private final /* synthetic */ int b;

    public /* synthetic */ bok(Handler handler, int i) {
        this.b = i;
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            this.a.post(runnable);
        } else if (i != 1) {
            this.a.post(runnable);
        } else {
            this.a.post(runnable);
        }
    }
}
