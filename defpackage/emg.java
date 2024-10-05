package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.application.Shell_SettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class emg implements alxs {
    public final trp a;
    private final Shell_SettingsActivity b;
    private final wjz c;

    public emg(trp trpVar, Shell_SettingsActivity shell_SettingsActivity, alwk alwkVar, wjz wjzVar, byte[] bArr, byte[] bArr2) {
        this.a = trpVar;
        this.b = shell_SettingsActivity;
        this.c = wjzVar;
        alyg b = alyh.b(shell_SettingsActivity);
        b.b(wkc.class);
        alwkVar.a(b.a()).c(this);
    }

    @Override // defpackage.alxs
    public final void a(alxq alxqVar) {
        this.c.b(10, 2, 2);
        Intent i = this.b.i();
        alxb.a(i, alxqVar.a());
        this.b.k(i);
    }

    @Override // defpackage.alxs
    public final void b(Throwable th) {
        this.c.c(10, th);
        this.b.finish();
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void d() {
        alta.y(this);
    }
}
