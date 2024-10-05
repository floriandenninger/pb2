package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbq extends cbm {
    public cbq(Context context, cfa cfaVar) {
        super(ccc.a(context, cfaVar).c);
    }

    @Override // defpackage.cbm
    public final boolean b(cda cdaVar) {
        return cdaVar.k.i == 3 || (Build.VERSION.SDK_INT >= 30 && cdaVar.k.i == 6);
    }

    @Override // defpackage.cbm
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        cbg cbgVar = (cbg) obj;
        return !cbgVar.a || cbgVar.c;
    }
}
