package defpackage;

import android.text.SpannableString;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class srf {
    public static final /* synthetic */ int a = 0;
    private static final Map b = DesugarCollections.synchronizedMap(new HashMap());
    private static final Map c = DesugarCollections.synchronizedMap(new HashMap());

    static void a(SpannableString spannableString, Object obj, int i, int i2) {
        int min = i < 0 ? 0 : Math.min(i, spannableString.length());
        int length = i2 <= 0 ? spannableString.length() : Math.min(i2 + min, spannableString.length());
        if (min == length) {
            return;
        }
        spannableString.setSpan(obj, min, length, 18);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(sxi sxiVar, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, AtomicReference atomicReference4) {
        sxiVar.a();
        atomicReference.lazySet(null);
        atomicReference2.lazySet(null);
        atomicReference3.lazySet(null);
        atomicReference4.lazySet(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:300:0x05be, code lost:
    
        if (r0 < 0) goto L253;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:? -> B:114:0x01ec). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.CharSequence c(defpackage.sxc r31, defpackage.dhe r32, defpackage.axoh r33, defpackage.sww r34, final defpackage.szl r35, defpackage.syd r36, java.util.Map r37, defpackage.sxi r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.srf.c(sxc, dhe, axoh, sww, szl, syd, java.util.Map, sxi, boolean, boolean):java.lang.CharSequence");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence d(sxc sxcVar, dhe dheVar, axoh axohVar, sww swwVar, szl szlVar, syd sydVar, Map map) {
        return c(sxcVar, dheVar, axohVar, swwVar, szlVar, sydVar, map, sxi.a, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0210, code lost:
    
        r6.a.U = new defpackage.sqf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020e, code lost:
    
        if (r0.aP() > 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dha e(defpackage.dhe r13, defpackage.axpe r14, defpackage.sww r15, defpackage.szl r16, defpackage.syd r17, defpackage.sxc r18, java.util.Map r19, defpackage.sxi r20, boolean r21, boolean r22, java.lang.Boolean r23, java.util.concurrent.atomic.AtomicReference r24, java.util.concurrent.atomic.AtomicReference r25, java.util.concurrent.atomic.AtomicReference r26, java.util.concurrent.atomic.AtomicReference r27) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.srf.e(dhe, axpe, sww, szl, syd, sxc, java.util.Map, sxi, boolean, boolean, java.lang.Boolean, java.util.concurrent.atomic.AtomicReference, java.util.concurrent.atomic.AtomicReference, java.util.concurrent.atomic.AtomicReference, java.util.concurrent.atomic.AtomicReference):dha");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(dhe dheVar, axpe axpeVar, sww swwVar, szl szlVar, sxc sxcVar, syd sydVar, Map map, sxi sxiVar, boolean z, boolean z2, baql baqlVar, baql baqlVar2, baql baqlVar3, baql baqlVar4) {
        baqlVar.a = new AtomicReference(axpeVar.aK());
        baqlVar2.a = new AtomicReference(axpeVar.aL());
        baqlVar3.a = new AtomicReference(c(sxcVar, dheVar, szz.b(axpeVar.aK()), swwVar, szlVar, sydVar, map, sxiVar, z, z2));
        baqlVar4.a = new AtomicReference(c(sxcVar, dheVar, szz.b(axpeVar.aL()), swwVar, szlVar, sydVar, map, sxiVar, z, z2));
    }
}
