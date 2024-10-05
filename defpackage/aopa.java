package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.PrivateKeyType;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aopa implements aopq {
    private static final int[] a = new int[0];
    private static final Unsafe b = aoqk.k();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final aooy g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final aoom o;
    private final amkq p;

    private aopa(int[] iArr, Object[] objArr, int i, int i2, aooy aooyVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, aoom aoomVar, amkq amkqVar, aocz aoczVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = aooyVar instanceof aonm;
        this.j = z;
        boolean z3 = false;
        if (aoczVar != null && (aooyVar instanceof aonh)) {
            z3 = true;
        }
        this.h = z3;
        this.k = z2;
        this.l = iArr2;
        this.m = i3;
        this.n = i4;
        this.o = aoomVar;
        this.p = amkqVar;
        this.g = aooyVar;
    }

    private final int A(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int s = s(i4);
            if (i == s) {
                return i4;
            }
            if (i < s) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int B(int i) {
        return (i >>> 20) & PrivateKeyType.INVALID;
    }

    private final int C(int i) {
        return this.c[i + 1];
    }

    private static long D(int i) {
        return i & 1048575;
    }

    private static long E(Object obj, long j) {
        return ((Long) aoqk.i(obj, j)).longValue();
    }

    private final aons F(int i) {
        int i2 = i / 3;
        return (aons) this.d[i2 + i2 + 1];
    }

    private final aopq G(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        aopq aopqVar = (aopq) this.d[i3];
        if (aopqVar != null) {
            return aopqVar;
        }
        aopq a2 = aopi.a.a((Class) this.d[i3 + 1]);
        this.d[i3] = a2;
        return a2;
    }

    private final Object H(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private static Field I(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private static List J(Object obj, long j) {
        return (List) aoqk.i(obj, j);
    }

    private final void K(Object obj, Object obj2, int i) {
        long D = D(C(i));
        if (R(obj2, i)) {
            Object i2 = aoqk.i(obj, D);
            Object i3 = aoqk.i(obj2, D);
            if (i2 != null && i3 != null) {
                aoqk.v(obj, D, aonz.e(i2, i3));
                N(obj, i);
            } else if (i3 != null) {
                aoqk.v(obj, D, i3);
                N(obj, i);
            }
        }
    }

    private final void L(Object obj, Object obj2, int i) {
        int C = C(i);
        int s = s(i);
        long D = D(C);
        if (U(obj2, s, i)) {
            Object i2 = U(obj, s, i) ? aoqk.i(obj, D) : null;
            Object i3 = aoqk.i(obj2, D);
            if (i2 != null && i3 != null) {
                aoqk.v(obj, D, aonz.e(i2, i3));
                O(obj, s, i);
            } else if (i3 != null) {
                aoqk.v(obj, D, i3);
                O(obj, s, i);
            }
        }
    }

    private final void M(Object obj, int i, aopl aoplVar) {
        if (Q(i)) {
            aoqk.v(obj, D(i), aoplVar.x());
        } else if (this.i) {
            aoqk.v(obj, D(i), aoplVar.v());
        } else {
            aoqk.v(obj, D(i), aoplVar.q());
        }
    }

    private final void N(Object obj, int i) {
        int z = z(i);
        long j = 1048575 & z;
        if (j == 1048575) {
            return;
        }
        aoqk.t(obj, j, (1 << (z >>> 20)) | aoqk.d(obj, j));
    }

    private final void O(Object obj, int i, int i2) {
        aoqk.t(obj, z(i2) & 1048575, i);
    }

    private final boolean P(Object obj, Object obj2, int i) {
        return R(obj, i) == R(obj2, i);
    }

    private static boolean Q(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean R(Object obj, int i) {
        int z = z(i);
        long j = 1048575 & z;
        if (j != 1048575) {
            return (aoqk.d(obj, j) & (1 << (z >>> 20))) != 0;
        }
        int C = C(i);
        long D = D(C);
        switch (B(C)) {
            case 0:
                return aoqk.b(obj, D) != 0.0d;
            case 1:
                return aoqk.c(obj, D) != 0.0f;
            case 2:
                return aoqk.f(obj, D) != 0;
            case 3:
                return aoqk.f(obj, D) != 0;
            case 4:
                return aoqk.d(obj, D) != 0;
            case 5:
                return aoqk.f(obj, D) != 0;
            case 6:
                return aoqk.d(obj, D) != 0;
            case 7:
                return aoqk.x(obj, D);
            case 8:
                Object i2 = aoqk.i(obj, D);
                if (i2 instanceof String) {
                    return !((String) i2).isEmpty();
                }
                if (i2 instanceof aomf) {
                    return !aomf.b.equals(i2);
                }
                throw new IllegalArgumentException();
            case 9:
                return aoqk.i(obj, D) != null;
            case 10:
                return !aomf.b.equals(aoqk.i(obj, D));
            case 11:
                return aoqk.d(obj, D) != 0;
            case 12:
                return aoqk.d(obj, D) != 0;
            case 13:
                return aoqk.d(obj, D) != 0;
            case 14:
                return aoqk.f(obj, D) != 0;
            case 15:
                return aoqk.d(obj, D) != 0;
            case 16:
                return aoqk.f(obj, D) != 0;
            case 17:
                return aoqk.i(obj, D) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean S(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return R(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean T(Object obj, int i, aopq aopqVar) {
        return aopqVar.k(aoqk.i(obj, D(i)));
    }

    private final boolean U(Object obj, int i, int i2) {
        return aoqk.d(obj, (long) (z(i2) & 1048575)) == i;
    }

    private static boolean V(Object obj, long j) {
        return ((Boolean) aoqk.i(obj, j)).booleanValue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    private static final int W(byte[] bArr, int i, int i2, aoqn aoqnVar, Class cls, aolt aoltVar) {
        aoqn aoqnVar2 = aoqn.DOUBLE;
        switch (aoqnVar) {
            case DOUBLE:
                aoltVar.c = Double.valueOf(aocz.t(bArr, i));
                return i + 8;
            case FLOAT:
                aoltVar.c = Float.valueOf(aocz.u(bArr, i));
                return i + 4;
            case INT64:
            case UINT64:
                int P = aocz.P(bArr, i, aoltVar);
                aoltVar.c = Long.valueOf(aoltVar.b);
                return P;
            case INT32:
            case UINT32:
            case ENUM:
                int M = aocz.M(bArr, i, aoltVar);
                aoltVar.c = Integer.valueOf(aoltVar.a);
                return M;
            case FIXED64:
            case SFIXED64:
                aoltVar.c = Long.valueOf(aocz.R(bArr, i));
                return i + 8;
            case FIXED32:
            case SFIXED32:
                aoltVar.c = Integer.valueOf(aocz.w(bArr, i));
                return i + 4;
            case BOOL:
                int P2 = aocz.P(bArr, i, aoltVar);
                aoltVar.c = Boolean.valueOf(aoltVar.b != 0);
                return P2;
            case STRING:
                return aocz.K(bArr, i, aoltVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return aocz.y(aopi.a.a(cls), bArr, i, i2, aoltVar);
            case BYTES:
                return aocz.v(bArr, i, aoltVar);
            case SINT32:
                int M2 = aocz.M(bArr, i, aoltVar);
                aoltVar.c = Integer.valueOf(aomk.J(aoltVar.a));
                return M2;
            case SINT64:
                int P3 = aocz.P(bArr, i, aoltVar);
                aoltVar.c = Long.valueOf(aomk.L(aoltVar.b));
                return P3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0298, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x029a, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r1 = r19;
        r2 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ae, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02e1, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0304, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0095. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void X(java.lang.Object r31, byte[] r32, int r33, int r34, defpackage.aolt r35) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aopa.X(java.lang.Object, byte[], int, int, aolt):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Y(java.lang.Object r18, defpackage.aomq r19) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aopa.Y(java.lang.Object, aomq):void");
    }

    private final void Z(aomq aomqVar, int i, Object obj, int i2) {
        if (obj != null) {
            aoor h = aocz.h(H(i2));
            aomp aompVar = aomqVar.a;
            Iterator it = ((aoot) obj).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                aomqVar.a.B(i, 2);
                aomqVar.a.D(aoos.a(h, entry.getKey(), entry.getValue()));
                aoos.c(aomqVar.a, h, entry.getKey(), entry.getValue());
            }
        }
    }

    private static final void aa(int i, Object obj, aomq aomqVar) {
        if (obj instanceof String) {
            aomqVar.q(i, (String) obj);
        } else {
            aomqVar.b(i, (aomf) obj);
        }
    }

    private final Object ab(Object obj, int i, Object obj2) {
        aons F;
        int s = s(i);
        Object i2 = aoqk.i(obj, D(C(i)));
        if (i2 == null || (F = F(i)) == null) {
            return obj2;
        }
        aoor h = aocz.h(H(i));
        Iterator it = ((aoot) i2).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!F.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = aoqc.c();
                }
                int a2 = aoos.a(h, entry.getKey(), entry.getValue());
                aomf aomfVar = aomf.b;
                byte[] bArr = new byte[a2];
                aomp ak = aomp.ak(bArr);
                try {
                    aoos.c(ak, h, entry.getKey(), entry.getValue());
                    amkq.cA(obj2, s, aocz.s(ak, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static final int ac(Object obj) {
        return amkq.cC(obj).a();
    }

    private static final void ad(Object obj, aomq aomqVar) {
        amkq.cC(obj).h(aomqVar);
    }

    static aoqc d(Object obj) {
        aonm aonmVar = (aonm) obj;
        aoqc aoqcVar = aonmVar.unknownFields;
        if (aoqcVar != aoqc.a) {
            return aoqcVar;
        }
        aoqc c = aoqc.c();
        aonmVar.unknownFields = c;
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static defpackage.aopa m(defpackage.aopk r35, defpackage.aoom r36, defpackage.amkq r37, defpackage.aocz r38, defpackage.aocz r39) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aopa.m(aopk, aoom, amkq, aocz, aocz):aopa");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aopa n(defpackage.aoov r28, defpackage.amkq r29, defpackage.aoom r30, defpackage.amkq r31, defpackage.aocz r32, defpackage.aocz r33) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aopa.n(aoov, amkq, aoom, amkq, aocz, aocz):aopa");
    }

    private static double o(Object obj, long j) {
        return ((Double) aoqk.i(obj, j)).doubleValue();
    }

    private static float p(Object obj, long j) {
        return ((Float) aoqk.i(obj, j)).floatValue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0058. Please report as an issue. */
    private final int q(Object obj) {
        int i;
        int i2;
        int az;
        int e;
        int ac;
        int ae;
        Unsafe unsafe = b;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i4 < this.c.length) {
            int C = C(i4);
            int s = s(i4);
            int B = B(C);
            if (B <= 17) {
                i = this.c[i4 + 2];
                int i8 = i & i3;
                i2 = 1 << (i >>> 20);
                if (i8 != i6) {
                    i7 = unsafe.getInt(obj, i8);
                    i6 = i8;
                }
            } else {
                i = (!this.k || B < aonb.DOUBLE_LIST_PACKED.Z || B > aonb.SINT64_LIST_PACKED.Z) ? 0 : this.c[i4 + 2] & i3;
                i2 = 0;
            }
            long D = D(C);
            switch (B) {
                case 0:
                    if ((i7 & i2) != 0) {
                        az = aomp.az(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i7 & i2) != 0) {
                        az = aomp.aC(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i7 & i2) != 0) {
                        az = aomp.P(s, unsafe.getLong(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i7 & i2) != 0) {
                        az = aomp.af(s, unsafe.getLong(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i7 & i2) != 0) {
                        az = aomp.N(s, unsafe.getInt(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i7 & i2) != 0) {
                        az = aomp.aB(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i7 & i2) != 0) {
                        az = aomp.aA(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i7 & i2) != 0) {
                        az = aomp.ay(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(obj, D);
                        if (object instanceof aomf) {
                            az = aomp.I(s, (aomf) object);
                        } else {
                            az = aomp.aa(s, (String) object);
                        }
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i7 & i2) != 0) {
                        az = aopr.i(s, unsafe.getObject(obj, D), G(i4));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i7 & i2) != 0) {
                        az = aomp.I(s, (aomf) unsafe.getObject(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i7 & i2) != 0) {
                        az = aomp.ad(s, unsafe.getInt(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i7 & i2) != 0) {
                        az = aomp.K(s, unsafe.getInt(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i7 & i2) != 0) {
                        az = aomp.aD(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i7 & i2) != 0) {
                        az = aomp.aE(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i7 & i2) != 0) {
                        az = aomp.W(s, unsafe.getInt(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i7 & i2) != 0) {
                        az = aomp.Y(s, unsafe.getLong(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i7 & i2) != 0) {
                        az = aomp.L(s, (aooy) unsafe.getObject(obj, D), G(i4));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    az = aopr.u(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 19:
                    az = aopr.t(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 20:
                    az = aopr.w(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 21:
                    az = aopr.A(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 22:
                    az = aopr.v(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 23:
                    az = aopr.u(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 24:
                    az = aopr.t(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 25:
                    az = aopr.r(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 26:
                    az = aopr.m(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 27:
                    az = aopr.j(s, (List) unsafe.getObject(obj, D), G(i4));
                    i5 += az;
                    break;
                case 28:
                    az = aopr.b(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 29:
                    az = aopr.z(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 30:
                    az = aopr.s(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 31:
                    az = aopr.t(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 32:
                    az = aopr.u(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 33:
                    az = aopr.x(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 34:
                    az = aopr.y(s, (List) unsafe.getObject(obj, D));
                    i5 += az;
                    break;
                case 35:
                    e = aopr.e((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 36:
                    e = aopr.d((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 37:
                    e = aopr.h((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 38:
                    e = aopr.o((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 39:
                    e = aopr.g((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 40:
                    e = aopr.e((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 41:
                    e = aopr.d((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 42:
                    e = aopr.a((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 43:
                    e = aopr.n((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 44:
                    e = aopr.c((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 45:
                    e = aopr.d((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 46:
                    e = aopr.e((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 47:
                    e = aopr.k((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 48:
                    e = aopr.l((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        i5 += ac + ae + e;
                        break;
                    }
                case 49:
                    az = aopr.f(s, (List) unsafe.getObject(obj, D), G(i4));
                    i5 += az;
                    break;
                case 50:
                    az = aocz.i(s, unsafe.getObject(obj, D), H(i4));
                    i5 += az;
                    break;
                case 51:
                    if (U(obj, s, i4)) {
                        az = aomp.az(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (U(obj, s, i4)) {
                        az = aomp.aC(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (U(obj, s, i4)) {
                        az = aomp.P(s, E(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (U(obj, s, i4)) {
                        az = aomp.af(s, E(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (U(obj, s, i4)) {
                        az = aomp.N(s, t(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (U(obj, s, i4)) {
                        az = aomp.aB(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (U(obj, s, i4)) {
                        az = aomp.aA(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (U(obj, s, i4)) {
                        az = aomp.ay(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (U(obj, s, i4)) {
                        Object object2 = unsafe.getObject(obj, D);
                        if (object2 instanceof aomf) {
                            az = aomp.I(s, (aomf) object2);
                        } else {
                            az = aomp.aa(s, (String) object2);
                        }
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (U(obj, s, i4)) {
                        az = aopr.i(s, unsafe.getObject(obj, D), G(i4));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (U(obj, s, i4)) {
                        az = aomp.I(s, (aomf) unsafe.getObject(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (U(obj, s, i4)) {
                        az = aomp.ad(s, t(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (U(obj, s, i4)) {
                        az = aomp.K(s, t(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (U(obj, s, i4)) {
                        az = aomp.aD(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (U(obj, s, i4)) {
                        az = aomp.aE(s);
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (U(obj, s, i4)) {
                        az = aomp.W(s, t(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (U(obj, s, i4)) {
                        az = aomp.Y(s, E(obj, D));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (U(obj, s, i4)) {
                        az = aomp.L(s, (aooy) unsafe.getObject(obj, D), G(i4));
                        i5 += az;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            i3 = 1048575;
        }
        int ac2 = i5 + ac(obj);
        if (!this.h) {
            return ac2;
        }
        aomz n = aocz.n(obj);
        int i9 = 0;
        for (int i10 = 0; i10 < n.b.a(); i10++) {
            Map.Entry f = n.b.f(i10);
            i9 += aomz.k((aonj) f.getKey(), f.getValue());
        }
        for (Map.Entry entry : n.b.c()) {
            i9 += aomz.k((aonj) entry.getKey(), entry.getValue());
        }
        return ac2 + i9;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0032. Please report as an issue. */
    private final int r(Object obj) {
        int az;
        int e;
        int ac;
        int ae;
        Unsafe unsafe = b;
        int i = 0;
        for (int i2 = 0; i2 < this.c.length; i2 += 3) {
            int C = C(i2);
            int B = B(C);
            int s = s(i2);
            long D = D(C);
            int i3 = (B < aonb.DOUBLE_LIST_PACKED.Z || B > aonb.SINT64_LIST_PACKED.Z) ? 0 : this.c[i2 + 2] & 1048575;
            switch (B) {
                case 0:
                    if (R(obj, i2)) {
                        az = aomp.az(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (R(obj, i2)) {
                        az = aomp.aC(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (R(obj, i2)) {
                        az = aomp.P(s, aoqk.f(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (R(obj, i2)) {
                        az = aomp.af(s, aoqk.f(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (R(obj, i2)) {
                        az = aomp.N(s, aoqk.d(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (R(obj, i2)) {
                        az = aomp.aB(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (R(obj, i2)) {
                        az = aomp.aA(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (R(obj, i2)) {
                        az = aomp.ay(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (R(obj, i2)) {
                        Object i4 = aoqk.i(obj, D);
                        if (i4 instanceof aomf) {
                            az = aomp.I(s, (aomf) i4);
                        } else {
                            az = aomp.aa(s, (String) i4);
                        }
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (R(obj, i2)) {
                        az = aopr.i(s, aoqk.i(obj, D), G(i2));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (R(obj, i2)) {
                        az = aomp.I(s, (aomf) aoqk.i(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (R(obj, i2)) {
                        az = aomp.ad(s, aoqk.d(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (R(obj, i2)) {
                        az = aomp.K(s, aoqk.d(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (R(obj, i2)) {
                        az = aomp.aD(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (R(obj, i2)) {
                        az = aomp.aE(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (R(obj, i2)) {
                        az = aomp.W(s, aoqk.d(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (R(obj, i2)) {
                        az = aomp.Y(s, aoqk.f(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (R(obj, i2)) {
                        az = aomp.L(s, (aooy) aoqk.i(obj, D), G(i2));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    az = aopr.u(s, J(obj, D));
                    i += az;
                    break;
                case 19:
                    az = aopr.t(s, J(obj, D));
                    i += az;
                    break;
                case 20:
                    az = aopr.w(s, J(obj, D));
                    i += az;
                    break;
                case 21:
                    az = aopr.A(s, J(obj, D));
                    i += az;
                    break;
                case 22:
                    az = aopr.v(s, J(obj, D));
                    i += az;
                    break;
                case 23:
                    az = aopr.u(s, J(obj, D));
                    i += az;
                    break;
                case 24:
                    az = aopr.t(s, J(obj, D));
                    i += az;
                    break;
                case 25:
                    az = aopr.r(s, J(obj, D));
                    i += az;
                    break;
                case 26:
                    az = aopr.m(s, J(obj, D));
                    i += az;
                    break;
                case 27:
                    az = aopr.j(s, J(obj, D), G(i2));
                    i += az;
                    break;
                case 28:
                    az = aopr.b(s, J(obj, D));
                    i += az;
                    break;
                case 29:
                    az = aopr.z(s, J(obj, D));
                    i += az;
                    break;
                case 30:
                    az = aopr.s(s, J(obj, D));
                    i += az;
                    break;
                case 31:
                    az = aopr.t(s, J(obj, D));
                    i += az;
                    break;
                case 32:
                    az = aopr.u(s, J(obj, D));
                    i += az;
                    break;
                case 33:
                    az = aopr.x(s, J(obj, D));
                    i += az;
                    break;
                case 34:
                    az = aopr.y(s, J(obj, D));
                    i += az;
                    break;
                case 35:
                    e = aopr.e((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 36:
                    e = aopr.d((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 37:
                    e = aopr.h((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 38:
                    e = aopr.o((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 39:
                    e = aopr.g((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 40:
                    e = aopr.e((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 41:
                    e = aopr.d((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 42:
                    e = aopr.a((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 43:
                    e = aopr.n((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 44:
                    e = aopr.c((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 45:
                    e = aopr.d((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 46:
                    e = aopr.e((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 47:
                    e = aopr.k((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 48:
                    e = aopr.l((List) unsafe.getObject(obj, D));
                    if (e <= 0) {
                        break;
                    } else {
                        if (this.k) {
                            unsafe.putInt(obj, i3, e);
                        }
                        ac = aomp.ac(s);
                        ae = aomp.ae(e);
                        az = ac + ae + e;
                        i += az;
                        break;
                    }
                case 49:
                    az = aopr.f(s, J(obj, D), G(i2));
                    i += az;
                    break;
                case 50:
                    az = aocz.i(s, aoqk.i(obj, D), H(i2));
                    i += az;
                    break;
                case 51:
                    if (U(obj, s, i2)) {
                        az = aomp.az(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (U(obj, s, i2)) {
                        az = aomp.aC(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (U(obj, s, i2)) {
                        az = aomp.P(s, E(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (U(obj, s, i2)) {
                        az = aomp.af(s, E(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (U(obj, s, i2)) {
                        az = aomp.N(s, t(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (U(obj, s, i2)) {
                        az = aomp.aB(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (U(obj, s, i2)) {
                        az = aomp.aA(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (U(obj, s, i2)) {
                        az = aomp.ay(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (U(obj, s, i2)) {
                        Object i5 = aoqk.i(obj, D);
                        if (i5 instanceof aomf) {
                            az = aomp.I(s, (aomf) i5);
                        } else {
                            az = aomp.aa(s, (String) i5);
                        }
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (U(obj, s, i2)) {
                        az = aopr.i(s, aoqk.i(obj, D), G(i2));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (U(obj, s, i2)) {
                        az = aomp.I(s, (aomf) aoqk.i(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (U(obj, s, i2)) {
                        az = aomp.ad(s, t(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (U(obj, s, i2)) {
                        az = aomp.K(s, t(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (U(obj, s, i2)) {
                        az = aomp.aD(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (U(obj, s, i2)) {
                        az = aomp.aE(s);
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (U(obj, s, i2)) {
                        az = aomp.W(s, t(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (U(obj, s, i2)) {
                        az = aomp.Y(s, E(obj, D));
                        i += az;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (U(obj, s, i2)) {
                        az = aomp.L(s, (aooy) aoqk.i(obj, D), G(i2));
                        i += az;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i + ac(obj);
    }

    private final int s(int i) {
        return this.c[i];
    }

    private static int t(Object obj, long j) {
        return ((Integer) aoqk.i(obj, j)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    private final int u(Object obj, byte[] bArr, int i, int i2, int i3, long j, aolt aoltVar) {
        Unsafe unsafe = b;
        Object H = H(i3);
        Object object = unsafe.getObject(obj, j);
        if (aocz.j(object)) {
            Object l = aocz.l();
            aocz.k(l, object);
            unsafe.putObject(obj, j, l);
            object = l;
        }
        aoor h = aocz.h(H);
        aoot aootVar = (aoot) object;
        int M = aocz.M(bArr, i, aoltVar);
        int i4 = aoltVar.a;
        if (i4 < 0 || i4 > i2 - M) {
            throw aoob.j();
        }
        int i5 = M + i4;
        Object obj2 = h.b;
        Object obj3 = h.d;
        while (M < i5) {
            int i6 = M + 1;
            byte b2 = bArr[M];
            if (b2 < 0) {
                i6 = aocz.N(b2, bArr, i6, aoltVar);
                b2 = aoltVar.a;
            }
            int i7 = b2 & 7;
            int i8 = b2 >>> 3;
            if (i8 != 1) {
                if (i8 == 2) {
                    aoqn aoqnVar = h.c;
                    if (i7 == aoqnVar.t) {
                        M = W(bArr, i6, i2, aoqnVar, h.d.getClass(), aoltVar);
                        obj3 = aoltVar.c;
                    }
                }
                M = aocz.Q(b2, bArr, i6, i2, aoltVar);
            } else {
                aoqn aoqnVar2 = h.a;
                if (i7 == aoqnVar2.t) {
                    M = W(bArr, i6, i2, aoqnVar2, null, aoltVar);
                    obj2 = aoltVar.c;
                } else {
                    M = aocz.Q(b2, bArr, i6, i2, aoltVar);
                }
            }
        }
        if (M != i5) {
            throw aoob.g();
        }
        aootVar.put(obj2, obj3);
        return i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    private final int v(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, aolt aoltVar) {
        Unsafe unsafe = b;
        long j2 = this.c[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(aocz.t(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(aocz.u(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    int P = aocz.P(bArr, i, aoltVar);
                    unsafe.putObject(obj, j, Long.valueOf(aoltVar.b));
                    unsafe.putInt(obj, j2, i4);
                    return P;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    int M = aocz.M(bArr, i, aoltVar);
                    unsafe.putObject(obj, j, Integer.valueOf(aoltVar.a));
                    unsafe.putInt(obj, j2, i4);
                    return M;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(aocz.R(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(aocz.w(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    int P2 = aocz.P(bArr, i, aoltVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(aoltVar.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return P2;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int M2 = aocz.M(bArr, i, aoltVar);
                    int i9 = aoltVar.a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) == 0 || aoqm.h(bArr, M2, M2 + i9)) {
                        unsafe.putObject(obj, j, new String(bArr, M2, i9, aonz.a));
                        M2 += i9;
                    } else {
                        throw aoob.d();
                    }
                    unsafe.putInt(obj, j2, i4);
                    return M2;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int y = aocz.y(G(i8), bArr, i, i2, aoltVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, aoltVar.c);
                    } else {
                        unsafe.putObject(obj, j, aonz.e(object, aoltVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return y;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    int v = aocz.v(bArr, i, aoltVar);
                    unsafe.putObject(obj, j, aoltVar.c);
                    unsafe.putInt(obj, j2, i4);
                    return v;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int M3 = aocz.M(bArr, i, aoltVar);
                    int i10 = aoltVar.a;
                    aons F = F(i8);
                    if (F == null || F.isInRange(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        d(obj).f(i3, Long.valueOf(i10));
                    }
                    return M3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    int M4 = aocz.M(bArr, i, aoltVar);
                    unsafe.putObject(obj, j, Integer.valueOf(aomk.J(aoltVar.a)));
                    unsafe.putInt(obj, j2, i4);
                    return M4;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    int P3 = aocz.P(bArr, i, aoltVar);
                    unsafe.putObject(obj, j, Long.valueOf(aomk.L(aoltVar.b)));
                    unsafe.putInt(obj, j2, i4);
                    return P3;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    int x = aocz.x(G(i8), bArr, i, i2, (i3 & (-8)) | 4, aoltVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, aoltVar.c);
                    } else {
                        unsafe.putObject(obj, j, aonz.e(object2, aoltVar.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return x;
                }
                return i;
            default:
                return i;
        }
    }

    private final int w(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, aolt aoltVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        int O;
        int i12 = i;
        Unsafe unsafe = b;
        aony aonyVar = (aony) unsafe.getObject(obj, j2);
        if (!aonyVar.c()) {
            int size = aonyVar.size();
            aonyVar = aonyVar.e(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, aonyVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return aocz.B(bArr, i12, aonyVar, aoltVar);
                }
                if (i5 == 1) {
                    aomr aomrVar = (aomr) aonyVar;
                    aomrVar.f(aocz.t(bArr, i));
                    while (true) {
                        i8 = i12 + 8;
                        if (i8 < i2) {
                            i12 = aocz.M(bArr, i8, aoltVar);
                            if (i3 == aoltVar.a) {
                                aomrVar.f(aocz.t(bArr, i12));
                            }
                        }
                    }
                    return i8;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return aocz.E(bArr, i12, aonyVar, aoltVar);
                }
                if (i5 == 5) {
                    aonc aoncVar = (aonc) aonyVar;
                    aoncVar.h(aocz.u(bArr, i));
                    while (true) {
                        i9 = i12 + 4;
                        if (i9 < i2) {
                            i12 = aocz.M(bArr, i9, aoltVar);
                            if (i3 == aoltVar.a) {
                                aoncVar.h(aocz.u(bArr, i12));
                            }
                        }
                    }
                    return i9;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return aocz.I(bArr, i12, aonyVar, aoltVar);
                }
                if (i5 == 0) {
                    aoon aoonVar = (aoon) aonyVar;
                    int P = aocz.P(bArr, i12, aoltVar);
                    aoonVar.f(aoltVar.b);
                    while (P < i2) {
                        int M = aocz.M(bArr, P, aoltVar);
                        if (i3 != aoltVar.a) {
                            return P;
                        }
                        P = aocz.P(bArr, M, aoltVar);
                        aoonVar.f(aoltVar.b);
                    }
                    return P;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return aocz.H(bArr, i12, aonyVar, aoltVar);
                }
                if (i5 == 0) {
                    return aocz.O(i3, bArr, i, i2, aonyVar, aoltVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return aocz.D(bArr, i12, aonyVar, aoltVar);
                }
                if (i5 == 1) {
                    aoon aoonVar2 = (aoon) aonyVar;
                    aoonVar2.f(aocz.R(bArr, i));
                    while (true) {
                        i10 = i12 + 8;
                        if (i10 < i2) {
                            i12 = aocz.M(bArr, i10, aoltVar);
                            if (i3 == aoltVar.a) {
                                aoonVar2.f(aocz.R(bArr, i12));
                            }
                        }
                    }
                    return i10;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return aocz.C(bArr, i12, aonyVar, aoltVar);
                }
                if (i5 == 5) {
                    aonn aonnVar = (aonn) aonyVar;
                    aonnVar.g(aocz.w(bArr, i));
                    while (true) {
                        i11 = i12 + 4;
                        if (i11 < i2) {
                            i12 = aocz.M(bArr, i11, aoltVar);
                            if (i3 == aoltVar.a) {
                                aonnVar.g(aocz.w(bArr, i12));
                            }
                        }
                    }
                    return i11;
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    return aocz.A(bArr, i12, aonyVar, aoltVar);
                }
                if (i5 == 0) {
                    aolw aolwVar = (aolw) aonyVar;
                    int P2 = aocz.P(bArr, i12, aoltVar);
                    aolwVar.f(aoltVar.b != 0);
                    while (P2 < i2) {
                        int M2 = aocz.M(bArr, P2, aoltVar);
                        if (i3 != aoltVar.a) {
                            return P2;
                        }
                        P2 = aocz.P(bArr, M2, aoltVar);
                        aolwVar.f(aoltVar.b != 0);
                    }
                    return P2;
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) != 0) {
                        i12 = aocz.M(bArr, i12, aoltVar);
                        int i13 = aoltVar.a;
                        if (i13 < 0) {
                            throw aoob.f();
                        }
                        if (i13 == 0) {
                            aonyVar.add("");
                        } else {
                            int i14 = i12 + i13;
                            if (!aoqm.h(bArr, i12, i14)) {
                                throw aoob.d();
                            }
                            aonyVar.add(new String(bArr, i12, i13, aonz.a));
                            i12 = i14;
                        }
                        while (i12 < i2) {
                            int M3 = aocz.M(bArr, i12, aoltVar);
                            if (i3 != aoltVar.a) {
                                break;
                            } else {
                                i12 = aocz.M(bArr, M3, aoltVar);
                                int i15 = aoltVar.a;
                                if (i15 < 0) {
                                    throw aoob.f();
                                }
                                if (i15 == 0) {
                                    aonyVar.add("");
                                } else {
                                    int i16 = i12 + i15;
                                    if (aoqm.h(bArr, i12, i16)) {
                                        aonyVar.add(new String(bArr, i12, i15, aonz.a));
                                        i12 = i16;
                                    } else {
                                        throw aoob.d();
                                    }
                                }
                            }
                        }
                        break;
                    } else {
                        i12 = aocz.M(bArr, i12, aoltVar);
                        int i17 = aoltVar.a;
                        if (i17 < 0) {
                            throw aoob.f();
                        }
                        if (i17 == 0) {
                            aonyVar.add("");
                        } else {
                            aonyVar.add(new String(bArr, i12, i17, aonz.a));
                            i12 += i17;
                        }
                        while (i12 < i2) {
                            int M4 = aocz.M(bArr, i12, aoltVar);
                            if (i3 != aoltVar.a) {
                                break;
                            } else {
                                i12 = aocz.M(bArr, M4, aoltVar);
                                int i18 = aoltVar.a;
                                if (i18 < 0) {
                                    throw aoob.f();
                                }
                                if (i18 == 0) {
                                    aonyVar.add("");
                                } else {
                                    aonyVar.add(new String(bArr, i12, i18, aonz.a));
                                    i12 += i18;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 27:
                if (i5 == 2) {
                    return aocz.z(G(i6), i3, bArr, i, i2, aonyVar, aoltVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int M5 = aocz.M(bArr, i12, aoltVar);
                    int i19 = aoltVar.a;
                    if (i19 < 0) {
                        throw aoob.f();
                    }
                    if (i19 > bArr.length - M5) {
                        throw aoob.j();
                    }
                    if (i19 == 0) {
                        aonyVar.add(aomf.b);
                    } else {
                        aonyVar.add(aomf.y(bArr, M5, i19));
                        M5 += i19;
                    }
                    while (M5 < i2) {
                        int M6 = aocz.M(bArr, M5, aoltVar);
                        if (i3 != aoltVar.a) {
                            return M5;
                        }
                        M5 = aocz.M(bArr, M6, aoltVar);
                        int i20 = aoltVar.a;
                        if (i20 >= 0) {
                            if (i20 > bArr.length - M5) {
                                throw aoob.j();
                            }
                            if (i20 == 0) {
                                aonyVar.add(aomf.b);
                            } else {
                                aonyVar.add(aomf.y(bArr, M5, i20));
                                M5 += i20;
                            }
                        } else {
                            throw aoob.f();
                        }
                    }
                    return M5;
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    O = aocz.H(bArr, i12, aonyVar, aoltVar);
                } else if (i5 == 0) {
                    O = aocz.O(i3, bArr, i, i2, aonyVar, aoltVar);
                }
                aonm aonmVar = (aonm) obj;
                aoqc aoqcVar = aonmVar.unknownFields;
                if (aoqcVar == aoqc.a) {
                    aoqcVar = null;
                }
                Object Y = aopr.Y(i4, aonyVar, F(i6), aoqcVar);
                if (Y == null) {
                    return O;
                }
                aonmVar.unknownFields = (aoqc) Y;
                return O;
            case 33:
            case 47:
                if (i5 == 2) {
                    return aocz.F(bArr, i12, aonyVar, aoltVar);
                }
                if (i5 == 0) {
                    aonn aonnVar2 = (aonn) aonyVar;
                    int M7 = aocz.M(bArr, i12, aoltVar);
                    aonnVar2.g(aomk.J(aoltVar.a));
                    while (M7 < i2) {
                        int M8 = aocz.M(bArr, M7, aoltVar);
                        if (i3 != aoltVar.a) {
                            return M7;
                        }
                        M7 = aocz.M(bArr, M8, aoltVar);
                        aonnVar2.g(aomk.J(aoltVar.a));
                    }
                    return M7;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return aocz.G(bArr, i12, aonyVar, aoltVar);
                }
                if (i5 == 0) {
                    aoon aoonVar3 = (aoon) aonyVar;
                    int P3 = aocz.P(bArr, i12, aoltVar);
                    aoonVar3.f(aomk.L(aoltVar.b));
                    while (P3 < i2) {
                        int M9 = aocz.M(bArr, P3, aoltVar);
                        if (i3 != aoltVar.a) {
                            return P3;
                        }
                        P3 = aocz.P(bArr, M9, aoltVar);
                        aoonVar3.f(aomk.L(aoltVar.b));
                    }
                    return P3;
                }
                break;
            default:
                if (i5 == 3) {
                    aopq G = G(i6);
                    int i21 = (i3 & (-8)) | 4;
                    int x = aocz.x(G, bArr, i, i2, i21, aoltVar);
                    aonyVar.add(aoltVar.c);
                    while (x < i2) {
                        int M10 = aocz.M(bArr, x, aoltVar);
                        if (i3 != aoltVar.a) {
                            return x;
                        }
                        x = aocz.x(G, bArr, M10, i2, i21, aoltVar);
                        aonyVar.add(aoltVar.c);
                    }
                    return x;
                }
                break;
        }
        return i12;
    }

    private final int x(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return A(i, 0);
    }

    private final int y(int i, int i2) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return A(i, i2);
    }

    private final int z(int i) {
        return this.c[i + 2];
    }

    @Override // defpackage.aopq
    public final int a(Object obj) {
        return this.j ? r(obj) : q(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    @Override // defpackage.aopq
    public final int b(Object obj) {
        int i;
        int c;
        int length = this.c.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int C = C(i3);
            int s = s(i3);
            long D = D(C);
            int i4 = 37;
            switch (B(C)) {
                case 0:
                    i = i2 * 53;
                    c = aonz.c(Double.doubleToLongBits(aoqk.b(obj, D)));
                    i2 = i + c;
                    break;
                case 1:
                    i = i2 * 53;
                    c = Float.floatToIntBits(aoqk.c(obj, D));
                    i2 = i + c;
                    break;
                case 2:
                    i = i2 * 53;
                    c = aonz.c(aoqk.f(obj, D));
                    i2 = i + c;
                    break;
                case 3:
                    i = i2 * 53;
                    c = aonz.c(aoqk.f(obj, D));
                    i2 = i + c;
                    break;
                case 4:
                    i = i2 * 53;
                    c = aoqk.d(obj, D);
                    i2 = i + c;
                    break;
                case 5:
                    i = i2 * 53;
                    c = aonz.c(aoqk.f(obj, D));
                    i2 = i + c;
                    break;
                case 6:
                    i = i2 * 53;
                    c = aoqk.d(obj, D);
                    i2 = i + c;
                    break;
                case 7:
                    i = i2 * 53;
                    c = aonz.a(aoqk.x(obj, D));
                    i2 = i + c;
                    break;
                case 8:
                    i = i2 * 53;
                    c = ((String) aoqk.i(obj, D)).hashCode();
                    i2 = i + c;
                    break;
                case 9:
                    Object i5 = aoqk.i(obj, D);
                    if (i5 != null) {
                        i4 = i5.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    c = aoqk.i(obj, D).hashCode();
                    i2 = i + c;
                    break;
                case 11:
                    i = i2 * 53;
                    c = aoqk.d(obj, D);
                    i2 = i + c;
                    break;
                case 12:
                    i = i2 * 53;
                    c = aoqk.d(obj, D);
                    i2 = i + c;
                    break;
                case 13:
                    i = i2 * 53;
                    c = aoqk.d(obj, D);
                    i2 = i + c;
                    break;
                case 14:
                    i = i2 * 53;
                    c = aonz.c(aoqk.f(obj, D));
                    i2 = i + c;
                    break;
                case 15:
                    i = i2 * 53;
                    c = aoqk.d(obj, D);
                    i2 = i + c;
                    break;
                case 16:
                    i = i2 * 53;
                    c = aonz.c(aoqk.f(obj, D));
                    i2 = i + c;
                    break;
                case 17:
                    Object i6 = aoqk.i(obj, D);
                    if (i6 != null) {
                        i4 = i6.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    c = aoqk.i(obj, D).hashCode();
                    i2 = i + c;
                    break;
                case 50:
                    i = i2 * 53;
                    c = aoqk.i(obj, D).hashCode();
                    i2 = i + c;
                    break;
                case 51:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aonz.c(Double.doubleToLongBits(o(obj, D)));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = Float.floatToIntBits(p(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aonz.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aonz.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aonz.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aonz.a(V(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = ((String) aoqk.i(obj, D)).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aoqk.i(obj, D).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aoqk.i(obj, D).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aonz.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = t(obj, D);
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aonz.c(E(obj, D));
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (U(obj, s, i3)) {
                        i = i2 * 53;
                        c = aoqk.i(obj, D).hashCode();
                        i2 = i + c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + amkq.cC(obj).hashCode();
        return this.h ? (hashCode * 53) + aocz.n(obj).hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0678, code lost:
    
        if (r5 == 1048575) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x067a, code lost:
    
        r31.putInt(r12, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0680, code lost:
    
        r2 = r7.m;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0686, code lost:
    
        if (r2 >= r7.n) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0688, code lost:
    
        r3 = r7.ab(r12, r7.l[r2], r3);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0693, code lost:
    
        if (r3 == null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0695, code lost:
    
        defpackage.amkq.cD(r12, (defpackage.aoqc) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x069a, code lost:
    
        if (r8 != 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x069e, code lost:
    
        if (r0 != r37) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x06a5, code lost:
    
        throw defpackage.aoob.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x06ac, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x06a8, code lost:
    
        if (r0 > r37) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x06aa, code lost:
    
        if (r1 != r8) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x06b2, code lost:
    
        throw defpackage.aoob.g();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:115:0x0532. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:179:0x0099. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x03ed. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, defpackage.aolt r39) {
        /*
            Method dump skipped, instructions count: 1834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aopa.c(java.lang.Object, byte[], int, int, int, aolt):int");
    }

    @Override // defpackage.aopq
    public final Object e() {
        return ((aonm) this.g).dynamicMethod(aonl.NEW_MUTABLE_INSTANCE);
    }

    @Override // defpackage.aopq
    public final void f(Object obj) {
        int i;
        int i2 = this.m;
        while (true) {
            i = this.n;
            if (i2 >= i) {
                break;
            }
            long D = D(C(this.l[i2]));
            Object i3 = aoqk.i(obj, D);
            if (i3 != null) {
                ((aoot) i3).c();
                aoqk.v(obj, D, i3);
            }
            i2++;
        }
        int length = this.l.length;
        while (i < length) {
            this.o.c(obj, this.l[i]);
            i++;
        }
        amkq.cF(obj);
        if (this.h) {
            aocz.r(obj);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:379:0x005c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x024c. Please report as an issue. */
    @Override // defpackage.aopq
    public final void h(Object obj, aopl aoplVar, aomw aomwVar) {
        Object valueOf;
        Object l;
        ArrayList arrayList;
        Object X;
        aomwVar.getClass();
        amkq amkqVar = this.p;
        Object obj2 = null;
        aomz aomzVar = null;
        while (true) {
            try {
                int c = aoplVar.c();
                int x = x(c);
                if (x >= 0) {
                    int C = C(x);
                    try {
                    } catch (aooa unused) {
                        if (obj2 == null) {
                            obj2 = amkq.cE(obj);
                        }
                        if (!amkqVar.cz(obj2, aoplVar)) {
                            for (int i = this.m; i < this.n; i++) {
                                obj2 = ab(obj, this.l[i], obj2);
                            }
                            if (obj2 == null) {
                                return;
                            }
                            amkq.cD(obj, (aoqc) obj2);
                            return;
                        }
                    }
                    switch (B(C)) {
                        case 0:
                            aoqk.r(obj, D(C), aoplVar.a());
                            N(obj, x);
                        case 1:
                            aoqk.s(obj, D(C), aoplVar.b());
                            N(obj, x);
                        case 2:
                            aoqk.u(obj, D(C), aoplVar.l());
                            N(obj, x);
                        case 3:
                            aoqk.u(obj, D(C), aoplVar.o());
                            N(obj, x);
                        case 4:
                            aoqk.t(obj, D(C), aoplVar.g());
                            N(obj, x);
                        case 5:
                            aoqk.u(obj, D(C), aoplVar.k());
                            N(obj, x);
                        case 6:
                            aoqk.t(obj, D(C), aoplVar.f());
                            N(obj, x);
                        case 7:
                            aoqk.n(obj, D(C), aoplVar.T());
                            N(obj, x);
                        case 8:
                            M(obj, C, aoplVar);
                            N(obj, x);
                        case 9:
                            if (R(obj, x)) {
                                aoqk.v(obj, D(C), aonz.e(aoqk.i(obj, D(C)), aoplVar.u(G(x), aomwVar)));
                            } else {
                                aoqk.v(obj, D(C), aoplVar.u(G(x), aomwVar));
                                N(obj, x);
                            }
                        case 10:
                            aoqk.v(obj, D(C), aoplVar.q());
                            N(obj, x);
                        case 11:
                            aoqk.t(obj, D(C), aoplVar.j());
                            N(obj, x);
                        case 12:
                            int e = aoplVar.e();
                            aons F = F(x);
                            if (F != null && !F.isInRange(e)) {
                                obj2 = aopr.W(c, e, obj2);
                            }
                            aoqk.t(obj, D(C), e);
                            N(obj, x);
                            break;
                        case 13:
                            aoqk.t(obj, D(C), aoplVar.h());
                            N(obj, x);
                        case 14:
                            aoqk.u(obj, D(C), aoplVar.m());
                            N(obj, x);
                        case 15:
                            aoqk.t(obj, D(C), aoplVar.i());
                            N(obj, x);
                        case 16:
                            aoqk.u(obj, D(C), aoplVar.n());
                            N(obj, x);
                        case 17:
                            if (R(obj, x)) {
                                aoqk.v(obj, D(C), aonz.e(aoqk.i(obj, D(C)), aoplVar.s(G(x), aomwVar)));
                            } else {
                                aoqk.v(obj, D(C), aoplVar.s(G(x), aomwVar));
                                N(obj, x);
                            }
                        case 18:
                            aoplVar.A(this.o.b(obj, D(C)));
                        case 19:
                            aoplVar.E(this.o.b(obj, D(C)));
                        case 20:
                            aoplVar.H(this.o.b(obj, D(C)));
                        case 21:
                            aoplVar.S(this.o.b(obj, D(C)));
                        case 22:
                            aoplVar.G(this.o.b(obj, D(C)));
                        case 23:
                            aoplVar.D(this.o.b(obj, D(C)));
                        case 24:
                            aoplVar.C(this.o.b(obj, D(C)));
                        case 25:
                            aoplVar.y(this.o.b(obj, D(C)));
                        case 26:
                            if (Q(C)) {
                                aoplVar.Q(this.o.b(obj, D(C)));
                            } else {
                                aoplVar.O(this.o.b(obj, D(C)));
                            }
                        case 27:
                            aoplVar.J(this.o.b(obj, D(C)), G(x), aomwVar);
                        case 28:
                            aoplVar.z(this.o.b(obj, D(C)));
                        case 29:
                            aoplVar.R(this.o.b(obj, D(C)));
                        case 30:
                            List b2 = this.o.b(obj, D(C));
                            aoplVar.B(b2);
                            obj2 = aopr.Y(c, b2, F(x), obj2);
                        case 31:
                            aoplVar.K(this.o.b(obj, D(C)));
                        case 32:
                            aoplVar.L(this.o.b(obj, D(C)));
                        case 33:
                            aoplVar.M(this.o.b(obj, D(C)));
                        case 34:
                            aoplVar.N(this.o.b(obj, D(C)));
                        case 35:
                            aoplVar.A(this.o.b(obj, D(C)));
                        case 36:
                            aoplVar.E(this.o.b(obj, D(C)));
                        case 37:
                            aoplVar.H(this.o.b(obj, D(C)));
                        case 38:
                            aoplVar.S(this.o.b(obj, D(C)));
                        case 39:
                            aoplVar.G(this.o.b(obj, D(C)));
                        case 40:
                            aoplVar.D(this.o.b(obj, D(C)));
                        case 41:
                            aoplVar.C(this.o.b(obj, D(C)));
                        case 42:
                            aoplVar.y(this.o.b(obj, D(C)));
                        case 43:
                            aoplVar.R(this.o.b(obj, D(C)));
                        case 44:
                            List b3 = this.o.b(obj, D(C));
                            aoplVar.B(b3);
                            obj2 = aopr.Y(c, b3, F(x), obj2);
                        case 45:
                            aoplVar.K(this.o.b(obj, D(C)));
                        case 46:
                            aoplVar.L(this.o.b(obj, D(C)));
                        case 47:
                            aoplVar.M(this.o.b(obj, D(C)));
                        case 48:
                            aoplVar.N(this.o.b(obj, D(C)));
                        case 49:
                            aoplVar.F(this.o.b(obj, D(C)), G(x), aomwVar);
                        case 50:
                            Object H = H(x);
                            long D = D(C(x));
                            Object i2 = aoqk.i(obj, D);
                            if (i2 == null) {
                                i2 = aocz.l();
                                aoqk.v(obj, D, i2);
                            } else if (aocz.j(i2)) {
                                Object l2 = aocz.l();
                                aocz.k(l2, i2);
                                aoqk.v(obj, D, l2);
                                i2 = l2;
                            }
                            aoplVar.I((aoot) i2, aocz.h(H), aomwVar);
                        case 51:
                            aoqk.v(obj, D(C), Double.valueOf(aoplVar.a()));
                            O(obj, c, x);
                        case 52:
                            aoqk.v(obj, D(C), Float.valueOf(aoplVar.b()));
                            O(obj, c, x);
                        case 53:
                            aoqk.v(obj, D(C), Long.valueOf(aoplVar.l()));
                            O(obj, c, x);
                        case 54:
                            aoqk.v(obj, D(C), Long.valueOf(aoplVar.o()));
                            O(obj, c, x);
                        case 55:
                            aoqk.v(obj, D(C), Integer.valueOf(aoplVar.g()));
                            O(obj, c, x);
                        case 56:
                            aoqk.v(obj, D(C), Long.valueOf(aoplVar.k()));
                            O(obj, c, x);
                        case 57:
                            aoqk.v(obj, D(C), Integer.valueOf(aoplVar.f()));
                            O(obj, c, x);
                        case 58:
                            aoqk.v(obj, D(C), Boolean.valueOf(aoplVar.T()));
                            O(obj, c, x);
                        case 59:
                            M(obj, C, aoplVar);
                            O(obj, c, x);
                        case 60:
                            if (U(obj, c, x)) {
                                aoqk.v(obj, D(C), aonz.e(aoqk.i(obj, D(C)), aoplVar.u(G(x), aomwVar)));
                            } else {
                                aoqk.v(obj, D(C), aoplVar.u(G(x), aomwVar));
                                N(obj, x);
                            }
                            O(obj, c, x);
                        case 61:
                            aoqk.v(obj, D(C), aoplVar.q());
                            O(obj, c, x);
                        case 62:
                            aoqk.v(obj, D(C), Integer.valueOf(aoplVar.j()));
                            O(obj, c, x);
                        case 63:
                            int e2 = aoplVar.e();
                            aons F2 = F(x);
                            if (F2 != null && !F2.isInRange(e2)) {
                                obj2 = aopr.W(c, e2, obj2);
                            }
                            aoqk.v(obj, D(C), Integer.valueOf(e2));
                            O(obj, c, x);
                            break;
                        case 64:
                            aoqk.v(obj, D(C), Integer.valueOf(aoplVar.h()));
                            O(obj, c, x);
                        case 65:
                            aoqk.v(obj, D(C), Long.valueOf(aoplVar.m()));
                            O(obj, c, x);
                        case 66:
                            aoqk.v(obj, D(C), Integer.valueOf(aoplVar.i()));
                            O(obj, c, x);
                        case 67:
                            aoqk.v(obj, D(C), Long.valueOf(aoplVar.n()));
                            O(obj, c, x);
                        case 68:
                            aoqk.v(obj, D(C), aoplVar.s(G(x), aomwVar));
                            O(obj, c, x);
                        default:
                            if (obj2 == null) {
                                obj2 = aoqc.c();
                            }
                            if (!amkqVar.cz(obj2, aoplVar)) {
                                for (int i3 = this.m; i3 < this.n; i3++) {
                                    obj2 = ab(obj, this.l[i3], obj2);
                                }
                                if (obj2 == null) {
                                    return;
                                }
                            }
                            break;
                    }
                } else if (c == Integer.MAX_VALUE) {
                    for (int i4 = this.m; i4 < this.n; i4++) {
                        obj2 = ab(obj, this.l[i4], obj2);
                    }
                    if (obj2 == null) {
                        return;
                    }
                } else {
                    aonk d = !this.h ? null : aomwVar.d(this.g, c);
                    if (d != null) {
                        if (aomzVar == null) {
                            aomzVar = aocz.o(obj);
                        }
                        int a2 = d.a();
                        aonj aonjVar = d.d;
                        if (aonjVar.d && aonjVar.e) {
                            aoqn aoqnVar = aoqn.DOUBLE;
                            switch (d.b()) {
                                case DOUBLE:
                                    arrayList = new ArrayList();
                                    aoplVar.A(arrayList);
                                    X = obj2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                                case FLOAT:
                                    arrayList = new ArrayList();
                                    aoplVar.E(arrayList);
                                    X = obj2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                                case INT64:
                                    arrayList = new ArrayList();
                                    aoplVar.H(arrayList);
                                    X = obj2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                                case UINT64:
                                    arrayList = new ArrayList();
                                    aoplVar.S(arrayList);
                                    X = obj2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                                case INT32:
                                    arrayList = new ArrayList();
                                    aoplVar.G(arrayList);
                                    X = obj2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                                case FIXED64:
                                    arrayList = new ArrayList();
                                    aoplVar.D(arrayList);
                                    X = obj2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                                case FIXED32:
                                    arrayList = new ArrayList();
                                    aoplVar.C(arrayList);
                                    X = obj2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                                case BOOL:
                                    arrayList = new ArrayList();
                                    aoplVar.y(arrayList);
                                    X = obj2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                                case STRING:
                                case GROUP:
                                case MESSAGE:
                                case BYTES:
                                default:
                                    String valueOf2 = String.valueOf(d.d.c);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 23);
                                    sb.append("Type cannot be packed: ");
                                    sb.append(valueOf2);
                                    throw new IllegalStateException(sb.toString());
                                case UINT32:
                                    arrayList = new ArrayList();
                                    aoplVar.R(arrayList);
                                    X = obj2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                                case ENUM:
                                    ArrayList arrayList2 = new ArrayList();
                                    aoplVar.B(arrayList2);
                                    X = aopr.X(a2, arrayList2, d.d.a, obj2);
                                    arrayList = arrayList2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                                case SFIXED32:
                                    arrayList = new ArrayList();
                                    aoplVar.K(arrayList);
                                    X = obj2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                                case SFIXED64:
                                    arrayList = new ArrayList();
                                    aoplVar.L(arrayList);
                                    X = obj2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                                case SINT32:
                                    arrayList = new ArrayList();
                                    aoplVar.M(arrayList);
                                    X = obj2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                                case SINT64:
                                    arrayList = new ArrayList();
                                    aoplVar.N(arrayList);
                                    X = obj2;
                                    aomzVar.n(d.d, arrayList);
                                    obj2 = X;
                                    break;
                            }
                        } else {
                            if (d.b() != aoqn.ENUM) {
                                switch (d.b()) {
                                    case DOUBLE:
                                        valueOf = Double.valueOf(aoplVar.a());
                                        break;
                                    case FLOAT:
                                        valueOf = Float.valueOf(aoplVar.b());
                                        break;
                                    case INT64:
                                        valueOf = Long.valueOf(aoplVar.l());
                                        break;
                                    case UINT64:
                                        valueOf = Long.valueOf(aoplVar.o());
                                        break;
                                    case INT32:
                                        valueOf = Integer.valueOf(aoplVar.g());
                                        break;
                                    case FIXED64:
                                        valueOf = Long.valueOf(aoplVar.k());
                                        break;
                                    case FIXED32:
                                        valueOf = Integer.valueOf(aoplVar.f());
                                        break;
                                    case BOOL:
                                        valueOf = Boolean.valueOf(aoplVar.T());
                                        break;
                                    case STRING:
                                        valueOf = aoplVar.v();
                                        break;
                                    case GROUP:
                                        valueOf = aoplVar.r(d.c.getClass(), aomwVar);
                                        break;
                                    case MESSAGE:
                                        valueOf = aoplVar.t(d.c.getClass(), aomwVar);
                                        break;
                                    case BYTES:
                                        valueOf = aoplVar.q();
                                        break;
                                    case UINT32:
                                        valueOf = Integer.valueOf(aoplVar.j());
                                        break;
                                    case ENUM:
                                        throw new IllegalStateException("Shouldn't reach here.");
                                    case SFIXED32:
                                        valueOf = Integer.valueOf(aoplVar.h());
                                        break;
                                    case SFIXED64:
                                        valueOf = Long.valueOf(aoplVar.m());
                                        break;
                                    case SINT32:
                                        valueOf = Integer.valueOf(aoplVar.i());
                                        break;
                                    case SINT64:
                                        valueOf = Long.valueOf(aoplVar.n());
                                        break;
                                    default:
                                        valueOf = null;
                                        break;
                                }
                            } else {
                                int g = aoplVar.g();
                                if (d.d.a.findValueByNumber(g) == null) {
                                    obj2 = aopr.W(a2, g, obj2);
                                } else {
                                    valueOf = Integer.valueOf(g);
                                }
                            }
                            if (d.e()) {
                                aomzVar.m(d.d, valueOf);
                            } else {
                                int ordinal = d.b().ordinal();
                                if ((ordinal == 9 || ordinal == 10) && (l = aomzVar.l(d.d)) != null) {
                                    valueOf = aonz.e(l, valueOf);
                                }
                                aomzVar.n(d.d, valueOf);
                            }
                        }
                    } else {
                        if (obj2 == null) {
                            obj2 = amkq.cE(obj);
                        }
                        if (!amkqVar.cz(obj2, aoplVar)) {
                            for (int i5 = this.m; i5 < this.n; i5++) {
                                obj2 = ab(obj, this.l[i5], obj2);
                            }
                            if (obj2 == null) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i6 = this.m; i6 < this.n; i6++) {
                    obj2 = ab(obj, this.l[i6], obj2);
                }
                if (obj2 != null) {
                    amkq.cD(obj, (aoqc) obj2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.aopq
    public final void i(Object obj, byte[] bArr, int i, int i2, aolt aoltVar) {
        if (this.j) {
            X(obj, bArr, i, i2, aoltVar);
        } else {
            c(obj, bArr, i, i2, 0, aoltVar);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c4 A[SYNTHETIC] */
    @Override // defpackage.aopq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aopa.j(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // defpackage.aopq
    public final boolean k(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.m) {
            int i6 = this.l[i5];
            int s = s(i6);
            int C = C(i6);
            int i7 = this.c[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = b.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & C) != 0 && !S(obj, i6, i, i2, i9)) {
                return false;
            }
            int B = B(C);
            if (B != 9 && B != 17) {
                if (B != 27) {
                    if (B == 60 || B == 68) {
                        if (U(obj, s, i6) && !T(obj, C, G(i6))) {
                            return false;
                        }
                    } else if (B != 49) {
                        if (B != 50) {
                            continue;
                        } else {
                            aoot aootVar = (aoot) aoqk.i(obj, D(C));
                            if (!aootVar.isEmpty() && aocz.h(H(i6)).c.s == aoqo.MESSAGE) {
                                aopq aopqVar = null;
                                for (Object obj2 : aootVar.values()) {
                                    if (aopqVar == null) {
                                        aopqVar = aopi.a.a(obj2.getClass());
                                    }
                                    if (!aopqVar.k(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) aoqk.i(obj, D(C));
                if (list.isEmpty()) {
                    continue;
                } else {
                    aopq G = G(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!G.k(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (S(obj, i6, i, i2, i9) && !T(obj, C, G(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.h || aocz.n(obj).j();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0586  */
    @Override // defpackage.aopq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.Object r13, defpackage.aomq r14) {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aopa.l(java.lang.Object, aomq):void");
    }

    @Override // defpackage.aopq
    public final void g(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int C = C(i);
            long D = D(C);
            int s = s(i);
            switch (B(C)) {
                case 0:
                    if (R(obj2, i)) {
                        aoqk.r(obj, D, aoqk.b(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (R(obj2, i)) {
                        aoqk.s(obj, D, aoqk.c(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (R(obj2, i)) {
                        aoqk.u(obj, D, aoqk.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (R(obj2, i)) {
                        aoqk.u(obj, D, aoqk.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (R(obj2, i)) {
                        aoqk.t(obj, D, aoqk.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (R(obj2, i)) {
                        aoqk.u(obj, D, aoqk.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (R(obj2, i)) {
                        aoqk.t(obj, D, aoqk.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (R(obj2, i)) {
                        aoqk.n(obj, D, aoqk.x(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (R(obj2, i)) {
                        aoqk.v(obj, D, aoqk.i(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    K(obj, obj2, i);
                    break;
                case 10:
                    if (R(obj2, i)) {
                        aoqk.v(obj, D, aoqk.i(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (R(obj2, i)) {
                        aoqk.t(obj, D, aoqk.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (R(obj2, i)) {
                        aoqk.t(obj, D, aoqk.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (R(obj2, i)) {
                        aoqk.t(obj, D, aoqk.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (R(obj2, i)) {
                        aoqk.u(obj, D, aoqk.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (R(obj2, i)) {
                        aoqk.t(obj, D, aoqk.d(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (R(obj2, i)) {
                        aoqk.u(obj, D, aoqk.f(obj2, D));
                        N(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    K(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.o.d(obj, obj2, D);
                    break;
                case 50:
                    aopr.U(obj, obj2, D);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (U(obj2, s, i)) {
                        aoqk.v(obj, D, aoqk.i(obj2, D));
                        O(obj, s, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    L(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (U(obj2, s, i)) {
                        aoqk.v(obj, D, aoqk.i(obj2, D));
                        O(obj, s, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    L(obj, obj2, i);
                    break;
            }
        }
        aopr.V(obj, obj2);
        if (this.h) {
            aopr.T(obj, obj2);
        }
    }
}
