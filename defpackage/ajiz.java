package defpackage;

import android.os.SystemClock;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajiz implements sxp {
    final /* synthetic */ akav a;
    final /* synthetic */ ajjc b;

    public ajiz(ajjc ajjcVar, akav akavVar) {
        this.b = ajjcVar;
        this.a = akavVar;
    }

    @Override // defpackage.sxp
    public final void a(View view, szk szkVar) {
        this.b.a = SystemClock.uptimeMillis();
        if (view != null) {
            akav akavVar = this.a;
            ajjc ajjcVar = this.b;
            akavVar.onTouch(view, ajjcVar.b(ajjcVar.a, 0, szkVar));
        }
    }
}
