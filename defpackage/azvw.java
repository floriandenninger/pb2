package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azvw extends azxi {
    public final azvt a;

    public azvw(azvt azvtVar) {
        this.a = azvtVar;
    }

    @Override // defpackage.aztu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b((Throwable) obj);
        return azsf.a;
    }

    @Override // defpackage.azwe
    public final void b(Throwable th) {
        azvt azvtVar = this.a;
        CancellationException h = e().h();
        if (azvtVar.k()) {
            azzm azzmVar = (azzm) azvtVar.a;
            azvm azvmVar = azzmVar.e;
            while (true) {
                Object obj = azvmVar.a;
                if (azul.c(obj, azzn.b)) {
                    if (azzmVar.e.c(azzn.b, h)) {
                        return;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    if (azzmVar.e.c(obj, null)) {
                        break;
                    }
                }
            }
        }
        azvtVar.l(h);
        azvtVar.i();
    }
}
