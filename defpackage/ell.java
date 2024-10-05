package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_HomeActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ell extends emb {
    private boolean l = false;

    public ell() {
        addOnContextAvailableListener(new elk(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.elj
    public final void c() {
        if (this.l) {
            return;
        }
        this.l = true;
        Shell_HomeActivity shell_HomeActivity = (Shell_HomeActivity) this;
        eed eedVar = (eed) lM();
        ((emb) shell_HomeActivity).a = (env) eedVar.a.wr.get();
        ((emb) shell_HomeActivity).b = (Handler) eedVar.a.an.get();
        shell_HomeActivity.c = (elf) eedVar.a.ne.get();
        shell_HomeActivity.d = (aaea) eedVar.a.K.get();
        shell_HomeActivity.e = (ymp) eedVar.a.V.get();
        shell_HomeActivity.f = ammv.j(eedVar.c);
        shell_HomeActivity.g = (yys) eedVar.a.X.get();
        shell_HomeActivity.h = (eni) eedVar.a.cL.get();
        shell_HomeActivity.j = (adpl) eedVar.a.ws.get();
        shell_HomeActivity.i = (aadw) eedVar.a.D.get();
    }
}
