package defpackage;

import android.content.Context;
import android.widget.Toast;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hfv {
    public final hos a;
    public final Context b;
    public vyz c;
    public final hqv d;

    public hfv(hos hosVar, Context context, hqv hqvVar) {
        hosVar.getClass();
        this.a = hosVar;
        context.getClass();
        this.b = context;
        this.d = hqvVar;
    }

    public final void a(Exception exc) {
        this.c = null;
        if (exc instanceof CancellationException) {
            String.valueOf(String.valueOf(exc)).length();
            Toast.makeText(this.b, "Segment Import canceled", 0).show();
            this.d.a();
        } else {
            zga.d("SegmentImport: Transcode failed:", exc);
            Toast.makeText(this.b, "Segment Import failed", 0).show();
            hqv hqvVar = this.d;
            hqvVar.a.s(false);
            ((hmc) hqvVar.a.ag).aK();
        }
    }
}
