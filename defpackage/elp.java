package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_MediaSearchActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class elp extends emb {
    private boolean l = false;

    public elp() {
        addOnContextAvailableListener(new elo(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.elj
    public final void c() {
        if (this.l) {
            return;
        }
        this.l = true;
        Shell_MediaSearchActivity shell_MediaSearchActivity = (Shell_MediaSearchActivity) this;
        eed eedVar = (eed) lM();
        ((emb) shell_MediaSearchActivity).a = (env) eedVar.a.wr.get();
        ((emb) shell_MediaSearchActivity).b = (Handler) eedVar.a.an.get();
        shell_MediaSearchActivity.c = (elf) eedVar.a.ne.get();
        shell_MediaSearchActivity.d = (aaea) eedVar.a.K.get();
        shell_MediaSearchActivity.e = (ymp) eedVar.a.V.get();
        shell_MediaSearchActivity.f = ammv.j(eedVar.c);
        shell_MediaSearchActivity.g = (yys) eedVar.a.X.get();
        shell_MediaSearchActivity.h = (eni) eedVar.a.cL.get();
        shell_MediaSearchActivity.j = (adpl) eedVar.a.ws.get();
        shell_MediaSearchActivity.i = (aadw) eedVar.a.D.get();
    }
}
