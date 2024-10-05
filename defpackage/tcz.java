package defpackage;

import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tcz extends AsyncTask {
    final /* synthetic */ tda a;
    private int b;
    private int c;

    public tcz(tda tdaVar) {
        this.a = tdaVar;
    }

    private final int b(String str) {
        Throwable th;
        Cursor cursor;
        if (tda.c.contains(Build.MANUFACTURER)) {
            try {
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
            }
            return this.a.e.getApplicationInfo("com.google.android.googlequicksearchbox", 0).enabled ? 2 : 3;
        }
        try {
            try {
                cursor = this.a.d.getContentResolver().query(Uri.parse(str), null, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.getCount() != 0) {
                            if (!cursor.moveToFirst()) {
                                cursor.close();
                                return 16;
                            }
                            if (cursor.getType(0) != 3) {
                                cursor.close();
                                return 17;
                            }
                            try {
                                int parseInt = Integer.parseInt(cursor.getString(0));
                                if (parseInt > 12) {
                                    parseInt = 12;
                                }
                                if (rwh.T(parseInt) == 0) {
                                    cursor.close();
                                    return 14;
                                }
                                int T = rwh.T(parseInt);
                                cursor.close();
                                return T;
                            } catch (NumberFormatException e) {
                                Log.e("LensSdkParamsReader", "Unable to parse Lens version code value.", e);
                                cursor.close();
                                return 18;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return 6;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (Exception e2) {
            Log.e("LensSdkParamsReader", "Failed to start Lens due to unexpected exception.", e2);
            return 6;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        this.b = b(tda.a);
        this.c = b(tda.b);
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        a(this.b, this.c);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        new Handler(this.a.d.getMainLooper()).postDelayed(new tcy(this), 4000L);
    }

    public final void a(int i, int i2) {
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        tda tdaVar = this.a;
        aone builder = tdaVar.g.toBuilder();
        builder.copyOnWrite();
        tdm tdmVar = (tdm) builder.instance;
        tdmVar.e = i - 2;
        tdmVar.b |= 4;
        builder.copyOnWrite();
        tdm tdmVar2 = (tdm) builder.instance;
        tdmVar2.f = i2 - 2;
        tdmVar2.b |= 8;
        tdaVar.g = (tdm) builder.build();
        tda tdaVar2 = this.a;
        tdaVar2.h = true;
        Iterator it = tdaVar2.f.iterator();
        while (it.hasNext()) {
            ((tcx) it.next()).a(this.a.g);
        }
        this.a.f.clear();
    }
}
