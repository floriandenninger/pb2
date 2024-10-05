package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akoe implements swv {
    public final akoi a;
    private final Activity b;
    private final /* synthetic */ int c;

    public akoe(Activity activity, akoi akoiVar, int i) {
        this.c = i;
        this.b = activity;
        this.a = akoiVar;
    }

    public akoe(Activity activity, akoi akoiVar, int i, byte[] bArr) {
        this.c = i;
        this.b = activity;
        this.a = akoiVar;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    public final aomu a() {
        return this.c != 0 ? apwu.b : atsp.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, swu swuVar) {
        Object[] objArr = 0;
        if (this.c == 0) {
            final atsp atspVar = (atsp) obj;
            if (!(this.a instanceof akok)) {
                sxc sxcVar = swuVar.i;
                final syg b = sxcVar != null ? sxcVar.b() : null;
                return ayph.t(new ayrm() { // from class: akod
                    @Override // defpackage.ayrm
                    public final void a() {
                        akoe akoeVar = akoe.this;
                        atsp atspVar2 = atspVar;
                        syg sygVar = b;
                        if ((atspVar2.c & 2) == 0) {
                            akoi akoiVar = akoeVar.a;
                            awos awosVar = atspVar2.d;
                            if (awosVar == null) {
                                awosVar = awos.a;
                            }
                            akoiVar.f(awosVar, sygVar);
                            return;
                        }
                        akoi akoiVar2 = akoeVar.a;
                        awos awosVar2 = atspVar2.d;
                        if (awosVar2 == null) {
                            awosVar2 = awos.a;
                        }
                        aufc b2 = aufc.b(atspVar2.e);
                        if (b2 == null) {
                            b2 = aufc.PRESENTATION_STYLE_UNKNOWN;
                        }
                        akoiVar2.g(awosVar2, sygVar, b2);
                    }
                });
            }
            String valueOf = String.valueOf(this.b.getClass().getName());
            return ayph.s(new IllegalStateException(valueOf.length() != 0 ? "Handler for OpenElementsScreenCommand was asked from an Activity which doesn't provide one: ".concat(valueOf) : new String("Handler for OpenElementsScreenCommand was asked from an Activity which doesn't provide one: ")));
        }
        final apwu apwuVar = (apwu) obj;
        if (!(this.a instanceof akok)) {
            final Object[] objArr2 = objArr == true ? 1 : 0;
            return ayph.t(new ayrm(apwuVar, objArr2) { // from class: akob
                public final /* synthetic */ apwu a;

                @Override // defpackage.ayrm
                public final void a() {
                    akoe akoeVar = akoe.this;
                    apwu apwuVar2 = this.a;
                    if ((apwuVar2.c & 1) == 0) {
                        akoeVar.a.b();
                        return;
                    }
                    akoi akoiVar = akoeVar.a;
                    aufc b2 = aufc.b(apwuVar2.d);
                    if (b2 == null) {
                        b2 = aufc.PRESENTATION_STYLE_UNKNOWN;
                    }
                    akoiVar.c(b2);
                }
            });
        }
        String valueOf2 = String.valueOf(this.b.getClass().getName());
        return ayph.s(new IllegalStateException(valueOf2.length() != 0 ? "Handler for CloseElementsScreenCommand was asked from an Activity which doesn't provide one: ".concat(valueOf2) : new String("Handler for CloseElementsScreenCommand was asked from an Activity which doesn't provide one: ")));
    }
}
