package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aes {
    public Object a;
    public aew b;
    public aex c = new aex();
    private boolean d;

    private final void e() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(Runnable runnable, Executor executor) {
        aex aexVar = this.c;
        if (aexVar != null) {
            aexVar.d(runnable, executor);
        }
    }

    public final void b() {
        this.d = true;
        aew aewVar = this.b;
        if (aewVar == null || !aewVar.b.cancel(true)) {
            return;
        }
        e();
    }

    public final void c(Object obj) {
        this.d = true;
        aew aewVar = this.b;
        if (aewVar == null || !aewVar.b.f(obj)) {
            return;
        }
        e();
    }

    public final void d(Throwable th) {
        this.d = true;
        aew aewVar = this.b;
        if (aewVar == null || !aewVar.a(th)) {
            return;
        }
        e();
    }

    protected final void finalize() {
        aex aexVar;
        aew aewVar = this.b;
        if (aewVar != null && !aewVar.isDone()) {
            aewVar.a(new aet("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
        }
        if (this.d || (aexVar = this.c) == null) {
            return;
        }
        aexVar.f(null);
    }
}
