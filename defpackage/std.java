package defpackage;

import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.chromium.net.CellularSignalStrengthError;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class std implements sym {
    private static final amta a;
    private final syd b;

    static {
        amta amtaVar;
        amsy amsyVar = new amsy();
        int i = 0;
        amsyVar.F(1, dnf.a, dnf.b);
        amsyVar.F(2, dnf.c, dnf.d);
        amsyVar.F(4, dnf.e);
        amsyVar.F(3, dnf.f);
        amsyVar.F(5, dnf.g);
        Set<Map.Entry> entrySet = amsyVar.a.entrySet();
        if (entrySet.isEmpty()) {
            amtaVar = amqk.a;
        } else {
            amrw amrwVar = new amrw(entrySet.size());
            for (Map.Entry entry : entrySet) {
                Object key = entry.getKey();
                amsx p = amsx.p((Collection) entry.getValue());
                if (!p.isEmpty()) {
                    amrwVar.g(key, p);
                    i += p.size();
                }
            }
            amtaVar = new amta(amrwVar.c(), i);
        }
        a = amtaVar;
    }

    public std(syd sydVar) {
        this.b = sydVar;
    }

    private static float d(aoam aoamVar, dng dngVar, float f) {
        if (aoamVar == null) {
            return f;
        }
        if (dnf.a.equals(dngVar)) {
            aoak aF = aoamVar.aF();
            return aF != null ? aF.d() : f;
        }
        if (dnf.b.equals(dngVar)) {
            aoak aF2 = aoamVar.aF();
            return aF2 != null ? aF2.e() : f;
        }
        if (dnf.c.equals(dngVar)) {
            aoak aG = aoamVar.aG();
            return aG != null ? aG.g() : f;
        }
        if (dnf.d.equals(dngVar)) {
            aoak aG2 = aoamVar.aG();
            return aG2 != null ? aG2.f() : f;
        }
        if (!aoaj.r(aoamVar, 4)) {
            return f;
        }
        int b = aoamVar.b(4);
        if (b != 0) {
            return aoamVar.b.getFloat(b + aoamVar.a);
        }
        return 0.0f;
    }

    @Override // defpackage.sym
    public final int a() {
        return 225874218;
    }

    @Override // defpackage.sym
    public final /* synthetic */ aoam b(ByteBuffer byteBuffer) {
        axpf axpfVar = new axpf();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axpfVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axpfVar;
    }

    @Override // defpackage.syn
    public final /* synthetic */ void c(dhe dheVar, sxc sxcVar, String str, Object obj, sxs sxsVar, swt swtVar) {
        int i;
        dmf d;
        std stdVar = this;
        sxc sxcVar2 = sxcVar;
        axpf axpfVar = (axpf) obj;
        dgy a2 = sxsVar.a();
        if (axpfVar.aI() == 0) {
            return;
        }
        if (str == null) {
            stdVar.b.c(23, "Key is required with valid transition, but the key is null", sxcVar2);
            return;
        }
        String concat = str.length() != 0 ? "com.youtube.transition_key.".concat(str) : new String("com.youtube.transition_key.");
        dgx C = a2.c.C();
        String str2 = a2.c.l;
        dgw c = C.c();
        c.a |= 512;
        c.h = concat;
        c.g = str2;
        int i2 = 2;
        if (a2.c.C().c().k == 0) {
            dmf dmfVar = dmh.g;
            a2.B(2);
        }
        int i3 = 1;
        a2.B(1);
        dmb e = dmh.e(concat);
        int i4 = 0;
        int i5 = 0;
        while (i5 < axpfVar.aI()) {
            aoam aoamVar = new aoam();
            int b = axpfVar.b(4);
            byte[] bArr = null;
            if (b != 0) {
                aoamVar.f(axpfVar.a(axpfVar.c(b) + (i5 * 4)), axpfVar.b);
            } else {
                aoamVar = null;
            }
            amta amtaVar = a;
            int b2 = aoamVar.b(4);
            amsx<dng> amsxVar = (amsx) amkq.Z((amsx) amtaVar.b.get(Integer.valueOf(b2 != 0 ? aoamVar.b.getInt(b2 + aoamVar.a) : 0)), amtaVar.d);
            if (!amsxVar.isEmpty()) {
                for (dng dngVar : amsxVar) {
                    e.b();
                    e.e = new clu(dngVar, bArr);
                    aoam aoamVar2 = new aoam();
                    int b3 = aoamVar.b(6);
                    if (b3 != 0) {
                        aoamVar2.f(aoamVar.a(b3 + aoamVar.a), aoamVar.b);
                    } else {
                        aoamVar2 = null;
                    }
                    int i6 = 1000;
                    if (aoamVar2 != null && aoamVar2.ao() != 0.0f) {
                        i6 = (int) (aoamVar2.ao() * 1000.0f);
                    }
                    if (aoamVar2 != null) {
                        int b4 = aoamVar2.b(6);
                        i = b4 != 0 ? aoamVar2.b.getInt(b4 + aoamVar2.a) : 0;
                    } else {
                        i = 2;
                    }
                    float ap = (aoamVar2 == null || aoamVar2.aq() <= 0) ? 0.0f : aoamVar2.ap(i4);
                    float ap2 = (aoamVar2 == null || aoamVar2.aq() <= i3) ? 0.0f : aoamVar2.ap(i3);
                    float ap3 = (aoamVar2 == null || aoamVar2.aq() <= i2) ? 0.0f : aoamVar2.ap(i2);
                    float ap4 = (aoamVar2 == null || aoamVar2.aq() <= 3) ? 0.0f : aoamVar2.ap(3);
                    if (i == 1) {
                        d = dmh.d(i6, new LinearInterpolator());
                    } else if (i == 3) {
                        d = dmh.d(i6, jg.o(0.4f, 0.0f, 1.0f, 1.0f));
                    } else if (i == 4) {
                        d = dmh.d(i6, jg.o(0.0f, 0.0f, 0.2f, 1.0f));
                    } else if (i == 5) {
                        d = dmh.d(i6, new PathInterpolator(ap, ap2));
                    } else if (i == 6) {
                        d = dmh.d(i6, jg.o(ap, ap2, ap3, ap4));
                    } else {
                        d = dmh.d(i6, jg.o(0.4f, 0.0f, 0.2f, 1.0f));
                    }
                    e.b = d;
                    int b5 = aoamVar.b(8);
                    if (b5 != 0 && aoamVar.b.get(b5 + aoamVar.a) != 0) {
                        aoam aoamVar3 = new aoam();
                        int b6 = aoamVar.b(10);
                        if (b6 != 0) {
                            aoamVar3.f(aoamVar.a(b6 + aoamVar.a), aoamVar.b);
                        } else {
                            aoamVar3 = null;
                        }
                        int b7 = aoamVar.b(12);
                        szq szqVar = new szq(d(aoamVar3, dngVar, b7 != 0 ? aoamVar.b.getFloat(b7 + aoamVar.a) : 0.0f));
                        if (e.e == null) {
                            throw new RuntimeException("Must specify a single property using #animate() before specifying an appearFrom value!");
                        }
                        e.c = szqVar;
                    }
                    int b8 = aoamVar.b(14);
                    if (b8 != 0 && aoamVar.b.get(b8 + aoamVar.a) != 0) {
                        aoam aoamVar4 = new aoam();
                        int b9 = aoamVar.b(16);
                        if (b9 != 0) {
                            aoamVar4.f(aoamVar.a(b9 + aoamVar.a), aoamVar.b);
                        } else {
                            aoamVar4 = null;
                        }
                        int b10 = aoamVar.b(18);
                        szq szqVar2 = new szq(d(aoamVar4, dngVar, b10 != 0 ? aoamVar.b.getFloat(b10 + aoamVar.a) : 0.0f));
                        if (e.e == null) {
                            throw new RuntimeException("Must specify a single property using #animate() before specifying an disappearTo value!");
                        }
                        e.d = szqVar2;
                    }
                    i3 = 1;
                    i2 = 2;
                    i4 = 0;
                    bArr = null;
                }
            } else {
                stdVar.b.c(22, "Unknown TransitionValue specified", sxcVar2);
            }
            i5++;
            stdVar = this;
            sxcVar2 = sxcVar;
            i3 = 1;
            i2 = 2;
            i4 = 0;
        }
        e.b();
        dgw c2 = a2.c.C().c();
        c2.a |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        c2.i = e;
    }

    @Override // defpackage.syn
    public final /* synthetic */ void e(sxs sxsVar) {
    }
}
