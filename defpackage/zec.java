package defpackage;

import androidx.preference.TwoStatePreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zec implements amml {
    public final /* synthetic */ ProtoDataStoreSwitchPreference a;
    private final /* synthetic */ int b;

    public /* synthetic */ zec(ProtoDataStoreSwitchPreference protoDataStoreSwitchPreference, int i) {
        this.b = i;
        this.a = protoDataStoreSwitchPreference;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b != 0) {
            this.a.aj((Boolean) obj);
            return null;
        }
        return Boolean.valueOf(((TwoStatePreference) this.a).a);
    }
}
