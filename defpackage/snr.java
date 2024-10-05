package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class snr {
    public static final clv a = new clv(-1.0f, 1.0f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LottieAnimationView a(Context context) {
        return new LottieAnimationView(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(dim dimVar, dim dimVar2) {
        boolean equals;
        boolean c = szz.c((aoam) dimVar.a, (aoam) dimVar.b);
        Object obj = dimVar2.a;
        Object obj2 = dimVar2.b;
        if (obj == null && obj2 == null) {
            equals = true;
        } else {
            equals = (obj == null || obj2 == null) ? false : obj.equals(obj2);
        }
        return (c && equals) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(defpackage.dhe r7, final com.airbnb.lottie.LottieAnimationView r8, defpackage.cgf r9, final defpackage.sww r10, final defpackage.sxc r11, defpackage.sod r12, defpackage.axog r13, final defpackage.szx r14, final defpackage.szx r15) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.snr.c(dhe, com.airbnb.lottie.LottieAnimationView, cgf, sww, sxc, sod, axog, szx, szx):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(LottieAnimationView lottieAnimationView, sod sodVar) {
        lottieAnimationView.clearAnimation();
        lottieAnimationView.k(0.0f);
        lottieAnimationView.d();
        lottieAnimationView.d.b.removeAllListeners();
        if (sodVar != null) {
            sodVar.a.remove(lottieAnimationView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(dhe dheVar, axog axogVar, baql baqlVar) {
        if (axogVar.aK() == null) {
            return;
        }
        if (axogVar.aK().l() != null) {
            baqlVar.a = cfq.e(axogVar.aK().l(), axogVar.aK().l());
        } else if (axogVar.aK().m() != null) {
            cfq.l(dheVar.a(), axogVar.aK().m());
        }
    }
}
