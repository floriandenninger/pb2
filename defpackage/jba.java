package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jba extends OrientationEventListener {
    final /* synthetic */ jbe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jba(jbe jbeVar, Context context) {
        super(context);
        this.a = jbeVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        this.a.e();
    }
}
