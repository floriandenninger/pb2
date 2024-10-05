package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advr implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final /* synthetic */ int d;

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i) {
        this.d = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, byte[] bArr) {
        this.d = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, char[] cArr) {
        this.d = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, float[] fArr) {
        this.d = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, int[] iArr) {
        this.d = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, short[] sArr) {
        this.d = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, boolean[] zArr) {
        this.d = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, byte[][] bArr) {
        this.d = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, char[][] cArr) {
        this.d = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, float[][] fArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, int[][] iArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, short[][] sArr) {
        this.d = i;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.b = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, char[][][] cArr) {
        this.d = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, int[][][] iArr) {
        this.d = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, short[][][] sArr) {
        this.d = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.c = azrwVar3;
    }

    public advr(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, boolean[][][] zArr) {
        this.d = i;
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
    }

    public static advr A(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 13);
    }

    public static advr B(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 14);
    }

    public static advr C(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 15, (float[][]) null);
    }

    public static advr D(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 16, (byte[][][]) null);
    }

    public static advr E(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 17, (char[][][]) null);
    }

    public static advr F(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 18, (short[][][]) null);
    }

    public static advr G(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 19, (int[][][]) null);
    }

    public static advr H(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 20, (boolean[][][]) null);
    }

    public static aidi I(akpq akpqVar) {
        return new aidi(akpqVar, null, null);
    }

    public static ysn J(ammv ammvVar, ajyw ajywVar, ysn ysnVar) {
        azrw azrwVar = ajywVar.b;
        apdq apdqVar = (apdq) ajywVar.a.get();
        apdqVar.getClass();
        Optional optional = (Optional) ajywVar.c.get();
        optional.getClass();
        ysnVar.getClass();
        return (ysn) ammvVar.e(new afwl(azrwVar, apdqVar, optional, ysnVar));
    }

    public static advr a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 0);
    }

    public static Executor b(Executor executor, atse atseVar) {
        int i = 1;
        if (atseVar != null && (atseVar.c & 67108864) != 0) {
            apdt apdtVar = atseVar.p;
            if (apdtVar == null) {
                apdtVar = apdt.a;
            }
            int bJ = amkq.bJ(apdtVar.b);
            if (bJ != 0) {
                i = bJ;
            }
        }
        Executor e = adyu.e(i, executor);
        ayaw.k(e);
        return e;
    }

    public static Executor c(Executor executor, afhs afhsVar) {
        int i = 1;
        if (afhsVar.am() && (afhsVar.o().b & 16777216) != 0) {
            apdt apdtVar = afhsVar.o().t;
            if (apdtVar == null) {
                apdtVar = apdt.a;
            }
            int bJ = amkq.bJ(apdtVar.b);
            if (bJ != 0) {
                i = bJ;
            }
        }
        Executor e = adyu.e(i, executor);
        ayaw.k(e);
        return e;
    }

    public static aeqg d(aeqh aeqhVar, afvb afvbVar, afvb afvbVar2) {
        ArrayList arrayList = new ArrayList(2);
        if (afvbVar != null) {
            arrayList.add(afvbVar);
        }
        if (afvbVar2 != null) {
            arrayList.add(afvbVar2);
        }
        return aeqhVar.a(amru.o(arrayList));
    }

    public static adxh e(azrw azrwVar, aenf aenfVar, afeu afeuVar) {
        return new adxh(azrwVar, aenfVar, afeuVar);
    }

    public static yoi f(Context context, String str, ammv ammvVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new yog("DelayedEventProto", 0));
        return new yoc(context, str, arrayList, ((Integer) ammvVar.e(0)).intValue());
    }

    public static yoc g(Context context, String str, ammv ammvVar) {
        return new yoc(context, str, amru.t(new yog("ScheduledTaskProto", 0), new yog("OfflineHttpRequestProto", 0), new yog(1)), ((Integer) ammvVar.e(0)).intValue());
    }

    public static Set h(afxl afxlVar, afvb afvbVar, afvb afvbVar2) {
        amsv i = amsx.i();
        i.c(afxlVar);
        if (afvbVar != null) {
            i.c(afvbVar);
        }
        i.c(afvbVar2);
        amsx g = i.g();
        ayaw.k(g);
        return g;
    }

    public static ysm i(shf shfVar, yry yryVar, afqn afqnVar) {
        return ysm.a(yryVar, new afvk(afqnVar, shfVar));
    }

    public static ywr j(Context context, anib anibVar, vfg vfgVar) {
        vda a = vdb.a(context);
        a.e("net");
        a.f("delayed_event.pb");
        Uri a2 = a.a();
        ywu d = ywv.d(new aiwe(context, 1), anibVar);
        d.a = wgw.j;
        d.b(adpv.q);
        d.b = adpv.p;
        d.c = afrl.a;
        ywv a3 = d.a();
        vfe a4 = vff.a();
        a4.f(a2);
        a4.e(awwa.a);
        a4.b(a3);
        return new ywp(agcm.e(vfgVar.a(a4.a())), awwa.a);
    }

    public static ammv k(aaea aaeaVar, Context context, axpg axpgVar) {
        return aifk.e(aaeaVar).f120J ? ammv.j(new zif(context, (Handler) axpgVar.get())) : amlr.a;
    }

    public static ahek l(zih zihVar, aixm aixmVar) {
        return new ahek(zihVar, aixmVar);
    }

    public static aisj m(anhy anhyVar, aifk aifkVar) {
        return new aisj(anhyVar, aifkVar);
    }

    public static aizu n(String str, aifk aifkVar, ahbv ahbvVar) {
        return new aizu(str, aifkVar, ahbvVar);
    }

    public static ajca o(aiwx aiwxVar, aift aiftVar, aemv aemvVar) {
        return new ajca(aiwxVar, aiftVar, aemvVar);
    }

    public static advr p(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 1);
    }

    public static advr q(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 2, (byte[]) null);
    }

    public static advr r(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 3, (char[]) null);
    }

    public static advr s(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 4, (short[]) null);
    }

    public static advr t(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 5, (int[]) null);
    }

    public static advr u(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 6, (boolean[]) null);
    }

    public static advr v(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 8, (byte[][]) null);
    }

    public static advr w(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 9, (char[][]) null);
    }

    public static advr x(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 10, (short[][]) null);
    }

    public static advr y(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 11, (int[][]) null);
    }

    public static advr z(azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        return new advr(azrwVar, azrwVar2, azrwVar3, 12, (boolean[][]) null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.d) {
            case 0:
                Executor executor = (Executor) this.a.get();
                atse atseVar = ((adwe) this.b).get();
                return b(executor, atseVar);
            case 1:
                Executor executor2 = (Executor) this.a.get();
                afhs afhsVar = (afhs) this.b.get();
                return c(executor2, afhsVar);
            case 2:
                return d(((aeqi) this.a).get(), (afvb) this.c.get(), (afvb) this.b.get());
            case 3:
                return e(this.c, (aenf) this.a.get(), ((afev) this.b).get());
            case 4:
                return f((Context) ((axqs) this.a).a, (String) this.c.get(), (ammv) ((axqs) this.b).a);
            case 5:
                return g((Context) ((axqs) this.a).a, (String) this.c.get(), (ammv) ((axqs) this.b).a);
            case 6:
                return J((ammv) ((axqs) this.c).a, ((afwm) this.b).get(), (ysn) this.a.get());
            case 7:
                return h((afxl) this.b.get(), (afvb) this.c.get(), ((vzs) this.a).a());
            case 8:
                return i((shf) this.a.get(), (yry) this.c.get(), (afqn) this.b.get());
            case 9:
                return j((Context) ((axqs) this.a).a, (anib) this.c.get(), (vfg) this.b.get());
            case 10:
                return new afrv((ynx) this.a.get(), (amrz) ((axqs) this.c).a, (ywr) this.b.get());
            case 11:
                return k((aaea) this.b.get(), (Context) ((axqs) this.a).a, axqq.a(this.c));
            case 12:
                zih zihVar = (zih) this.c.get();
                aixm aixmVar = (aixm) this.a.get();
                return l(zihVar, aixmVar);
            case 13:
                aidi I = I(((aidp) this.b).get());
                I.a((aypn) this.c.get());
                return I;
            case 14:
                return new aiov((aypn) this.a.get(), (aypn) this.b.get(), (aypn) this.c.get());
            case 15:
                aisj m = m((anhy) this.b.get(), (aifk) this.a.get());
                m.b((aioc) this.c.get());
                return m;
            case 16:
                return new aitb((ScheduledExecutorService) this.c.get(), (Executor) this.a.get(), (zjl) this.b.get());
            case 17:
                return new aiuy((Context) ((axqs) this.c).a, (aipt) this.b.get(), (aadw) this.a.get());
            case 18:
                return n(((yjv) this.b).b(), (aifk) this.a.get(), (ahbv) ((axqs) this.c).a);
            case 19:
                ajca o = o((aiwx) this.c.get(), (aift) this.b.get(), (aemv) this.a.get());
                o.a();
                return o;
            default:
                return new ajjp((ajjs) this.b.get(), ((ajkk) this.c).get(), ajbp.c(), (aadw) this.a.get());
        }
    }
}
