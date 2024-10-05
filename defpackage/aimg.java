package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aimg implements aimk {
    public final aifk a;
    public final aimt b;
    public final aiih c;
    public final aimx d;
    public final aigv e;
    private final aypn f;
    private final aypn g;
    private final ayqw h = new ayqw();
    private final aime i = new aime(this);

    public aimg(aypn aypnVar, aypn aypnVar2, aimx aimxVar, aigv aigvVar, aiih aiihVar, aifk aifkVar, aimt aimtVar) {
        this.f = aypnVar;
        this.g = aypnVar2;
        this.d = aimxVar;
        this.e = aigvVar;
        this.c = aiihVar;
        this.a = aifkVar;
        this.b = aimtVar;
    }

    public final void a() {
        azqw azqwVar = this.d.c;
        boolean g = g(aims.b);
        boolean g2 = g(aims.a);
        aimt aimtVar = this.b;
        boolean z = false;
        int B = aimtVar instanceof aimq ? ((aimq) aimtVar).B() : 0;
        aimt aimtVar2 = this.b;
        if ((aimtVar2 instanceof aimu) && ((aimu) aimtVar2).rS()) {
            z = true;
        }
        azqwVar.c(new ahdu(g, g2, B, z));
    }

    @Override // defpackage.aimk
    public final void b() {
        this.h.d(this.f.X(new ayrs() { // from class: aimf
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aimg.this.b.h(((ahei) obj).a());
            }
        }));
        this.h.d(this.g.X(new ahwx(20)));
        this.e.g();
        a();
        azqw azqwVar = this.d.d;
        PlaybackStartDescriptor playbackStartDescriptor = this.c.o;
        azqwVar.c(new aiex(playbackStartDescriptor == null ? null : playbackStartDescriptor.k()));
        this.b.k(this.i);
    }

    @Override // defpackage.aimk
    public final void c(boolean z) {
        this.b.e(z);
    }

    public final void d(aiey aieyVar) {
        this.d.e.c(new aiez(aieyVar));
    }

    @Override // defpackage.aimk
    public final void e() {
        d(aiey.START);
    }

    @Override // defpackage.aimk
    public final void f() {
        this.d.a.c(new ahdt(false));
        this.d.g.c(ahdv.a);
        this.e.d();
        this.h.qc();
        this.b.l(this.i);
        this.b.g();
    }

    @Override // defpackage.aimk
    public final boolean g(aims aimsVar) {
        return i(aimsVar) == 2;
    }

    public final boolean h(Class cls) {
        return this.b.getClass().equals(cls);
    }

    @Override // defpackage.aimk
    public final int i(aims aimsVar) {
        return this.b.j(aimsVar);
    }
}
