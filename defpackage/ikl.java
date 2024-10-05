package defpackage;

import android.text.style.ClickableSpan;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ikl implements ajck {
    final /* synthetic */ ikn a;

    public ikl(ikn iknVar) {
        this.a = iknVar;
    }

    @Override // defpackage.ajck
    public final ClickableSpan a(apxf apxfVar) {
        int bU;
        aukf aukfVar = this.a.v;
        return new ikk(this.a.f, apxfVar, aukfVar == null || (aukfVar.b & 4096) == 0 || (bU = aobq.bU(aukfVar.o)) == 0 || bU != 12);
    }
}
