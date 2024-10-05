package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cww implements cvz {
    private final Context a;
    private final cvz b;
    private final cvz c;
    private final Class d;

    public cww(Context context, cvz cvzVar, cvz cvzVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = cvzVar;
        this.c = cvzVar2;
        this.d = cls;
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ cvy a(Object obj, int i, int i2, cqn cqnVar) {
        Uri uri = (Uri) obj;
        return new cvy(new dcz(uri), new cwv(this.a, this.b, this.c, uri, i, i2, cqnVar, this.d));
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && gm.t((Uri) obj);
    }
}
