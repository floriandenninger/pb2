package defpackage;

import android.os.Build;
import androidx.work.OverwritingInputMerger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byz extends bzi {
    public byz(Class cls) {
        super(cls);
        this.c.e = OverwritingInputMerger.class.getName();
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bzj a() {
        if (!this.a || Build.VERSION.SDK_INT < 23 || !this.c.k.c) {
            return new bzj(this.b, this.c, this.d);
        }
        throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
    }
}
