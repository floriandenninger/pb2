package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajia extends ajjh {
    private final Context a;
    private final aoam b;
    private final aoam c;

    public ajia(Context context, aoam aoamVar, aoam aoamVar2) {
        this.a = context;
        this.b = aoamVar;
        this.c = aoamVar2;
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void a(ImageView imageView) {
        aoam aoamVar = this.c;
        if (aoamVar != null) {
            ahbn.m(aoamVar, imageView, this.a);
        }
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void c(ImageView imageView) {
        aoam aoamVar = this.b;
        if (aoamVar != null) {
            ahbn.m(aoamVar, imageView, this.a);
        }
    }
}
