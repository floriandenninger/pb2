package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bwf extends bwe {
    final /* synthetic */ adz a;
    final /* synthetic */ bwg b;

    public bwf(bwg bwgVar, adz adzVar) {
        this.b = bwgVar;
        this.a = adzVar;
    }

    @Override // defpackage.bwe, defpackage.bwc
    public final void a(bwd bwdVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(bwdVar);
        bwdVar.B(this);
    }
}
