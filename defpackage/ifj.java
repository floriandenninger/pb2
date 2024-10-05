package defpackage;

import com.google.protos.youtube.api.innertube.ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ifj implements aaha {
    public final aahd a;
    public final jgp b;
    private final hak c;
    private final Executor d;

    public ifj(jgp jgpVar, aahd aahdVar, hak hakVar, Executor executor, byte[] bArr, byte[] bArr2) {
        this.b = jgpVar;
        this.a = aahdVar;
        this.c = hakVar;
        this.d = executor;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, final Map map) {
        amkq.E(apxfVar.pY(ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.showPendingReelUploadsCommand));
        final ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand = (ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand) apxfVar.pX(ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.showPendingReelUploadsCommand);
        final apxf apxfVar2 = showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.d;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        ynm.k(this.c.a(), this.d, new ynk() { // from class: ifh
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                ifj ifjVar = ifj.this;
                ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand2 = showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
                apxf apxfVar3 = apxfVar2;
                Map map2 = map;
                zga.d("Error loading upload jobs", th);
                if ((showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand2.b & 2) != 0) {
                    ifjVar.a.c(apxfVar3, map2);
                }
            }
        }, new ynl() { // from class: ifi
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                ifj ifjVar = ifj.this;
                Map map2 = map;
                ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand2 = showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
                apxf apxfVar3 = apxfVar2;
                if (((amru) obj).isEmpty()) {
                    if ((showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand2.b & 2) != 0) {
                        ifjVar.a.c(apxfVar3, map2);
                        return;
                    }
                    return;
                }
                ajok ajokVar = map2 != null ? (ajok) map2.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext") : null;
                jgp jgpVar = ifjVar.b;
                aulq aulqVar = showPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand2.c;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                ci ciVar = (ci) jgpVar.a.get();
                ciVar.getClass();
                ioj iojVar = (ioj) jgpVar.b.get();
                iojVar.getClass();
                aulqVar.getClass();
                inr inrVar = new inr(ciVar, iojVar, aulqVar, ajokVar);
                inrVar.G();
                inrVar.b.oB(inrVar.c, inrVar.a);
                inrVar.b.i = new inq(inrVar);
            }
        });
    }
}
