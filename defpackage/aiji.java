package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiji implements Runnable {
    private final aigy a;
    private final ayro b;
    private final /* synthetic */ int c;

    public aiji(aigy aigyVar, ayro ayroVar, int i) {
        this.c = i;
        this.a = aigyVar;
        this.b = ayroVar;
    }

    private final void a() {
        if (this.a.a) {
            return;
        }
        Object obj = amlr.a;
        Object obj2 = amlr.a;
        try {
            obj = ammv.i((WatchNextResponseModel) this.a.get());
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            zga.d("Problem fetching WatchNext response", e);
            if (e instanceof CancellationException) {
                return;
            } else {
                obj2 = ammv.j(e);
            }
        }
        try {
            ayro ayroVar = this.b;
            if (ayroVar == null || this.a.a) {
                return;
            }
            ayroVar.a(obj, obj2);
        } catch (Exception e2) {
            zga.d("Fail to apply completeContinuation in watchNextFutureListener", e2);
        }
    }

    private final void b() {
        Object obj = amlr.a;
        Object obj2 = amlr.a;
        aigy aigyVar = this.a;
        if (aigyVar.a) {
            return;
        }
        try {
            obj = ammv.i((PlayerResponseModel) aigyVar.get());
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            zga.d("Problem fetching player response", e);
            if (e instanceof CancellationException) {
                return;
            } else {
                obj2 = ammv.j(e);
            }
        }
        try {
            ayro ayroVar = this.b;
            if (ayroVar == null || this.a.a) {
                return;
            }
            ayroVar.a(obj, obj2);
        } catch (Exception e2) {
            zga.d("Fail to apply completeContinuation in PlaybackFutureListener", e2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            yjk.f();
            a();
        } else {
            yjk.f();
            b();
        }
    }
}
