package defpackage;

import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class szz {
    private final syd a;

    public szz(syd sydVar) {
        this.a = sydVar;
    }

    public static int a(aoaj aoajVar, axoh axohVar) {
        int aN;
        aoaj aoajVar2;
        int aO;
        int[] iArr;
        int b;
        aoaj aoajVar3 = aoajVar;
        axoh axohVar2 = axohVar;
        int i = 0;
        if (axohVar2 == null || axohVar.aW() == null) {
            return 0;
        }
        int b2 = aoajVar3.b(axohVar.aW());
        float aI = axohVar.aI();
        int n = axohVar.n();
        int aQ = axohVar.aQ();
        if (axohVar.aK() == 0) {
            aN = 0;
        } else {
            int[] iArr2 = new int[axohVar.aK()];
            for (int i2 = 0; i2 < axohVar.aK(); i2++) {
                axoo aT = axohVar2.aT(i2);
                iArr2[i2] = axoo.aI(aoajVar, aT.q(), aT.p(), e(aoajVar3, aT.aK()), e(aoajVar3, aT.aJ()));
            }
            aN = axoh.aN(aoajVar3, iArr2);
        }
        if (axohVar.aR() == 0) {
            aoajVar2 = aoajVar3;
            aO = 0;
        } else {
            int[] iArr3 = new int[axohVar.aR()];
            int i3 = 0;
            while (i3 < axohVar.aR()) {
                axpd aU = axohVar2.aU(i3);
                long q = aU.q();
                long p = aU.p();
                int b3 = aU.aU() == null ? 0 : aoajVar3.b(aU.aU());
                float aJ = aU.aJ();
                long aR = aU.aR();
                int aO2 = aU.aO();
                int p2 = p(aoajVar3, aU.aW());
                float aK = aU.aK();
                long aS = aU.aS();
                int aP = aU.aP();
                boolean aV = aU.aV();
                int aN2 = aU.aN();
                int aL = aU.aL();
                if (aU.aT() == null) {
                    iArr = iArr3;
                    b = 0;
                } else {
                    iArr = iArr3;
                    b = aoajVar3.b(aU.aT());
                }
                int[] iArr4 = iArr;
                int i4 = i3;
                iArr4[i4] = axpd.aM(aoajVar, q, p, b3, aJ, aR, aO2, p2, aK, aS, aP, aV, aN2, aL, b, aU.aQ(), aU.aI());
                i3 = i4 + 1;
                aoajVar3 = aoajVar;
                axohVar2 = axohVar;
                iArr3 = iArr4;
            }
            aoajVar2 = aoajVar3;
            aO = axoh.aO(aoajVar2, iArr3);
        }
        if (axohVar.aJ() != 0) {
            int[] iArr5 = new int[axohVar.aJ()];
            for (int i5 = 0; i5 < axohVar.aJ(); i5++) {
                aoam aY = axohVar.aY(i5);
                iArr5[i5] = aoam.o(aoajVar, aY.q(), aY.p(), d(aoajVar2, aY.ar()), aY.n());
            }
            i = axoh.aL(aoajVar2, iArr5);
        }
        return axoh.aM(aoajVar, b2, aI, n, aQ, aN, aO, i, axohVar.aX(), axohVar.aS(), o(aoajVar, axohVar));
    }

    public static axoh b(axoh axohVar) {
        int aN;
        float f;
        int i;
        aoaj aoajVar;
        int aO;
        int[] iArr;
        int b;
        int aL;
        int[] iArr2 = null;
        if (axohVar == null) {
            return null;
        }
        String aW = axohVar.aW();
        if (aW == null) {
            return axohVar;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        if (axohVar.aJ() != 0) {
            ArrayList arrayList2 = new ArrayList();
            PriorityQueue priorityQueue = new PriorityQueue(1, bea.q);
            for (int i2 = 0; i2 < axohVar.aJ(); i2++) {
                aoam aY = axohVar.aY(i2);
                if (aY.p() == 0) {
                    priorityQueue.add(aY);
                } else {
                    arrayList2.add(aY);
                }
            }
            if (priorityQueue.isEmpty()) {
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    aoam aoamVar = (aoam) arrayList2.get(i3);
                    arrayList.add(new tan(aoamVar, aoamVar.q(), aoamVar.p()));
                }
            } else {
                int size2 = priorityQueue.size();
                int[] iArr3 = new int[size2];
                int i4 = 0;
                while (!priorityQueue.isEmpty()) {
                    aoam aoamVar2 = (aoam) priorityQueue.poll();
                    if (aoamVar2 != null) {
                        iArr3[i4] = (int) aoamVar2.q();
                        arrayList.add(new tan(aoamVar2, ((int) aoamVar2.q()) + i4, 1L));
                        i4++;
                    }
                }
                iArr2 = i4 < size2 ? Arrays.copyOf(iArr3, i4) : iArr3;
                int size3 = arrayList2.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    aoam aoamVar3 = (aoam) arrayList2.get(i5);
                    vtg aj = rwh.aj((int) aoamVar3.q(), (int) aoamVar3.p(), iArr2);
                    arrayList.add(new tan(aoamVar3, aj.b, aj.a));
                }
            }
        }
        if (iArr2 == null || (r4 = iArr2.length) == 0) {
            return axohVar;
        }
        aoaj aoajVar2 = new aoaj();
        StringBuilder sb = new StringBuilder(aW);
        int length = aW.length();
        while (true) {
            int length2 = length2 - 1;
            if (length2 < 0) {
                break;
            }
            int i6 = iArr2[length2];
            if (i6 >= 0 && i6 <= length) {
                sb.insert(i6, '^');
            }
        }
        int b2 = aoajVar2.b(sb.toString());
        float aI = axohVar.aI();
        int n = axohVar.n();
        int aQ = axohVar.aQ();
        if (axohVar.aK() == 0) {
            aN = 0;
        } else {
            int[] iArr4 = new int[axohVar.aK()];
            int i7 = 0;
            while (i7 < axohVar.aK()) {
                axoo aT = axohVar.aT(i7);
                int e = e(aoajVar2, aT.aK());
                int e2 = e(aoajVar2, aT.aJ());
                long q = aT.q();
                long p = aT.p();
                if (iArr2.length > 0) {
                    vtg aj2 = rwh.aj((int) aT.q(), (int) aT.p(), iArr2);
                    long j = aj2.b;
                    p = aj2.a;
                    q = j;
                }
                int i8 = i7;
                iArr4[i8] = axoo.aI(aoajVar2, q, p, e, e2);
                i7 = i8 + 1;
            }
            aN = axoh.aN(aoajVar2, iArr4);
        }
        if (axohVar.aR() == 0) {
            f = aI;
            i = aN;
            aoajVar = aoajVar2;
            aO = 0;
        } else {
            int[] iArr5 = new int[axohVar.aR()];
            int i9 = 0;
            while (i9 < axohVar.aR()) {
                axpd aU = axohVar.aU(i9);
                long q2 = aU.q();
                long p2 = aU.p();
                if (iArr2.length > 0) {
                    vtg ak = rwh.ak((int) aU.q(), (int) aU.p(), iArr2, z);
                    long j2 = ak.b;
                    long j3 = ak.a;
                    q2 = j2;
                    p2 = j3;
                }
                int b3 = aU.aU() == null ? 0 : aoajVar2.b(aU.aU());
                float aJ = aU.aJ();
                long aR = aU.aR();
                int aO2 = aU.aO();
                int p3 = p(aoajVar2, aU.aW());
                float aK = aU.aK();
                long aS = aU.aS();
                int aP = aU.aP();
                boolean aV = aU.aV();
                int aN2 = aU.aN();
                int aL2 = aU.aL();
                if (aU.aT() == null) {
                    iArr = iArr2;
                    b = 0;
                } else {
                    iArr = iArr2;
                    b = aoajVar2.b(aU.aT());
                }
                int i10 = i9;
                float f2 = aI;
                int[] iArr6 = iArr5;
                iArr6[i10] = axpd.aM(aoajVar2, q2, p2, b3, aJ, aR, aO2, p3, aK, aS, aP, aV, aN2, aL2, b, aU.aQ(), aU.aI());
                i9 = i10 + 1;
                iArr5 = iArr6;
                aoajVar2 = aoajVar2;
                iArr2 = iArr;
                aN = aN;
                aI = f2;
                z = true;
            }
            f = aI;
            i = aN;
            aoajVar = aoajVar2;
            aO = axoh.aO(aoajVar, iArr5);
        }
        int size4 = arrayList.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            if (arrayList.get(size4) == null) {
                arrayList.remove(size4);
            }
        }
        if (arrayList.isEmpty()) {
            aL = 0;
        } else {
            int[] iArr7 = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tan tanVar = (tan) arrayList.get(i11);
                int d = d(aoajVar, ((aoam) tanVar.a).ar());
                vtg vtgVar = tanVar.b;
                iArr7[i11] = aoam.o(aoajVar, vtgVar.b, vtgVar.a, d, ((aoam) tanVar.a).n());
            }
            aL = axoh.aL(aoajVar, iArr7);
        }
        aoajVar.k(axoh.aM(aoajVar, b2, f, n, aQ, i, aO, aL, axohVar.aX(), axohVar.aS(), o(aoajVar, axohVar)));
        ByteBuffer f3 = aoajVar.f();
        axoh axohVar2 = new axoh();
        f3.order(ByteOrder.LITTLE_ENDIAN);
        axohVar2.f(f3.getInt(f3.position()) + f3.position(), f3);
        return axohVar2;
    }

    public static boolean c(aoam aoamVar, aoam aoamVar2) {
        if (aoamVar == null && aoamVar2 == null) {
            return true;
        }
        if (aoamVar != null && aoamVar2 != null) {
            ByteBuffer byteBuffer = aoamVar.b;
            ByteBuffer byteBuffer2 = aoamVar2.b;
            if (byteBuffer == null && byteBuffer2 == null) {
                return true;
            }
            if (byteBuffer != null && byteBuffer2 != null) {
                if (byteBuffer.hasArray() && byteBuffer2.hasArray() && byteBuffer.arrayOffset() == byteBuffer2.arrayOffset() && byteBuffer.capacity() == byteBuffer2.capacity() && byteBuffer.position() == byteBuffer2.position() && byteBuffer.remaining() == byteBuffer2.remaining() && byteBuffer.array() == byteBuffer2.array()) {
                    return true;
                }
                return aoamVar.b.equals(aoamVar2.b);
            }
        }
        return false;
    }

    static int d(aoaj aoajVar, aoam aoamVar) {
        int i;
        if (aoamVar == null) {
            return 0;
        }
        int e = e(aoajVar, aoamVar.av());
        int p = p(aoajVar, aoamVar.ax());
        if (aoamVar.K() > 0) {
            int K = aoamVar.K();
            int[] iArr = new int[K];
            for (int i2 = 0; i2 < aoamVar.K(); i2++) {
                iArr[i2] = d(aoajVar, aoamVar.at(i2));
            }
            aoajVar.q(4, K, 4);
            while (true) {
                K--;
                if (K < 0) {
                    break;
                }
                aoajVar.i(iArr[K]);
            }
            i = aoajVar.d();
        } else {
            i = 0;
        }
        return aoam.L(aoajVar, e, p, i, aoamVar.M() != null ? aoajVar.b(aoamVar.M()) : 0);
    }

    static int e(aoaj aoajVar, aoam aoamVar) {
        int i = 0;
        if (aoamVar == null) {
            return 0;
        }
        if (aoamVar.S() > 0) {
            byte[] bArr = new byte[aoamVar.S()];
            aoamVar.V().get(bArr);
            i = aoajVar.a(bArr);
        }
        return aoam.R(aoajVar, aoamVar.T(), i, aoamVar.U());
    }

    public static IntersectionCriteria f(aoam aoamVar) {
        int b = aoamVar.b(4);
        float f = b != 0 ? aoamVar.b.getFloat(b + aoamVar.a) : 0.0f;
        int b2 = aoamVar.b(6);
        return new IntersectionCriteria(f, b2 == 0 || aoamVar.b.getInt(b2 + aoamVar.a) == 0);
    }

    public static awpf h(aoam aoamVar) {
        aone createBuilder = awpf.a.createBuilder();
        axov axovVar = new axov();
        for (int i = 0; i < aoamVar.aa(); i++) {
            aoamVar.ac(axovVar, i);
            aone createBuilder2 = awph.a.createBuilder();
            long aJ = axovVar.aJ();
            createBuilder2.copyOnWrite();
            awph awphVar = (awph) createBuilder2.instance;
            awphVar.b |= 8;
            awphVar.e = (int) aJ;
            long aI = axovVar.aI();
            createBuilder2.copyOnWrite();
            awph awphVar2 = (awph) createBuilder2.instance;
            awphVar2.b |= 16;
            awphVar2.f = (int) aI;
            if (axovVar.m() != null) {
                String m = axovVar.m();
                createBuilder2.copyOnWrite();
                awph awphVar3 = (awph) createBuilder2.instance;
                m.getClass();
                awphVar3.c = 1;
                awphVar3.d = m;
            }
            createBuilder.copyOnWrite();
            awpf awpfVar = (awpf) createBuilder.instance;
            awph awphVar4 = (awph) createBuilder2.build();
            awphVar4.getClass();
            aony aonyVar = awpfVar.c;
            if (!aonyVar.c()) {
                awpfVar.c = aonm.mutableCopy(aonyVar);
            }
            awpfVar.c.add(awphVar4);
        }
        return (awpf) createBuilder.build();
    }

    public static aoam i(aoam aoamVar, int i) {
        if (aoamVar == null) {
            return null;
        }
        aoam aoamVar2 = new aoam();
        for (int i2 = 0; i2 < aoamVar.W(); i2++) {
            aoamVar.aA(aoamVar2, i2);
            if (aoamVar2.T() == i) {
                return aoamVar2;
            }
        }
        return null;
    }

    public static String j(aoam aoamVar) {
        return String.format("(format:%d id:%d datalength:%d)", Integer.valueOf(aoamVar.U()), Integer.valueOf(aoamVar.T()), Integer.valueOf(aoamVar.S()));
    }

    public static ByteBuffer k(aoam aoamVar, int i) {
        aoam i2 = i(aoamVar, i);
        if (i2 == null) {
            return null;
        }
        return i2.V();
    }

    public static boolean l(aoam aoamVar, aoam aoamVar2, int i, szy szyVar) {
        ByteBuffer k = k(aoamVar, i);
        if (k == null) {
            return false;
        }
        szyVar.a(k, aoamVar2);
        return true;
    }

    public static boolean m(aoam aoamVar, axof axofVar) {
        if (aoamVar == null) {
            return false;
        }
        return l(aoamVar, axofVar, 168774763, swi.c);
    }

    public static boolean n(aoam aoamVar, axoy axoyVar) {
        if (aoamVar == null) {
            return false;
        }
        return l(aoamVar, axoyVar, 168772996, swi.d);
    }

    private static int o(aoaj aoajVar, axoh axohVar) {
        if (axohVar.aP() == 0) {
            return 0;
        }
        int[] iArr = new int[axohVar.aP()];
        for (int i = 0; i < axohVar.aP(); i++) {
            iArr[i] = e(aoajVar, axohVar.aZ(i).as());
        }
        int aP = axohVar.aP();
        int[] iArr2 = new int[aP];
        for (int i2 = 0; i2 < axohVar.aP(); i2++) {
            int i3 = iArr[i2];
            aoajVar.p(1);
            aoajVar.u(0, i3);
            iArr2[i2] = aoajVar.c();
        }
        aoajVar.q(4, aP, 4);
        while (true) {
            aP--;
            if (aP < 0) {
                return aoajVar.d();
            }
            aoajVar.i(iArr2[aP]);
        }
    }

    private static int p(aoaj aoajVar, aoam aoamVar) {
        if (aoamVar == null) {
            return 0;
        }
        int W = aoamVar.W();
        int[] iArr = new int[W];
        for (int i = 0; i < aoamVar.W(); i++) {
            iArr[i] = e(aoajVar, aoamVar.az(i));
        }
        aoajVar.q(4, W, 4);
        while (true) {
            W--;
            if (W < 0) {
                int d = aoajVar.d();
                aoajVar.p(1);
                aoajVar.u(0, d);
                return aoajVar.c();
            }
            aoajVar.i(iArr[W]);
        }
    }

    public final szx g(aoam aoamVar) {
        if (aoamVar == null) {
            return null;
        }
        return new szx(aoamVar, this.a);
    }
}
