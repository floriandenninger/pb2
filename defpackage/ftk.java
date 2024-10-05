package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ftk implements fvw {
    final /* synthetic */ auzj a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ftm c;

    public ftk(ftm ftmVar, auzj auzjVar, boolean z) {
        this.c = ftmVar;
        this.a = auzjVar;
        this.b = z;
    }

    @Override // defpackage.fvw
    public final void a() {
        if (this.c.o(this.a)) {
            this.c.n(this.b);
        }
    }

    @Override // defpackage.fvw
    public final void b(asbp asbpVar) {
        fvd fvdVar;
        View a;
        arej arejVar;
        if (asbpVar != null) {
            asbn asbnVar = asbpVar.f;
            if (asbnVar == null) {
                asbnVar = asbn.a;
            }
            if (asbnVar.b != 102716411 || (fvdVar = this.c.d) == null || (a = fvdVar.a()) == null) {
                return;
            }
            akbu akbuVar = this.c.f;
            asbn asbnVar2 = asbpVar.f;
            if (asbnVar2 == null) {
                asbnVar2 = asbn.a;
            }
            if (asbnVar2.b == 102716411) {
                arejVar = (arej) asbnVar2.c;
            } else {
                arejVar = arej.a;
            }
            asbn asbnVar3 = asbpVar.f;
            if (asbnVar3 == null) {
                asbnVar3 = asbn.a;
            }
            akbuVar.b(arejVar, a, asbnVar3, this.c.i);
        }
    }

    @Override // defpackage.fvw
    public final void c() {
    }
}
