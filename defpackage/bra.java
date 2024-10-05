package defpackage;

import android.content.Context;
import android.media.MediaRouter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class bra extends bqz {
    public bra(Context context, brb brbVar) {
        super(context, brbVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bqy
    public final void B(bqx bqxVar) {
        super.B(bqxVar);
        ((MediaRouter.UserRouteInfo) bqxVar.b).setDescription(bqxVar.a.e);
    }

    @Override // defpackage.bqz
    protected final boolean D(bqw bqwVar) {
        return ((MediaRouter.RouteInfo) bqwVar.a).isConnecting();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bqz, defpackage.bqy
    public void m(bqw bqwVar, bot botVar) {
        super.m(bqwVar, botVar);
        CharSequence description = ((MediaRouter.RouteInfo) bqwVar.a).getDescription();
        if (description != null) {
            botVar.e(description.toString());
        }
    }

    @Override // defpackage.bqy
    protected final Object r() {
        return ((MediaRouter) this.a).getDefaultRoute();
    }

    @Override // defpackage.bqy
    protected final void y(Object obj) {
        ((MediaRouter) this.a).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bqz, defpackage.bqy
    public final void z() {
        if (this.o) {
            jn.c(this.a, this.b);
        }
        this.o = true;
        Object obj = this.a;
        ((MediaRouter) obj).addCallback(this.m, (MediaRouter.Callback) this.b, (this.n ? 1 : 0) | 2);
    }
}
