package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.livecreation.ui.view.DeveloperPanel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aclf implements View.OnClickListener {
    final /* synthetic */ DeveloperPanel a;

    public aclf(DeveloperPanel developerPanel) {
        this.a = developerPanel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.setVisibility(8);
    }
}
