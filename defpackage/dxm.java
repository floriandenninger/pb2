package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dxm extends dyk {
    private final dya b;

    public dxm(dya dyaVar) {
        this.b = dyaVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dyk, defpackage.dyn
    public final dyn ks(String str, dxk dxkVar, List list) {
        char c;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            esv.B("getEventName", 0, list);
            return new dyq(this.b.b.d());
        }
        if (c == 1) {
            esv.B("getParamValue", 1, list);
            return esv.t(this.b.b.c(dxkVar.b((dyn) list.get(0)).i()));
        }
        if (c == 2) {
            esv.B("getParams", 0, list);
            Map e = this.b.b.e();
            dyk dykVar = new dyk();
            for (String str2 : e.keySet()) {
                dykVar.r(str2, esv.t(e.get(str2)));
            }
            return dykVar;
        }
        if (c == 3) {
            esv.B("getTimestamp", 0, list);
            return new dyg(Double.valueOf(this.b.b.a()));
        }
        if (c != 4) {
            if (c == 5) {
                esv.B("setParamValue", 2, list);
                String i = dxkVar.b((dyn) list.get(0)).i();
                dyn b = dxkVar.b((dyn) list.get(1));
                this.b.b.g(i, esv.y(b));
                return b;
            }
            return super.ks(str, dxkVar, list);
        }
        esv.B("setEventName", 1, list);
        dyn b2 = dxkVar.b((dyn) list.get(0));
        if (f.equals(b2) || g.equals(b2)) {
            throw new IllegalArgumentException("Illegal event name");
        }
        this.b.b.f(b2.i());
        return new dyq(b2.i());
    }
}
