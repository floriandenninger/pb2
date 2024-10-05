package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpc implements ajom {
    private final YouTubeTextView a;
    private final ajop b;

    public mpc(Context context, gma gmaVar) {
        this.b = gmaVar;
        YouTubeTextView youTubeTextView = (YouTubeTextView) View.inflate(context, R.layout.section_heading, null);
        this.a = youTubeTextView;
        gmaVar.c(youTubeTextView);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.b).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        this.a.setText(((ajvk) obj).a);
        this.b.e(ajokVar);
    }
}
