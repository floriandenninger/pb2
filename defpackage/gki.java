package defpackage;

import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gki implements adlr {
    final /* synthetic */ DefaultPipController a;

    public gki(DefaultPipController defaultPipController) {
        this.a = defaultPipController;
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        DefaultPipController defaultPipController = this.a;
        if (defaultPipController.t) {
            defaultPipController.t = false;
            defaultPipController.k(new gkg(defaultPipController, 4));
        }
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
        DefaultPipController defaultPipController = this.a;
        if (defaultPipController.t) {
            return;
        }
        defaultPipController.t = true;
        defaultPipController.k(new gkg(defaultPipController, 5));
    }
}
