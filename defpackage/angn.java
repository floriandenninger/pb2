package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class angn extends ango {
    final /* synthetic */ angp a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public angn(angp angpVar, Callable callable, Executor executor) {
        super(angpVar, executor);
        this.a = angpVar;
        callable.getClass();
        this.c = callable;
    }

    @Override // defpackage.anhx
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.anhx
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.ango
    public final void c(Object obj) {
        this.a.o(obj);
    }
}
