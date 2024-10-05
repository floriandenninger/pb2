package defpackage;

import com.google.android.apps.youtube.app.application.Shell_HomeActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class emc implements alxs {
    public final izr a;
    public final ysy b;
    public final fcj c;
    public final aadw d;
    public final aloh e;
    private final Shell_HomeActivity f;
    private final wjz g;

    public emc(izr izrVar, ysy ysyVar, aloh alohVar, fcj fcjVar, aadw aadwVar, Shell_HomeActivity shell_HomeActivity, alwk alwkVar, wjz wjzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = izrVar;
        this.b = ysyVar;
        this.e = alohVar;
        this.c = fcjVar;
        this.d = aadwVar;
        this.f = shell_HomeActivity;
        this.g = wjzVar;
        alyg b = alyh.b(shell_HomeActivity);
        b.b(wkc.class);
        alwkVar.a(b.a()).c(this);
    }

    @Override // defpackage.alxs
    public final void a(alxq alxqVar) {
        this.g.b(4, 2, 2);
    }

    @Override // defpackage.alxs
    public final void b(Throwable th) {
        this.g.c(4, th);
        this.f.finish();
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void d() {
        alta.y(this);
    }
}
