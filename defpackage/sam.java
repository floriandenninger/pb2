package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sam implements sap {
    private final /* synthetic */ int a;

    public sam(int i) {
        this.a = i;
    }

    @Override // defpackage.sap
    public final void a(Paint paint) {
        if (this.a != 0) {
            paint.setStyle(Paint.Style.FILL);
        } else {
            paint.setStyle(Paint.Style.STROKE);
        }
    }
}
