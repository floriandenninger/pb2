package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xvx implements ajom {
    private final View a;
    private final View b;

    public xvx(Context context) {
        View inflate = View.inflate(context, R.layout.comment_thread_footer, null);
        this.a = inflate;
        this.b = inflate.findViewById(R.id.comment_thread_footer);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        this.b.setVisibility(0);
    }
}
