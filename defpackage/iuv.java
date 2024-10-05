package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iuv extends ajsv {
    final /* synthetic */ lxu a;

    public iuv(lxu lxuVar) {
        this.a = lxuVar;
    }

    @Override // defpackage.ajsv, defpackage.ajww
    public final void c(aamd aamdVar, boolean z) {
        auoo auooVar;
        auov auovVar = aamdVar.a;
        if ((auovVar.c & 4) != 0) {
            auos auosVar = auovVar.h;
            if (auosVar == null) {
                auosVar = auos.a;
            }
            if (auosVar.b == 105924295) {
                auooVar = (auoo) auosVar.c;
            } else {
                auooVar = auoo.a;
            }
        } else {
            auooVar = null;
        }
        if (auooVar != null) {
            this.a.p(auooVar);
        }
    }
}
