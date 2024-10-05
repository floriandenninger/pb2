package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afvs implements ykl {
    final /* synthetic */ afvt a;
    private final ykl b;
    private boolean c;

    public afvs(afvt afvtVar, ykl yklVar, boolean z) {
        this.a = afvtVar;
        yklVar.getClass();
        this.b = yklVar;
        this.c = z;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.b.a((Uri) obj, exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        Long l = (Long) obj2;
        if (!this.c) {
            this.b.b(uri, l);
        } else {
            if (l.longValue() > 0) {
                this.b.b(uri, l);
                return;
            }
            this.c = false;
            this.a.b = true;
            this.a.a.c(uri, this);
        }
    }
}
