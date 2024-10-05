package defpackage;

import android.content.Context;
import android.media.MediaRouter;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes2.dex */
class bqz extends bqy implements bpy {
    private bqc r;
    private jo s;

    public bqz(Context context, brb brbVar) {
        super(context, brbVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bqy
    public void m(bqw bqwVar, bot botVar) {
        super.m(bqwVar, botVar);
        if (!((MediaRouter.RouteInfo) bqwVar.a).isEnabled()) {
            botVar.g(false);
        }
        if (D(bqwVar)) {
            botVar.d(1);
        }
        Display g = jo.g(bqwVar.a);
        if (g != null) {
            botVar.j(g.getDisplayId());
        }
    }

    @Override // defpackage.bqy
    protected final Object q() {
        return new bqd(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bqy
    public void z() {
        super.z();
        if (this.r == null) {
            this.r = new bqc(0);
        }
        throw null;
    }

    protected boolean D(bqw bqwVar) {
        if (this.s == null) {
            this.s = new jo();
        }
        Object obj = bqwVar.a;
        throw null;
    }
}
