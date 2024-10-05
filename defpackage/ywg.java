package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ywg implements ywh {
    private final Context b;

    public ywg(Context context) {
        this.b = context;
    }

    @Override // defpackage.ywh
    public final boolean a(atub... atubVarArr) {
        for (atub atubVar : atubVarArr) {
            amrz amrzVar = a;
            atua b = atua.b(atubVar.c);
            if (b == null) {
                b = atua.INVALID;
            }
            String str = (String) amrzVar.get(b);
            if (str != null) {
                if (aih.c(this.b, str) != 0) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("Unsupported Permission Type");
            }
        }
        return true;
    }
}
