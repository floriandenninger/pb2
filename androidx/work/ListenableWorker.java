package androidx.work;

import android.content.Context;
import defpackage.anhy;
import defpackage.byr;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ListenableWorker {
    public Context a;
    public WorkerParameters b;
    public volatile boolean c;
    public boolean d;
    public boolean e;

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters != null) {
            this.a = context;
            this.b = workerParameters;
            return;
        }
        throw new IllegalArgumentException("WorkerParameters is null");
    }

    public final byr a() {
        return this.b.b;
    }

    public abstract anhy b();

    public final Set c() {
        return this.b.c;
    }

    public final UUID d() {
        return this.b.a;
    }

    public final void g() {
        this.c = true;
        jX();
    }

    public boolean h() {
        return this.e;
    }

    public void jX() {
    }

    public final Executor jY() {
        return this.b.e;
    }
}
