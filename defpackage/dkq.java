package defpackage;

import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dkq implements YogaMeasureFunction {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [dhi, java.lang.Object, djr] */
    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(dut dutVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int C;
        int i;
        int i2;
        ?? p = dutVar.p();
        dha W = p.W();
        dhe dheVar = W.q;
        if (dheVar != null && dheVar.k()) {
            return 0L;
        }
        dii diiVar = (dii) p;
        dha dhaVar = null;
        din dinVar = diiVar.d ? diiVar.c : null;
        int u = did.u(f, yogaMeasureMode);
        int u2 = did.u(f2, yogaMeasureMode2);
        diiVar.e = u;
        diiVar.f = u2;
        dhe dheVar2 = diiVar.a;
        if (dha.A(dheVar2, W) || p.aM()) {
            dha V = p.V();
            if (W != V) {
                dhaVar = V;
            } else if (p.al() != null) {
                dhaVar = p.al().W();
            }
            if (dhaVar != null) {
                dheVar2 = dhaVar.q;
            }
            djr e = djt.e(dheVar2, p, u, u2);
            int H = e.H();
            C = e.C();
            i = H;
        } else if (dinVar != null && dinVar.e() == u && dinVar.d() == u2) {
            W.an();
            i = (int) dinVar.b();
            C = (int) dinVar.a();
        } else {
            dlo dloVar = new dlo(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            W.R(dheVar, p, u, u2, dloVar);
            int i3 = dloVar.a;
            if (i3 < 0 || (i2 = dloVar.b) < 0) {
                String valueOf = String.valueOf(W);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                sb.append("MeasureOutput not set, ComponentLifecycle is: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
            din dinVar2 = diiVar.c;
            if (dinVar2 != null) {
                dinVar2.ko(u);
                diiVar.c.kl(u2);
                diiVar.c.kn(i3);
                diiVar.c.km(i2);
            }
            C = i2;
            i = i3;
        }
        diiVar.g = i;
        diiVar.h = C;
        return Float.floatToRawIntBits(r10) | (Float.floatToRawIntBits(r9) << 32);
    }
}
