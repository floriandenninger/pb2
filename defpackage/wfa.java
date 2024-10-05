package defpackage;

import android.app.Activity;
import android.os.Handler;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;
import com.google.protos.youtube.api.innertube.PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wfa extends wed {
    private wex f;
    private final dd g;

    public wfa(aahd aahdVar, Handler handler, wfz wfzVar, Activity activity) {
        super(aahdVar, handler, wfzVar);
        this.g = ((ci) activity).getSupportFragmentManager();
    }

    @Override // defpackage.wed
    public final void b() {
        this.f.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void c(int i) {
        super.c(i);
        this.f.aH();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void d(int i) {
        super.d(i);
        this.f.aH();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void e(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer) {
        wex wexVar = this.f;
        wexVar.aI();
        wexVar.aJ(fingerprintAuthRendererOuterClass$FingerprintAuthRenderer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void f(wfu wfuVar) {
        wex wexVar = this.f;
        wexVar.aI();
        wexVar.aJ(wfuVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void g(PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer) {
        wex wexVar = this.f;
        wexVar.aI();
        wexVar.aJ(passwordAuthRendererOuterClass$PasswordAuthRenderer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void h(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer) {
        wex wexVar = this.f;
        wexVar.aI();
        wexVar.aJ(passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void i(aqws aqwsVar) {
        wex wexVar = this.f;
        wexVar.aI();
        wexVar.aJ(aqwsVar);
    }

    @Override // defpackage.wed
    public final void k(InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand) {
        wex wexVar = (wex) this.g.f("INLINE_AUTH_FRAGMENT_TAG");
        this.f = wexVar;
        if (wexVar == null) {
            wex wexVar2 = new wex();
            wexVar2.ae = this;
            this.f = wexVar2;
            dn k = this.g.k();
            k.r(this.f, "INLINE_AUTH_FRAGMENT_TAG");
            k.a();
        } else if (!wexVar.av()) {
            this.f.ae = this;
            dn k2 = this.g.k();
            k2.n(this.f);
            k2.a();
        }
        super.k(inlineAuthCommandOuterClass$InlineAuthCommand);
    }
}
