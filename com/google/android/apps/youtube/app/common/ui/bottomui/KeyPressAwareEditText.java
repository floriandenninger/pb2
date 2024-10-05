package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import defpackage.gcx;
import defpackage.gdj;
import defpackage.gdk;
import defpackage.sp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class KeyPressAwareEditText extends sp {
    public gcx a;

    public KeyPressAwareEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        gcx gcxVar = this.a;
        if (gcxVar != null) {
            gdk gdkVar = gcxVar.a;
            if (i == 4) {
                if (keyEvent.getAction() == 1) {
                    gdkVar.g.c(gdj.b(false));
                }
                i = 4;
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }
}
