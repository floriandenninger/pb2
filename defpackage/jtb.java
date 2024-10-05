package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jtb extends jsn {
    private final jng a;

    public jtb(jng jngVar) {
        super(asxd.class, aqrf.class);
        this.a = jngVar;
    }

    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        jng jngVar = this.a;
        aong aongVar = (aong) awas.a.createBuilder();
        String g = aalt.g(((asxd) obj).d());
        aongVar.copyOnWrite();
        awas awasVar = (awas) aongVar.instance;
        awasVar.b |= 1;
        awasVar.c = g;
        aongVar.copyOnWrite();
        awas awasVar2 = (awas) aongVar.instance;
        awasVar2.b |= 2;
        awasVar2.d = 137;
        awas awasVar3 = (awas) aongVar.build();
        jni jniVar = jngVar.d;
        aonk aonkVar = aqnz.b;
        aone createBuilder = aqnz.a.createBuilder();
        String m = fhe.m(aqny.b, awasVar3.toByteString());
        createBuilder.copyOnWrite();
        aqnz aqnzVar = (aqnz) createBuilder.instance;
        m.getClass();
        aqnzVar.c |= 8;
        aqnzVar.d = m;
        boolean aa = yjk.aa(jngVar.a);
        createBuilder.copyOnWrite();
        aqnz aqnzVar2 = (aqnz) createBuilder.instance;
        aqnzVar2.c |= 128;
        aqnzVar2.e = aa;
        createBuilder.copyOnWrite();
        aqnz aqnzVar3 = (aqnz) createBuilder.instance;
        aqnzVar3.c |= 256;
        aqnzVar3.f = true;
        aone createBuilder2 = aqmb.a.createBuilder();
        String string = jngVar.a.getString(R.string.accessibility_offline_button_save);
        createBuilder2.copyOnWrite();
        aqmb aqmbVar = (aqmb) createBuilder2.instance;
        string.getClass();
        aqmbVar.b = 1 | aqmbVar.b;
        aqmbVar.c = string;
        String string2 = jngVar.a.getString(R.string.accessibility_offline_button_cancel);
        createBuilder2.copyOnWrite();
        aqmb aqmbVar2 = (aqmb) createBuilder2.instance;
        string2.getClass();
        aqmbVar2.b |= 2;
        aqmbVar2.d = string2;
        String string3 = jngVar.a.getString(R.string.accessibility_offline_button_remove_video);
        createBuilder2.copyOnWrite();
        aqmb aqmbVar3 = (aqmb) createBuilder2.instance;
        string3.getClass();
        aqmbVar3.b |= 4;
        aqmbVar3.e = string3;
        aqmb aqmbVar4 = (aqmb) createBuilder2.build();
        createBuilder.copyOnWrite();
        aqnz aqnzVar4 = (aqnz) createBuilder.instance;
        aqmbVar4.getClass();
        aqnzVar4.g = aqmbVar4;
        aqnzVar4.c |= 512;
        return (aqrf) jniVar.b(R.raw.downloads_page_recommended_video_element_android, aonkVar, (aqnz) createBuilder.build()).f();
    }
}
