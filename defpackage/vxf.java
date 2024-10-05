package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vxf implements oxj {
    final /* synthetic */ oxk a;
    final /* synthetic */ oxk b;
    final /* synthetic */ Looper c;
    final /* synthetic */ vxg d;
    private final /* synthetic */ int e;

    public vxf(vxg vxgVar, oxk oxkVar, oxk oxkVar2, Looper looper, int i) {
        this.e = i;
        this.d = vxgVar;
        this.a = oxkVar;
        this.b = oxkVar2;
        this.c = looper;
    }

    public vxf(vxg vxgVar, oxk oxkVar, oxk oxkVar2, Looper looper, int i, byte[] bArr) {
        this.e = i;
        this.d = vxgVar;
        this.b = oxkVar;
        this.a = oxkVar2;
        this.c = looper;
    }

    @Override // defpackage.oxj
    public final void rB() {
    }

    @Override // defpackage.oxj
    public final void rD(boolean z, int i) {
    }

    @Override // defpackage.oxj
    public final void rC(oxh oxhVar) {
        if (this.e != 0) {
            this.d.a = oxhVar;
            String valueOf = String.valueOf(oxhVar.toString());
            vtv.b(valueOf.length() != 0 ? "primaryAudioPlayer triggered onPlayerError: ".concat(valueOf) : new String("primaryAudioPlayer triggered onPlayerError: "));
            this.b.n();
            this.a.h();
            this.b.h();
            this.c.quit();
            return;
        }
        this.d.a = oxhVar;
        String valueOf2 = String.valueOf(oxhVar.toString());
        vtv.b(valueOf2.length() != 0 ? "audioSwapPlayer triggered onPlayerError: ".concat(valueOf2) : new String("audioSwapPlayer triggered onPlayerError: "));
        this.a.n();
        this.a.h();
        this.b.h();
        this.c.quit();
    }
}
