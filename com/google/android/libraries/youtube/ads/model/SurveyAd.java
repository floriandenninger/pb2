package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import defpackage.aamr;
import defpackage.afrd;
import defpackage.amkq;
import defpackage.amru;
import defpackage.aobq;
import defpackage.aomf;
import defpackage.aowz;
import defpackage.aoyj;
import defpackage.apxf;
import defpackage.avbm;
import defpackage.avcx;
import defpackage.xes;
import defpackage.xfx;
import defpackage.xgo;
import defpackage.yny;
import defpackage.zga;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SurveyAd extends MediaBreakAd implements aamr {
    public static final Parcelable.Creator CREATOR = new xes(5);
    public static final xfx a = new xgo();
    public final avbm b;
    public final avcx c;
    public final amru d;
    public final int q;

    public SurveyAd(InstreamAdBreak instreamAdBreak, PlayerConfigModel playerConfigModel, String str, avbm avbmVar, int i) {
        this(instreamAdBreak.f, instreamAdBreak.i, instreamAdBreak.h, instreamAdBreak.g, instreamAdBreak.e, playerConfigModel, str, avbmVar, i);
    }

    public final aomf C() {
        return this.b.j;
    }

    public final apxf D() {
        avbm avbmVar = this.b;
        if ((avbmVar.b & 1) == 0) {
            return null;
        }
        apxf apxfVar = avbmVar.d;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    public final apxf ag() {
        avbm avbmVar = this.b;
        if ((avbmVar.b & 4) == 0) {
            return null;
        }
        apxf apxfVar = avbmVar.f;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // defpackage.aamr
    public final List ah() {
        return this.d;
    }

    public final boolean ai() {
        avbm avbmVar = this.b;
        return (avbmVar.b & 512) == 0 || avbmVar.l;
    }

    public final boolean aj() {
        return this.b.g;
    }

    public final SurveyQuestionRendererModel ak() {
        if (this.d.size() <= 0) {
            zga.l("Trying to retrieve question that is out of range.");
            return null;
        }
        return (SurveyQuestionRendererModel) this.d.get(0);
    }

    public final int al() {
        int aW = aobq.aW(this.b.k);
        if (aW == 0) {
            return 1;
        }
        return aW;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        if (this.d.isEmpty()) {
            return 0;
        }
        return ak().a();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean equals(Object obj) {
        if (!(obj instanceof SurveyAd)) {
            return false;
        }
        SurveyAd surveyAd = (SurveyAd) obj;
        return super.equals(surveyAd) && amkq.b(this.b, surveyAd.b);
    }

    @Override // defpackage.afre
    public final /* bridge */ /* synthetic */ afrd h() {
        return new xgo(this);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aowz o() {
        avbm avbmVar = this.b;
        if ((avbmVar.b & 32) == 0) {
            return null;
        }
        aowz aowzVar = avbmVar.i;
        return aowzVar == null ? aowz.a : aowzVar;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int p() {
        return this.q;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    protected final int r() {
        return ak().c() * 1000;
    }

    public final int s() {
        if (this.d.isEmpty()) {
            return 5;
        }
        return ak().c();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aoyj u() {
        aoyj aoyjVar = this.b.h;
        return aoyjVar == null ? aoyj.a : aoyjVar;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        yny.I(this.b, parcel);
        parcel.writeInt(this.q);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SurveyAd(java.lang.String r12, byte[] r13, java.lang.String r14, java.lang.String r15, boolean r16, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r17, java.lang.String r18, defpackage.avbm r19, int r20) {
        /*
            r11 = this;
            r9 = r11
            r10 = r19
            com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel r8 = new com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel
            aony r0 = r10.c
            int r0 = r0.size()
            if (r0 <= 0) goto L2f
            aony r0 = r10.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            avbo r0 = (defpackage.avbo) r0
            int r1 = r0.b
            r1 = r1 & 1
            if (r1 == 0) goto L2f
            avbl r0 = r0.c
            if (r0 != 0) goto L22
            avbl r0 = defpackage.avbl.a
        L22:
            avbn r0 = r0.f
            if (r0 != 0) goto L28
            avbn r0 = defpackage.avbn.a
        L28:
            aoyi r0 = r0.e
            if (r0 != 0) goto L31
            aoyi r0 = defpackage.aoyi.a
            goto L31
        L2f:
            aoyi r0 = defpackage.aoyi.a
        L31:
            r8.<init>(r0)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r19.getClass()
            r9.b = r10
            aulq r0 = r10.e
            if (r0 != 0) goto L4d
            aulq r0 = defpackage.aulq.a
        L4d:
            aonk r1 = com.google.protos.youtube.api.innertube.SurveyTextInterstitialRendererOuterClass.surveyTextInterstitialRenderer
            java.lang.Object r0 = defpackage.ahbj.n(r0, r1)
            avcx r0 = (defpackage.avcx) r0
            r9.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            aony r1 = r10.c
            java.util.Iterator r1 = r1.iterator()
        L62:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L83
            java.lang.Object r2 = r1.next()
            avbo r2 = (defpackage.avbo) r2
            int r3 = r2.b
            r3 = r3 & 1
            if (r3 == 0) goto L62
            com.google.android.libraries.youtube.ads.model.SurveyQuestionRendererModel r3 = new com.google.android.libraries.youtube.ads.model.SurveyQuestionRendererModel
            avbl r2 = r2.c
            if (r2 != 0) goto L7c
            avbl r2 = defpackage.avbl.a
        L7c:
            r3.<init>(r2)
            r0.add(r3)
            goto L62
        L83:
            amru r0 = defpackage.amru.o(r0)
            r9.d = r0
            r0 = r20
            r9.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.ads.model.SurveyAd.<init>(java.lang.String, byte[], java.lang.String, java.lang.String, boolean, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, java.lang.String, avbm, int):void");
    }
}
