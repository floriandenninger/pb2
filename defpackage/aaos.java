package defpackage;

import android.os.Handler;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaos extends pgs {
    public Handler o;
    public afbb p;

    public aaos(String str, pgf pgfVar, pgg pggVar, int i) {
        super(str, pgfVar, pggVar, i);
    }

    @Override // defpackage.pgs, defpackage.pga
    public final void n(pgc pgcVar) {
        super.n(pgcVar);
        Handler handler = this.o;
        if (handler == null || this.p == null) {
            return;
        }
        handler.post(new omm(9));
    }

    @Override // defpackage.pgs, defpackage.pga
    public final void o(pgc pgcVar, final IOException iOException) {
        super.o(pgcVar, iOException);
        Handler handler = this.o;
        if (handler == null || this.p == null) {
            return;
        }
        handler.post(new Runnable() { // from class: aaor
            @Override // java.lang.Runnable
            public final void run() {
                aaos aaosVar = aaos.this;
                IOException iOException2 = iOException;
                afbb afbbVar = aaosVar.p;
                if (afbbVar != null) {
                    afbs afbsVar = afbbVar.a;
                    afbsVar.f.g(afbsVar.l.a(iOException2, afbsVar.g(), afbbVar.a.b, afif.DEFAULT, afbbVar.a.t));
                }
            }
        });
    }
}
