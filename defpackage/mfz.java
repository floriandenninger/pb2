package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfz implements ajoq {
    private final Context a;
    private final aahd b;
    private final ajjz c;
    private final ajuw d;
    private final /* synthetic */ int e;

    public mfz(Context context, aahd aahdVar, ajjz ajjzVar, ajuw ajuwVar, int i) {
        this.e = i;
        this.a = context;
        this.b = aahdVar;
        this.c = ajjzVar;
        this.d = ajuwVar;
    }

    @Override // defpackage.ajoq
    public final /* synthetic */ ajom b(ViewGroup viewGroup) {
        int i = this.e;
        if (i != 0) {
            return i != 1 ? new mgd(this.a, this.b, this.c, this.d, viewGroup) : new mfv(this.a, this.b, this.c, this.d, viewGroup);
        }
        return new mga(this.a, this.b, this.c, this.d, viewGroup);
    }
}
