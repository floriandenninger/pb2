package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.widget.RemoteViews;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ucr implements ucq {
    private final ubt b;
    private final Context c;
    private final two d;
    private final tzh e;

    public ucr(ubt ubtVar, Context context, twn twnVar, tzh tzhVar) {
        this.b = ubtVar;
        this.c = context;
        this.d = twnVar.d;
        this.e = tzhVar;
    }

    static float c(float f, Context context) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    static int d(int i, Context context) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    private final void e(RemoteViews remoteViews, int i, String str, txb txbVar) {
        aokd aokdVar = txbVar.d;
        if ((aokdVar.b & 8192) != 0) {
            remoteViews.setInt(i, str, aokdVar.q);
        } else if (this.d.c != null) {
            remoteViews.setInt(i, str, this.c.getResources().getColor(this.d.c.intValue()));
        }
    }

    @Override // defpackage.ucq
    public final txb a(txb txbVar) {
        if (tyo.n(this.c)) {
            return txbVar;
        }
        tws c = txbVar.c();
        c.d(txbVar.a);
        return c.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    @Override // defpackage.ucq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.twu r24, defpackage.txb r25, defpackage.dy r26, defpackage.ammv r27, defpackage.twd r28) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ucr.b(twu, txb, dy, ammv, twd):boolean");
    }
}
