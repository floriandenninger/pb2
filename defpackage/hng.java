package defpackage;

import com.google.android.libraries.youtube.player.ui.PlayerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hng implements hnf {
    private final hmg a;
    private final hmw b;
    private long c;

    public hng(hmg hmgVar, hmw hmwVar) {
        this.a = hmgVar;
        this.b = hmwVar;
    }

    @Override // defpackage.hnf
    public final void a(long j) {
        this.c = j;
        this.a.c(j);
    }

    @Override // defpackage.hnf
    public final void b() {
        this.a.f(false);
        this.a.g(true);
        this.b.i(this.c);
    }

    @Override // defpackage.hnf
    public final void c() {
        this.a.g(false);
        this.a.e(1.0f);
        this.a.f(true);
        this.a.i();
    }

    @Override // defpackage.hnf
    public final void d(long j) {
        long j2 = this.a.j();
        long j3 = this.c;
        if (j2 >= j + j3) {
            this.a.c(j3);
        }
    }

    @Override // defpackage.hnf
    public final void e() {
        this.a.b();
    }

    @Override // defpackage.hnf
    public final /* synthetic */ void f(PlayerView playerView) {
    }

    @Override // defpackage.hnf
    public final /* synthetic */ boolean g() {
        return true;
    }
}
