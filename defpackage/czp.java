package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czp extends dcd {
    final int a;
    public Bitmap b;
    private final Handler d;
    private final long e;

    public czp(Handler handler, int i, long j) {
        this.d = handler;
        this.a = i;
        this.e = j;
    }

    @Override // defpackage.dcl
    public final /* bridge */ /* synthetic */ void b(Object obj, dcs dcsVar) {
        this.b = (Bitmap) obj;
        this.d.sendMessageAtTime(this.d.obtainMessage(1, this), this.e);
    }

    @Override // defpackage.dcl
    public final void jZ(Drawable drawable) {
        this.b = null;
    }
}
