package defpackage;

import android.os.SystemClock;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajja implements sxq {
    final /* synthetic */ akav a;
    final /* synthetic */ ajjc b;

    public ajja(ajjc ajjcVar, akav akavVar) {
        this.b = ajjcVar;
        this.a = akavVar;
    }

    @Override // defpackage.sxq
    public final void a(View view, szk szkVar) {
        if (view != null) {
            this.a.onTouch(view, this.b.b(SystemClock.uptimeMillis(), 1, szkVar));
        }
    }
}
