package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbn extends cbm {
    public cbn(Context context, cfa cfaVar) {
        super(ccc.a(context, cfaVar).c);
    }

    @Override // defpackage.cbm
    public final boolean b(cda cdaVar) {
        return cdaVar.k.i == 2;
    }

    @Override // defpackage.cbm
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        cbg cbgVar = (cbg) obj;
        return Build.VERSION.SDK_INT >= 26 ? (cbgVar.a && cbgVar.b) ? false : true : !cbgVar.a;
    }
}
