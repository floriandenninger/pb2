package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vcz extends vej {
    private final Context a;
    private final vei b;
    private final vei c;
    private final Object d = new Object();
    private String e;

    public vcz(vcy vcyVar) {
        this.b = new vde(vcyVar.c);
        this.a = vcyVar.a;
        this.c = vcyVar.b;
    }

    public static vcy q(Context context) {
        return new vcy(context);
    }

    private final void s() {
        if (this.c == null) {
            throw new vdi("Android backend cannot perform remote operations without a remote backend");
        }
    }

    private final boolean t(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    @Override // defpackage.vej, defpackage.vei
    public final File c(Uri uri) {
        String str;
        if (!t(uri)) {
            File e = uqq.e(uri, this.a);
            if (!slf.e(this.a)) {
                synchronized (this.d) {
                    if (this.e == null) {
                        this.e = uqq.f(this.a).getAbsolutePath();
                    }
                    str = this.e;
                }
                if (!e.getAbsolutePath().startsWith(str)) {
                    throw new vdi("Cannot access credential-protected data from direct boot");
                }
            }
            return e;
        }
        throw new IOException("operation is not permitted in other authorities.");
    }

    @Override // defpackage.vej, defpackage.vei
    public final InputStream d(Uri uri) {
        if (!t(uri)) {
            return this.b.d(p(uri));
        }
        s();
        return this.c.d(uri);
    }

    @Override // defpackage.vei
    public final String h() {
        return "android";
    }

    @Override // defpackage.vej, defpackage.vei
    public final boolean m(Uri uri) {
        if (!t(uri)) {
            return this.b.m(p(uri));
        }
        s();
        return this.c.m(uri);
    }

    @Override // defpackage.vej
    protected final Uri o(Uri uri) {
        try {
            vda a = vdb.a(this.a);
            a.b(uri.getPath());
            return a.a();
        } catch (IllegalArgumentException e) {
            throw new vdo(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vej
    public final Uri p(Uri uri) {
        if (t(uri)) {
            throw new vdo("Operation across authorities is not allowed.");
        }
        File c = c(uri);
        Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
        amrp f = amru.f();
        path.path(c.getAbsolutePath());
        return uqq.c(path, f);
    }

    @Override // defpackage.vej
    protected final vei r() {
        return this.b;
    }
}
