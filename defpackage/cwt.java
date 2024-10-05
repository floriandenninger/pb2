package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwt implements cvz {
    private final Context a;
    private final /* synthetic */ int b;

    public cwt(Context context, int i) {
        this.b = i;
        this.a = context.getApplicationContext();
    }

    public cwt(Context context, int i, byte[] bArr) {
        this.b = i;
        this.a = context;
    }

    public cwt(Context context, int i, char[] cArr) {
        this.b = i;
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.cvz
    public final /* synthetic */ boolean b(Object obj) {
        int i = this.b;
        if (i == 0) {
            Uri uri = (Uri) obj;
            return gm.t(uri) && !gm.v(uri);
        }
        if (i == 1) {
            return gm.t((Uri) obj);
        }
        Uri uri2 = (Uri) obj;
        return gm.t(uri2) && gm.v(uri2);
    }

    @Override // defpackage.cvz
    public final /* synthetic */ cvy a(Object obj, int i, int i2, cqn cqnVar) {
        Long l;
        int i3 = this.b;
        if (i3 == 0) {
            Uri uri = (Uri) obj;
            if (!gm.u(i, i2)) {
                return null;
            }
            dcz dczVar = new dcz(uri);
            Context context = this.a;
            return new cvy(dczVar, crp.f(context, uri, new crn(context.getContentResolver())));
        }
        if (i3 == 1) {
            Uri uri2 = (Uri) obj;
            return new cvy(new dcz(uri2), new cvt(this.a, uri2));
        }
        Uri uri3 = (Uri) obj;
        if (!gm.u(i, i2) || (l = (Long) cqnVar.b(cyz.a)) == null || l.longValue() != -1) {
            return null;
        }
        dcz dczVar2 = new dcz(uri3);
        Context context2 = this.a;
        return new cvy(dczVar2, crp.f(context2, uri3, new cro(context2.getContentResolver())));
    }
}
