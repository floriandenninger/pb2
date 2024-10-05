package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ncy implements ajom {
    private final ndf a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ncy(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, boolean z, ypa ypaVar, ViewGroup viewGroup, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, fgq fgqVar, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = new ndf(context, ajjzVar, aahdVar, ajutVar, ajuwVar, wyzVar, tdvVar, wzqVar, euvVar, z, ypaVar, viewGroup, inlinePlaybackLifecycleController, fgqVar, ajywVar, akbdVar, null, null, null, null, null);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a.l;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.b(ajosVar);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        atlt atltVar;
        auhc auhcVar = (auhc) obj;
        ndf ndfVar = this.a;
        ajokVar.getClass();
        auhcVar.getClass();
        ndfVar.l.removeAllViews();
        ndfVar.d();
        nde ndeVar = ndfVar.m;
        augz augzVar = auhcVar.c;
        if (augzVar == null) {
            augzVar = augz.a;
        }
        ndeVar.e = augzVar;
        augz augzVar2 = auhcVar.c;
        if (augzVar2 == null) {
            augzVar2 = augz.a;
        }
        ndeVar.f = (augzVar2.b & 8192) != 0;
        augz augzVar3 = auhcVar.c;
        if (augzVar3 == null) {
            augzVar3 = augz.a;
        }
        ndeVar.g = augzVar3.p;
        augu[] auguVarArr = (augu[]) auhcVar.d.toArray(new augu[0]);
        String str = (auhcVar.b & 64) != 0 ? auhcVar.h : null;
        augz augzVar4 = auhcVar.c;
        if (augzVar4 == null) {
            augzVar4 = augz.a;
        }
        augz augzVar5 = augzVar4;
        if ((auhcVar.b & 2) != 0) {
            aulq aulqVar = auhcVar.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            atltVar = (atlt) ahbj.n(aulqVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atltVar = null;
        }
        aoxy aoxyVar = auhcVar.f;
        if (aoxyVar == null) {
            aoxyVar = aoxy.a;
        }
        ndeVar.a(ajokVar, auhcVar, str, augzVar5, auguVarArr, atltVar, aoxyVar, auhcVar.g.I());
        ndfVar.l.addView(ndfVar.m.d);
    }
}
