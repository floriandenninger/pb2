package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axgq extends OrientationEventListener {
    final /* synthetic */ axgs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axgq(axgs axgsVar, Context context) {
        super(context);
        this.a = axgsVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        axgs axgsVar = this.a;
        axgsVar.a = i;
        if (!axgsVar.b) {
            axgsVar.a();
        } else if (!axgs.d(i)) {
            Math.abs(i - 90);
        } else {
            this.a.f(false);
        }
    }
}
