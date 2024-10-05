package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class scv {
    public final amru a;
    public final Size b;

    public scv(amru amruVar, Size size) {
        this.a = amruVar;
        this.b = size;
    }

    public static Size a(Size size, int i) {
        return (i == 0 || i == 2) ? new Size(size.getHeight(), size.getWidth()) : size;
    }
}
