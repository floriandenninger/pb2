package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.PerformOnceCommandController;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ssv implements axqr {
    public static ssu a() {
        return new ssu();
    }

    public static sst b(sww swwVar, szz szzVar, ammv ammvVar) {
        return new sst(swwVar, szzVar, ammvVar);
    }

    public static ssx c(Map map, Map map2, syd sydVar) {
        return new ssx(map, map2, sydVar);
    }

    public static ssz d(ammv ammvVar) {
        return new ssz(ammvVar);
    }

    public static sta e(Collection collection, Collection collection2, List list, syd sydVar, ammv ammvVar) {
        return new sta(collection, collection2, list, sydVar, ammvVar);
    }

    public static List f(Map map, Set set) {
        List c = stb.c(map, set);
        ayaw.k(c);
        return c;
    }

    public static stc g(Map map, Map map2, ammv ammvVar, syd sydVar) {
        return new stc(map, map2, ammvVar, sydVar);
    }

    public static std h(syd sydVar) {
        return new std(sydVar);
    }

    public static stk i(ayqi ayqiVar) {
        return new stk(ayqiVar);
    }

    public static str j(JSEnvironment jSEnvironment) {
        return new str(jSEnvironment);
    }

    public static stz k(axpg axpgVar, ammv ammvVar, ayqi ayqiVar) {
        return new stz(axpgVar, ammvVar, ayqiVar);
    }

    public static Map l(ammv ammvVar) {
        amrw amrwVar = new amrw();
        for (Map.Entry entry : ((Map) ((amna) ammvVar).a).entrySet()) {
            amrwVar.g(Integer.valueOf(((sza) ((Pair) entry.getValue()).first).a().a()), (Pair) entry.getValue());
        }
        return amrwVar.c();
    }

    public static sur m(Context context, ammv ammvVar, ammv ammvVar2, azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new sur(context, ammvVar, ammvVar2, azrwVar, azrwVar2, azrwVar3);
    }

    public static szc n(ammv ammvVar) {
        return (szc) ammvVar.e(szc.i);
    }

    public static sxe o(ammv ammvVar, azrw azrwVar) {
        sxe c = sve.c(ammvVar, azrwVar);
        ayaw.k(c);
        return c;
    }

    public static sxh p() {
        return sxg.a;
    }

    public static sxy q(syk sykVar, ammv ammvVar, syd sydVar, sww swwVar, syj syjVar, ammv ammvVar2, ammv ammvVar3) {
        final swh swhVar = new swh(sydVar, ((Boolean) ammvVar2.e(true)).booleanValue(), (ajzi) ((amna) ammvVar).a, swwVar, ((Float) ammvVar3.e(Float.valueOf(0.0f))).floatValue(), syjVar);
        return sqb.b(sykVar, new spz() { // from class: swj
            @Override // defpackage.spz
            public final dgy a(dhe dheVar, sxc sxcVar, Object obj, String str, aoam aoamVar, sod sodVar, List list) {
                swh swhVar2 = swh.this;
                axow axowVar = (axow) obj;
                syd sydVar2 = swhVar2.a;
                boolean z = swhVar2.b;
                ajzi ajziVar = swhVar2.f;
                sww swwVar2 = swhVar2.c;
                float f = swhVar2.d;
                syj syjVar2 = swhVar2.e;
                aoam aO = axowVar.aO();
                if (aO == null) {
                    throw new syf("ImageType.image missing");
                }
                swf swfVar = new swf();
                swf.c(swfVar, dheVar, new swg());
                swfVar.a.B = aO;
                boolean z2 = false;
                swfVar.d.set(0);
                swfVar.a.g = sydVar2;
                swfVar.d.set(4);
                swfVar.a.v = z;
                swfVar.d.set(5);
                if (axowVar.aM() != null) {
                    swfVar.a.z = axowVar.aM();
                }
                if (axowVar.aN() != null) {
                    swfVar.a.A = axowVar.aN();
                }
                swfVar.a.y = ajziVar;
                if (aO.Z() == 4 || aO.Z() == 3) {
                    szz szzVar = new szz(sydVar2);
                    szx g = szzVar.g(axowVar.aL());
                    szx g2 = szzVar.g(axowVar.aK());
                    swfVar.a.b = new szn(g != null ? g.a() : null, g2 != null ? g2.a() : null, swwVar2, axowVar);
                }
                swfVar.a.f = axowVar.aI();
                swfVar.d.set(3);
                swg swgVar = swfVar.a;
                swgVar.c = sxcVar;
                swgVar.d = f;
                swfVar.d.set(1);
                if (aoamVar != null) {
                    axof axofVar = new axof();
                    if (szz.l(aoamVar, axofVar, 168774763, swi.a) && "primary_image".equals(axofVar.X())) {
                        z2 = true;
                    }
                    swfVar.a.a = Boolean.valueOf(z2);
                }
                swfVar.a.e = syjVar2;
                swfVar.d.set(2);
                return swfVar;
            }
        }, 158796345, spo.j);
    }

    public static stx r(axpg axpgVar, ayqi ayqiVar) {
        return new stx(axpgVar, ayqiVar, 1);
    }

    public static sna s(PerformOnceCommandController performOnceCommandController, axpg axpgVar) {
        return new sna(axpgVar, 2);
    }

    public static sna t(axpg axpgVar) {
        return new sna(axpgVar, 3);
    }

    public static sgf u() {
        return new sgf();
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        throw null;
    }
}
