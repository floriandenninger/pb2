package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcj extends dcd {
    private static final Handler b = new Handler(Looper.getMainLooper(), new dci(0));
    public final cor a;

    public dcj(cor corVar, int i, int i2) {
        super(i, i2);
        this.a = corVar;
    }

    @Override // defpackage.dcl
    public final void b(Object obj, dcs dcsVar) {
        dbs dbsVar = this.c;
        if (dbsVar == null || !dbsVar.l()) {
            return;
        }
        b.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.dcl
    public final void jZ(Drawable drawable) {
    }
}
