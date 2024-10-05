package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wxv implements wyi, wof, woe, wwy, www {
    public final azrw a;
    public final azrw b;
    private final azrw f;
    private final azrw g;
    public final ajun e = new ajun((short[]) null);
    final Map c = new HashMap();
    public final Set d = new HashSet();
    private String h = "";
    private long i = -1;

    public wxv(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.f = azrwVar3;
        this.g = azrwVar4;
    }

    @Override // defpackage.wof
    public final /* synthetic */ void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wwy
    public final void i(xgh xghVar) {
        if (xghVar.a.isEmpty()) {
            return;
        }
        this.d.remove(xghVar.a);
    }

    @Override // defpackage.www
    public final void j(xgh xghVar) {
        if (xghVar.a.isEmpty()) {
            return;
        }
        this.d.add(xghVar.a);
    }

    @Override // defpackage.wyi
    public final void qA(xgx xgxVar) {
        xgv v = this.e.v(xgxVar.c());
        if (v == null) {
            return;
        }
        ajun ajunVar = (ajun) this.f.get();
        aixh aixhVar = (aixh) v.c.d(xej.class);
        aixi aixiVar = (aixi) ajunVar.a.remove(xgxVar.c());
        if (aixiVar != null && aixhVar != null && aixhVar.d() != null) {
            aixhVar.d().i(aixiVar);
        }
        if (xgxVar instanceof xfl) {
            this.c.remove(((xfl) xgxVar).c);
        }
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
    public final void qs(String str, long j, long j2, long j3, boolean z) {
        tdt l;
        this.h = str;
        this.i = j;
        if (this.c.containsKey(str)) {
            ArrayList arrayList = new ArrayList();
            Queue queue = (Queue) this.c.get(str);
            while (true) {
                if (queue.isEmpty() || j < ((xfl) queue.peek()).d.a) {
                    break;
                }
                xfl xflVar = (xfl) queue.poll();
                if (!xflVar.b) {
                    whu.l(null, "VideoTimeEventTriggerAdapter: VideoTimeEvent trigger should only be triggered once");
                } else if (this.e.y(xflVar.a)) {
                    xgv u = this.e.u(xflVar.a);
                    if (((xfl) u.b).g && (l = ((wob) this.g.get()).l(j)) != null) {
                        u = new xgv(u, xcp.b(new xcq(l)));
                    }
                    arrayList.add(u);
                } else {
                    whu.l(null, "Ping migration VideoTimeEventTriggerAdapter: bundle map doesn't contain the activated trigger");
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ((wyh) this.a.get()).r(arrayList);
        }
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5 A[Catch: wnw -> 0x0119, TryCatch #0 {wnw -> 0x0119, blocks: (B:21:0x009f, B:24:0x00bf, B:26:0x00c5, B:28:0x00cb, B:39:0x0109, B:40:0x0110, B:41:0x0111, B:42:0x0118), top: B:20:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111 A[Catch: wnw -> 0x0119, TryCatch #0 {wnw -> 0x0119, blocks: (B:21:0x009f, B:24:0x00bf, B:26:0x00c5, B:28:0x00cb, B:39:0x0109, B:40:0x0110, B:41:0x0111, B:42:0x0118), top: B:20:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    @Override // defpackage.wyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qz(int r18, defpackage.xgx r19, defpackage.xgh r20, defpackage.xev r21) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxv.qz(int, xgx, xgh, xev):void");
    }
}
