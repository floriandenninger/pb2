package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_LiveCreationActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class eln extends emb {
    private boolean l = false;

    public eln() {
        addOnContextAvailableListener(new elm(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.elj
    public final void c() {
        if (this.l) {
            return;
        }
        this.l = true;
        Shell_LiveCreationActivity shell_LiveCreationActivity = (Shell_LiveCreationActivity) this;
        eed eedVar = (eed) lM();
        ((emb) shell_LiveCreationActivity).a = (env) eedVar.a.wr.get();
        ((emb) shell_LiveCreationActivity).b = (Handler) eedVar.a.an.get();
        shell_LiveCreationActivity.c = (elf) eedVar.a.ne.get();
        shell_LiveCreationActivity.d = (aaea) eedVar.a.K.get();
        shell_LiveCreationActivity.e = (ymp) eedVar.a.V.get();
        shell_LiveCreationActivity.f = ammv.j(eedVar.c);
        shell_LiveCreationActivity.g = (yys) eedVar.a.X.get();
        shell_LiveCreationActivity.h = (eni) eedVar.a.cL.get();
        shell_LiveCreationActivity.j = (adpl) eedVar.a.ws.get();
        shell_LiveCreationActivity.i = (aadw) eedVar.a.D.get();
    }
}
