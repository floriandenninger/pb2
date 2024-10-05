package defpackage;

import android.widget.Toast;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xxn {
    final /* synthetic */ yao a;
    final /* synthetic */ xxo b;

    public xxn(xxo xxoVar, yao yaoVar) {
        this.b = xxoVar;
        this.a = yaoVar;
    }

    public final void a(String str) {
        xxp xxpVar = this.b.a;
        xxpVar.aK = str;
        xxpVar.aM();
        this.a.b();
    }

    public final void b() {
        xxp xxpVar = this.b.a;
        if (xxpVar.aJ == null) {
            xxpVar.aL = null;
            xxpVar.aM();
            this.a.b();
            Toast.makeText(this.b.a.C(), R.string.backstage_post_attach_video_failed, 1).show();
        }
    }
}
