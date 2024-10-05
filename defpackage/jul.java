package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowContentPillActionOuterClass$ShowContentPillAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jul implements izn {
    public final kbt a;
    public final trp b;
    private final fif c;
    private final ayqi d;
    private final ayqi e;

    public jul(kbt kbtVar, fif fifVar, ayqi ayqiVar, ayqi ayqiVar2, trp trpVar, byte[] bArr, byte[] bArr2) {
        this.a = kbtVar;
        this.c = fifVar;
        this.d = ayqiVar;
        this.e = ayqiVar2;
        this.b = trpVar;
    }

    @Override // defpackage.izn
    public final ayqj a(aauc aaucVar) {
        if ("FEwhat_to_watch".equals(aaucVar.c)) {
            fib a = fid.a();
            a.b(aqnf.FILTER_TYPE_NONE);
            return this.c.b(a.a()).G(jtu.e).k(jtu.f).O(new ayrv() { // from class: juj
                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    jul julVar = jul.this;
                    aakt aaktVar = (aakt) obj;
                    if (aaktVar instanceof awil) {
                        kbt kbtVar = julVar.a;
                        aong aongVar = (aong) awas.a.createBuilder();
                        String g = aalt.g(((awil) aaktVar).d());
                        aongVar.copyOnWrite();
                        awas awasVar = (awas) aongVar.instance;
                        awasVar.b |= 1;
                        awasVar.c = g;
                        aongVar.copyOnWrite();
                        awas awasVar2 = (awas) aongVar.instance;
                        awasVar2.b |= 2;
                        awasVar2.d = 155;
                        awas awasVar3 = (awas) aongVar.build();
                        jni jniVar = kbtVar.a;
                        aonk aonkVar = aqmp.b;
                        aone createBuilder = aqmp.a.createBuilder();
                        String m = fhe.m(aqmo.b, awasVar3.toByteString());
                        createBuilder.copyOnWrite();
                        aqmp aqmpVar = (aqmp) createBuilder.instance;
                        m.getClass();
                        aqmpVar.c |= 4;
                        aqmpVar.d = m;
                        ammv b = jniVar.b(R.raw.downloaded_video_with_context_element_android, aonkVar, (aqmp) createBuilder.build());
                        if (b.h()) {
                            return ayps.w((aqrf) b.c());
                        }
                        return ayps.q(new Exception("Failed to generate element renderer"));
                    }
                    return ayps.p();
                }
            }).ar((aong) askd.a.createBuilder(), opu.b).G(jtu.g).G(jtu.h).G(new ayrv() { // from class: juk
                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    jul julVar = jul.this;
                    amru amruVar = (amru) obj;
                    aone createBuilder = auov.a.createBuilder();
                    int size = amruVar.size();
                    for (int i = 0; i < size; i++) {
                        askd askdVar = (askd) amruVar.get(i);
                        aone createBuilder2 = auoy.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        auoy auoyVar = (auoy) createBuilder2.instance;
                        askdVar.getClass();
                        auoyVar.j = askdVar;
                        auoyVar.b |= 16;
                        createBuilder.aN(createBuilder2);
                    }
                    aone createBuilder3 = aveh.a.createBuilder();
                    aone createBuilder4 = aved.a.createBuilder();
                    createBuilder4.copyOnWrite();
                    aved avedVar = (aved) createBuilder4.instance;
                    auov auovVar = (auov) createBuilder.build();
                    auovVar.getClass();
                    avedVar.c = auovVar;
                    avedVar.b |= 1;
                    createBuilder3.copyOnWrite();
                    aveh avehVar = (aveh) createBuilder3.instance;
                    aved avedVar2 = (aved) createBuilder4.build();
                    avedVar2.getClass();
                    avehVar.k = avedVar2;
                    avehVar.b |= 8192;
                    createBuilder3.copyOnWrite();
                    aveh avehVar2 = (aveh) createBuilder3.instance;
                    avehVar2.b |= 8;
                    avehVar2.f = true;
                    aveh avehVar3 = (aveh) createBuilder3.build();
                    aone createBuilder5 = arke.a.createBuilder();
                    aone createBuilder6 = arjy.a.createBuilder();
                    createBuilder6.copyOnWrite();
                    arjy arjyVar = (arjy) createBuilder6.instance;
                    avehVar3.getClass();
                    arjyVar.c = avehVar3;
                    arjyVar.b = 58174010;
                    createBuilder5.ai(createBuilder6);
                    arke arkeVar = (arke) createBuilder5.build();
                    aone createBuilder7 = ShowContentPillActionOuterClass$ShowContentPillAction.a.createBuilder();
                    aone createBuilder8 = autr.a.createBuilder();
                    trp trpVar = julVar.b;
                    aone createBuilder9 = aqet.a.createBuilder();
                    aqyg h = ajcq.h(trpVar.a.getResources().getString(R.string.connectivity_regained_pill_button_title));
                    createBuilder9.copyOnWrite();
                    aqet aqetVar = (aqet) createBuilder9.instance;
                    h.getClass();
                    aqetVar.c = h;
                    aqetVar.b |= 1;
                    aong aongVar = (aong) arfs.a.createBuilder();
                    arfr arfrVar = arfr.REFRESH;
                    aongVar.copyOnWrite();
                    arfs arfsVar = (arfs) aongVar.instance;
                    arfsVar.c = arfrVar.pV;
                    arfsVar.b |= 1;
                    createBuilder9.copyOnWrite();
                    aqet aqetVar2 = (aqet) createBuilder9.instance;
                    arfs arfsVar2 = (arfs) aongVar.build();
                    arfsVar2.getClass();
                    aqetVar2.d = arfsVar2;
                    aqetVar2.b |= 2;
                    aone createBuilder10 = aqes.a.createBuilder();
                    createBuilder10.copyOnWrite();
                    aqes aqesVar = (aqes) createBuilder10.instance;
                    aqesVar.c = 4;
                    aqesVar.b |= 1;
                    createBuilder9.copyOnWrite();
                    aqet aqetVar3 = (aqet) createBuilder9.instance;
                    aqes aqesVar2 = (aqes) createBuilder10.build();
                    aqesVar2.getClass();
                    aqetVar3.g = aqesVar2;
                    aqetVar3.b |= 128;
                    aqet aqetVar4 = (aqet) createBuilder9.build();
                    createBuilder8.copyOnWrite();
                    autr autrVar = (autr) createBuilder8.instance;
                    aqetVar4.getClass();
                    autrVar.c = aqetVar4;
                    autrVar.b = 127508420;
                    createBuilder7.copyOnWrite();
                    ShowContentPillActionOuterClass$ShowContentPillAction showContentPillActionOuterClass$ShowContentPillAction = (ShowContentPillActionOuterClass$ShowContentPillAction) createBuilder7.instance;
                    autr autrVar2 = (autr) createBuilder8.build();
                    autrVar2.getClass();
                    showContentPillActionOuterClass$ShowContentPillAction.c = autrVar2;
                    showContentPillActionOuterClass$ShowContentPillAction.b |= 1;
                    ShowContentPillActionOuterClass$ShowContentPillAction showContentPillActionOuterClass$ShowContentPillAction2 = (ShowContentPillActionOuterClass$ShowContentPillAction) createBuilder7.build();
                    aong aongVar2 = (aong) arjv.a.createBuilder();
                    aone createBuilder11 = arjw.a.createBuilder();
                    createBuilder11.copyOnWrite();
                    arjw arjwVar = (arjw) createBuilder11.instance;
                    arkeVar.getClass();
                    arjwVar.c = arkeVar;
                    arjwVar.b = 58173949;
                    aongVar2.copyOnWrite();
                    arjv arjvVar = (arjv) aongVar2.instance;
                    arjw arjwVar2 = (arjw) createBuilder11.build();
                    arjwVar2.getClass();
                    arjvVar.f = arjwVar2;
                    arjvVar.b |= 64;
                    aong aongVar3 = (aong) apxf.a.createBuilder();
                    aongVar3.e(ShowContentPillActionOuterClass$ShowContentPillAction.showContentPillAction, showContentPillActionOuterClass$ShowContentPillAction2);
                    aongVar2.copyOnWrite();
                    arjv arjvVar2 = (arjv) aongVar2.instance;
                    apxf apxfVar = (apxf) aongVar3.build();
                    apxfVar.getClass();
                    arjvVar2.x = apxfVar;
                    arjvVar2.b |= 134217728;
                    return new BrowseResponseModel((arjv) aongVar2.build());
                }
            }).M(this.e).I(this.d);
        }
        return ayqj.z(new IllegalArgumentException("Home offline response is only used for Homepage"));
    }
}
