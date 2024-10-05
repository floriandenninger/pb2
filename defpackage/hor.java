package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class hor implements amml {
    @Override // defpackage.amml
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        axdy axdyVar = (axdy) obj;
        aone createBuilder = aqqs.a.createBuilder();
        if ((axdyVar.b & 1) != 0) {
            String str = axdyVar.c;
            createBuilder.copyOnWrite();
            aqqs aqqsVar = (aqqs) createBuilder.instance;
            str.getClass();
            aqqsVar.b |= 1;
            aqqsVar.c = str;
        }
        if ((axdyVar.b & 8) != 0) {
            amml ammlVar = hpg.c;
            aoro aoroVar = axdyVar.e;
            if (aoroVar == null) {
                aoroVar = aoro.a;
            }
            Object apply = ammlVar.apply(aoroVar);
            createBuilder.copyOnWrite();
            aqqs aqqsVar2 = (aqqs) createBuilder.instance;
            apply.getClass();
            aqqsVar2.d = (aqqr) apply;
            aqqsVar2.b |= 2;
        }
        if ((axdyVar.b & 16) != 0) {
            amml ammlVar2 = hpg.c;
            aoro aoroVar2 = axdyVar.f;
            if (aoroVar2 == null) {
                aoroVar2 = aoro.a;
            }
            Object apply2 = ammlVar2.apply(aoroVar2);
            createBuilder.copyOnWrite();
            aqqs aqqsVar3 = (aqqs) createBuilder.instance;
            apply2.getClass();
            aqqsVar3.e = (aqqr) apply2;
            aqqsVar3.b |= 4;
        }
        if ((axdyVar.b & 256) != 0) {
            amml ammlVar3 = hpg.a;
            axbl b = axbl.b(axdyVar.h);
            if (b == null) {
                b = axbl.ALIGN_HORIZONTAL_UNSPECIFIED;
            }
            Object apply3 = ammlVar3.apply(b);
            createBuilder.copyOnWrite();
            aqqs aqqsVar4 = (aqqs) createBuilder.instance;
            aqqsVar4.f = ((awag) apply3).e;
            aqqsVar4.b |= 8;
        }
        if ((axdyVar.b & 512) != 0) {
            amml ammlVar4 = hpg.b;
            axch b2 = axch.b(axdyVar.i);
            if (b2 == null) {
                b2 = axch.FONT_FAMILY_UNSPECIFIED;
            }
            Object apply4 = ammlVar4.apply(b2);
            createBuilder.copyOnWrite();
            aqqs aqqsVar5 = (aqqs) createBuilder.instance;
            aqqsVar5.g = ((awah) apply4).h;
            aqqsVar5.b |= 16;
        }
        return (aqqs) createBuilder.build();
    }
}
