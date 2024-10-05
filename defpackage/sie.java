package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sie extends sio {
    final /* synthetic */ anic a;

    public sie(anic anicVar) {
        this.a = anicVar;
    }

    @Override // defpackage.sio
    public final anic a() {
        return this.a;
    }

    @Override // defpackage.anhc, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new sih(runnable, 1));
    }

    @Override // defpackage.sio, defpackage.anhg
    public final /* synthetic */ anib f() {
        return this.a;
    }

    @Override // defpackage.anhc, defpackage.amqt
    public final /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.anhg, defpackage.anhc
    public final /* synthetic */ ExecutorService h() {
        return this.a;
    }

    @Override // defpackage.anhc, java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.anhc, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amqt
    public final String toString() {
        String sioVar = super.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(sioVar).length() + 14);
        sb.append("ErrorLogging[");
        sb.append(sioVar);
        sb.append("]");
        return sb.toString();
    }
}
