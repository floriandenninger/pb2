package defpackage;

import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uie extends tyo {
    final /* synthetic */ ExpressSignInLayout b;

    public uie(ExpressSignInLayout expressSignInLayout) {
        this.b = expressSignInLayout;
    }

    @Override // defpackage.tyo
    public final void ae() {
        tyo.M(new Runnable() { // from class: uib
            @Override // java.lang.Runnable
            public final void run() {
                uie uieVar = uie.this;
                uieVar.b.g(true);
                ExpressSignInLayout expressSignInLayout = uieVar.b;
                expressSignInLayout.k(expressSignInLayout.e.b.d(), uieVar.b.e.b.a());
            }
        });
    }

    @Override // defpackage.tyo
    public final void af(final Object obj) {
        tyo.M(new Runnable() { // from class: uid
            @Override // java.lang.Runnable
            public final void run() {
                uie uieVar = uie.this;
                Object obj2 = obj;
                ExpressSignInLayout expressSignInLayout = uieVar.b;
                expressSignInLayout.k(expressSignInLayout.e.b.d(), obj2);
            }
        });
    }

    @Override // defpackage.tyo
    public final void ag(final amru amruVar) {
        tyo.M(new Runnable() { // from class: uic
            @Override // java.lang.Runnable
            public final void run() {
                uie uieVar = uie.this;
                amru amruVar2 = amruVar;
                ExpressSignInLayout expressSignInLayout = uieVar.b;
                expressSignInLayout.k(amruVar2, expressSignInLayout.e.b.a());
            }
        });
    }
}
