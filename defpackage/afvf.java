package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afvf implements afvq {
    private final ysl a;
    private final afqz b;

    public afvf(ysl yslVar, afqz afqzVar) {
        this.b = afqzVar;
        this.a = yslVar;
    }

    @Override // defpackage.afvq
    public final void c(Object obj, final ykl yklVar) {
        try {
            final Uri uri = (Uri) obj;
            this.a.a(new afqy(this.b, uri.toString(), new cnk() { // from class: afqx
                @Override // defpackage.cnk
                public final void kY(cnq cnqVar) {
                    ykl.this.a(uri, cnqVar);
                }
            }, yklVar, uri));
        } catch (zjg e) {
            yklVar.a(obj, e);
        }
    }
}
