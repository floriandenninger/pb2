package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxr implements ajom {
    public final mxt a;

    public mxr(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ohg ohgVar, shf shfVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new mxt(context, ajjzVar, View.inflate(context, i, null), aahdVar, ajutVar, shfVar, ohgVar, null, null, null);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a.i;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.b(ajosVar);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        this.a.oB(ajokVar, ((mxq) obj).a);
    }
}
