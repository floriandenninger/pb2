package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fpg extends ajjh {
    final /* synthetic */ awpi a;
    final /* synthetic */ Context b;
    final /* synthetic */ sww c;
    final /* synthetic */ awpf d;

    public fpg(awpi awpiVar, Context context, sww swwVar, awpf awpfVar) {
        this.a = awpiVar;
        this.b = context;
        this.c = swwVar;
        this.d = awpfVar;
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void b(ImageView imageView) {
        if (imageView instanceof fpl) {
            ((fpl) imageView).b();
        }
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void c(ImageView imageView) {
        if (imageView instanceof fpl) {
            awpi awpiVar = this.a;
            if ((awpiVar.c & 8) != 0) {
                awpf awpfVar = awpiVar.g;
                if (awpfVar == null) {
                    awpfVar = awpf.a;
                }
                fpl fplVar = (fpl) imageView;
                int y = awxr.y(awpfVar.d);
                if (y == 0) {
                    y = 1;
                }
                fplVar.r = y;
                ahbn.l(awpfVar, imageView, this.b, this.c);
            }
            fpl fplVar2 = (fpl) imageView;
            int y2 = awxr.y(this.d.d);
            fplVar2.r = y2 != 0 ? y2 : 1;
        }
    }
}
