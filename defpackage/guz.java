package defpackage;

import android.os.Bundle;
import com.google.protos.youtube.api.innertube.BackstageRepostCreationRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint;
import com.google.protos.youtube.api.innertube.CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class guz implements aaha {
    public static final /* synthetic */ int a = 0;
    private final azrw b;
    private final ainy c;
    private final /* synthetic */ int d;

    public guz(azrw azrwVar, ainy ainyVar, int i, byte[] bArr) {
        this.d = i;
        azrwVar.getClass();
        this.b = azrwVar;
        ainyVar.getClass();
        this.c = ainyVar;
    }

    public guz(azrw azrwVar, ainy ainyVar, int i) {
        this.d = i;
        azrwVar.getClass();
        this.b = azrwVar;
        ainyVar.getClass();
        this.c = ainyVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        apjf apjfVar = null;
        if (this.d == 0) {
            aulq aulqVar = (apxfVar.pY(CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand.createBackstageRepostCommand) ? (CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand) apxfVar.pX(CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand.createBackstageRepostCommand) : null).b;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            apjm apjmVar = aulqVar.pY(BackstageRepostCreationRendererOuterClass.backstageRepostCreationRenderer) ? (apjm) aulqVar.pX(BackstageRepostCreationRendererOuterClass.backstageRepostCreationRenderer) : null;
            if (apjmVar == null) {
                zga.b("Executed createBackstageRepostCommand with no BackstageRepostCreationRenderer.");
                return;
            }
            if (this.c.d()) {
                this.c.a();
            }
            final xoz xozVar = (xoz) yjj.u(map, "com.google.android.libraries.youtube.comment.comment_thread_created_callback", xoz.class);
            xoz xozVar2 = new xoz() { // from class: guy
                @Override // defpackage.xoz
                public final void a(Object obj, boolean z) {
                    xoz xozVar3 = xoz.this;
                    int i = guz.a;
                    if (xozVar3 != null) {
                        xozVar3.a(obj, false);
                    }
                }
            };
            xnk xnkVar = (xnk) this.b.get();
            aulq aulqVar2 = apjmVar.d;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            if ((((apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer)).b & 8192) == 0) {
                zga.b("Command for repost button is missing in BackstageRepostCreationRenderer");
                return;
            }
            dn k = xnkVar.a.getSupportFragmentManager().k();
            ce f = xnkVar.a.getSupportFragmentManager().f("backstage_repost_fragment");
            if (f != null) {
                k.m(f);
            }
            k.s(null);
            xnkVar.d = null;
            wcy wcyVar = xnkVar.e;
            xxz xxzVar = new xxz();
            Bundle bundle = new Bundle();
            amkq.cn(bundle, "renderer", apjmVar);
            xxzVar.af(bundle);
            xnkVar.d = xxzVar;
            xnj xnjVar = xnkVar.c;
            xnjVar.b = xozVar2;
            xya xyaVar = xnkVar.d;
            xnjVar.c = xyaVar;
            ((xxz) xyaVar).ap = new xnh(xnkVar, apjmVar);
            xnkVar.d.s(k, "backstage_repost_fragment");
            return;
        }
        CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint = apxfVar.pY(CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.createBackstagePostDialogEndpoint) ? (CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint) apxfVar.pX(CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.createBackstagePostDialogEndpoint) : null;
        if (createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint != null) {
            aqgq aqgqVar = createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.b;
            if (aqgqVar == null) {
                aqgqVar = aqgq.a;
            }
            if (aqgqVar.b == 118523928) {
                aqgq aqgqVar2 = createBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.b;
                if (aqgqVar2 == null) {
                    aqgqVar2 = aqgq.a;
                }
                if (aqgqVar2.b == 118523928) {
                    apjfVar = (apjf) aqgqVar2.c;
                } else {
                    apjfVar = apjf.a;
                }
            }
        }
        if (apjfVar == null) {
            zga.b("Executed CreateBackstagePostDialogEndpoint with no BackstagePostDialogRenderer.");
            return;
        }
        if (this.c.d()) {
            this.c.a();
        }
        final Runnable runnable = (Runnable) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", Runnable.class);
        final xoz xozVar3 = (xoz) yjj.u(map, "com.google.android.libraries.youtube.comment.comment_thread_created_callback", xoz.class);
        ((xng) this.b.get()).a(apjfVar, new xoz() { // from class: gux
            @Override // defpackage.xoz
            public final void a(Object obj, boolean z) {
                Runnable runnable2 = runnable;
                xoz xozVar4 = xozVar3;
                int i = guz.a;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (xozVar4 != null) {
                    xozVar4.a(obj, false);
                }
            }
        });
    }
}
