package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aexf extends aewy {
    private final aesm l;
    private final affc m;
    private final aexm n;
    private final ysy o;
    private final aevc[] p;
    private final afhs q;

    public aexf(afhf afhfVar, ayr ayrVar, bbx bbxVar, att attVar, bbx bbxVar2, bfg bfgVar, PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData, aesm aesmVar, affc affcVar, aexh aexhVar, String str, pnd pndVar, aezm aezmVar, aevc[] aevcVarArr, ysy ysyVar, afhs afhsVar, byte[] bArr) {
        super(afhfVar, ayrVar, bbxVar, attVar, bbxVar2, bfgVar, playerConfigModel, videoStreamingData, aexhVar, str, pndVar, aezmVar, null);
        afki.b(!videoStreamingData.p.isEmpty());
        this.l = aesmVar;
        this.m = affcVar;
        this.n = new aexm(((FormatStreamModel) videoStreamingData.p.get(0)).h());
        this.p = aevcVarArr;
        this.o = ysyVar;
        this.q = afhsVar;
    }

    @Override // defpackage.aewy
    protected final bdr k(aezx aezxVar, bel belVar) {
        aexb aexbVar = new aexb(this.a, aezxVar.b, this.e, this.l, this.g, (aexh) this.d, belVar, this.m, this.n, this.c, aezxVar.a, this.b.G(), this.b.E(), this.i, this.p, this.o, this.q);
        this.n.c(aexbVar);
        return aexbVar;
    }

    @Override // defpackage.aewy, defpackage.bbp, defpackage.bda
    public final boolean o(long j) {
        aesf l;
        for (bdq bdqVar : this.j) {
            bdr bdrVar = bdqVar.b;
            if ((bdrVar instanceof aexb) && (l = ((aexb) bdrVar).l()) != null && l.c()) {
                l.a(new Runnable() { // from class: aexe
                    @Override // java.lang.Runnable
                    public final void run() {
                        aexf.this.r();
                    }
                });
                return false;
            }
        }
        return super.o(j);
    }

    @Override // defpackage.aewy
    protected final void q(bdr bdrVar) {
        if (bdrVar instanceof aexb) {
            this.n.e((aexb) bdrVar);
        }
    }
}
