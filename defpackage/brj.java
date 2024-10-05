package defpackage;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.Collections;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brj {
    static final bsc f = new bsc();
    public final List a;
    public final List b;
    public final bri e;
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final aeg c = new aeg();

    public brj(List list, List list2) {
        this.a = list;
        this.b = list2;
        int size = list.size();
        int i = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        bri briVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            bri briVar2 = (bri) this.a.get(i2);
            int i3 = briVar2.b;
            briVar = i3 > i ? briVar2 : briVar;
            if (i3 > i) {
                i = i3;
            }
        }
        this.e = briVar;
    }

    public static brg b(Bitmap bitmap) {
        return new brg(bitmap);
    }

    public final int a(int i) {
        bri briVar = this.e;
        return briVar != null ? briVar.a : i;
    }

    public final bri c(brk brkVar) {
        return (bri) this.c.get(brkVar);
    }

    public final List d() {
        return Collections.unmodifiableList(this.a);
    }
}
