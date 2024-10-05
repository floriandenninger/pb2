package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.q;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.l;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c;
import defpackage.aoae;
import defpackage.osv;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ApiPlayerFactoryService extends IApiPlayerFactoryService.Stub {
    public final Context a;
    public final Handler b;
    public final osv c;
    public final aoae d;

    public ApiPlayerFactoryService(Context context, Handler handler, aoae aoaeVar, osv osvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        context.getClass();
        this.a = context;
        handler.getClass();
        this.b = handler;
        aoaeVar.getClass();
        this.d = aoaeVar;
        this.c = osvVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService
    public final IApiPlayerService a(final q qVar, final c cVar, final f fVar, final l lVar, final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c cVar2, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar3, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c cVar4, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.c cVar5, final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f fVar2, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.liveoverlay.shared.c cVar6, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.subtitlesoverlay.shared.c cVar7, final com.google.android.apps.youtube.embeddedplayer.service.ui.preview.shared.c cVar8, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.shared.c cVar9, final com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.hostappverificationerroroverlay.shared.f fVar3, final com.google.android.apps.youtube.embeddedplayer.service.databus.shared.c cVar10, final com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.f fVar4, final boolean z) {
        qVar.getClass();
        cVar.getClass();
        if (!z) {
            fVar.getClass();
        } else {
            lVar.getClass();
        }
        cVar2.getClass();
        cVar3.getClass();
        cVar4.getClass();
        cVar5.getClass();
        cVar6.getClass();
        cVar7.getClass();
        cVar8.getClass();
        cVar9.getClass();
        fVar3.getClass();
        final ConditionVariable conditionVariable = new ConditionVariable();
        final AtomicReference atomicReference = new AtomicReference();
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerFactoryService.1
            @Override // java.lang.Runnable
            public final void run() {
                ApiPlayerFactoryService apiPlayerFactoryService = ApiPlayerFactoryService.this;
                atomicReference.set(new ApiPlayerService(apiPlayerFactoryService.a, apiPlayerFactoryService.b, apiPlayerFactoryService.d, apiPlayerFactoryService.c, qVar, cVar, fVar, lVar, cVar2, cVar3, cVar4, cVar5, fVar2, cVar6, cVar7, cVar8, cVar9, cVar10, fVar4, fVar3, z, null, null, null));
                conditionVariable.open();
            }
        });
        conditionVariable.block();
        return (IApiPlayerService) atomicReference.get();
    }
}
