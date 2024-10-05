package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_UploadActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class elv extends emb {
    private boolean l = false;

    public elv() {
        addOnContextAvailableListener(new elu(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.elj
    public final void c() {
        if (this.l) {
            return;
        }
        this.l = true;
        Shell_UploadActivity shell_UploadActivity = (Shell_UploadActivity) this;
        eed eedVar = (eed) lM();
        ((emb) shell_UploadActivity).a = (env) eedVar.a.wr.get();
        ((emb) shell_UploadActivity).b = (Handler) eedVar.a.an.get();
        shell_UploadActivity.c = (elf) eedVar.a.ne.get();
        shell_UploadActivity.d = (aaea) eedVar.a.K.get();
        shell_UploadActivity.e = (ymp) eedVar.a.V.get();
        shell_UploadActivity.f = ammv.j(eedVar.c);
        shell_UploadActivity.g = (yys) eedVar.a.X.get();
        shell_UploadActivity.h = (eni) eedVar.a.cL.get();
        shell_UploadActivity.j = (adpl) eedVar.a.ws.get();
        shell_UploadActivity.i = (aadw) eedVar.a.D.get();
    }
}
