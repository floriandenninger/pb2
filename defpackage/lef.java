package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lef implements View.OnClickListener {
    final /* synthetic */ leg a;

    public lef(leg legVar) {
        this.a = legVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar = (apxf) view.getTag(R.id.tag_endpoint);
        if (apxfVar == null) {
            return;
        }
        this.a.a.c(apxfVar, null);
    }
}
