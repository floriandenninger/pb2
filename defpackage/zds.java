package defpackage;

import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreListPreference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zds implements zfi {
    public final /* synthetic */ ProtoDataStoreListPreference a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ zds(ProtoDataStoreListPreference protoDataStoreListPreference, String str, int i) {
        this.c = i;
        this.a = protoDataStoreListPreference;
        this.b = str;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            this.a.ae(this.b);
        } else if (i == 1) {
            this.a.ac(this.b, (String) obj);
        } else {
            this.a.ai(this.b);
        }
    }
}
