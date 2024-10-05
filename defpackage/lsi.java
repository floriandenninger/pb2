package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lsi implements ypd {
    public final Activity a;
    public final ajut b;
    public final aahd c;
    public final acra d;
    public final ypa e;
    public mi f;

    public lsi(Activity activity, ajut ajutVar, aahd aahdVar, acsg acsgVar, ypa ypaVar) {
        this.a = activity;
        this.b = ajutVar;
        this.c = aahdVar;
        this.d = acsgVar;
        this.e = ypaVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        mi miVar;
        if (i == -1) {
            return new Class[]{yro.class};
        }
        if (i == 0) {
            if (((yro) obj).a() || (miVar = this.f) == null || !miVar.isShowing()) {
                return null;
            }
            this.f.dismiss();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
