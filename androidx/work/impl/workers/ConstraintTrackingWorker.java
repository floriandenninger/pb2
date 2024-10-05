package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import defpackage.abd;
import defpackage.ajbh;
import defpackage.anhy;
import defpackage.cbh;
import defpackage.cex;
import defpackage.cfb;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements cbh {
    public static final String f = ajbh.S("ConstraintTrkngWrkr");
    public WorkerParameters g;
    public final Object h;
    public volatile boolean i;
    public ListenableWorker j;
    public cex k;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = workerParameters;
        this.h = new Object();
        this.i = false;
        this.k = cex.h();
    }

    @Override // androidx.work.ListenableWorker
    public final anhy b() {
        jY().execute(new cfb(this));
        return this.k;
    }

    @Override // defpackage.cbh
    public final void e(List list) {
    }

    @Override // defpackage.cbh
    public final void f(List list) {
        ajbh X = ajbh.X();
        String.format("Constraints changed for %s", list);
        X.T(new Throwable[0]);
        synchronized (this.h) {
            this.i = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final boolean h() {
        ListenableWorker listenableWorker = this.j;
        return listenableWorker != null && listenableWorker.h();
    }

    public final void i() {
        this.k.e(abd.f());
    }

    public final void j() {
        this.k.e(abd.g());
    }

    @Override // androidx.work.ListenableWorker
    public final void jX() {
        ListenableWorker listenableWorker = this.j;
        if (listenableWorker == null || listenableWorker.c) {
            return;
        }
        this.j.g();
    }
}
