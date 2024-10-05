package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.offline.ui.UploadArrowView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmw {
    public final UploadArrowView a;
    public isr b;
    public final jlb c;

    public mmw(jlb jlbVar, View view, byte[] bArr) {
        this.c = jlbVar;
        this.a = (UploadArrowView) view.findViewById(R.id.upload_arrow);
    }

    public final void a() {
        isr isrVar = this.b;
        if (isrVar != null) {
            isrVar.b(false);
        }
        this.b = null;
        whu.I(this.a, false);
    }
}
