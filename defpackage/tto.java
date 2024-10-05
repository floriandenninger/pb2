package defpackage;

import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tto {
    public static Uri a(Context context, Uri uri) {
        try {
            String readlink = Os.readlink(uqq.e(uri, context).getAbsolutePath());
            if (readlink == null) {
                throw new IOException("Unable to read symlink");
            }
            vda a = vdb.a(context);
            a.b(readlink);
            return a.a();
        } catch (ErrnoException | vdo e) {
            throw new IOException("Unable to read symlink", e);
        }
    }

    public static void b(Context context, Uri uri, Uri uri2) {
        try {
            Os.symlink(uqq.e(uri2, context).getAbsolutePath(), uqq.e(uri, context).getAbsolutePath());
        } catch (ErrnoException | vdo e) {
            throw new IOException("Unable to create symlink", e);
        }
    }
}
