package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class puk extends ViewGroup {
    public final pxs a;

    /* JADX INFO: Access modifiers changed from: protected */
    public puk(Context context) {
        super(context);
        this.a = new pxs(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            android.view.View r1 = r7.getChildAt(r0)
            if (r1 == 0) goto L1c
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto L1c
            r7.measureChild(r1, r8, r9)
            int r0 = r1.getMeasuredWidth()
            int r1 = r1.getMeasuredHeight()
            goto L97
        L1c:
            r1 = 0
            pxs r2 = r7.a     // Catch: java.lang.NullPointerException -> L41
            pwt r3 = r2.f     // Catch: android.os.RemoteException -> L34 java.lang.NullPointerException -> L41
            if (r3 == 0) goto L3a
            com.google.android.gms.ads.internal.client.AdSizeParcel r3 = r3.a()     // Catch: android.os.RemoteException -> L34 java.lang.NullPointerException -> L41
            if (r3 == 0) goto L3a
            int r4 = r3.e     // Catch: android.os.RemoteException -> L34 java.lang.NullPointerException -> L41
            int r5 = r3.b     // Catch: android.os.RemoteException -> L34 java.lang.NullPointerException -> L41
            java.lang.String r3 = r3.a     // Catch: android.os.RemoteException -> L34 java.lang.NullPointerException -> L41
            puh r1 = defpackage.pse.n(r4, r5, r3)     // Catch: android.os.RemoteException -> L34 java.lang.NullPointerException -> L41
            goto L47
        L34:
            r3 = move-exception
            java.lang.String r4 = "#007 Could not call remote method."
            defpackage.qbi.i(r4, r3)     // Catch: java.lang.NullPointerException -> L41
        L3a:
            puh[] r2 = r2.e     // Catch: java.lang.NullPointerException -> L41
            if (r2 == 0) goto L47
            r1 = r2[r0]     // Catch: java.lang.NullPointerException -> L41
            goto L47
        L41:
            r2 = move-exception
            java.lang.String r3 = "Unable to retrieve ad size."
            defpackage.qbi.e(r3, r2)
        L47:
            if (r1 == 0) goto L96
            android.content.Context r0 = r7.getContext()
            int r2 = r1.c
            r3 = -3
            r4 = -1
            if (r2 == r3) goto L6a
            if (r2 == r4) goto L5f
            defpackage.pvy.c()
            int r2 = r1.c
            int r2 = defpackage.qbg.g(r0, r2)
            goto L6b
        L5f:
            android.content.res.Resources r2 = r0.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            goto L6b
        L6a:
            r2 = -1
        L6b:
            int r5 = r1.d
            r6 = -4
            if (r5 == r6) goto L92
            if (r5 == r3) goto L92
            r3 = -2
            if (r5 == r3) goto L7f
            defpackage.pvy.c()
            int r1 = r1.d
            int r0 = defpackage.qbg.g(r0, r1)
            goto L93
        L7f:
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = com.google.android.gms.ads.internal.client.AdSizeParcel.a(r0)
            float r1 = (float) r1
            float r0 = r0.density
            float r1 = r1 * r0
            int r0 = (int) r1
            goto L93
        L92:
            r0 = -1
        L93:
            r1 = r0
            r0 = r2
            goto L97
        L96:
            r1 = 0
        L97:
            int r2 = r7.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r7.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r1, r2)
            int r8 = android.view.View.resolveSize(r0, r8)
            int r9 = android.view.View.resolveSize(r1, r9)
            r7.setMeasuredDimension(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puk.onMeasure(int, int):void");
    }
}
