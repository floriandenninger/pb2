package defpackage;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bsn implements brz {
    final /* synthetic */ PreferenceGroup a;
    final /* synthetic */ bsp b;

    public bsn(bsp bspVar, PreferenceGroup preferenceGroup) {
        this.b = bspVar;
        this.a = preferenceGroup;
    }

    @Override // defpackage.brz
    public final boolean b(Preference preference) {
        this.a.ac(Integer.MAX_VALUE);
        this.b.a();
        return true;
    }
}
