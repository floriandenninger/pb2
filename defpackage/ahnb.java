package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.common.ui.TouchImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahnb implements View.OnClickListener, ahna {
    public ahmz a;
    private final TouchImageView b;

    public ahnb(TouchImageView touchImageView) {
        this.b = touchImageView;
        touchImageView.setOnClickListener(this);
    }

    @Override // defpackage.ahna
    public final void a(boolean z) {
        whu.I(this.b, z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ahmz ahmzVar = this.a;
        if (ahmzVar != null) {
            ahmzVar.c();
        }
    }
}
