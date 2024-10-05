package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alko extends alku {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public alko(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.alku
    public final void a(Matrix matrix, aljy aljyVar, int i, Canvas canvas) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((alku) it.next()).a(this.b, aljyVar, i, canvas);
        }
    }
}
