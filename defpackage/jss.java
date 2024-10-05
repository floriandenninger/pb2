package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jss extends jsn {
    private final jng a;

    public jss(jng jngVar) {
        super(awil.class, aqrf.class);
        this.a = jngVar;
    }

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        jng jngVar = this.a;
        aong aongVar = (aong) awas.a.createBuilder();
        String g = aalt.g(((awil) obj).d());
        aongVar.copyOnWrite();
        awas awasVar = (awas) aongVar.instance;
        awasVar.b |= 1;
        awasVar.c = g;
        aongVar.copyOnWrite();
        awas awasVar2 = (awas) aongVar.instance;
        awasVar2.b |= 2;
        awasVar2.d = 155;
        awas awasVar3 = (awas) aongVar.build();
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
        boolean booleanValue = jngVar.e.f().booleanValue();
        createBuilder.copyOnWrite();
        aqom aqomVar2 = (aqom) createBuilder.instance;
        aqomVar2.b |= 2;
        aqomVar2.d = booleanValue;
        aqom aqomVar3 = (aqom) createBuilder.build();
        jni jniVar = jngVar.d;
        aonk aonkVar = aqon.b;
        aone createBuilder3 = aqon.a.createBuilder();
        String k = fhe.k(awasVar3);
        createBuilder3.copyOnWrite();
        aqon aqonVar = (aqon) createBuilder3.instance;
        k.getClass();
        aqonVar.c |= 4;
        aqonVar.d = k;
        createBuilder3.copyOnWrite();
        aqon aqonVar2 = (aqon) createBuilder3.instance;
        aqomVar3.getClass();
        aqonVar2.e = aqomVar3;
        aqonVar2.c |= 64;
        return (aqrf) jniVar.b(R.raw.downloads_page_video_element_android, aonkVar, (aqon) createBuilder3.build()).f();
    }
}
