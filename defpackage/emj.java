package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class emj extends elz {
    @Override // android.app.Activity
    public final Intent getIntent() {
        Intent intent = super.getIntent();
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.isEmpty();
            }
        } catch (Exception unused) {
            intent.replaceExtras((Bundle) null);
        }
        return intent;
    }
}
