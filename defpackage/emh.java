package defpackage;

import com.google.android.apps.youtube.app.application.Shell_UploadActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class emh implements alxs {
    private final Shell_UploadActivity a;
    private final wjz b;

    public emh(Shell_UploadActivity shell_UploadActivity, alwk alwkVar, wjz wjzVar) {
        this.a = shell_UploadActivity;
        this.b = wjzVar;
        alyg b = alyh.b(shell_UploadActivity);
        b.b(wkc.class);
        alwkVar.a(b.a()).c(this);
    }

    @Override // defpackage.alxs
    public final void a(alxq alxqVar) {
        this.b.b(8, 2, 2);
    }

    @Override // defpackage.alxs
    public final void b(Throwable th) {
        this.b.c(8, th);
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
