package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sll implements sxt {
    static final Map a;
    static final aoam b = new aoam();
    private final SparseArray c = new SparseArray();
    private final SparseArray d = new SparseArray();
    private final amsx e;
    private final syd f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(192475008, "AnimatedVectorType");
        hashMap.put(160982084, "CellType");
        hashMap.put(158796298, "CollectionType");
        hashMap.put(158796327, "ContainerType");
        hashMap.put(191923252, "EditableTextType");
        hashMap.put(158796345, "ImageType");
        hashMap.put(158796380, "TextType");
        hashMap.put(193805739, "ExpandableTextType");
        hashMap.put(197633010, "ScrollableContainerType");
        a = amrz.j(hashMap);
    }

    public sll(Map map, Map map2, Set set, syd sydVar, ammv ammvVar, ammv ammvVar2, ammv ammvVar3, ammv ammvVar4, ammv ammvVar5) {
        this.g = ((Boolean) ammvVar.e(false)).booleanValue();
        for (sxy sxyVar : ((amrz) map).values()) {
            this.c.put(sxyVar.a(), sxyVar);
        }
        amqp<sxx> b2 = amqp.b(((amrz) map2).values(), set);
        HashSet hashSet = new HashSet();
        amsv i = amsx.i();
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            int a2 = ((sxx) it.next()).b().a();
            Integer valueOf = Integer.valueOf(a2);
            if (!hashSet.add(valueOf)) {
                i.c(valueOf);
                StringBuilder sb = new StringBuilder(68);
                sb.append("Multiple type converters found and removed for extension ");
                sb.append(a2);
                sydVar.b(27, sb.toString());
            }
        }
        this.e = i.g();
        for (sxx sxxVar : b2) {
            int a3 = sxxVar.b().a();
            if (!this.e.contains(Integer.valueOf(a3))) {
                this.d.put(a3, sxxVar);
            }
        }
        this.h = ((Boolean) ammvVar2.e(false)).booleanValue();
        this.i = ((Boolean) ammvVar3.e(false)).booleanValue();
        this.j = ((Boolean) ammvVar4.e(false)).booleanValue();
        this.k = ((Boolean) ammvVar5.e(true)).booleanValue();
        this.f = sydVar;
        aoan.a = new tap(sydVar);
        axod.a.set(this.g);
    }

    private final List d(dhe dheVar, sxc sxcVar, aoam aoamVar, final sxk sxkVar, final List list, boolean z) {
        dha c;
        int K = aoamVar.K();
        if (K == 0) {
            return amru.q();
        }
        ArrayList arrayList = new ArrayList(Collections.nCopies(K, null));
        ArrayList arrayList2 = new ArrayList(K);
        for (int i = 0; i < K; i++) {
            arrayList2.add(Integer.valueOf(i));
        }
        if (!z) {
            Collections.shuffle(arrayList2);
        }
        for (int i2 = 0; i2 < K; i2++) {
            final aoam at = aoamVar.at(((Integer) arrayList2.get(i2)).intValue());
            if (z) {
                tac a2 = tae.a(dheVar);
                a2.e(new szo() { // from class: slk
                    @Override // defpackage.szo
                    public final dha a(dhe dheVar2, sxc sxcVar2) {
                        return sll.this.c(dheVar2, sxcVar2, at, sxkVar, list);
                    }
                });
                a2.f(sxcVar);
                c = a2.a();
            } else {
                c = c(dheVar, sxcVar, at, sxkVar, list);
            }
            arrayList.set(((Integer) arrayList2.get(i2)).intValue(), c);
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    @Override // defpackage.sxt
    public final dha a(dhe dheVar, sxc sxcVar, byte[] bArr, sxk sxkVar, ayqw ayqwVar) {
        sxc a2;
        awrt j;
        if (sxcVar == null) {
            sxcVar = sxc.a;
        }
        sxb e = sxcVar.e();
        e.e = ayqwVar;
        if (!this.g) {
            a2 = e.a();
        } else {
            e.o = Integer.toString(System.identityHashCode(bArr));
            a2 = e.a();
        }
        sxc sxcVar2 = a2;
        aoam aoamVar = new aoam();
        int a3 = axod.a(bArr, aoamVar, this.h, this.j);
        if (a3 != 0) {
            syd sydVar = this.f;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Failed to convert Element to Flatbuffers:");
            sb.append(a3);
            sydVar.c(28, sb.toString(), sxcVar2);
            return drd.a(dheVar).a;
        }
        dha b2 = b(dheVar, sxcVar2, aoamVar, sxkVar, ayqwVar);
        if (!this.g || (j = svv.j(aoamVar, null, null, null)) == null) {
            return b2;
        }
        svt svtVar = new svt(null);
        svtVar.a(j);
        dnc a4 = dnd.a(dheVar);
        a4.e(b2);
        a4.F(svtVar);
        return a4.a();
    }

    @Override // defpackage.sxt
    public final dha b(dhe dheVar, sxc sxcVar, aoam aoamVar, sxk sxkVar, ayqw ayqwVar) {
        int c;
        int i;
        if (this.g && sxcVar.t == null) {
            throw new IllegalStateException("Element tree missing id in debug mode.");
        }
        szf szfVar = szf.b;
        szf szfVar2 = sxcVar.e;
        if (szfVar2 != null) {
            szfVar = szfVar2;
        }
        ArrayList arrayList = new ArrayList();
        dha c2 = c(dheVar, sxcVar, aoamVar, sxkVar, arrayList);
        slg slgVar = new slg();
        slg.d(slgVar, dheVar, new slh());
        slgVar.a.c = c2 == null ? null : c2.j();
        slgVar.d.set(1);
        slgVar.a.d = this;
        slgVar.d.set(2);
        slgVar.a.e = szfVar;
        slgVar.d.set(3);
        slgVar.a.a = ayqwVar;
        slgVar.d.set(0);
        if (sxkVar != null) {
            slgVar.a.b = sxkVar;
        }
        if (aoamVar.M() != null && !aoamVar.M().equals("deprecated_option_force_clip_bounds")) {
            slgVar.x(aoamVar.M());
        }
        syg b2 = sxcVar.b();
        if (b2 != null && !arrayList.isEmpty()) {
            amru o = amru.o(arrayList);
            int size = o.size();
            for (int i2 = 0; i2 < size; i2++) {
                awpj awpjVar = (awpj) o.get(i2);
                acsd acsdVar = (acsd) b2;
                if (acsdVar.j(awpjVar) && acsdVar.e(awpjVar.d) == null) {
                    acsa d = acsdVar.d(awpjVar);
                    if (acsd.h(awpjVar) && d != null) {
                        awpl awplVar = awpjVar.c;
                        if (awplVar == null) {
                            awplVar = awpl.a;
                        }
                        if ((awplVar.c & 2) != 0 && (c = acsd.c(awpjVar)) != -1) {
                            if (acsdVar.i() && acsd.g(awpjVar)) {
                                asuh asuhVar = acsd.f(awpjVar).e;
                                if (asuhVar == null) {
                                    asuhVar = asuh.b;
                                }
                                apvd apvdVar = asuhVar.h;
                                if (apvdVar == null) {
                                    apvdVar = apvd.a;
                                }
                                i = apvdVar.d;
                            } else {
                                i = awpjVar.d;
                            }
                            acra acraVar = acsdVar.a;
                            awpl awplVar2 = awpjVar.c;
                            if (awplVar2 == null) {
                                awplVar2 = awpl.a;
                            }
                            acraVar.l(awplVar2.d, acsb.c(c), i);
                        }
                        acsa e = acsdVar.e(awpjVar.e);
                        if (e != null) {
                            acsdVar.a.F(d, e);
                        } else {
                            int i3 = acsdVar.c.get(awpjVar.e, -1);
                            if (i3 != -1) {
                                acsdVar.a.F(d, (acsa) acsdVar.b.get(i3));
                            } else {
                                acsa acsaVar = acsdVar.d;
                                if (acsaVar != null) {
                                    acsdVar.a.F(d, acsaVar);
                                } else {
                                    acsdVar.a.D(d);
                                }
                            }
                        }
                    }
                }
            }
        }
        return slgVar.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(1:(1:80)(4:81|82|83|(2:85|(3:87|88|(1:90)(5:91|(1:93)|94|95|96))(6:98|(1:100)|101|(1:109)(1:107)|108|(0)(0)))(4:110|(4:115|(1:117)|118|(0)(0))|88|(0)(0))))|82|83|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0343, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0344, code lost:
    
        r1 = r25.f;
        r2 = r12.T();
        r3 = new java.lang.StringBuilder(65);
        r3.append("ElementsException was thrown in flat while converting ");
        r3.append(r2);
        r1.a(28, r3.toString(), r10, r0);
        r0 = defpackage.drd.a(r26).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0368, code lost:
    
        r1 = defpackage.tab.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x036b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x036c, code lost:
    
        r1 = r25.f;
        r2 = r12.T();
        r3 = new java.lang.StringBuilder(34);
        r3.append("Error while converting ");
        r3.append(r2);
        r1.a(26, r3.toString(), r10, r0);
        r0 = defpackage.drd.a(r26).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x038e, code lost:
    
        r1 = defpackage.tab.a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029a A[Catch: all -> 0x0341, syf -> 0x0343, aoob -> 0x036b, TryCatch #1 {syf -> 0x0343, blocks: (B:83:0x0223, B:85:0x0229, B:91:0x0300, B:93:0x0327, B:94:0x0331, B:98:0x023a, B:100:0x0248, B:101:0x024a, B:103:0x0250, B:105:0x0256, B:107:0x0263, B:108:0x0277, B:110:0x029a, B:112:0x02a0, B:115:0x02b1, B:117:0x02cf, B:118:0x02d4), top: B:82:0x0223, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5 A[Catch: aoob -> 0x01ae, LOOP:0: B:38:0x00f3->B:39:0x00f5, LOOP_END, TryCatch #2 {aoob -> 0x01ae, blocks: (B:29:0x00a1, B:31:0x00be, B:33:0x00cc, B:34:0x00d2, B:37:0x00ec, B:39:0x00f5, B:41:0x0105, B:42:0x0114, B:47:0x011b, B:49:0x0121, B:51:0x012c, B:53:0x0188, B:54:0x019a, B:44:0x01a1, B:56:0x00ea), top: B:28:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a1 A[Catch: aoob -> 0x01ae, TRY_LEAVE, TryCatch #2 {aoob -> 0x01ae, blocks: (B:29:0x00a1, B:31:0x00be, B:33:0x00cc, B:34:0x00d2, B:37:0x00ec, B:39:0x00f5, B:41:0x0105, B:42:0x0114, B:47:0x011b, B:49:0x0121, B:51:0x012c, B:53:0x0188, B:54:0x019a, B:44:0x01a1, B:56:0x00ea), top: B:28:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121 A[Catch: aoob -> 0x01ae, LOOP:2: B:47:0x011b->B:49:0x0121, LOOP_END, TryCatch #2 {aoob -> 0x01ae, blocks: (B:29:0x00a1, B:31:0x00be, B:33:0x00cc, B:34:0x00d2, B:37:0x00ec, B:39:0x00f5, B:41:0x0105, B:42:0x0114, B:47:0x011b, B:49:0x0121, B:51:0x012c, B:53:0x0188, B:54:0x019a, B:44:0x01a1, B:56:0x00ea), top: B:28:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188 A[Catch: aoob -> 0x01ae, TryCatch #2 {aoob -> 0x01ae, blocks: (B:29:0x00a1, B:31:0x00be, B:33:0x00cc, B:34:0x00d2, B:37:0x00ec, B:39:0x00f5, B:41:0x0105, B:42:0x0114, B:47:0x011b, B:49:0x0121, B:51:0x012c, B:53:0x0188, B:54:0x019a, B:44:0x01a1, B:56:0x00ea), top: B:28:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea A[Catch: aoob -> 0x01ae, TryCatch #2 {aoob -> 0x01ae, blocks: (B:29:0x00a1, B:31:0x00be, B:33:0x00cc, B:34:0x00d2, B:37:0x00ec, B:39:0x00f5, B:41:0x0105, B:42:0x0114, B:47:0x011b, B:49:0x0121, B:51:0x012c, B:53:0x0188, B:54:0x019a, B:44:0x01a1, B:56:0x00ea), top: B:28:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0229 A[Catch: all -> 0x0341, syf -> 0x0343, aoob -> 0x036b, TryCatch #1 {syf -> 0x0343, blocks: (B:83:0x0223, B:85:0x0229, B:91:0x0300, B:93:0x0327, B:94:0x0331, B:98:0x023a, B:100:0x0248, B:101:0x024a, B:103:0x0250, B:105:0x0256, B:107:0x0263, B:108:0x0277, B:110:0x029a, B:112:0x02a0, B:115:0x02b1, B:117:0x02cf, B:118:0x02d4), top: B:82:0x0223, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0300 A[Catch: all -> 0x0341, syf -> 0x0343, aoob -> 0x036b, TRY_ENTER, TryCatch #1 {syf -> 0x0343, blocks: (B:83:0x0223, B:85:0x0229, B:91:0x0300, B:93:0x0327, B:94:0x0331, B:98:0x023a, B:100:0x0248, B:101:0x024a, B:103:0x0250, B:105:0x0256, B:107:0x0263, B:108:0x0277, B:110:0x029a, B:112:0x02a0, B:115:0x02b1, B:117:0x02cf, B:118:0x02d4), top: B:82:0x0223, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r3v11, types: [dha] */
    /* JADX WARN: Type inference failed for: r3v7, types: [dha] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dha c(defpackage.dhe r26, defpackage.sxc r27, defpackage.aoam r28, defpackage.sxk r29, java.util.List r30) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sll.c(dhe, sxc, aoam, sxk, java.util.List):dha");
    }
}
