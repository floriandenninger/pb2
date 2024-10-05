package defpackage;

import android.graphics.Color;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ryu {
    public int b = 0;
    public Map c = rwh.t();
    public final int[] a = new int[8];

    public ryu(String[] strArr) {
        for (int i = 0; i < 8; i++) {
            this.a[i] = Color.parseColor(strArr[i]);
        }
    }
}
