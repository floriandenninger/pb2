package com.google.android.apps.youtube.app.watch.nextgenwatch.flexy;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FoldableStatesMonitor;
import defpackage.aloh;
import defpackage.any;
import defpackage.aok;
import defpackage.aypn;
import defpackage.ayqw;
import defpackage.ayro;
import defpackage.ayrs;
import defpackage.nua;
import defpackage.nxb;
import defpackage.nyk;
import defpackage.nzc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FoldableStatesMonitor implements any {
    public final nzc a;
    private final aypn b;
    private final ayqw c;
    private final aloh d;

    public FoldableStatesMonitor(Context context, nyk nykVar, aypn aypnVar, nzc nzcVar) {
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        final byte[] bArr3 = null;
        final byte[] bArr4 = null;
        final aloh alohVar = new aloh(context, null, null, null, null);
        this.d = alohVar;
        this.a = nzcVar;
        final byte[] bArr5 = null;
        this.b = aypn.e(nykVar.b.n(), aypnVar.A(nxb.q).n(), new ayro(bArr, bArr2, bArr3, bArr4, bArr5) { // from class: nzf
            @Override // defpackage.ayro
            public final Object a(Object obj, Object obj2) {
                aloh alohVar2 = aloh.this;
                int intValue = ((Integer) obj).intValue();
                Rect rect = (Rect) obj2;
                return Float.valueOf(intValue > 0 ? ((((Integer) yjk.S(alohVar2.a).first).intValue() - rect.left) - rect.right) / intValue : -1.0f);
            }
        }).n().J().ah().sk();
        this.c = new ayqw();
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.c.c();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.c.d(this.b.Y(new ayrs() { // from class: nzg
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                FoldableStatesMonitor foldableStatesMonitor = FoldableStatesMonitor.this;
                float floatValue = ((Float) obj).floatValue();
                if (floatValue >= 0.0f) {
                    foldableStatesMonitor.a.h(new nyv(5, floatValue, floatValue));
                } else if (foldableStatesMonitor.a.f(5) != null) {
                    foldableStatesMonitor.a.g(0, false);
                }
            }
        }, nua.h));
    }
}
