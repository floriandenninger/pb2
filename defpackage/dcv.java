package defpackage;

import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcv implements dcs {
    private final dsm a;

    public dcv(dsm dsmVar, byte[] bArr) {
        this.a = dsmVar;
    }

    @Override // defpackage.dcs
    public final void a(dcr dcrVar) {
        View n = dcrVar.n();
        n.clearAnimation();
        n.startAnimation(AnimationUtils.loadAnimation(n.getContext(), this.a.c));
    }
}
