package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amc extends alm {
    public amc(Context context, aiy aiyVar) {
        super(new ama(context, aiyVar));
    }

    public final void c(amb ambVar) {
        alp alpVar = this.a;
        synchronized (((ama) alpVar).a) {
            ((ama) alpVar).d = ambVar;
        }
    }
}
