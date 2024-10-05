package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czh implements cqp {
    private final /* synthetic */ int a;

    public czh(int i) {
        this.a = i;
    }

    @Override // defpackage.cqp
    public final /* synthetic */ boolean b(Object obj, cqn cqnVar) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            return true;
        }
        return true;
    }

    @Override // defpackage.cqp
    public final /* synthetic */ ctd a(Object obj, int i, int i2, cqn cqnVar) {
        int i3 = this.a;
        if (i3 == 0) {
            return czf.g((Drawable) obj);
        }
        if (i3 == 1) {
            return new cyt((Bitmap) obj);
        }
        return new cxb((File) obj);
    }
}
