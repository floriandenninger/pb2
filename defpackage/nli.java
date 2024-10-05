package defpackage;

import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.protos.youtube.api.innertube.ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
import com.google.protos.youtube.api.innertube.ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nli extends nld {
    private final akvq j;
    private final nlr k;

    public nli(aahd aahdVar, ohg ohgVar, ajyw ajywVar, akvq akvqVar, Executor executor, hak hakVar, acra acraVar, BrowseResponseModel browseResponseModel, apna apnaVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(aahdVar, ohgVar, ajywVar, acraVar, browseResponseModel, apnaVar, null, null, null, null);
        this.j = akvqVar;
        this.k = new nlr(hakVar, executor, new Runnable() { // from class: nlg
            @Override // java.lang.Runnable
            public final void run() {
                nli.this.b().ifPresent(iwu.k);
            }
        }, 1, null);
    }

    @Override // defpackage.nky
    public final CharSequence c() {
        return ((apna) this.a).f;
    }

    @Override // defpackage.nky
    public final void e() {
        aulq aulqVar;
        apna apnaVar = (apna) this.a;
        if (apnaVar.d == 55) {
            aulqVar = (aulq) apnaVar.e;
        } else {
            aulqVar = aulq.a;
        }
        apxf apxfVar = ((ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer) aulqVar.pX(ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.channelReelAvatarRenderer)).d;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (apxfVar.pY(ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.showPendingReelUploadsCommand)) {
            this.j.c(this.k);
        }
    }

    @Override // defpackage.nld
    public final avsr f() {
        apnb apnbVar = ((apna) this.a).o;
        if (apnbVar == null) {
            apnbVar = apnb.a;
        }
        if ((apnbVar.b & 4) == 0) {
            return null;
        }
        apnb apnbVar2 = ((apna) this.a).o;
        if (apnbVar2 == null) {
            apnbVar2 = apnb.a;
        }
        avsr avsrVar = apnbVar2.e;
        return avsrVar == null ? avsr.a : avsrVar;
    }

    @Override // defpackage.nky
    public final void g() {
        this.j.d(this.k);
    }
}
