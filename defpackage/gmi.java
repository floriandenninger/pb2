package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gmi extends ajvm {
    private static final Class[] a = {avgq.class, frf.class};
    private final ajos b;
    private final Context c;

    public gmi(int i, ajos ajosVar, Context context) {
        super(i);
        ajosVar.getClass();
        this.b = ajosVar;
        this.c = context;
    }

    @Override // defpackage.ajvm, defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        Object obj;
        boolean z = false;
        if (b(ajngVar, i)) {
            ajos ajosVar = this.b;
            Object c = ajngVar.c(i);
            int i2 = i + 1;
            while (true) {
                if (i2 >= ajngVar.a()) {
                    obj = null;
                    break;
                } else {
                    if (ajosVar.c(ajngVar.c(i2)) != -1) {
                        obj = ajngVar.c(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (obj != null) {
                if (!yjk.aa(this.c) || !(c instanceof ajul) || !(obj instanceof ausu)) {
                    Class<?> cls = obj.getClass();
                    Class[] clsArr = a;
                    for (int i3 = 0; i3 < 2; i3++) {
                        if (amkq.b(cls, clsArr[i3])) {
                            break;
                        }
                    }
                }
            }
            z = true;
        }
        ajokVar.f("showLineSeparator", Boolean.valueOf(z));
    }
}
