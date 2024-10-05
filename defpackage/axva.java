package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axva implements axuz {
    public static final uvr a;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.measurement"));
        uvpVar.e("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        a = uvpVar.e("measurement.collection.redundant_engagement_removal_enabled", false);
        uvpVar.c("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // defpackage.axuz
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
