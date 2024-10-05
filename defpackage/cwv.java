package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwv implements cqw {
    private static final String[] a = {"_data"};
    private final Context b;
    private final cvz c;
    private final cvz d;
    private final Uri e;
    private final int f;
    private final int g;
    private final cqn h;
    private final Class i;
    private volatile boolean j;
    private volatile cqw k;

    public cwv(Context context, cvz cvzVar, cvz cvzVar2, Uri uri, int i, int i2, cqn cqnVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = cvzVar;
        this.d = cvzVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = cqnVar;
        this.i = cls;
    }

    @Override // defpackage.cqw
    public final Class a() {
        return this.i;
    }

    @Override // defpackage.cqw
    public final void b() {
        this.j = true;
        cqw cqwVar = this.k;
        if (cqwVar != null) {
            cqwVar.b();
        }
    }

    @Override // defpackage.cqw
    public final void c() {
        cqw cqwVar = this.k;
        if (cqwVar != null) {
            cqwVar.c();
        }
    }

    @Override // defpackage.cqw
    public final void d(cof cofVar, cqv cqvVar) {
        Uri uri;
        cvy a2;
        try {
            Cursor cursor = null;
            if (!Environment.isExternalStorageLegacy()) {
                if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri = MediaStore.setRequireOriginal(this.e);
                } else {
                    uri = this.e;
                }
                a2 = this.d.a(uri, this.f, this.g, this.h);
            } else {
                cvz cvzVar = this.c;
                Uri uri2 = this.e;
                try {
                    Cursor query = this.b.getContentResolver().query(uri2, a, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    String valueOf = String.valueOf(uri2);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                                    sb.append("File path was empty in media store for: ");
                                    sb.append(valueOf);
                                    throw new FileNotFoundException(sb.toString());
                                }
                                File file = new File(string);
                                query.close();
                                a2 = cvzVar.a(file, this.f, this.g, this.h);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    String valueOf2 = String.valueOf(uri2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb2.append("Failed to media store entry for: ");
                    sb2.append(valueOf2);
                    throw new FileNotFoundException(sb2.toString());
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            cqw cqwVar = a2 != null ? a2.c : null;
            if (cqwVar == null) {
                String valueOf3 = String.valueOf(this.e);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 29);
                sb3.append("Failed to build fetcher for: ");
                sb3.append(valueOf3);
                cqvVar.g(new IllegalArgumentException(sb3.toString()));
                return;
            }
            this.k = cqwVar;
            if (this.j) {
                b();
            } else {
                cqwVar.d(cofVar, cqvVar);
            }
        } catch (FileNotFoundException e) {
            cqvVar.g(e);
        }
    }

    @Override // defpackage.cqw
    public final int e() {
        return 1;
    }
}
