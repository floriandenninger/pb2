package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dmp {
    final /* synthetic */ dmq a;

    public dmp(dmq dmqVar) {
        this.a = dmqVar;
    }

    public final float a(dno dnoVar) {
        dlf dlfVar;
        dng dngVar = dnoVar.b;
        dmk dmkVar = (dmk) this.a.b.a(dnoVar.a);
        dmm dmmVar = (dmm) dmkVar.a.get(dngVar);
        if (dmmVar != null) {
            return dmmVar.a.c;
        }
        if (dmkVar.c == 0) {
            dlfVar = dmkVar.e;
        } else {
            dlfVar = dmkVar.d;
        }
        if (dlfVar == null) {
            throw new RuntimeException("Both LayoutOutputs were null!");
        }
        return dngVar.e((dju) dlfVar.d());
    }

    public final dnh b(dno dnoVar) {
        return ((dmm) ((dmk) this.a.b.a(dnoVar.a)).a.get(dnoVar.b)).a;
    }
}
