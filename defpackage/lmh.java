package defpackage;

import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lmh extends zw {
    final /* synthetic */ lmi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmh(lmi lmiVar) {
        super(true);
        this.a = lmiVar;
    }

    @Override // defpackage.zw
    public final void a() {
        lmi lmiVar = this.a;
        axpg axpgVar = lmiVar.i;
        SettingsActivity settingsActivity = lmiVar.a;
        if (axpgVar == null || settingsActivity == null) {
            return;
        }
        if (((gjk) axpgVar.get()).F()) {
            settingsActivity.setTitle(settingsActivity.getString(R.string.settings));
        } else {
            settingsActivity.finish();
        }
    }
}
