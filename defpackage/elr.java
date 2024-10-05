package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_ResultsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class elr extends emb {
    private boolean l = false;

    public elr() {
        addOnContextAvailableListener(new elq(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.elj
    public final void c() {
        if (this.l) {
            return;
        }
        this.l = true;
        Shell_ResultsActivity shell_ResultsActivity = (Shell_ResultsActivity) this;
        eed eedVar = (eed) lM();
        ((emb) shell_ResultsActivity).a = (env) eedVar.a.wr.get();
        ((emb) shell_ResultsActivity).b = (Handler) eedVar.a.an.get();
        shell_ResultsActivity.c = (elf) eedVar.a.ne.get();
        shell_ResultsActivity.d = (aaea) eedVar.a.K.get();
        shell_ResultsActivity.e = (ymp) eedVar.a.V.get();
        shell_ResultsActivity.f = ammv.j(eedVar.c);
        shell_ResultsActivity.g = (yys) eedVar.a.X.get();
        shell_ResultsActivity.h = (eni) eedVar.a.cL.get();
        shell_ResultsActivity.j = (adpl) eedVar.a.ws.get();
        shell_ResultsActivity.i = (aadw) eedVar.a.D.get();
    }
}
