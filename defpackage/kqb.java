package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kqb implements ypd {
    final /* synthetic */ kqe a;

    public kqb(kqe kqeVar) {
        this.a = kqeVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{flw.class};
        }
        if (i == 0) {
            flw flwVar = (flw) obj;
            kpz kpzVar = this.a.d;
            if (kpzVar == null || !TextUtils.equals(kpzVar.a, flwVar.a())) {
                return null;
            }
            this.a.a.Y();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
