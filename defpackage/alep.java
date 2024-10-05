package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alep {
    public final shf a;

    public alep(shf shfVar) {
        this.a = shfVar;
    }

    public static long a(akzs akzsVar) {
        akzp akzpVar = akzsVar.ad;
        if (akzpVar == null) {
            akzpVar = akzp.a;
        }
        long j = akzpVar.g;
        if (j == 0) {
            akzp akzpVar2 = akzsVar.ac;
            if (akzpVar2 == null) {
                akzpVar2 = akzp.a;
            }
            j = akzpVar2.g;
        }
        if (j != 0) {
            return j;
        }
        akzp akzpVar3 = akzsVar.aa;
        if (akzpVar3 == null) {
            akzpVar3 = akzp.a;
        }
        return akzpVar3.g;
    }

    public static avgs e(avtu avtuVar) {
        for (avtv avtvVar : avtuVar.e) {
            if ((avtvVar.b & 2) != 0) {
                avgs avgsVar = avtvVar.c;
                return avgsVar == null ? avgs.a : avgsVar;
            }
        }
        return null;
    }

    public static File g(akzs akzsVar) {
        if ((akzsVar.b & 536870912) == 0) {
            String valueOf = String.valueOf(akzsVar.k);
            throw new IOException(valueOf.length() != 0 ? "Missing copy file name ".concat(valueOf) : new String("Missing copy file name "));
        }
        akzp akzpVar = akzsVar.A;
        if (akzpVar == null) {
            akzpVar = akzp.a;
        }
        int l = akwg.l(akzpVar.c);
        if (l == 0 || l != 2) {
            String valueOf2 = String.valueOf(akzsVar.k);
            throw new IOException(valueOf2.length() != 0 ? "Invalid copy file state ".concat(valueOf2) : new String("Invalid copy file state "));
        }
        String absolutePath = f(akzsVar).getAbsolutePath();
        String str = akzsVar.B;
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 1 + String.valueOf(str).length());
        sb.append(absolutePath);
        sb.append("/");
        sb.append(str);
        return new File(sb.toString());
    }

    public static boolean h(avtu avtuVar) {
        Iterator it = avtuVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            avtw avtwVar = (avtw) it.next();
            if ((avtwVar.b & 128) != 0) {
                avxz avxzVar = avtwVar.f;
                if (avxzVar == null) {
                    avxzVar = avxz.a;
                }
                int X = awxr.X(avxzVar.b);
                if (X != 0 && X == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(akzp akzpVar, avtq avtqVar) {
        int l = akwg.l(akzpVar.c);
        if (l == 0 || l != 4) {
            return false;
        }
        avtq b = avtq.b(akzpVar.d);
        if (b == null) {
            b = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN;
        }
        return b == avtqVar;
    }

    public static boolean j(akzp akzpVar) {
        int l = akwg.l(akzpVar.c);
        if (l != 0 && l == 2) {
            return true;
        }
        int l2 = akwg.l(akzpVar.c);
        return l2 != 0 && l2 == 4;
    }

    public static boolean k(akzs akzsVar) {
        if (!akzsVar.z || (akzsVar.b & 536870912) == 0) {
            return false;
        }
        akzp akzpVar = akzsVar.A;
        if (akzpVar == null) {
            akzpVar = akzp.a;
        }
        int l = akwg.l(akzpVar.c);
        return l != 0 && l == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (r0 == defpackage.avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        if (r0 == defpackage.avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
    
        if (r0 != defpackage.avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int l(defpackage.akzs r3) {
        /*
            akzp r0 = r3.aa
            if (r0 != 0) goto L6
            akzp r0 = defpackage.akzp.a
        L6:
            int r0 = r0.c
            int r0 = defpackage.akwg.l(r0)
            r1 = 4
            if (r0 != 0) goto L10
            goto L26
        L10:
            if (r0 != r1) goto L26
            akzp r0 = r3.aa
            if (r0 != 0) goto L18
            akzp r0 = defpackage.akzp.a
        L18:
            int r0 = r0.d
            avtq r0 = defpackage.avtq.b(r0)
            if (r0 != 0) goto L22
            avtq r0 = defpackage.avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN
        L22:
            avtq r2 = defpackage.avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED
            if (r0 != r2) goto L70
        L26:
            akzp r0 = r3.ac
            if (r0 != 0) goto L2c
            akzp r0 = defpackage.akzp.a
        L2c:
            int r0 = r0.c
            int r0 = defpackage.akwg.l(r0)
            if (r0 != 0) goto L35
            goto L4b
        L35:
            if (r0 != r1) goto L4b
            akzp r0 = r3.ac
            if (r0 != 0) goto L3d
            akzp r0 = defpackage.akzp.a
        L3d:
            int r0 = r0.d
            avtq r0 = defpackage.avtq.b(r0)
            if (r0 != 0) goto L47
            avtq r0 = defpackage.avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN
        L47:
            avtq r2 = defpackage.avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED
            if (r0 != r2) goto L70
        L4b:
            akzp r0 = r3.ad
            if (r0 != 0) goto L51
            akzp r0 = defpackage.akzp.a
        L51:
            int r0 = r0.c
            int r0 = defpackage.akwg.l(r0)
            if (r0 != 0) goto L5a
            goto L71
        L5a:
            if (r0 != r1) goto L71
            akzp r0 = r3.ad
            if (r0 != 0) goto L62
            akzp r0 = defpackage.akzp.a
        L62:
            int r0 = r0.d
            avtq r0 = defpackage.avtq.b(r0)
            if (r0 != 0) goto L6c
            avtq r0 = defpackage.avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UNKNOWN
        L6c:
            avtq r2 = defpackage.avtq.UPLOAD_PROCESSOR_FAILURE_REASON_UPLOAD_ALREADY_FAILED
            if (r0 == r2) goto L71
        L70:
            return r1
        L71:
            akzp r3 = r3.ad
            if (r3 != 0) goto L77
            akzp r3 = defpackage.akzp.a
        L77:
            int r3 = r3.c
            int r3 = defpackage.akwg.l(r3)
            if (r3 != 0) goto L80
            goto L84
        L80:
            r0 = 2
            if (r3 != r0) goto L84
            return r0
        L84:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alep.l(akzs):int");
    }

    public static int m(akzq akzqVar) {
        akzq akzqVar2 = akzq.UNKNOWN_UPLOAD;
        int ordinal = akzqVar.ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal != 3) {
            return ordinal != 5 ? 1 : 4;
        }
        return 3;
    }

    public static void n(aone aoneVar) {
        amkq.E(((akzs) aoneVar.instance).t);
        aoneVar.copyOnWrite();
        akzs akzsVar = (akzs) aoneVar.instance;
        akzsVar.aj = null;
        akzsVar.c &= -1073741825;
        aoneVar.copyOnWrite();
        akzs akzsVar2 = (akzs) aoneVar.instance;
        akzsVar2.y = null;
        akzsVar2.b &= -67108865;
        aoneVar.copyOnWrite();
        akzs akzsVar3 = (akzs) aoneVar.instance;
        akzsVar3.x = null;
        akzsVar3.b &= -33554433;
        if (akzsVar3.z) {
            aoneVar.copyOnWrite();
            akzs akzsVar4 = (akzs) aoneVar.instance;
            akzsVar4.A = null;
            akzsVar4.b &= -268435457;
            aoneVar.copyOnWrite();
            akzs akzsVar5 = (akzs) aoneVar.instance;
            akzsVar5.b &= -536870913;
            akzsVar5.B = akzs.a.B;
            aoneVar.copyOnWrite();
            akzs akzsVar6 = (akzs) aoneVar.instance;
            akzsVar6.b &= -1073741825;
            akzsVar6.C = 0L;
            aoneVar.copyOnWrite();
            akzs akzsVar7 = (akzs) aoneVar.instance;
            akzsVar7.c &= -2;
            akzsVar7.E = 0L;
            aoneVar.copyOnWrite();
            akzs akzsVar8 = (akzs) aoneVar.instance;
            akzsVar8.c |= 2;
            akzsVar8.F = true;
        }
        aoneVar.copyOnWrite();
        akzs akzsVar9 = (akzs) aoneVar.instance;
        akzsVar9.K = null;
        akzsVar9.c &= -257;
        aoneVar.copyOnWrite();
        akzs akzsVar10 = (akzs) aoneVar.instance;
        akzsVar10.f65J = null;
        akzsVar10.c &= -129;
        aoneVar.copyOnWrite();
        akzs akzsVar11 = (akzs) aoneVar.instance;
        akzsVar11.an = null;
        akzsVar11.d &= -5;
        aoneVar.copyOnWrite();
        akzs akzsVar12 = (akzs) aoneVar.instance;
        akzsVar12.L = null;
        akzsVar12.c &= -513;
        aoneVar.copyOnWrite();
        akzs akzsVar13 = (akzs) aoneVar.instance;
        akzsVar13.M = null;
        akzsVar13.c &= -1025;
        aoneVar.copyOnWrite();
        akzs akzsVar14 = (akzs) aoneVar.instance;
        akzsVar14.ac = null;
        akzsVar14.c &= -8388609;
        aoneVar.copyOnWrite();
        akzs akzsVar15 = (akzs) aoneVar.instance;
        akzsVar15.aa = null;
        akzsVar15.c &= -2097153;
        if (akzsVar15.w) {
            aoneVar.copyOnWrite();
            akzs akzsVar16 = (akzs) aoneVar.instance;
            akzsVar16.ao = null;
            akzsVar16.d &= -9;
        }
    }

    public final akzp b(long j) {
        long c = this.a.c();
        aone createBuilder = akzp.a.createBuilder();
        createBuilder.copyOnWrite();
        akzp akzpVar = (akzp) createBuilder.instance;
        akzpVar.b |= 8;
        akzpVar.f = j + c;
        createBuilder.copyOnWrite();
        akzp akzpVar2 = (akzp) createBuilder.instance;
        akzpVar2.b |= 16;
        akzpVar2.g = c;
        return (akzp) createBuilder.build();
    }

    public final akzp c(avtq avtqVar) {
        aone createBuilder = akzp.a.createBuilder();
        createBuilder.copyOnWrite();
        akzp akzpVar = (akzp) createBuilder.instance;
        akzpVar.c = 3;
        akzpVar.b |= 1;
        createBuilder.copyOnWrite();
        akzp akzpVar2 = (akzp) createBuilder.instance;
        akzpVar2.d = avtqVar.aB;
        akzpVar2.b |= 2;
        long c = this.a.c();
        createBuilder.copyOnWrite();
        akzp akzpVar3 = (akzp) createBuilder.instance;
        akzpVar3.b |= 16;
        akzpVar3.g = c;
        return (akzp) createBuilder.build();
    }

    public final akzp d() {
        aone createBuilder = akzp.a.createBuilder();
        createBuilder.copyOnWrite();
        akzp akzpVar = (akzp) createBuilder.instance;
        akzpVar.c = 1;
        akzpVar.b = 1 | akzpVar.b;
        long c = this.a.c();
        createBuilder.copyOnWrite();
        akzp akzpVar2 = (akzp) createBuilder.instance;
        akzpVar2.b |= 16;
        akzpVar2.g = c;
        return (akzp) createBuilder.build();
    }

    public final akzp o(avtq avtqVar, akzp akzpVar, List list, axze axzeVar) {
        aone createBuilder = akzp.a.createBuilder();
        long c = this.a.c();
        int i = (akzpVar.b & 1) != 0 ? akzpVar.e : 0;
        if (i >= list.size()) {
            int i2 = avtqVar.aB;
            StringBuilder sb = new StringBuilder(41);
            sb.append("Retry count exceeded. Reason[");
            sb.append(i2);
            sb.append("]");
            axzeVar.e(sb.toString(), new Exception());
            createBuilder.copyOnWrite();
            akzp akzpVar2 = (akzp) createBuilder.instance;
            akzpVar2.c = 3;
            akzpVar2.b |= 1;
        } else {
            createBuilder.copyOnWrite();
            akzp akzpVar3 = (akzp) createBuilder.instance;
            akzpVar3.c = 2;
            akzpVar3.b |= 1;
            long longValue = ((Long) list.get(i)).longValue();
            createBuilder.copyOnWrite();
            akzp akzpVar4 = (akzp) createBuilder.instance;
            akzpVar4.b |= 8;
            akzpVar4.f = longValue + c;
            createBuilder.copyOnWrite();
            akzp akzpVar5 = (akzp) createBuilder.instance;
            akzpVar5.b |= 4;
            akzpVar5.e = i + 1;
        }
        createBuilder.copyOnWrite();
        akzp akzpVar6 = (akzp) createBuilder.instance;
        akzpVar6.d = avtqVar.aB;
        akzpVar6.b |= 2;
        createBuilder.copyOnWrite();
        akzp akzpVar7 = (akzp) createBuilder.instance;
        akzpVar7.b |= 16;
        akzpVar7.g = c;
        return (akzp) createBuilder.build();
    }

    public static File f(akzs akzsVar) {
        if ((akzsVar.d & 1) == 0) {
            String valueOf = String.valueOf(akzsVar.k);
            throw new IOException(valueOf.length() != 0 ? "Missing working directory ".concat(valueOf) : new String("Missing working directory "));
        }
        File file = new File(akzsVar.al);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        String valueOf2 = String.valueOf(akzsVar.k);
        throw new IOException(valueOf2.length() != 0 ? "Could not create working directory ".concat(valueOf2) : new String("Could not create working directory "));
    }
}
