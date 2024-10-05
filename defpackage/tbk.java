package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tbk {
    static {
        tbl tblVar = tbl.b;
    }

    public static /* synthetic */ aksx a() {
        return new aksx(Looper.getMainLooper().getThread() == Thread.currentThread(), Thread.currentThread().getId());
    }
}
