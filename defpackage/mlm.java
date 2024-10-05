package defpackage;

import com.google.android.apps.youtube.app.common.rendering.SnappyRecyclerView;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mlm {
    final /* synthetic */ mlu a;
    private final shf b;
    private final ScheduledExecutorService c;
    private ScheduledFuture d;

    public mlm(mlu mluVar, shf shfVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = mluVar;
        this.b = shfVar;
        this.c = scheduledExecutorService;
    }

    public final synchronized void a() {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        mlu mluVar = this.a;
        apoj apojVar = mluVar.o;
        if (apojVar == null) {
            return;
        }
        aong aongVar = (aong) apojVar.toBuilder();
        aongVar.e(apoh.c, true);
        mluVar.o((apoj) aongVar.build());
    }

    public final synchronized void b(long j) {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        if (j <= 0) {
            return;
        }
        this.b.d();
        ScheduledExecutorService scheduledExecutorService = this.c;
        final mlu mluVar = this.a;
        if (mluVar.r == null) {
            mluVar.r = new Runnable() { // from class: mli
                @Override // java.lang.Runnable
                public final void run() {
                    mlu mluVar2 = mlu.this;
                    int J2 = mluVar2.u.J();
                    int i = J2 + 1;
                    int size = mluVar2.f.size() - 1;
                    if (J2 >= 0) {
                        SnappyRecyclerView snappyRecyclerView = mluVar2.t;
                        if (i > size) {
                            i = 0;
                        }
                        snappyRecyclerView.ak(i);
                    }
                }
            };
        }
        this.d = scheduledExecutorService.schedule(mluVar.r, j, TimeUnit.MILLISECONDS);
    }
}
