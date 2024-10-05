package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jsr extends jsn {
    private final jng a;
    private final azrw b;

    public jsr(jng jngVar, azrw azrwVar) {
        super(awig.class, aqrf.class);
        this.a = jngVar;
        this.b = azrwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jtc
    public final /* bridge */ /* synthetic */ Object b(Object obj, amrz amrzVar) {
        Boolean bool;
        awig awigVar = (awig) obj;
        aong aongVar = (aong) awas.a.createBuilder();
        String g = aalt.g(awigVar.d());
        aongVar.copyOnWrite();
        awas awasVar = (awas) aongVar.instance;
        awasVar.b |= 1;
        awasVar.c = g;
        aongVar.copyOnWrite();
        awas awasVar2 = (awas) aongVar.instance;
        awasVar2.b |= 2;
        awasVar2.d = 156;
        amsj amsjVar = (amsj) this.b.get();
        awja b = awigVar.b();
        b.getClass();
        ammv i = ammv.i(amsjVar.a.get(etx.f(b.getPlaylistId())));
        if (i.h()) {
            aonk aonkVar = aqns.b;
            aone createBuilder = aqns.a.createBuilder();
            awjd awjdVar = (awjd) i.c();
            createBuilder.copyOnWrite();
            aqns aqnsVar = (aqns) createBuilder.instance;
            aqnsVar.d = awjdVar.f;
            aqnsVar.c |= 1;
            aongVar.e(aonkVar, (aqns) createBuilder.build());
        }
        jng jngVar = this.a;
        awas awasVar3 = (awas) aongVar.build();
        jni jniVar = jngVar.d;
        aonk aonkVar2 = aqnu.b;
        aone createBuilder2 = aqnu.a.createBuilder();
        String m = fhe.m(aqnr.b, awasVar3.toByteString());
        createBuilder2.copyOnWrite();
        aqnu aqnuVar = (aqnu) createBuilder2.instance;
        m.getClass();
        aqnuVar.c |= 4;
        aqnuVar.d = m;
        aone createBuilder3 = aqnt.a.createBuilder();
        aqvj aqvjVar = jngVar.e.a.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45353720L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45353720L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45353720L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        boolean booleanValue = bool.booleanValue();
        createBuilder3.copyOnWrite();
        aqnt aqntVar = (aqnt) createBuilder3.instance;
        aqntVar.b = 1 | aqntVar.b;
        aqntVar.c = booleanValue;
        boolean booleanValue2 = jngVar.e.f().booleanValue();
        createBuilder3.copyOnWrite();
        aqnt aqntVar2 = (aqnt) createBuilder3.instance;
        aqntVar2.b |= 2;
        aqntVar2.d = booleanValue2;
        createBuilder2.copyOnWrite();
        aqnu aqnuVar2 = (aqnu) createBuilder2.instance;
        aqnt aqntVar3 = (aqnt) createBuilder3.build();
        aqntVar3.getClass();
        aqnuVar2.e = aqntVar3;
        aqnuVar2.c |= 128;
        return (aqrf) jniVar.b(R.raw.downloads_page_playlist_element_android, aonkVar2, (aqnu) createBuilder2.build()).f();
    }
}
