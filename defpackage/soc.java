package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class soc {
    public static final /* synthetic */ int a = 0;
    private static final String b = "soc";
    private static final AtomicInteger c = new AtomicInteger(1);

    public static void a(RecyclerView recyclerView, sww swwVar, awnw awnwVar, swt swtVar, syb sybVar, sxs sxsVar) {
        sws a2 = swu.a();
        a2.a = recyclerView;
        a2.h = sybVar;
        a2.f = sxsVar;
        swwVar.b(awnwVar, swtVar.a(a2).a()).Q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r15 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x032e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dha b(defpackage.dhe r27, defpackage.sxt r28, defpackage.sxk r29, defpackage.ayqw r30, defpackage.sxc r31, defpackage.axol r32, java.util.List r33, defpackage.sww r34, defpackage.dsz r35, java.util.concurrent.atomic.AtomicBoolean r36, defpackage.syu r37, boolean r38, java.util.concurrent.atomic.AtomicReference r39, defpackage.szx r40, defpackage.szx r41, defpackage.szx r42, defpackage.sod r43, defpackage.swt r44, defpackage.taq r45) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.soc.b(dhe, sxt, sxk, ayqw, sxc, axol, java.util.List, sww, dsz, java.util.concurrent.atomic.AtomicBoolean, syu, boolean, java.util.concurrent.atomic.AtomicReference, szx, szx, szx, sod, swt, taq):dha");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(String str, dsz dszVar, AtomicBoolean atomicBoolean) {
        dsz dszVar2;
        if (str != null && dszVar != null && (dszVar2 = (dsz) stk.a.put(str, dszVar)) != null) {
            stk.b.remove(dszVar2.a());
        }
        atomicBoolean.set(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(String str, dsz dszVar) {
        dsz dszVar2;
        if (str == null || (dszVar2 = (dsz) stk.a.get(str)) == null || dszVar2 != dszVar) {
            return;
        }
        stk.a.remove(str);
        stk.b.remove(dszVar2.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(axol axolVar, AtomicReference atomicReference, dsz dszVar, AtomicBoolean atomicBoolean) {
        RecyclerView a2;
        if (atomicReference == null || atomicReference.get() == null) {
            return;
        }
        if (!atomicBoolean.getAndSet(false) || (a2 = dszVar.a()) == null) {
            return;
        }
        int aI = axolVar.aI();
        ((syu) atomicReference.get()).b(a2, aI == 1 ? a2.getWidth() : 0, aI != 1 ? a2.getHeight() : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(dhe dheVar, azrw azrwVar, axou axouVar, axol axolVar, baql baqlVar, baql baqlVar2, baql baqlVar3, baql baqlVar4, baql baqlVar5, baql baqlVar6) {
        int b2;
        dsz dszVar = new dsz(null);
        baqlVar.a = dszVar;
        baqlVar5.a = new sob(axolVar, dheVar.b, dszVar);
        baqlVar4.a = new AtomicBoolean(false);
        if (azrwVar != null) {
            baqlVar2.a = (syu) azrwVar.get();
        }
        baqlVar3.a = new AtomicBoolean(true);
        if (axouVar == null || (b2 = axouVar.b(4)) == 0 || axouVar.b.get(b2 + axouVar.a) == 0) {
            return;
        }
        baqlVar6.a = new taq();
    }
}
