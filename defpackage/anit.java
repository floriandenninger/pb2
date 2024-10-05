package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anit extends anhx {
    final /* synthetic */ aniu a;
    private final Callable b;

    public anit(aniu aniuVar, Callable callable) {
        this.a = aniuVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.anhx
    public final Object a() {
        return this.b.call();
    }

    @Override // defpackage.anhx
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.anhx
    public final void d(Throwable th) {
        this.a.e(th);
    }

    @Override // defpackage.anhx
    public final void e(Object obj) {
        this.a.o(obj);
    }

    @Override // defpackage.anhx
    public final boolean g() {
        return this.a.isDone();
    }
}
