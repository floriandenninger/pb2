package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azzn {
    public static final baac a = new baac("UNDEFINED");
    public static final baac b = new baac("REUSABLE_CLAIMED");

    public static final void a(azsq azsqVar, Object obj) {
        if (azsqVar instanceof azzm) {
            azzm azzmVar = (azzm) azsqVar;
            Object l = azth.l(obj);
            if (azzmVar.a.d(azzmVar.getContext())) {
                azzmVar.c = l;
                azzmVar.f = 1;
                azzmVar.a.so(azzmVar.getContext(), azzmVar);
                return;
            }
            boolean z = azwq.a;
            azwy a2 = azxw.a.a();
            if (a2.h()) {
                azzmVar.c = l;
                azzmVar.f = 1;
                a2.e(azzmVar);
                return;
            }
            a2.f(true);
            try {
                azxg azxgVar = (azxg) azzmVar.getContext().get(azxg.b);
                if (azxgVar != null && !azxgVar.l()) {
                    CancellationException h = azxgVar.h();
                    azzmVar.g(l, h);
                    azzmVar.resumeWith(aype.l(h));
                } else {
                    azsq azsqVar2 = azzmVar.b;
                    Object obj2 = azzmVar.d;
                    azsv context = azsqVar2.getContext();
                    Object b2 = baae.b(context, obj2);
                    if (b2 != baae.a) {
                        azwh.c(azsqVar2, context);
                    }
                    try {
                        azzmVar.b.resumeWith(obj);
                    } finally {
                        baae.c(context, b2);
                    }
                }
                do {
                } while (a2.i());
                return;
            } catch (Throwable th) {
                try {
                    azzmVar.q(th, null);
                    return;
                } finally {
                    a2.j();
                }
            }
        }
        azsqVar.resumeWith(obj);
    }
}
