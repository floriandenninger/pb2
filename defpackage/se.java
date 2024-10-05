package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class se extends uw {

    @ViewDebug.ExportedProperty
    public boolean a;

    @ViewDebug.ExportedProperty
    public int b;

    @ViewDebug.ExportedProperty
    public int c;

    @ViewDebug.ExportedProperty
    public boolean d;

    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public se() {
        super(-2);
        this.a = false;
    }

    public se(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public se(se seVar) {
        super(seVar);
        this.a = seVar.a;
    }

    public se(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
