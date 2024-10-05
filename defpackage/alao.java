package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InterruptedIOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alao implements alaf {
    private final File a;
    private final File b;
    private final Uri c;

    public alao(Uri uri) {
        amkq.E(a(uri));
        this.c = uri;
        String queryParameter = uri.getQueryParameter("temp");
        boolean z = false;
        amkq.E((queryParameter == null || queryParameter.isEmpty()) ? false : true);
        this.a = new File(queryParameter);
        String path = uri.getPath();
        if (path != null && !path.isEmpty()) {
            z = true;
        }
        amkq.E(z);
        this.b = new File(path);
        amkq.E(!r3.equals(r0));
    }

    public static boolean a(Uri uri) {
        return uri != null && "streaming".equals(uri.getScheme());
    }

    private final alad c() {
        return new alad(new FileInputStream(this.b), this.b.length());
    }

    @Override // defpackage.alaf
    public final Bitmap b(Point point) {
        return alap.b(this.c, point);
    }

    @Override // defpackage.alaf
    public final alad f(File file) {
        long currentTimeMillis = System.currentTimeMillis();
        while (!this.a.canRead()) {
            if (this.b.canRead()) {
                return c();
            }
            if (System.currentTimeMillis() - currentTimeMillis >= 3000) {
                throw new FileNotFoundException(String.format("File %s not found.", this.a));
            }
            try {
                Thread.sleep(30L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException(e.getMessage() != null ? e.getMessage() : "");
            }
        }
        try {
            return new alan(this.a, this.b);
        } catch (FileNotFoundException e2) {
            if (this.b.canRead()) {
                return c();
            }
            throw e2;
        }
    }

    @Override // defpackage.alaf
    public final avuc g(String str, String str2) {
        return alap.d(str, str2);
    }

    @Override // defpackage.alaf
    public final void j() {
    }

    @Override // defpackage.alaf
    public final boolean k() {
        return false;
    }

    @Override // defpackage.alaf
    public final boolean l() {
        return false;
    }
}
