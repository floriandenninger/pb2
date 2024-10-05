package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ykm extends anhe implements ykl {
    private final SettableFuture a;

    protected ykm() {
        this(SettableFuture.f());
    }

    protected ykm(SettableFuture settableFuture) {
        this.a = settableFuture;
    }

    public static ykm c() {
        return new ykm(SettableFuture.f());
    }

    @Override // defpackage.ykl
    public final void a(Object obj, Exception exc) {
        if (exc == null) {
            exc = new ExecutionException("No exception provided to CallbackFuture.onError", null);
        }
        this.a.e(exc);
    }

    @Override // defpackage.ykl
    public final void b(Object obj, Object obj2) {
        this.a.o(obj2);
    }

    @Override // defpackage.anhe
    protected final anhy e() {
        return this.a;
    }

    @Override // defpackage.anhe
    protected final /* synthetic */ Future f() {
        return this.a;
    }

    @Override // defpackage.anhe, defpackage.amqt
    protected final /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.anhe, java.util.concurrent.Future
    public final Object get() {
        return anaf.A(this.a);
    }

    @Override // defpackage.anhe, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return anaf.B(this.a, j, timeUnit);
    }
}
