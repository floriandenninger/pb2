package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abor extends ll {
    public aboq a;
    public int b;
    private final ajvb c;
    private final abgk d;
    private final ViewGroup e;
    private final View f;
    private int g;
    private final aboo h = new aboo(this);

    public abor(ajvb ajvbVar, abgk abgkVar, View view) {
        view.getClass();
        this.f = view;
        ajvbVar.getClass();
        this.c = ajvbVar;
        abgkVar.getClass();
        this.d = abgkVar;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.docked_view_container);
        this.e = viewGroup;
        viewGroup.setClipToOutline(true);
        this.g = view.getHeight();
        this.b = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11, types: [ajos, java.lang.Object] */
    @Override // defpackage.ll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.graphics.Canvas r9, android.support.v7.widget.RecyclerView r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abor.f(android.graphics.Canvas, android.support.v7.widget.RecyclerView):void");
    }

    public final void h() {
        this.a = null;
        this.e.removeAllViews();
        this.e.setVisibility(8);
        this.e.setTranslationY(0.0f);
    }
}
