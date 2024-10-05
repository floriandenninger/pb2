package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aap extends aam {
    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        return (Intent) obj;
    }

    @Override // defpackage.aam
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
