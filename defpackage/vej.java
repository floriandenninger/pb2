package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class vej implements vei {
    @Override // defpackage.vei
    public final long a(Uri uri) {
        return r().a(p(uri));
    }

    @Override // defpackage.vei
    public final vdn b() {
        return ((vde) r()).a;
    }

    @Override // defpackage.vei
    public /* synthetic */ File c(Uri uri) {
        throw null;
    }

    @Override // defpackage.vei
    public InputStream d(Uri uri) {
        throw null;
    }

    @Override // defpackage.vei
    public final OutputStream e(Uri uri) {
        return r().e(p(uri));
    }

    @Override // defpackage.vei
    public final OutputStream f(Uri uri) {
        return r().f(p(uri));
    }

    @Override // defpackage.vei
    public final Iterable g(Uri uri) {
        ArrayList arrayList = new ArrayList();
        Iterator it = r().g(p(uri)).iterator();
        while (it.hasNext()) {
            arrayList.add(o((Uri) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.vei
    public final void i(Uri uri) {
        r().i(p(uri));
    }

    @Override // defpackage.vei
    public final void j(Uri uri) {
        r().j(p(uri));
    }

    @Override // defpackage.vei
    public final void k(Uri uri) {
        r().k(p(uri));
    }

    @Override // defpackage.vei
    public final void l(Uri uri, Uri uri2) {
        r().l(p(uri), p(uri2));
    }

    @Override // defpackage.vei
    public boolean m(Uri uri) {
        throw null;
    }

    @Override // defpackage.vei
    public final boolean n(Uri uri) {
        return r().n(p(uri));
    }

    protected Uri o(Uri uri) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Uri p(Uri uri) {
        throw null;
    }

    protected abstract vei r();
}
