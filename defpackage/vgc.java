package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vgc implements veq {
    private final vgd a;
    private final /* synthetic */ int b;

    public vgc(vgd vgdVar, int i) {
        this.b = i;
        this.a = vgdVar;
    }

    @Override // defpackage.veq
    public final anhy a(final anhy anhyVar) {
        if (this.b == 0) {
            return this.a.i(anhyVar);
        }
        final vgd vgdVar = this.a;
        return vgdVar.j.b(amjk.b(new anfy() { // from class: vfw
            @Override // defpackage.anfy
            public final anhy a() {
                anhy i;
                vgd vgdVar2 = vgd.this;
                anhy anhyVar2 = anhyVar;
                Uri uri = (Uri) anaf.W(vgdVar2.b);
                vdp a = vdp.a((Closeable) vgdVar2.d.c(uri, vee.b()));
                try {
                    try {
                        vgdVar2.f(uri);
                        i = anhv.a;
                    } catch (IOException unused) {
                        i = vgdVar2.i(anhyVar2);
                    }
                    anhy b = vgd.b(i, a.b(), vgdVar2.c);
                    a.close();
                    return b;
                } catch (Throwable th) {
                    try {
                        a.close();
                    } catch (Throwable unused2) {
                    }
                    throw th;
                }
            }
        }), vgdVar.c);
    }
}
