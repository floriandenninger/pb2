package defpackage;

import android.util.Pair;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class luw implements ayrv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ luw u = new luw(20);
    public static final /* synthetic */ luw t = new luw(19);
    public static final /* synthetic */ luw s = new luw(18);
    public static final /* synthetic */ luw r = new luw(17);
    public static final /* synthetic */ luw q = new luw(16);
    public static final /* synthetic */ luw p = new luw(15);
    public static final /* synthetic */ luw o = new luw(14);
    public static final /* synthetic */ luw n = new luw(13);
    public static final /* synthetic */ luw m = new luw(12);
    public static final /* synthetic */ luw l = new luw(11);
    public static final /* synthetic */ luw k = new luw(10);
    public static final /* synthetic */ luw j = new luw(9);
    public static final /* synthetic */ luw i = new luw(8);
    public static final /* synthetic */ luw h = new luw(7);
    public static final /* synthetic */ luw g = new luw(6);
    public static final /* synthetic */ luw f = new luw(5);
    public static final /* synthetic */ luw e = new luw(4);
    public static final /* synthetic */ luw d = new luw(3);
    public static final /* synthetic */ luw c = new luw(2);
    public static final /* synthetic */ luw b = new luw(1);
    public static final /* synthetic */ luw a = new luw(0);

    private /* synthetic */ luw(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        atvt atvtVar;
        boolean z = false;
        switch (this.v) {
            case 0:
                return Boolean.valueOf(evr.af((arfd) obj));
            case 1:
                aswb aswbVar = (aswb) obj;
                if (aswbVar.ab && aswbVar.ac) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                gnh gnhVar = (gnh) obj;
                return Pair.create(gnhVar.f, Boolean.valueOf(gnhVar.e));
            case 3:
                return ammv.j((lzq) obj);
            case 4:
                return aypy.T(((aaxh) obj).a.d).L(khf.k).Y(f).j();
            case 5:
                arst arstVar = (arst) obj;
                if (arstVar.b == 123267149) {
                    return (atgn) arstVar.c;
                }
                return atgn.a;
            case 6:
                aqjt aqjtVar = ((atgn) obj).f;
                if (aqjtVar == null) {
                    aqjtVar = aqjt.a;
                }
                aqjs aqjsVar = aqjtVar.b;
                return aqjsVar == null ? aqjs.a : aqjsVar;
            case 7:
                return Boolean.valueOf(evr.af((arfd) obj));
            case 8:
                return Boolean.valueOf(((mbm) obj).f());
            case 9:
                return aypy.T(((aaxh) obj).a.d).L(khf.l).Y(l).j();
            case 10:
                return (ayqj) aypy.T(((aaxh) obj).a.d).L(khf.m).Y(m).j().P().N(n).Y(o).aD(zcz.d);
            case 11:
                arst arstVar2 = (arst) obj;
                if (arstVar2.b == 123267149) {
                    return (atgn) arstVar2.c;
                }
                return atgn.a;
            case 12:
                arst arstVar3 = (arst) obj;
                if (arstVar3.b == 117866661) {
                    return (atvy) arstVar3.c;
                }
                return atvy.a;
            case 13:
                return ((atvy) obj).b;
            case 14:
                atvz atvzVar = (atvz) obj;
                int i2 = atvzVar.b;
                if (i2 == 117501096) {
                    apxf apxfVar = ((atvw) atvzVar.c).e;
                    return apxfVar == null ? apxf.a : apxfVar;
                }
                if (i2 == 318370163) {
                    atvtVar = (atvt) atvzVar.c;
                } else {
                    atvtVar = atvt.a;
                }
                apxf apxfVar2 = atvtVar.e;
                return apxfVar2 == null ? apxf.a : apxfVar2;
            case 15:
                return ((gir) obj).aO();
            case 16:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 17:
                return (CharSequence) ((Optional) obj).get();
            case 18:
                Integer num = (Integer) obj;
                return num.intValue() <= 9 ? String.format(Locale.getDefault(), "%d", num) : String.format(Locale.getDefault(), "%d+", 9);
            case 19:
                return (Integer) ((Optional) obj).get();
            default:
                return (Boolean) ((Optional) obj).map(mjq.b).orElse(Boolean.FALSE);
        }
    }
}
