package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aexv implements pmv {
    private final amnv a;

    public aexv(amnv amnvVar) {
        this.a = amnvVar;
    }

    @Override // defpackage.pmv
    public final long a() {
        return 0L;
    }

    @Override // defpackage.pmv
    public final boolean b(long j, long j2, float f) {
        return false;
    }

    @Override // defpackage.pmv
    public final boolean c(long j, float f, boolean z, long j2) {
        PlayerConfigModel playerConfigModel = (PlayerConfigModel) this.a.get();
        long c = plh.c(z ? playerConfigModel.x() : playerConfigModel.t());
        return c <= 0 || j >= c;
    }

    @Override // defpackage.pmv
    public final void e() {
    }

    @Override // defpackage.pmv
    public final void f() {
    }

    @Override // defpackage.pmv
    public final void g() {
    }

    @Override // defpackage.pmv
    public final void h(poe[] poeVarArr, asj asjVar, bel[] belVarArr) {
    }

    @Override // defpackage.pmv
    public final boolean i() {
        return false;
    }

    @Override // defpackage.pmv
    public final /* bridge */ /* synthetic */ bfg j() {
        return null;
    }
}
