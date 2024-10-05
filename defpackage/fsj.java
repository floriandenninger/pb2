package defpackage;

import android.content.Context;
import android.widget.CheckedTextView;
import android.widget.RadioGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fsj {
    public final Context a;
    public final RadioGroup b;
    public final CheckedTextView c;
    public npt d;
    public npt e;

    public fsj(Context context, RadioGroup radioGroup, CheckedTextView checkedTextView) {
        this.a = context;
        this.b = radioGroup;
        this.c = checkedTextView;
    }

    public final void a(boolean z) {
        this.c.setChecked(z);
        this.d.a.k = true != z ? 2 : 3;
    }
}
