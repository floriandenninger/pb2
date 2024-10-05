package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alih implements iw {
    final /* synthetic */ alij a;
    final /* synthetic */ alfy b;

    public alih(alfy alfyVar, alij alijVar) {
        this.b = alfyVar;
        this.a = alijVar;
    }

    @Override // defpackage.iw
    public final ko a(View view, ko koVar) {
        alfy alfyVar = this.b;
        alij alijVar = new alij(this.a);
        alfyVar.b.j = koVar.f();
        int e = jw.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = alfyVar.b;
        if (bottomSheetBehavior.f) {
            bottomSheetBehavior.i = koVar.c();
            paddingBottom = alijVar.d + alfyVar.b.i;
        }
        if (alfyVar.b.g) {
            paddingLeft = (e == 1 ? alijVar.c : alijVar.a) + koVar.d();
        }
        if (alfyVar.b.h) {
            paddingRight = (e == 1 ? alijVar.a : alijVar.c) + koVar.e();
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (alfyVar.a) {
            alfyVar.b.e = koVar.h().e;
        }
        BottomSheetBehavior bottomSheetBehavior2 = alfyVar.b;
        if (bottomSheetBehavior2.f || alfyVar.a) {
            bottomSheetBehavior2.L();
        }
        return koVar;
    }
}
