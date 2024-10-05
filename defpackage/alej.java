package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alej {
    private final alaj a;

    public alej(alaj alajVar) {
        this.a = alajVar;
    }

    public final awzu a(akzs akzsVar, alae alaeVar) {
        alaj alajVar = this.a;
        int m = akwg.m(akzsVar.s);
        if (m == 0) {
            m = 1;
        }
        alaf d = alajVar.d(m, Uri.parse(akzsVar.f), alaeVar);
        File f = alep.f(akzsVar);
        akzm akzmVar = akzsVar.x;
        if (akzmVar == null) {
            akzmVar = akzm.a;
        }
        alei aleiVar = new alei(akzmVar, d, f);
        alad a = aleiVar.a();
        if (a.b()) {
            return new alel(aleiVar, a);
        }
        return new alek(a);
    }
}
