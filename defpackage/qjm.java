package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.gms.cast.framework.media.ImageHints;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qjm {
    public qjn a;
    public Bitmap b;
    public boolean c;
    public qjl d;
    private final Context e;
    private final ImageHints f;
    private Uri g;

    public qjm(Context context) {
        this(context, new ImageHints(-1, 0, 0));
    }

    private final void c() {
        qjn qjnVar = this.a;
        if (qjnVar != null) {
            qjnVar.cancel(true);
            this.a = null;
        }
        this.g = null;
        this.b = null;
        this.c = false;
    }

    public final void a() {
        c();
        this.d = null;
    }

    public final void b(Uri uri) {
        int i;
        if (uri == null) {
            c();
            return;
        }
        if (uri.equals(this.g)) {
            return;
        }
        c();
        this.g = uri;
        ImageHints imageHints = this.f;
        int i2 = imageHints.b;
        if (i2 == 0 || (i = imageHints.c) == 0) {
            this.a = new qjn(this.e, 0, 0, this);
        } else {
            this.a = new qjn(this.e, i2, i, this);
        }
        qjn qjnVar = this.a;
        qip.an(qjnVar);
        Uri uri2 = this.g;
        qip.an(uri2);
        qjnVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public qjm(Context context, ImageHints imageHints) {
        this.e = context;
        this.f = imageHints;
        c();
    }
}
