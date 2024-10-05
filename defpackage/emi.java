package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.application.Shell_UrlActivity;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class emi extends eml implements alxs {
    public final Shell_UrlActivity a;
    public final fgj b;
    public final BandaidConnectionOpenerController c;
    public final ypa d;
    public final fay e;
    public final aifk f;
    public final opn g;
    public final aloh h;
    private final wjz j;

    public emi(Shell_UrlActivity shell_UrlActivity, fgj fgjVar, BandaidConnectionOpenerController bandaidConnectionOpenerController, ypa ypaVar, aloh alohVar, fay fayVar, opn opnVar, aifk aifkVar, alwk alwkVar, wjz wjzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = shell_UrlActivity;
        this.b = fgjVar;
        this.c = bandaidConnectionOpenerController;
        this.d = ypaVar;
        this.h = alohVar;
        this.e = fayVar;
        this.g = opnVar;
        this.f = aifkVar;
        this.j = wjzVar;
        alyg b = alyh.b(shell_UrlActivity);
        b.b(wkc.class);
        alwkVar.a(b.a()).c(this);
    }

    @Override // defpackage.alxs
    public final void a(alxq alxqVar) {
        this.j.b(5, 2, 2);
    }

    @Override // defpackage.alxs
    public final void b(Throwable th) {
        this.j.c(5, th);
        this.a.finish();
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void d() {
        alta.y(this);
    }

    public final boolean e() {
        Intent intent = this.a.getIntent();
        return intent.getData() != null && (intent.getBooleanExtra("force_fullscreen", false) || intent.getBooleanExtra("finish_on_ended", false));
    }
}
