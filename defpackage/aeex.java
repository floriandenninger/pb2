package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeex {
    public static final aeex a = new aeex(-1, -1);
    public final int b;
    public final int c;
    public final int d;

    public aeex(int i, int i2) {
        this(i, i2, 0);
    }

    public final int a(int i) {
        if (this.b < i || i < this.c) {
            return i < this.c ? -1 : 1;
        }
        return 0;
    }

    public final List b(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
            int a2 = a(formatStreamModel.f());
            if (a2 == -1) {
                arrayList2.add(formatStreamModel);
            } else if (a2 != 0) {
                arrayList3.add(formatStreamModel);
            } else {
                arrayList.add(formatStreamModel);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        if (!arrayList3.isEmpty()) {
            FormatStreamModel formatStreamModel2 = (FormatStreamModel) arrayList3.get(0);
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                FormatStreamModel formatStreamModel3 = (FormatStreamModel) arrayList3.get(i);
                if (formatStreamModel3.f() < formatStreamModel2.f()) {
                    formatStreamModel2 = formatStreamModel3;
                }
            }
            arrayList.add(formatStreamModel2);
        }
        return arrayList;
    }

    public final boolean c() {
        return this.d == 2;
    }

    public final boolean d() {
        return this.d == 1;
    }

    public final boolean e() {
        return this.d == 3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aeex)) {
            return false;
        }
        aeex aeexVar = (aeex) obj;
        return this.b == aeexVar.b && this.c == aeexVar.c;
    }

    public final int hashCode() {
        return (this.b + 527) * 31 * this.c;
    }

    public aeex(int i, int i2, int i3) {
        afki.b(i >= i2);
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
