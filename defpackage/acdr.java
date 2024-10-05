package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acdr implements ajoq {
    final /* synthetic */ acds a;
    private final /* synthetic */ int b;

    public acdr(acds acdsVar, int i) {
        this.b = i;
        this.a = acdsVar;
    }

    @Override // defpackage.ajoq
    public final /* synthetic */ ajom b(ViewGroup viewGroup) {
        if (this.b != 0) {
            acdw acdwVar = this.a.a;
            return new ackc(acdwVar.c, null, acdwVar.k);
        }
        acdw acdwVar2 = this.a.a;
        Context context = acdwVar2.c;
        ajjs ajjsVar = acdwVar2.l;
        acqz acqzVar = new acqz() { // from class: acdq
            @Override // defpackage.acqz
            public final acra mM() {
                return acdr.this.a.a.i;
            }
        };
        acdw acdwVar3 = this.a.a;
        return new ackd(context, ajjsVar, acqzVar, null, acdwVar3.m, acdwVar3.k, acdwVar3.w, null, null, null, null);
    }
}
