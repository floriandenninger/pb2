package defpackage;

import android.content.Context;
import android.media.MediaRouter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqu extends bra {
    public bqu(Context context, brb brbVar) {
        super(context, brbVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bra, defpackage.bqz, defpackage.bqy
    public final void m(bqw bqwVar, bot botVar) {
        super.m(bqwVar, botVar);
        botVar.f(((MediaRouter.RouteInfo) bqwVar.a).getDeviceType());
    }
}
