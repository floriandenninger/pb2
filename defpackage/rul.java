package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rul extends aow {
    private final AtomicBoolean e = new AtomicBoolean(false);

    @Override // defpackage.aot
    public void f(aok aokVar, final aox aoxVar) {
        super.f(aokVar, new aox() { // from class: ruk
            @Override // defpackage.aox
            public final void a(Object obj) {
                rul.this.n(aoxVar, obj);
            }
        });
    }

    @Override // defpackage.aow, defpackage.aot
    public void j(Object obj) {
        this.e.set(true);
        super.j(obj);
    }

    @Override // defpackage.aow, defpackage.aot
    public void l(Object obj) {
        this.e.set(true);
        super.l(obj);
    }

    public /* synthetic */ void n(aox aoxVar, Object obj) {
        if (this.e.compareAndSet(true, false)) {
            aoxVar.a(obj);
        }
    }
}
