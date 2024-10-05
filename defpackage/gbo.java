package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gbo implements View.OnClickListener {
    public final /* synthetic */ HatsContainer a;
    private final /* synthetic */ int b;

    public /* synthetic */ gbo(HatsContainer hatsContainer, int i) {
        this.b = i;
        this.a = hatsContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            this.a.b();
        } else {
            this.a.b();
        }
    }
}
