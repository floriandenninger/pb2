package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kbc implements kbj {
    private final jni a;
    private final ammv b;

    public kbc(jni jniVar, ammv ammvVar) {
        this.a = jniVar;
        this.b = ammvVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        ammv b;
        ammv ammvVar = this.b;
        if (ammvVar.h()) {
            aone createBuilder = aqom.a.createBuilder();
            aone createBuilder2 = aqlj.a.createBuilder();
            createBuilder2.copyOnWrite();
            aqlj.a((aqlj) createBuilder2.instance);
            createBuilder.copyOnWrite();
            aqom aqomVar = (aqom) createBuilder.instance;
            aqlj aqljVar = (aqlj) createBuilder2.build();
            aqljVar.getClass();
            aqomVar.c = aqljVar;
            aqomVar.b |= 1;
            aqom aqomVar2 = (aqom) createBuilder.build();
            jni jniVar = this.a;
            aonk aonkVar = aqon.b;
            aone createBuilder3 = aqon.a.createBuilder();
            asxs asxsVar = ((kbl) ammvVar.c()).b;
            aong aongVar = (aong) awas.a.createBuilder();
            String g = aalt.g(asxsVar.d());
            aongVar.copyOnWrite();
            awas awasVar = (awas) aongVar.instance;
            awasVar.b |= 1;
            awasVar.c = g;
            aongVar.copyOnWrite();
            awas awasVar2 = (awas) aongVar.instance;
            awasVar2.b |= 2;
            awasVar2.d = 261;
            String k = fhe.k((awas) aongVar.build());
            createBuilder3.copyOnWrite();
            aqon aqonVar = (aqon) createBuilder3.instance;
            k.getClass();
            aqonVar.c |= 4;
            aqonVar.d = k;
            createBuilder3.copyOnWrite();
            aqon aqonVar2 = (aqon) createBuilder3.instance;
            aqomVar2.getClass();
            aqonVar2.e = aqomVar2;
            aqonVar2.c |= 64;
            int i = ((kbl) ammvVar.c()).a;
            createBuilder3.copyOnWrite();
            aqon aqonVar3 = (aqon) createBuilder3.instance;
            aqonVar3.c |= 128;
            aqonVar3.f = i;
            b = jniVar.b(R.raw.downloads_page_video_element_android, aonkVar, (aqon) createBuilder3.build());
        } else {
            b = amlr.a;
        }
        if (b.h()) {
            aone createBuilder4 = askg.a.createBuilder();
            aqrf aqrfVar = (aqrf) b.c();
            createBuilder4.copyOnWrite();
            askg askgVar = (askg) createBuilder4.instance;
            askgVar.av = aqrfVar;
            askgVar.h |= 1048576;
            return amru.r(new kbh((askg) createBuilder4.build()));
        }
        return amru.q();
    }
}
