package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afen extends afcr {
    private final PlayerConfigModel c;
    private final aenf d;
    private final ysy e;
    private final zih f;
    private final adxr g;
    private final String h;
    private final String i;

    public afen(afhs afhsVar, PlayerConfigModel playerConfigModel, aenf aenfVar, ysy ysyVar, zih zihVar, adxr adxrVar, String str, aesa aesaVar) {
        super(afhsVar, aesaVar);
        this.c = playerConfigModel;
        this.d = aenfVar;
        this.e = ysyVar;
        this.f = zihVar;
        this.g = adxrVar;
        this.h = str;
        this.i = true != playerConfigModel.aY() ? "249" : "250";
    }

    @Override // defpackage.afcr
    public final void a(List list, long j, long j2, afcp[] afcpVarArr, afco afcoVar) {
        amru o;
        afcp afcpVar;
        afcp afcpVar2;
        ArrayList arrayList = new ArrayList();
        for (afcp afcpVar3 : afcpVarArr) {
            if (!this.b.p().as || aear.l(this.g, this.h, this.c, afcpVar3)) {
                arrayList.add(afcpVar3);
            }
        }
        if (arrayList.isEmpty()) {
            o = amru.p(afcpVarArr);
        } else {
            o = amru.o(arrayList);
        }
        amru amruVar = o;
        Iterator it = amruVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                afcpVar = null;
                break;
            }
            afcpVar = (afcp) it.next();
            if (aear.k(this.g, afcpVar, this.h, this.c, true, j) || h(this.g, afcpVar, this.h, this.c, j)) {
                break;
            }
        }
        afcp afcpVar4 = afcoVar.c;
        Object a = this.f.a();
        long j3 = j + j2;
        if (!this.b.aj()) {
            int a2 = this.b.a();
            if (a != null) {
                FormatStreamModel formatStreamModel = (FormatStreamModel) a;
                if (formatStreamModel.d() <= a2) {
                    afcpVar2 = (afcp) amkq.bj(amruVar);
                    afhs afhsVar = this.b;
                    if (afhsVar.G() && afhsVar.p().ah && !aaoq.w().contains(Integer.valueOf(formatStreamModel.e()))) {
                        Iterator it2 = amruVar.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            afcp afcpVar5 = (afcp) it2.next();
                            if (afcpVar5.d().equals(this.i)) {
                                afcpVar2 = afcpVar5;
                                break;
                            }
                        }
                    }
                }
            }
            afcpVar2 = (afcp) amruVar.get(0);
        } else {
            long e = this.d.e();
            long j4 = a != null ? ((FormatStreamModel) a).f : 0;
            Iterator it3 = amruVar.iterator();
            while (true) {
                if (it3.hasNext()) {
                    afcpVar2 = (afcp) it3.next();
                    if (afcpVar2.a() + j4 < e) {
                        break;
                    }
                } else {
                    afcpVar2 = (afcp) amkq.bj(amruVar);
                    break;
                }
            }
        }
        int i = 1;
        if (afcpVar != null) {
            int a3 = afcpVar.a();
            int a4 = afcpVar2.a();
            boolean o2 = this.e.o();
            boolean k = aear.k(this.g, afcpVar, this.h, this.c, true, j3);
            if ((!o2) || a3 > a4 || k) {
                afcpVar2 = afcpVar;
            }
        }
        int size = list.size();
        if (!this.b.p().T && afcpVar2 != null) {
            size = aear.j(list, j, this.c.E(this.e.a()), new afem(afcpVar2, 0));
        }
        if (afcpVar4 != null) {
            i = !afcpVar2.equals(afcpVar4) ? 3 : 0;
        }
        new afcn(afcpVar2, i, 0, size).a(afcoVar);
    }

    @Override // defpackage.afcr
    public final void b(boolean z) {
    }

    @Override // defpackage.afcr
    public final void c() {
    }

    @Override // defpackage.afcr
    public final void d(float f) {
    }

    @Override // defpackage.afcr
    public final void e() {
    }

    @Override // defpackage.afcr
    public final void f(aeex aeexVar) {
    }

    @Override // defpackage.afcr
    public final void g(afkm afkmVar) {
    }
}
