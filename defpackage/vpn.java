package defpackage;

import android.widget.TableLayout;
import android.widget.TableRow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vpn {
    public final TableLayout a;
    public final int b;

    public vpn(TableLayout tableLayout, int i) {
        this.a = tableLayout;
        this.b = i;
    }

    public static TableRow.LayoutParams a() {
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams();
        layoutParams.width = 0;
        layoutParams.weight = 1.0f;
        return layoutParams;
    }
}
