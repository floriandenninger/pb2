package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_UrlActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class elx extends emj {
    private boolean l = false;

    public elx() {
        addOnContextAvailableListener(new elw(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.elj
    public final void c() {
        if (this.l) {
            return;
        }
        this.l = true;
        Shell_UrlActivity shell_UrlActivity = (Shell_UrlActivity) this;
        eed eedVar = (eed) lM();
        ((emb) shell_UrlActivity).a = (env) eedVar.a.wr.get();
        ((emb) shell_UrlActivity).b = (Handler) eedVar.a.an.get();
        shell_UrlActivity.c = (elf) eedVar.a.ne.get();
        shell_UrlActivity.d = (aaea) eedVar.a.K.get();
        shell_UrlActivity.e = (ymp) eedVar.a.V.get();
        shell_UrlActivity.f = ammv.j(eedVar.c);
        shell_UrlActivity.g = (yys) eedVar.a.X.get();
        shell_UrlActivity.h = (eni) eedVar.a.cL.get();
        shell_UrlActivity.j = (adpl) eedVar.a.ws.get();
        shell_UrlActivity.i = (aadw) eedVar.a.D.get();
    }
}
