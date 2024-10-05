package com.google.android.libraries.youtube.ads.model;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import defpackage.apmg;
import defpackage.apxf;
import defpackage.asgk;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class VideoAd extends MediaAd {
    /* JADX INFO: Access modifiers changed from: protected */
    public VideoAd(String str, byte[] bArr, String str2, String str3, boolean z, PlayerConfigModel playerConfigModel, String str4, long j, VideoAdTrackingModel videoAdTrackingModel) {
        super(str, bArr, str2, str3, z, playerConfigModel, str4, j, videoAdTrackingModel);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final apxf G() {
        asgk k = k();
        if (k == null || (k.b & 4) == 0) {
            return null;
        }
        aulq aulqVar = k.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apmg apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
        if ((apmgVar.b & 16384) == 0) {
            return null;
        }
        apxf apxfVar = apmgVar.o;
        return apxfVar == null ? apxf.a : apxfVar;
    }
}
