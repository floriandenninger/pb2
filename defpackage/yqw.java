package defpackage;

import defpackage.aok;
import defpackage.yqv;
import defpackage.zfi;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yqw {
    public final aof a;

    public yqw(aof aofVar) {
        aofVar.getClass();
        this.a = aofVar;
    }

    public static void e(Runnable runnable) {
        if (yjk.h()) {
            runnable.run();
        } else {
            ayqr.a().f(runnable);
        }
    }

    private final aypy i(final yqv yqvVar) {
        return d().Y(new ayrv() { // from class: yqp
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                return Boolean.valueOf(((yqv) obj).ordinal() >= yqv.this.ordinal());
            }
        }).B();
    }

    private final void j(yqv yqvVar, Callable callable) {
        callable.getClass();
        i(yqvVar).aE(new yqt(callable));
    }

    public final ayph a() {
        return d().h();
    }

    public final aypy b() {
        return i(yqv.RESUMED);
    }

    public final aypy c() {
        return i(yqv.STARTED);
    }

    public final aypy d() {
        return aypy.v(new ayqa() { // from class: yqn
            @Override // defpackage.ayqa
            public final void a(final aypz aypzVar) {
                final yqw yqwVar = yqw.this;
                yqw.e(new Runnable() { // from class: yqr
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        final yqw yqwVar2 = yqw.this;
                        final aypz aypzVar2 = aypzVar;
                        final Runnable runnable = new Runnable() { // from class: yqs
                            @Override // java.lang.Runnable
                            public final void run() {
                                aypz aypzVar3 = aypz.this;
                                if (aypzVar3.e()) {
                                    return;
                                }
                                aypzVar3.a();
                            }
                        };
                        if (yqwVar2.a.a() == aoe.DESTROYED) {
                            runnable.run();
                            return;
                        }
                        final zfi zfiVar = new zfi() { // from class: yqm
                            @Override // defpackage.zfi
                            public final void a(Object obj) {
                                aypz aypzVar3 = aypz.this;
                                yqv yqvVar = (yqv) obj;
                                if (aypzVar3.e()) {
                                    return;
                                }
                                aypzVar3.d(yqvVar);
                            }
                        };
                        final any anyVar = new any() { // from class: com.google.android.libraries.youtube.common.lifecycle.rx.RxLifecycle$2
                            @Override // defpackage.aoa
                            public final void lc(aok aokVar) {
                                zfi.this.a(yqv.STARTED);
                            }

                            @Override // defpackage.any, defpackage.aoa
                            public final void lg(aok aokVar) {
                                zfi.this.a(yqv.CREATED);
                            }

                            @Override // defpackage.any, defpackage.aoa
                            public final void lh(aok aokVar) {
                                runnable.run();
                            }

                            @Override // defpackage.any, defpackage.aoa
                            public final void nu(aok aokVar) {
                                zfi.this.a(yqv.RESUMED);
                            }

                            @Override // defpackage.aoa
                            public final void nv(aok aokVar) {
                                zfi.this.a(yqv.CREATED);
                            }

                            @Override // defpackage.any, defpackage.aoa
                            public final void ot(aok aokVar) {
                                zfi.this.a(yqv.STARTED);
                            }
                        };
                        ayrz.f((AtomicReference) aypzVar2, aynu.e(new ayrm() { // from class: yqo
                            @Override // defpackage.ayrm
                            public final void a() {
                                final yqw yqwVar3 = yqw.this;
                                final aoj aojVar = anyVar;
                                yqw.e(new Runnable() { // from class: yqq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        yqw yqwVar4 = yqw.this;
                                        yqwVar4.a.c(aojVar);
                                    }
                                });
                            }
                        }));
                        yqwVar2.a.b(anyVar);
                    }
                });
            }
        });
    }

    public final void f(Callable callable) {
        j(yqv.CREATED, callable);
    }

    public final void g(Callable callable) {
        j(yqv.RESUMED, callable);
    }

    public final void h(Callable callable) {
        j(yqv.STARTED, callable);
    }
}
