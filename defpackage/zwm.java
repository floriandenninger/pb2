package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zwm extends AsyncTask {
    private final Context a;
    private final zwo b;
    private final zwn c;
    private final DeviceLocalFile d;
    private final zwp e;
    private final int f;
    private final CancellationSignal g;

    public zwm(Context context, zwo zwoVar, zwn zwnVar, DeviceLocalFile deviceLocalFile, zwp zwpVar, int i) {
        this.a = context;
        this.b = zwoVar;
        this.c = zwnVar;
        deviceLocalFile.getClass();
        this.d = deviceLocalFile;
        zwpVar.getClass();
        this.e = zwpVar;
        this.f = i;
        this.g = new CancellationSignal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        super.cancel(false);
        this.g.cancel();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (isCancelled()) {
            return null;
        }
        try {
            return zwr.a(this.a, this.d, this.g);
        } catch (Exception e) {
            if (e instanceof OperationCanceledException) {
                return null;
            }
            String valueOf = String.valueOf(this.d.f());
            String valueOf2 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length());
            sb.append("Failed to load thumbnail for ");
            sb.append(valueOf);
            sb.append(": ");
            sb.append(valueOf2);
            zga.l(sb.toString());
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        zwp zwpVar = this.e;
        if (zwpVar.d == this) {
            zwpVar.d = null;
        }
        this.c.d(this.d, ammv.i(bitmap));
        this.b.oc(this.f);
    }
}
