package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axvj implements axvi {
    public static final uvr a;
    public static final uvr b;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.measurement"));
        a = uvpVar.e("measurement.sdk.collection.enable_extend_user_property_size", true);
        uvpVar.e("measurement.sdk.collection.last_deep_link_referrer2", true);
        b = uvpVar.e("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        uvpVar.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // defpackage.axvi
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axvi
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
