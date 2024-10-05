package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_SettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class elt extends emb {
    private boolean l = false;

    public elt() {
        addOnContextAvailableListener(new els(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.elj
    public final void c() {
        if (this.l) {
            return;
        }
        this.l = true;
        Shell_SettingsActivity shell_SettingsActivity = (Shell_SettingsActivity) this;
        eed eedVar = (eed) lM();
        ((emb) shell_SettingsActivity).a = (env) eedVar.a.wr.get();
        ((emb) shell_SettingsActivity).b = (Handler) eedVar.a.an.get();
        shell_SettingsActivity.c = (elf) eedVar.a.ne.get();
        shell_SettingsActivity.d = (aaea) eedVar.a.K.get();
        shell_SettingsActivity.e = (ymp) eedVar.a.V.get();
        shell_SettingsActivity.f = ammv.j(eedVar.c);
        shell_SettingsActivity.g = (yys) eedVar.a.X.get();
        shell_SettingsActivity.h = (eni) eedVar.a.cL.get();
        shell_SettingsActivity.j = (adpl) eedVar.a.ws.get();
        shell_SettingsActivity.i = (aadw) eedVar.a.D.get();
    }
}
