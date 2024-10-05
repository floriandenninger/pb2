package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kak implements kbj {
    private final jng a;
    private final /* synthetic */ int b;

    public kak(jng jngVar, int i) {
        this.b = i;
        this.a = jngVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        if (this.b == 0) {
            jng jngVar = this.a;
            jni jniVar = jngVar.d;
            aonk aonkVar = aqnk.b;
            aone createBuilder = aqnk.a.createBuilder();
            boolean a = yjk.a(jngVar.b);
            createBuilder.copyOnWrite();
            aqnk aqnkVar = (aqnk) createBuilder.instance;
            aqnkVar.c |= 2;
            aqnkVar.d = a;
            String string = jngVar.a.getString(R.string.habanero_entry_point_title);
            createBuilder.copyOnWrite();
            aqnk aqnkVar2 = (aqnk) createBuilder.instance;
            string.getClass();
            aqnkVar2.c |= 4;
            aqnkVar2.e = string;
            String string2 = jngVar.a.getString(R.string.habanero_entry_point_subtitle);
            createBuilder.copyOnWrite();
            aqnk aqnkVar3 = (aqnk) createBuilder.instance;
            string2.getClass();
            aqnkVar3.c |= 8;
            aqnkVar3.f = string2;
            String string3 = jngVar.a.getString(R.string.habanero_entry_point_cta_button);
            createBuilder.copyOnWrite();
            aqnk aqnkVar4 = (aqnk) createBuilder.instance;
            string3.getClass();
            aqnkVar4.c |= 16;
            aqnkVar4.g = string3;
            String string4 = jngVar.a.getString(R.string.habanero_entry_point_offline_message);
            createBuilder.copyOnWrite();
            aqnk aqnkVar5 = (aqnk) createBuilder.instance;
            string4.getClass();
            aqnkVar5.c |= 32;
            aqnkVar5.h = string4;
            ammv b = jniVar.b(R.raw.downloads_page_habanero_entry_point_element_android, aonkVar, (aqnk) createBuilder.build());
            if (!b.h()) {
                return amru.q();
            }
            aone createBuilder2 = askg.a.createBuilder();
            aqrf aqrfVar = (aqrf) b.c();
            createBuilder2.copyOnWrite();
            askg askgVar = (askg) createBuilder2.instance;
            askgVar.av = aqrfVar;
            askgVar.h |= 1048576;
            return amru.r(new kbh((askg) createBuilder2.build()));
        }
        jni jniVar2 = this.a.d;
        aonk aonkVar2 = aqmv.b;
        aone createBuilder3 = aqmv.a.createBuilder();
        aonk aonkVar3 = aqmu.b;
        aong aongVar = (aong) awas.a.createBuilder();
        aongVar.copyOnWrite();
        awas awasVar = (awas) aongVar.instance;
        awasVar.b |= 2;
        awasVar.d = 164;
        String m = fhe.m(aonkVar3, ((awas) aongVar.build()).toByteString());
        createBuilder3.copyOnWrite();
        aqmv aqmvVar = (aqmv) createBuilder3.instance;
        m.getClass();
        aqmvVar.c |= 32768;
        aqmvVar.d = m;
        ammv b2 = jniVar2.b(R.raw.downloads_page_banner_element_android, aonkVar2, (aqmv) createBuilder3.build());
        if (b2.h()) {
            aone createBuilder4 = askg.a.createBuilder();
            aqrf aqrfVar2 = (aqrf) b2.c();
            createBuilder4.copyOnWrite();
            askg askgVar2 = (askg) createBuilder4.instance;
            askgVar2.av = aqrfVar2;
            askgVar2.h |= 1048576;
            return amru.r(new kbh((askg) createBuilder4.build()));
        }
        return amru.q();
    }
}
