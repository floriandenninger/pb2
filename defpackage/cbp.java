package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbp extends cbm {
    static {
        ajbh.S("NetworkNotRoamingCtrlr");
    }

    public cbp(Context context, cfa cfaVar) {
        super(ccc.a(context, cfaVar).c);
    }

    @Override // defpackage.cbm
    public final boolean b(cda cdaVar) {
        return cdaVar.k.i == 4;
    }

    @Override // defpackage.cbm
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        cbg cbgVar = (cbg) obj;
        if (Build.VERSION.SDK_INT >= 24) {
            return (cbgVar.a && cbgVar.d) ? false : true;
        }
        ajbh.X().T(new Throwable[0]);
        return !cbgVar.a;
    }
}
