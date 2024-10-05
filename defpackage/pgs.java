package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class pgs implements pga {
    public final pgg a;
    public final pgf b;
    public final int c;
    public volatile String d;
    public int e;
    public pge f;
    public pgh g;
    public long h;
    public int i;
    public long j;
    public pgq k;
    public volatile Object l;
    public volatile long m;
    public volatile long n;

    public pgs(String str, pgf pgfVar, pgg pggVar, int i) {
        this.a = pggVar;
        this.d = str;
        this.b = pgfVar;
        this.c = i;
    }

    @Override // defpackage.pga
    public void n(pgc pgcVar) {
        pgh pghVar = this.g;
        if (pghVar != pgcVar) {
            return;
        }
        this.l = pghVar.a;
        this.m = this.h;
        this.n = SystemClock.elapsedRealtime();
        this.i = 0;
        this.k = null;
        if (this.l instanceof pao) {
            String str = ((pao) this.l).f;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.d = str;
        }
    }

    @Override // defpackage.pga
    public void o(pgc pgcVar, IOException iOException) {
        if (this.g != pgcVar) {
            return;
        }
        this.i++;
        this.j = SystemClock.elapsedRealtime();
        this.k = new pgq(iOException);
    }

    @Override // defpackage.pga
    public final void p() {
    }
}
