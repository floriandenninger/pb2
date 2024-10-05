package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abid {
    public final ViewGroup a;
    public final acra b;
    public abpd c;
    public abnz d;
    public abpo e;
    public final aeqh f;
    public final agcd g;
    public final ajoy h;
    private abjp i;
    private abjn j;
    private final aiqn k;
    private final agcd l;

    public abid(agcd agcdVar, ajoy ajoyVar, aeqh aeqhVar, agcd agcdVar2, aiqn aiqnVar, ViewGroup viewGroup, acra acraVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.l = agcdVar;
        this.h = ajoyVar;
        this.f = aeqhVar;
        this.g = agcdVar2;
        this.k = aiqnVar;
        this.a = viewGroup;
        this.b = acraVar;
    }

    public final abjn a() {
        if (this.j == null) {
            this.j = this.k.b(this.a, false, this.b);
        }
        return this.j;
    }

    public final abjp b() {
        if (this.i == null) {
            agcd agcdVar = this.l;
            ViewGroup viewGroup = this.a;
            Context context = (Context) agcdVar.d.get();
            context.getClass();
            ajvb ajvbVar = (ajvb) agcdVar.a.get();
            ajvbVar.getClass();
            ajoy ajoyVar = (ajoy) agcdVar.h.get();
            ajoyVar.getClass();
            acqz acqzVar = (acqz) agcdVar.f.get();
            acqzVar.getClass();
            sqq sqqVar = (sqq) agcdVar.j.get();
            sqqVar.getClass();
            ((syd) agcdVar.c.get()).getClass();
            ajgq ajgqVar = (ajgq) agcdVar.e.get();
            ajgqVar.getClass();
            sxw sxwVar = (sxw) agcdVar.g.get();
            sxwVar.getClass();
            azrw azrwVar = agcdVar.i;
            abiy abiyVar = (abiy) agcdVar.b.get();
            abiyVar.getClass();
            this.i = new abon(context, ajvbVar, ajoyVar, acqzVar, sqqVar, ajgqVar, sxwVar, azrwVar, abiyVar, viewGroup);
        }
        return this.i;
    }
}
