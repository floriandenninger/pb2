package defpackage;

import android.view.View;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ptv {
    public int e;
    public int f;
    public int g;
    public int h;
    int i;
    float j;
    float k;
    public int l;
    int m;
    public int o;
    public int p;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    public int d = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    final List n = new ArrayList();

    public final int a() {
        return this.h - this.i;
    }

    public final void b(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - flexItem.g()) - i);
        this.b = Math.min(this.b, (view.getTop() - flexItem.i()) - i2);
        this.c = Math.max(this.c, view.getRight() + flexItem.h() + i3);
        this.d = Math.max(this.d, view.getBottom() + flexItem.f() + i4);
    }
}
