package defpackage;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzb implements ylb {
    private final azrw a;
    private final aaea b;

    public afzb(azrw azrwVar, aaea aaeaVar) {
        this.a = azrwVar;
        this.b = aaeaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(ylf ylfVar, atob atobVar) {
        if (!d(atobVar)) {
            try {
                ylfVar.c("notification_registration_task");
            } catch (NoSuchMethodError unused) {
            }
        } else {
            ylfVar.d("notification_registration_task", atobVar.c, atobVar.d, true, 2, false, null, null);
        }
    }

    public static void c(aaea aaeaVar, final ylf ylfVar, azrw azrwVar) {
        aaeaVar.a.ab(azre.b((Executor) azrwVar.get())).Y(afly.i).B().ax(new ayrs() { // from class: afza
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                afzb.b(ylf.this, (atob) obj);
            }
        });
    }

    private static boolean d(atob atobVar) {
        return atobVar.b && atobVar.c > 0 && atobVar.d > 0;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        atog atogVar = this.b.a().p;
        if (atogVar == null) {
            atogVar = atog.a;
        }
        atob atobVar = atogVar.h;
        if (atobVar == null) {
            atobVar = atob.a;
        }
        if (!d(atobVar)) {
            return 0;
        }
        ((agcf) this.a.get()).d();
        return 0;
    }
}
