package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afdy extends ozs {
    private final pbh d;

    public afdy(ozt oztVar, afdw afdwVar, int i, Handler handler, ozr ozrVar, int i2, int i3, pbh pbhVar) {
        super(oztVar, afdwVar, i, handler, ozrVar, i2, i3);
        this.d = pbhVar;
    }

    @Override // defpackage.ozs, defpackage.oyq
    public int b(int i, long j, oyn oynVar, oyp oypVar) {
        pbh pbhVar;
        int b = super.b(i, j, oynVar, oypVar);
        if (b != -4 || (pbhVar = this.d) == null) {
            return b;
        }
        pbhVar.d(oynVar.b);
        return -4;
    }
}
