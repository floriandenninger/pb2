package defpackage;

import android.widget.Toast;
import com.google.android.libraries.video.media.VideoMetaData;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vtj implements vtr {
    final /* synthetic */ vtn a;

    public vtj(vtn vtnVar) {
        this.a = vtnVar;
    }

    @Override // defpackage.vtr
    public final void a(Exception exc) {
        vtn vtnVar = this.a;
        if (vtnVar.h) {
            return;
        }
        vtnVar.d(exc);
        vtn vtnVar2 = this.a;
        vtnVar2.h = true;
        Exception exc2 = vtnVar2.f;
        if (exc2 != null) {
            vtnVar2.z.b(exc2);
        } else {
            VideoMetaData videoMetaData = vtnVar2.g;
            if (videoMetaData != null) {
                vyv vyvVar = vtnVar2.z;
                vtv.a("onEncodeCompleted");
                if (vyvVar.b == null) {
                    vyvVar.d.a(new IllegalStateException("Encode completed with uninitialized Listener"));
                } else {
                    vyvVar.a();
                    hfu hfuVar = vyvVar.c;
                    hfv hfvVar = hfuVar.a;
                    hfuVar.b.t(new zog(videoMetaData.k(), videoMetaData.j(), TimeUnit.MICROSECONDS.toMillis(videoMetaData.g), 1.0f, 1), null, null, true);
                    hfvVar.c = null;
                    Toast.makeText(hfvVar.b, "Add trimmed segment to project", 0).show();
                    hqv hqvVar = hfvVar.d;
                    hqvVar.a.s(true);
                    ((hmc) hqvVar.a.ag).aK();
                }
            } else {
                vtnVar2.z.b(new IOException("Null VideoMetaData but no exception set"));
            }
        }
        vtn vtnVar3 = this.a;
        vts vtsVar = vtnVar3.c;
        if (vtsVar != null) {
            vtsVar.f();
            vtnVar3.c = null;
        }
        vte vteVar = vtnVar3.d;
        if (vteVar != null) {
            vteVar.d();
            vtnVar3.d = null;
        }
    }
}
