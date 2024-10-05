package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fct extends ynz {
    private final Intent a;

    public fct(Intent intent) {
        intent.getClass();
        this.a = intent;
    }

    public String a() {
        ComponentName component = this.a.getComponent();
        if (component != null) {
            return component.getClassName();
        }
        return this.a.getAction();
    }
}
