package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajnt implements ajoq {
    public final Context a;
    public final amnv b;
    public final ajos c;

    public ajnt(Context context, amnv amnvVar, ajos ajosVar) {
        context.getClass();
        this.a = context;
        amnvVar.getClass();
        this.b = amnvVar;
        this.c = ajosVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new ajnk(this.a, (ajop) this.b.get(), this.c);
    }
}
