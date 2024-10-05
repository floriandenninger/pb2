package defpackage;

import android.app.Activity;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yev implements aaha {
    public final aahd a;
    public final zaw b;
    public final ycs c = new ycs();
    public final Executor d;
    public final aaxn e;
    private final Activity f;
    private final yfh g;

    public yev(Activity activity, aahd aahdVar, aaxn aaxnVar, yfh yfhVar, zaw zawVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f = activity;
        this.e = aaxnVar;
        this.g = yfhVar;
        this.a = aahdVar;
        this.b = zawVar;
        this.d = executor;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        this.c.show(this.f.getFragmentManager(), ycs.a);
        final yfh yfhVar = this.g;
        final yeu yeuVar = new yeu(this, apxfVar);
        final int i = 0;
        final int i2 = 1;
        ynm.n(yfhVar.a, ((abep) yfhVar.b.get()).c(), new zfi() { // from class: yfg
            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i == 0) {
                    yfhVar.a(aaeb.PRODUCTION, yeuVar);
                    return;
                }
                yfhVar.a((aaeb) obj, yeuVar);
            }
        }, new zfi() { // from class: yfg
            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i2 == 0) {
                    yfhVar.a(aaeb.PRODUCTION, yeuVar);
                    return;
                }
                yfhVar.a((aaeb) obj, yeuVar);
            }
        });
    }
}
