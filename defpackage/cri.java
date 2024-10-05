package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cri implements cqw {
    private final Uri a;
    private final ContentResolver b;
    private Object c;

    public cri(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    @Override // defpackage.cqw
    public final void b() {
    }

    @Override // defpackage.cqw
    public final void c() {
        Object obj = this.c;
        if (obj != null) {
            try {
                g(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.cqw
    public final void d(cof cofVar, cqv cqvVar) {
        try {
            Object f = f(this.a, this.b);
            this.c = f;
            cqvVar.f(f);
        } catch (FileNotFoundException e) {
            cqvVar.g(e);
        }
    }

    @Override // defpackage.cqw
    public final int e() {
        return 1;
    }

    protected abstract Object f(Uri uri, ContentResolver contentResolver);

    protected abstract void g(Object obj);
}
