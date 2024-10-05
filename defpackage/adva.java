package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adva implements afhi {
    final /* synthetic */ azrw a;
    final /* synthetic */ afhi b;

    public adva(azrw azrwVar, afhi afhiVar) {
        this.a = azrwVar;
        this.b = afhiVar;
    }

    @Override // defpackage.afhi
    public final void D(int i, Map map) {
        Long e = new ajun(map).e("x-walltime-ms");
        if (e != null) {
            ((zfi) this.a.get()).a(e);
        }
        this.b.D(i, map);
    }
}
