package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alec implements anhy {
    public final String a;
    public final anhy b;
    public final aldo c;
    private final aldz d;

    public alec(String str, aldz aldzVar, aldo aldoVar, anhy anhyVar) {
        this.a = str;
        this.d = aldzVar;
        this.c = aldoVar;
        this.b = anhyVar;
    }

    public final alec a(aldq aldqVar) {
        aldz aldzVar = this.d;
        String str = this.a;
        aldo aldoVar = this.c;
        return new alec(str, aldzVar, aldoVar, anfq.i(this, new alds(aldzVar, str, aldqVar, aldoVar, 1), angq.a));
    }

    public final void b(Runnable runnable) {
        d(runnable, this.d.c);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.b.cancel(z);
    }

    @Override // defpackage.anhy
    public final void d(Runnable runnable, Executor executor) {
        this.b.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ Object get() {
        return (aleb) this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return (aleb) this.b.get(j, timeUnit);
    }
}
