package defpackage;

import android.widget.PopupWindow;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akhp implements PopupWindow.OnDismissListener {
    private final Set a;

    public akhp(aahd aahdVar) {
        aahdVar.getClass();
        this.a = new HashSet();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.add(null);
    }
}
