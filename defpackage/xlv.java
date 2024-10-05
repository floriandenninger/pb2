package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xlv extends xlk {
    private final xhi a;
    private final InstreamAdBreak b;
    private boolean c;

    public xlv(xcl xclVar, xhi xhiVar, InstreamAdBreak instreamAdBreak) {
        xclVar.getClass();
        this.a = xhiVar;
        instreamAdBreak.getClass();
        this.b = instreamAdBreak;
    }

    @Override // defpackage.xlk
    public final void a() {
        this.a.f(this.b.d());
    }

    @Override // defpackage.xlk
    public final void b() {
        if (this.c) {
            return;
        }
        this.a.f(this.b.e());
        this.c = true;
    }
}
