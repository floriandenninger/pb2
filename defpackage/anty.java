package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anty extends qsg {
    public static final qnw a;
    private static final pse b;
    private static final qar c;

    static {
        pse pseVar = new pse();
        b = pseVar;
        antx antxVar = new antx();
        c = antxVar;
        a = new qnw("AppIndexing.API", antxVar, pseVar, null, null, null, null);
    }

    public anty(Context context, Looper looper, qrz qrzVar, qod qodVar, qoe qoeVar) {
        super(context, looper, 113, qrzVar, qodVar, qoeVar);
    }

    @Override // defpackage.qrx
    public final boolean R() {
        return true;
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 12600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        if (queryLocalInterface instanceof anuf) {
            return (anuf) queryLocalInterface;
        }
        return new anuf(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }
}
