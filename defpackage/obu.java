package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class obu {
    public final View a;
    public final int b;
    public final int c;
    public final obx d;
    public obt e;
    public final oeu f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public obu(android.view.View r13, int r14, int r15, defpackage.obp r16, defpackage.obp r17, defpackage.oeu r18, defpackage.aypn r19, defpackage.aaea r20) {
        /*
            r12 = this;
            obp r3 = defpackage.obk.b(r16)
            obp r5 = defpackage.obk.b(r17)
            zgd r0 = defpackage.odd.a
            java.lang.Object r0 = r0.get()
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            r1 = r14 | r15
            java.lang.Object r0 = r0.get(r1)
            ocw r0 = (defpackage.ocw) r0
            if (r0 == 0) goto L33
            r1 = r13
            r2 = r14
            r4 = r15
            r6 = r19
            r7 = r20
            obx r10 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            r10.a(r0)
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r11 = r18
            r6.<init>(r7, r8, r9, r10, r11)
            return
        L33:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported transition."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obu.<init>(android.view.View, int, int, obp, obp, oeu, aypn, aaea):void");
    }

    public final int a(int i) {
        int centerX;
        int centerX2;
        obx obxVar = this.d;
        Rect t = ((obw) obxVar.a.get(0)).a.t();
        Rect t2 = ((obw) obxVar.a.get(r0.size() - 1)).a.t();
        if (i == 1) {
            centerX = t.centerY();
            centerX2 = t2.centerY();
        } else {
            centerX = t.centerX();
            centerX2 = t2.centerX();
        }
        return centerX2 - centerX;
    }

    public final void b() {
        obt obtVar = this.e;
        if (obtVar == null) {
            return;
        }
        obtVar.b = true;
        obtVar.a.cancel();
        this.e = null;
    }

    public final void c() {
        b();
        obv obvVar = this.d.b;
        if (obvVar != null) {
            obvVar.a();
        }
    }

    public final void d(float f) {
        obx obxVar = this.d;
        if (f == obxVar.c) {
            return;
        }
        obxVar.a(f);
        oeu oeuVar = this.f;
        if (oeuVar != null) {
            oeuVar.b(this.b, this.c, f);
        }
    }

    public final boolean e() {
        return this.e != null;
    }

    public final void f(float f, oej oejVar) {
        int integer;
        if (e()) {
            return;
        }
        int i = this.b;
        int i2 = this.c;
        boolean z = false;
        if ((odd.a(i) == 2 && odd.a(i2) == 1) || (odd.a(i) == 1 && odd.a(i2) == 2)) {
            z = true;
        }
        if (this.b != 128 || this.c != 2) {
            integer = this.a.getContext().getResources().getInteger(true != z ? R.integer.next_gen_watch_transition_animation_duration_ms : R.integer.next_gen_watch_min_max_transition_animation_duration_ms);
        } else {
            integer = this.a.getContext().getResources().getInteger(R.integer.next_gen_watch_down_and_out_transition_animation_duration_ms);
        }
        obt obtVar = new obt(this, (int) (integer * (1.0f - f)), f, oejVar);
        this.e = obtVar;
        obtVar.a.addListener(obtVar);
        obtVar.a.addUpdateListener(obtVar);
        this.e.a.start();
    }

    public obu(View view, int i, int i2, obx obxVar, oeu oeuVar) {
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = obxVar;
        this.f = oeuVar;
        obxVar.a(0.0f);
    }
}
