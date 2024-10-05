package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.CommandWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.t;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.service.b;
import defpackage.aahc;
import defpackage.aahd;
import defpackage.aoae;
import defpackage.apxf;
import defpackage.osv;
import defpackage.yjk;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EmbedFragmentServiceFactoryService extends IEmbedFragmentServiceFactoryService.Stub {
    public final Handler a;
    public final osv b;
    public final aoae c;

    public EmbedFragmentServiceFactoryService(Handler handler, aoae aoaeVar, osv osvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        handler.getClass();
        this.a = handler;
        aoaeVar.getClass();
        this.c = aoaeVar;
        this.b = osvVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService
    public final IEmbedFragmentService a(final t tVar, final int i) {
        tVar.getClass();
        yjk.e();
        final ConditionVariable conditionVariable = new ConditionVariable();
        final AtomicReference atomicReference = new AtomicReference();
        this.a.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentServiceFactoryService.1
            @Override // java.lang.Runnable
            public final void run() {
                EmbedFragmentServiceFactoryService embedFragmentServiceFactoryService = EmbedFragmentServiceFactoryService.this;
                final EmbedFragmentService embedFragmentService = new EmbedFragmentService(embedFragmentServiceFactoryService.a, tVar, embedFragmentServiceFactoryService.b, embedFragmentServiceFactoryService.c, i, null, null, null);
                embedFragmentService.p = new aahd() { // from class: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentService$$ExternalSyntheticLambda4
                    @Override // defpackage.aahd
                    public final /* synthetic */ void a(apxf apxfVar) {
                        aahc.a(this, apxfVar);
                    }

                    @Override // defpackage.aahd
                    public final /* synthetic */ void b(List list) {
                        aahc.b(this, list);
                    }

                    @Override // defpackage.aahd
                    public final void c(apxf apxfVar, Map map) {
                        t tVar2 = EmbedFragmentService.this.c;
                        if (tVar2 == null) {
                            return;
                        }
                        try {
                            tVar2.g(new CommandWrapper(apxfVar));
                        } catch (RemoteException unused) {
                        }
                    }

                    @Override // defpackage.aahd
                    public final /* synthetic */ void d(List list, Map map) {
                        aahc.c(this, list, map);
                    }

                    @Override // defpackage.aahd
                    public final /* synthetic */ void e(List list, Object obj) {
                        aahc.d(this, list, obj);
                    }
                };
                embedFragmentService.f = new b(embedFragmentService.p, embedFragmentService.b);
                embedFragmentService.h = embedFragmentService.a.i().h(embedFragmentService.p);
                embedFragmentService.j = embedFragmentService.a.h().g(embedFragmentService.p);
                embedFragmentService.l = embedFragmentService.a.e().a(embedFragmentService.p);
                embedFragmentService.g = embedFragmentService.f;
                embedFragmentService.i = embedFragmentService.h;
                embedFragmentService.k = embedFragmentService.j;
                embedFragmentService.m = embedFragmentService.l;
                embedFragmentService.r.B(embedFragmentService);
                try {
                    t tVar2 = embedFragmentService.c;
                    if (tVar2 != null) {
                        tVar2.asBinder().linkToDeath(embedFragmentService, 0);
                    }
                } catch (RemoteException unused) {
                    embedFragmentService.i();
                }
                atomicReference.set(embedFragmentService);
                conditionVariable.open();
            }
        });
        conditionVariable.block();
        return (IEmbedFragmentService) atomicReference.get();
    }
}
