package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class algf implements View.OnClickListener {
    final /* synthetic */ algj a;

    public algf(algj algjVar) {
        this.a = algjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        algj algjVar = this.a;
        if (algjVar.d && algjVar.isShowing()) {
            algj algjVar2 = this.a;
            if (!algjVar2.f) {
                TypedArray obtainStyledAttributes = algjVar2.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                algjVar2.e = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                algjVar2.f = true;
            }
            if (algjVar2.e) {
                this.a.cancel();
            }
        }
    }
}
