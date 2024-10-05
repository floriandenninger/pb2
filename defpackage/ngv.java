package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ngv extends nck {
    private apxf l;
    private long m;

    public ngv(Context context, aahd aahdVar, wzq wzqVar, wyz wyzVar, tdv tdvVar, euv euvVar, View view, View view2, View view3, View view4, View view5) {
        super(context, aahdVar, wzqVar, wyzVar, tdvVar, euvVar, view, view2, view3, view5, view4, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nck
    public final void k(View view, View view2) {
        long j = this.m;
        float f = 0.0f;
        float f2 = (j < 0 || j >= 50) ? 0.0f : ((float) j) / 100.0f;
        int measuredWidth = view2.getMeasuredWidth();
        if (measuredWidth <= 0) {
            measuredWidth = 1000;
        }
        int i = (int) (f2 * measuredWidth);
        long j2 = this.m;
        if (j2 >= 0 && j2 < 50) {
            f = ((float) j2) / 100.0f;
        }
        int i2 = (int) (f * (view2.getMeasuredHeight() > 0 ? r1 : 1000));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.width = view2.getMeasuredWidth() - (i + i);
        marginLayoutParams.height = view2.getMeasuredHeight() - (i2 + i2);
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = i2;
        view.requestLayout();
    }

    @Override // defpackage.nck
    public final void l(View view, MotionEvent motionEvent, List list, boolean z) {
        q(this.l);
    }

    @Override // defpackage.nck
    public final void m(View view, MotionEvent motionEvent, List list) {
    }

    @Override // defpackage.nck
    public final void n(List list) {
    }

    @Override // defpackage.nck
    public final void o() {
    }

    @Override // defpackage.nck
    protected final boolean s() {
        return this.m == 0;
    }

    public final void w(acra acraVar, Object obj, String str, List list, apxf apxfVar, long j, long j2, aoxy aoxyVar, byte[] bArr) {
        this.l = apxfVar;
        this.m = j;
        super.p(acraVar, obj, str, list, j2, aoxyVar, bArr);
    }
}
