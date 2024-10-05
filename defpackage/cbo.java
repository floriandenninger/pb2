package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbo extends cbm {
    static {
        ajbh.S("NetworkMeteredCtrlr");
    }

    public cbo(Context context, cfa cfaVar) {
        super(ccc.a(context, cfaVar).c);
    }

    @Override // defpackage.cbm
    public final boolean b(cda cdaVar) {
        return cdaVar.k.i == 5;
    }

    @Override // defpackage.cbm
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        cbg cbgVar = (cbg) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return (cbgVar.a && cbgVar.c) ? false : true;
        }
        ajbh.X().T(new Throwable[0]);
        return !cbgVar.a;
    }
}
