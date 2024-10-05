package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aipl implements ykl {
    final /* synthetic */ PlayerResponseModel a;
    final /* synthetic */ aipm b;
    final /* synthetic */ PlaybackStartDescriptor c;
    final /* synthetic */ acsx d;
    final /* synthetic */ aipn e;

    public aipl(aipn aipnVar, PlayerResponseModel playerResponseModel, aipm aipmVar, PlaybackStartDescriptor playbackStartDescriptor, acsx acsxVar) {
        this.e = aipnVar;
        this.a = playerResponseModel;
        this.b = aipmVar;
        this.c = playbackStartDescriptor;
        this.d = acsxVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("Could not get playability result: ");
        sb.append(valueOf);
        afsi.b(2, 10, sb.toString());
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final aile aileVar = (aile) obj2;
        synchronized (this.e.a) {
            aipn aipnVar = this.e;
            final aiwk aiwkVar = aipnVar.a.a;
            if (aiwkVar == null) {
                return;
            }
            if (!aifk.i(aipnVar.d)) {
                int i = aileVar.c - 1;
                if (i == 0) {
                    this.e.d(this.a, this.c, this.d, aiwkVar);
                } else if (i != 1) {
                    aipm aipmVar = this.b;
                    if (aipmVar != null) {
                        aipmVar.f();
                    }
                } else if (!this.e.f(this.a, aiwkVar, this.b)) {
                    this.e.c(this.a, aileVar.b, aiwkVar);
                }
            } else {
                int i2 = aileVar.c - 1;
                if (i2 != 0) {
                    if (i2 != 1) {
                        aipm aipmVar2 = this.b;
                        if (aipmVar2 != null) {
                            aipmVar2.f();
                        }
                    } else {
                        Executor executor = this.e.b;
                        final PlayerResponseModel playerResponseModel = this.a;
                        final aipm aipmVar3 = this.b;
                        executor.execute(new Runnable() { // from class: aipj
                            @Override // java.lang.Runnable
                            public final void run() {
                                final aipl aiplVar = aipl.this;
                                final PlayerResponseModel playerResponseModel2 = playerResponseModel;
                                final aiwk aiwkVar2 = aiwkVar;
                                aipm aipmVar4 = aipmVar3;
                                final aile aileVar2 = aileVar;
                                if (aiplVar.e.f(playerResponseModel2, aiwkVar2, aipmVar4)) {
                                    return;
                                }
                                aiplVar.e.c.execute(new Runnable() { // from class: aiph
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        aipl aiplVar2 = aipl.this;
                                        PlayerResponseModel playerResponseModel3 = playerResponseModel2;
                                        aile aileVar3 = aileVar2;
                                        aiplVar2.e.c(playerResponseModel3, aileVar3.b, aiwkVar2);
                                    }
                                });
                            }
                        });
                    }
                } else if (ahbx.k(this.a.q())) {
                    Executor executor2 = this.e.b;
                    final PlayerResponseModel playerResponseModel2 = this.a;
                    final aipm aipmVar4 = this.b;
                    final PlaybackStartDescriptor playbackStartDescriptor = this.c;
                    final acsx acsxVar = this.d;
                    executor2.execute(new Runnable() { // from class: aipi
                        @Override // java.lang.Runnable
                        public final void run() {
                            final aipl aiplVar = aipl.this;
                            final PlayerResponseModel playerResponseModel3 = playerResponseModel2;
                            final aiwk aiwkVar2 = aiwkVar;
                            aipm aipmVar5 = aipmVar4;
                            final PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                            final acsx acsxVar2 = acsxVar;
                            if (aiplVar.e.f(playerResponseModel3, aiwkVar2, aipmVar5)) {
                                return;
                            }
                            aiplVar.e.c.execute(new Runnable() { // from class: aipk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aipl aiplVar2 = aipl.this;
                                    aiwk aiwkVar3 = aiwkVar2;
                                    PlayerResponseModel playerResponseModel4 = playerResponseModel3;
                                    PlaybackStartDescriptor playbackStartDescriptor3 = playbackStartDescriptor2;
                                    acsx acsxVar3 = acsxVar2;
                                    if (aiwkVar3.Y()) {
                                        aiplVar2.e.d(playerResponseModel4, playbackStartDescriptor3, acsxVar3, aiwkVar3);
                                    }
                                }
                            });
                        }
                    });
                } else {
                    this.e.d(this.a, this.c, this.d, aiwkVar);
                }
            }
        }
    }
}
