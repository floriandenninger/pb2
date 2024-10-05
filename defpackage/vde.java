package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vde implements vei {
    public final vdn a;

    public vde() {
        this(new vdn());
    }

    public vde(vdn vdnVar) {
        this.a = vdnVar;
    }

    @Override // defpackage.vei
    public final long a(Uri uri) {
        File l = vls.l(uri);
        if (l.isDirectory()) {
            return 0L;
        }
        return l.length();
    }

    @Override // defpackage.vei
    public final vdn b() {
        return this.a;
    }

    @Override // defpackage.vei
    public final File c(Uri uri) {
        return vls.l(uri);
    }

    @Override // defpackage.vei
    public final InputStream d(Uri uri) {
        File l = vls.l(uri);
        return new vdt(new FileInputStream(l), l);
    }

    @Override // defpackage.vei
    public final OutputStream e(Uri uri) {
        File l = vls.l(uri);
        anaf.t(l);
        return new vdu(new FileOutputStream(l, true), l);
    }

    @Override // defpackage.vei
    public final OutputStream f(Uri uri) {
        File l = vls.l(uri);
        anaf.t(l);
        return new vdu(new FileOutputStream(l), l);
    }

    @Override // defpackage.vei
    public final Iterable g(Uri uri) {
        File l = vls.l(uri);
        if (!l.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        File[] listFiles = l.listFiles();
        if (listFiles == null) {
            throw new IOException(String.format("Not a directory or I/O error (unexpected): %s", uri));
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            String absolutePath = file.getAbsolutePath();
            if (file.isDirectory() && !absolutePath.endsWith("/")) {
                absolutePath = String.valueOf(absolutePath).concat("/");
            }
            Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
            amrp f = amru.f();
            path.path(absolutePath);
            arrayList.add(uqq.c(path, f));
        }
        return arrayList;
    }

    @Override // defpackage.vei
    public final String h() {
        return "file";
    }

    @Override // defpackage.vei
    public final void i(Uri uri) {
        if (!vls.l(uri).mkdirs()) {
            throw new IOException(String.format("%s could not be created", uri));
        }
    }

    @Override // defpackage.vei
    public final void j(Uri uri) {
        File l = vls.l(uri);
        if (!l.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        if (!l.delete()) {
            throw new IOException(String.format("%s could not be deleted", uri));
        }
    }

    @Override // defpackage.vei
    public final void k(Uri uri) {
        File l = vls.l(uri);
        if (l.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (l.delete()) {
            return;
        }
        if (!l.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.vei
    public final void l(Uri uri, Uri uri2) {
        File l = vls.l(uri);
        File l2 = vls.l(uri2);
        anaf.t(l2);
        if (!l.renameTo(l2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.vei
    public final boolean m(Uri uri) {
        return vls.l(uri).exists();
    }

    @Override // defpackage.vei
    public final boolean n(Uri uri) {
        return vls.l(uri).isDirectory();
    }
}
