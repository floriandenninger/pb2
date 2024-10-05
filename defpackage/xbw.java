package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xbw implements afxe {
    private Integer a;
    private Integer b;
    private View c;

    public xbw() {
    }

    public xbw(View view) {
        this.c = view;
    }

    public xbw(View view, byte[] bArr) {
        this.c = view;
        view.setOnTouchListener(new xbv(this, view.getResources().getDisplayMetrics().density));
    }

    @Override // defpackage.afxe
    public final String a(Uri uri, String str) {
        Integer num;
        if (str == null || (num = (Integer) xbr.a.get(str)) == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 66) {
            View view = this.c;
            if (view == null) {
                return null;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = this.c.getMeasuredHeight();
            float f = this.c.getResources().getDisplayMetrics().density;
            return String.format(Locale.US, "%dx%d", Integer.valueOf((int) (measuredWidth / f)), Integer.valueOf((int) (measuredHeight / f)));
        }
        if (intValue == 68) {
            if (this.a != null) {
                return String.format(Locale.US, "%d", this.a);
            }
            return null;
        }
        if (intValue == 69 && this.b != null) {
            return String.format(Locale.US, "%d", this.b);
        }
        return null;
    }

    @Override // defpackage.afxe
    public final String b() {
        return "xbw";
    }

    public final void c() {
        this.a = null;
        this.b = null;
    }

    public final void d(int i, int i2) {
        this.a = Integer.valueOf(i);
        this.b = Integer.valueOf(i2);
    }
}
