package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class idb extends AsyncTask {
    public final CancellationSignal a = new CancellationSignal();
    private int b;
    private final idd c;
    private final icr d;

    public idb(idd iddVar, icr icrVar, byte[] bArr, byte[] bArr2) {
        this.c = iddVar;
        this.d = icrVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Context context = ((Context[]) objArr)[0];
        for (axch axchVar : this.c.keySet()) {
            idc idcVar = (idc) this.c.get(axchVar);
            if (this.c.a(axchVar) == null && idcVar.c.h()) {
                aiy aiyVar = new aiy((String) idcVar.c.c(), R.array.com_google_android_gms_fonts_certs_yt);
                try {
                    String str = (String) idcVar.c.c();
                    if (str.length() != 0) {
                        "Requesting font: ".concat(str);
                    }
                    ajf a = aix.a(context, aiyVar, this.a);
                    if (isCancelled()) {
                        return null;
                    }
                    ajg[] ajgVarArr = a.b;
                    if (ajgVarArr == null || ajgVarArr.length == 0) {
                        zga.b("fetchFonts failed (empty result)");
                    } else {
                        int i = ajgVarArr[0].e;
                        if (i == 0) {
                            Typeface b = aim.b(context, this.a, ajgVarArr);
                            if (isCancelled()) {
                                return null;
                            }
                            if (b == null) {
                                zga.b("Failed to create Typeface.");
                            } else {
                                this.c.b(axchVar, b);
                                int i2 = this.b + 1;
                                this.b = i2;
                                if (i2 == 1) {
                                    publishProgress(new Void[0]);
                                }
                            }
                        } else {
                            StringBuilder sb = new StringBuilder(42);
                            sb.append("fetchFonts result is not OK. (");
                            sb.append(i);
                            sb.append(")");
                            zga.b(sb.toString());
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Object[] objArr) {
        ida idaVar = this.d.a;
        if (etx.S(idaVar.c)) {
            idaVar.l.setVisibility(0);
        }
    }
}
