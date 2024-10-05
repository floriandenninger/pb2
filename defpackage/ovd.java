package defpackage;

import android.content.Intent;
import android.widget.Toast;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ak;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ovd implements oto {
    final /* synthetic */ ove a;

    public ovd(ove oveVar) {
        this.a = oveVar;
    }

    @Override // defpackage.oto
    public final void a() {
        this.a.T();
    }

    @Override // defpackage.oto
    public final void b(boolean z, long j) {
        this.a.U(z);
    }

    @Override // defpackage.oto
    public final void c() {
        this.a.M();
    }

    @Override // defpackage.oto
    public final void d() {
        this.a.N();
    }

    @Override // defpackage.oto
    public final void e(boolean z) {
        this.a.O(z);
        this.a.V(z);
    }

    @Override // defpackage.oto
    public final void f(String str, String str2, long j, long j2, boolean z, boolean z2, int i) {
        this.a.aA(str2);
        ak akVar = this.a.u;
        if (akVar != null) {
            akVar.N(str2);
            this.a.u.M(i);
        }
        this.a.W(str);
    }

    @Override // defpackage.oto
    public final void g() {
        this.a.X();
    }

    @Override // defpackage.oto
    public final void h() {
        this.a.Y();
    }

    @Override // defpackage.oto
    public final void i(long j) {
        this.a.P();
        this.a.Z();
    }

    @Override // defpackage.oto
    public final void j(long j, long j2) {
        this.a.Q();
        this.a.aa();
    }

    @Override // defpackage.oto
    public final void k() {
        this.a.R();
    }

    @Override // defpackage.oto
    public final void l() {
        this.a.ab();
    }

    @Override // defpackage.oto
    public final void m() {
        this.a.ac();
    }

    @Override // defpackage.oto
    public final void n(long j, long j2) {
    }

    @Override // defpackage.oto
    public final void o(long j) {
        this.a.ad(j);
    }

    @Override // defpackage.oto
    public final void p() {
        this.a.P();
        this.a.ae();
    }

    @Override // defpackage.oto
    public final void q() {
        this.a.af();
    }

    @Override // defpackage.oto
    public final void r() {
        this.a.S();
        this.a.ag();
    }

    @Override // defpackage.oto
    public final void s(String str) {
        Toast.makeText(this.a.D, str, 0).show();
    }

    @Override // defpackage.oto
    public final void t(Intent intent) {
        this.a.D.startActivity(intent);
    }

    @Override // defpackage.oto
    public final void u(int i) {
        this.a.az(i);
    }
}
