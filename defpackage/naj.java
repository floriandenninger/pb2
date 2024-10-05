package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class naj implements ajoq {
    private final Context a;
    private final ajjz b;
    private final aahd c;
    private final ajuw d;
    private final wyz e;
    private final tdv f;
    private final wzq g;
    private final euv h;

    public naj(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar) {
        this.a = context;
        ajjzVar.getClass();
        this.b = ajjzVar;
        aahdVar.getClass();
        this.c = aahdVar;
        this.d = ajuwVar;
        wyzVar.getClass();
        this.e = wyzVar;
        tdvVar.getClass();
        this.f = tdvVar;
        wzqVar.getClass();
        this.g = wzqVar;
        euvVar.getClass();
        this.h = euvVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new nak(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, viewGroup);
    }
}
