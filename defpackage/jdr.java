package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jdr implements adlq, adlr {
    private final adlt a;
    private final okf b;

    public jdr(adlt adltVar, okf okfVar) {
        this.a = adltVar;
        this.b = okfVar;
    }

    @Override // defpackage.adlq
    public final void a() {
    }

    @Override // defpackage.adlq
    public final void b(aanb aanbVar) {
    }

    @Override // defpackage.adlq
    public final void c(List list) {
    }

    @Override // defpackage.adlq
    public final void f(String str) {
        String str2 = jds.a;
        String.format("Autoconnect nowPlaying: videoId=%s", str);
        if (ammx.e(str)) {
            return;
        }
        this.b.l(true);
    }

    @Override // defpackage.adlq
    public final void g(int i) {
    }

    @Override // defpackage.adlq
    public final void h() {
    }

    @Override // defpackage.adlq
    public final void i() {
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        adlmVar.O(this);
        this.a.k(this);
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
        adlmVar.A(this);
    }

    @Override // defpackage.adlq
    public final void m() {
    }

    @Override // defpackage.adlq
    public final void rc() {
    }

    @Override // defpackage.adlq
    public final void rd(String str) {
    }
}
