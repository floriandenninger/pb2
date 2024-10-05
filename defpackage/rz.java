package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rz extends rc {
    final /* synthetic */ sb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(sb sbVar, Context context, qq qqVar, View view) {
        super(context, qqVar, view, true);
        this.d = sbVar;
        this.b = 8388613;
        e(sbVar.n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rc
    public final void c() {
        qq qqVar = this.d.c;
        if (qqVar != null) {
            qqVar.close();
        }
        this.d.k = null;
        super.c();
    }
}
