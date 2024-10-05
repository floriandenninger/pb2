package defpackage;

import io.grpc.Status;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ayik implements aygd {
    @Override // defpackage.aygd
    public final axzj a() {
        throw null;
    }

    @Override // defpackage.aygd
    public final void b(ayiz ayizVar) {
        p().b(ayizVar);
    }

    @Override // defpackage.aygd
    public final void c(Status status) {
        p().c(status);
    }

    @Override // defpackage.ayob
    public final void d() {
        p().d();
    }

    @Override // defpackage.aygd
    public final void e() {
        p().e();
    }

    @Override // defpackage.ayob
    public final void f() {
        p().f();
    }

    @Override // defpackage.ayob
    public final void g(int i) {
        p().g(i);
    }

    @Override // defpackage.ayob
    public final void h(ayac ayacVar) {
        p().h(ayacVar);
    }

    @Override // defpackage.aygd
    public final void i(ayaj ayajVar) {
        p().i(ayajVar);
    }

    @Override // defpackage.aygd
    public final void j(ayam ayamVar) {
        p().j(ayamVar);
    }

    @Override // defpackage.aygd
    public final void k(int i) {
        p().k(i);
    }

    @Override // defpackage.aygd
    public final void l(int i) {
        p().l(i);
    }

    @Override // defpackage.aygd
    public void m(aygf aygfVar) {
        throw null;
    }

    @Override // defpackage.ayob
    public final void n(InputStream inputStream) {
        p().n(inputStream);
    }

    @Override // defpackage.ayob
    public final boolean o() {
        return p().o();
    }

    protected abstract aygd p();

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("delegate", p());
        return Y.toString();
    }
}
