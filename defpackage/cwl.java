package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwl implements cwa, cwm {
    private final ContentResolver a;
    private final /* synthetic */ int b;

    public cwl(ContentResolver contentResolver, int i) {
        this.b = i;
        this.a = contentResolver;
    }

    @Override // defpackage.cwa
    public final void d() {
    }

    @Override // defpackage.cwm
    public final cqw a(Uri uri) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? new crm(this.a, uri) : new cqs(this.a, uri);
        }
        return new cre(this.a, uri);
    }

    @Override // defpackage.cwa
    public final cvz c(cwg cwgVar) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? new cwn(this) : new cwn(this);
        }
        return new cwn(this);
    }
}
