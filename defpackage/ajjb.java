package defpackage;

import android.os.SystemClock;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajjb implements sxo {
    final /* synthetic */ akav a;
    final /* synthetic */ ajjc b;

    public ajjb(ajjc ajjcVar, akav akavVar) {
        this.b = ajjcVar;
        this.a = akavVar;
    }

    @Override // defpackage.sxo
    public final void a(View view) {
        if (view != null) {
            this.a.onTouch(view, this.b.b(SystemClock.uptimeMillis(), 3, new szk(0.0f, 0.0f)));
        }
    }
}
