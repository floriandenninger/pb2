package defpackage;

import com.google.android.apps.youtube.app.application.Shell_ResultsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class emf implements alxs {
    public final aloh a;
    private final Shell_ResultsActivity b;
    private final wjz c;

    public emf(aloh alohVar, Shell_ResultsActivity shell_ResultsActivity, alwk alwkVar, wjz wjzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = alohVar;
        this.b = shell_ResultsActivity;
        this.c = wjzVar;
        alyg b = alyh.b(shell_ResultsActivity);
        b.b(wkc.class);
        alwkVar.a(b.a()).c(this);
    }

    @Override // defpackage.alxs
    public final void a(alxq alxqVar) {
        this.c.b(6, 2, 2);
    }

    @Override // defpackage.alxs
    public final void b(Throwable th) {
        this.c.c(6, th);
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
