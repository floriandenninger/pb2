package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvt implements cqw {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public cvt(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.cqw
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.cqw
    public final void b() {
    }

    @Override // defpackage.cqw
    public final void c() {
    }

    @Override // defpackage.cqw
    public final void d(cof cofVar, cqv cqvVar) {
        Cursor query = this.b.getContentResolver().query(this.c, a, null, null, null);
        if (query != null) {
            try {
                r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(r0)) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Failed to find file path for: ");
            sb.append(valueOf);
            cqvVar.g(new FileNotFoundException(sb.toString()));
            return;
        }
        cqvVar.f(new File(r0));
    }

    @Override // defpackage.cqw
    public final int e() {
        return 1;
    }
}
