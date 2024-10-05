package androidx.work;

import android.content.Context;
import defpackage.abd;
import defpackage.anhy;
import defpackage.bzk;
import defpackage.cex;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public cex f;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final anhy b() {
        this.f = cex.h();
        jY().execute(new bzk(this));
        return this.f;
    }

    public abstract abd i();
}
