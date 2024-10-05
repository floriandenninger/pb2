package defpackage;

import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fqp implements swv {
    public final slw a;
    private final ActiveStateLifecycleController b;

    public fqp(slw slwVar, ActiveStateLifecycleController activeStateLifecycleController, gem gemVar) {
        this.a = slwVar;
        this.b = activeStateLifecycleController;
        activeStateLifecycleController.c.add(gemVar);
    }

    @Override // defpackage.swv
    public final aomu a() {
        return asub.b;
    }

    @Override // defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, final swu swuVar) {
        get getVar;
        final asub asubVar = (asub) obj;
        int i = asubVar.c;
        if ((i & 2) != 0) {
            final int i2 = 1;
            if ((i & 1) != 0) {
                if (asubVar.g) {
                    return ayph.t(new ayrm(this) { // from class: fqo
                        public final /* synthetic */ fqp a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.ayrm
                        public final void a() {
                            if (i2 != 0) {
                                fqp fqpVar = this.a;
                                asub asubVar2 = asubVar;
                                swu swuVar2 = swuVar;
                                slw slwVar = fqpVar.a;
                                int ah = aobq.ah(asubVar2.d);
                                slwVar.a(ah == 0 ? 1 : ah, asubVar2.e, asubVar2.f, asubVar2.h, asubVar2.i, swuVar2);
                                return;
                            }
                            fqp fqpVar2 = this.a;
                            asub asubVar3 = asubVar;
                            swu swuVar3 = swuVar;
                            slw slwVar2 = fqpVar2.a;
                            int ah2 = aobq.ah(asubVar3.d);
                            slwVar2.a(ah2 == 0 ? 1 : ah2, asubVar3.e, asubVar3.f, asubVar3.h, asubVar3.i, swuVar3);
                        }
                    });
                }
                ActiveStateLifecycleController activeStateLifecycleController = this.b;
                int ah = aobq.ah(asubVar.d);
                if (ah == 0 || ah != 2) {
                    getVar = get.INACTIVE;
                } else {
                    getVar = get.ACTIVE;
                }
                final int i3 = 0;
                return activeStateLifecycleController.g(getVar).o(new ayrm(this) { // from class: fqo
                    public final /* synthetic */ fqp a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrm
                    public final void a() {
                        if (i3 != 0) {
                            fqp fqpVar = this.a;
                            asub asubVar2 = asubVar;
                            swu swuVar2 = swuVar;
                            slw slwVar = fqpVar.a;
                            int ah2 = aobq.ah(asubVar2.d);
                            slwVar.a(ah2 == 0 ? 1 : ah2, asubVar2.e, asubVar2.f, asubVar2.h, asubVar2.i, swuVar2);
                            return;
                        }
                        fqp fqpVar2 = this.a;
                        asub asubVar3 = asubVar;
                        swu swuVar3 = swuVar;
                        slw slwVar2 = fqpVar2.a;
                        int ah22 = aobq.ah(asubVar3.d);
                        slwVar2.a(ah22 == 0 ? 1 : ah22, asubVar3.e, asubVar3.f, asubVar3.h, asubVar3.i, swuVar3);
                    }
                });
            }
        }
        return ayph.f();
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }
}
