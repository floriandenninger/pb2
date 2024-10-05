package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alge implements iw {
    final /* synthetic */ algj a;

    public alge(algj algjVar) {
        this.a = algjVar;
    }

    @Override // defpackage.iw
    public final ko a(View view, ko koVar) {
        algj algjVar = this.a;
        algb algbVar = algjVar.g;
        if (algbVar != null) {
            algjVar.b.A(algbVar);
        }
        algj algjVar2 = this.a;
        algjVar2.g = new algi(algjVar2.c, koVar);
        algj algjVar3 = this.a;
        algjVar3.b.y(algjVar3.g);
        return koVar;
    }
}
