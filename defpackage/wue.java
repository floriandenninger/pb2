package defpackage;

import com.google.android.libraries.youtube.ads.model.AdVideoEnd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wue implements wub, wof {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final azrw i;
    private final azrw j;
    private final azrw k;
    private final azrw l;
    private final Executor m;
    private final Executor n;
    private final azrw o;
    private final CopyOnWriteArrayList p;
    private final Map q = new HashMap();
    private final azrw r;
    private final whu s;

    public wue(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, Executor executor, Executor executor2, CopyOnWriteArrayList copyOnWriteArrayList, whu whuVar, azrw azrwVar14, byte[] bArr, byte[] bArr2) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.g = azrwVar7;
        this.h = azrwVar8;
        this.i = azrwVar9;
        this.j = azrwVar10;
        this.k = azrwVar11;
        this.l = azrwVar12;
        this.o = azrwVar13;
        this.m = executor;
        this.n = executor2;
        this.p = copyOnWriteArrayList;
        this.s = whuVar;
        this.r = azrwVar14;
        this.f = azrwVar6;
    }

    @Override // defpackage.wub
    public final wsx a(wsw wswVar, xgh xghVar, xev xevVar) {
        int i;
        String str;
        wtn wtnVar;
        wts wtpVar;
        boolean z;
        wue wueVar = this;
        xgh xghVar2 = xghVar;
        xev xevVar2 = xevVar;
        if (whl.e(wti.class, xghVar2, xevVar2)) {
            aeqn aeqnVar = (aeqn) xghVar2.d(xdj.class);
            if (wueVar.q.containsKey(aeqnVar.a)) {
                aeqnVar = (aeqn) wueVar.q.get(aeqnVar.a);
            }
            wti wtiVar = new wti((wog) wueVar.c.get(), (wqa) wueVar.f.get(), (woc) wueVar.l.get(), (ypa) wueVar.o.get(), wueVar.m, wueVar.n, xghVar, xevVar, (wsw) wueVar.h.get(), (wno) wueVar.i.get(), aeqnVar, (aaea) wueVar.a.get());
            for (xev xevVar3 : (List) xevVar2.e(xec.class)) {
                if (whl.e(wtj.class, xghVar2, xevVar3)) {
                    wtiVar.e.add(new wtj((woc) wueVar.l.get(), (wqa) wueVar.f.get(), xghVar, xevVar3, (wno) wueVar.i.get()));
                } else {
                    String valueOf = String.valueOf(xghVar);
                    String valueOf2 = String.valueOf(xevVar3);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length());
                    sb.append("Unrecognized metadata. slot: ");
                    sb.append(valueOf);
                    sb.append(", layout: ");
                    sb.append(valueOf2);
                    throw new wua(sb.toString());
                }
            }
            return wtiVar;
        }
        if (whl.e(wtn.class, xghVar2, xevVar2)) {
            List list = (List) xevVar2.e(xec.class);
            String str2 = "Unrecognized metadata. slot: ";
            wtn wtnVar2 = r10;
            wtn wtnVar3 = new wtn((wsw) wueVar.h.get(), (wno) wueVar.i.get(), (wog) wueVar.c.get(), (wxz) wueVar.j.get(), (woc) wueVar.l.get(), (wwo) wueVar.k.get(), (wpw) wueVar.e.get(), xghVar, xevVar, (PlayerResponseModel) xghVar2.d(xdg.class), wueVar.n);
            int i2 = 0;
            while (i2 < list.size()) {
                List list2 = (List) xevVar2.e(xec.class);
                xev xevVar4 = (xev) list2.get(i2);
                if (whl.e(wtq.class, xghVar2, xevVar4)) {
                    wno wnoVar = (wno) wueVar.i.get();
                    aaea aaeaVar = (aaea) wueVar.a.get();
                    wqg wqgVar = (wqg) wueVar.d.get();
                    wog wogVar = (wog) wueVar.c.get();
                    wpl wplVar = (wpl) wueVar.b.get();
                    woc wocVar = (woc) wueVar.l.get();
                    wny wnyVar = (wny) wueVar.g.get();
                    xci i3 = wtnVar2.i(xevVar4);
                    ypa ypaVar = (ypa) wueVar.o.get();
                    int i4 = i2 + 1;
                    if (i4 < list2.size()) {
                        xev xevVar5 = (xev) list2.get(i4);
                        if (xevVar5.f(xdv.class)) {
                            z = xevVar5.e(xdv.class) instanceof AdVideoEnd;
                            i = i2;
                            str = str2;
                            wtpVar = new wtq(wnoVar, wtnVar2, aaeaVar, wqgVar, wogVar, wplVar, wocVar, wnyVar, i3, ypaVar, xghVar, xevVar4, z, (wpu) wueVar.r.get());
                            wueVar = this;
                            wtnVar = wtnVar2;
                        }
                    }
                    z = false;
                    i = i2;
                    str = str2;
                    wtpVar = new wtq(wnoVar, wtnVar2, aaeaVar, wqgVar, wogVar, wplVar, wocVar, wnyVar, i3, ypaVar, xghVar, xevVar4, z, (wpu) wueVar.r.get());
                    wueVar = this;
                    wtnVar = wtnVar2;
                } else {
                    i = i2;
                    wtn wtnVar4 = wtnVar2;
                    str = str2;
                    if (whl.e(wtp.class, xghVar2, xevVar4)) {
                        wueVar = this;
                        wno wnoVar2 = (wno) wueVar.i.get();
                        wxz wxzVar = (wxz) wueVar.j.get();
                        CopyOnWriteArrayList copyOnWriteArrayList = wueVar.p;
                        woc wocVar2 = (woc) wueVar.l.get();
                        wny wnyVar2 = (wny) wueVar.g.get();
                        wtnVar = wtnVar4;
                        xci i5 = wtnVar.i(xevVar4);
                        wtpVar = new wtp(wnoVar2, wtnVar, wxzVar, copyOnWriteArrayList, wocVar2, wnyVar2, i5, (ypa) wueVar.o.get(), xghVar, xevVar4);
                    } else {
                        String valueOf3 = String.valueOf(xghVar);
                        String valueOf4 = String.valueOf(xevVar4);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 39 + String.valueOf(valueOf4).length());
                        sb2.append(str);
                        sb2.append(valueOf3);
                        sb2.append(", layout: ");
                        sb2.append(valueOf4);
                        throw new wua(sb2.toString());
                    }
                }
                wtnVar.b.add(wtpVar);
                xghVar2 = xghVar;
                xevVar2 = xevVar;
                wtnVar2 = wtnVar;
                str2 = str;
                i2 = i + 1;
            }
            return wtnVar2;
        }
        throw new wua("PlayerBytesLayoutRenderingAdapterFactory received unsupported slot");
    }

    @Override // defpackage.wof
    public final void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
        if (aignVar == aign.NEW) {
            this.q.clear();
        }
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qs(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final void qy(ahcm ahcmVar) {
        this.q.put(ahcmVar.a().a, ahcmVar.a());
    }
}
