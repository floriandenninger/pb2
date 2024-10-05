package defpackage;

import android.os.Handler;
import java.io.File;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iam {
    public final Handler a;
    public final ida b;
    public final hzu c;
    public final hyh d;
    public final ibe e;
    public final ibw f;
    public final hza g;
    public final icg h;
    public boolean i;
    public ce j;

    public iam(Handler handler, ida idaVar, hzu hzuVar, hyh hyhVar, ibe ibeVar, ibw ibwVar, hza hzaVar, icg icgVar) {
        this.a = handler;
        this.b = idaVar;
        this.c = hzuVar;
        this.d = hyhVar;
        this.e = ibeVar;
        this.f = ibwVar;
        this.g = hzaVar;
        this.h = icgVar;
    }

    public static Object a(List list, Object obj) {
        return list.get((list.indexOf(obj) + 1) % list.size());
    }

    public final void b(String str) {
        new ial(new File(new File(this.j.C().getFilesDir(), zoz.a), str), str).execute(new Void[0]);
    }
}
