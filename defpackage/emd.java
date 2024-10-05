package defpackage;

import com.google.android.apps.youtube.app.application.Shell_LiveCreationActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class emd implements alxs {
    public final Shell_LiveCreationActivity a;
    public final fhe b;
    private final wjz c;

    public emd(Shell_LiveCreationActivity shell_LiveCreationActivity, fhe fheVar, alwk alwkVar, wjz wjzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = shell_LiveCreationActivity;
        this.b = fheVar;
        this.c = wjzVar;
        alyg b = alyh.b(shell_LiveCreationActivity);
        b.b(wkc.class);
        alwkVar.a(b.a()).c(this);
    }

    @Override // defpackage.alxs
    public final void a(alxq alxqVar) {
        this.c.b(9, 2, 2);
    }

    @Override // defpackage.alxs
    public final void b(Throwable th) {
        this.c.c(9, th);
        this.a.finish();
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void d() {
        alta.y(this);
    }
}
