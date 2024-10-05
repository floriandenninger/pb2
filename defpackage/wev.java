package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;
import com.google.protos.youtube.api.innertube.PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wev extends wed {
    private final dd f;
    private wez g;

    public wev(aahd aahdVar, Handler handler, wfz wfzVar, ci ciVar) {
        super(aahdVar, handler, wfzVar);
        this.f = ciVar.getSupportFragmentManager();
    }

    @Override // defpackage.wed
    public final void b() {
        this.g.o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void c(int i) {
        super.c(i);
        this.g.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void d(int i) {
        super.d(i);
        this.g.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void e(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer) {
        wez wezVar = this.g;
        wezVar.s();
        wezVar.aF(fingerprintAuthRendererOuterClass$FingerprintAuthRenderer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void f(wfu wfuVar) {
        wez wezVar = this.g;
        wezVar.s();
        wezVar.aF(wfuVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void g(PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer) {
        wez wezVar = this.g;
        wezVar.s();
        wezVar.aF(passwordAuthRendererOuterClass$PasswordAuthRenderer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void h(PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer) {
        wez wezVar = this.g;
        wezVar.s();
        wezVar.aF(passwordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wed
    public final void i(aqws aqwsVar) {
        wez wezVar = this.g;
        wezVar.s();
        wezVar.aF(aqwsVar);
    }

    @Override // defpackage.wed
    public final void k(InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand) {
        wez wezVar = (wez) this.f.f("INLINE_AUTH_FRAGMENT_TAG");
        this.g = wezVar;
        if (wezVar == null) {
            wez wezVar2 = new wez();
            wezVar2.af = this;
            this.g = wezVar2;
            dn k = this.f.k();
            k.r(this.g, "INLINE_AUTH_FRAGMENT_TAG");
            k.a();
        } else if (!wezVar.av()) {
            this.g.af = this;
            dn k2 = this.f.k();
            k2.n(this.g);
            k2.a();
        }
        super.k(inlineAuthCommandOuterClass$InlineAuthCommand);
    }
}
