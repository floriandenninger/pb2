package defpackage;

import android.app.ActivityOptions;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahq extends ahe {
    private final ActivityOptions a;

    public ahq(ActivityOptions activityOptions) {
        super(null);
        this.a = activityOptions;
    }

    @Override // defpackage.ahe
    public final Bundle t() {
        return this.a.toBundle();
    }
}
