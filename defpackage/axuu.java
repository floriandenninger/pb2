package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axuu implements axut {
    public static final uvr a;
    public static final uvr b;
    public static final uvr c;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.measurement"));
        uvpVar.e("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = uvpVar.e("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = uvpVar.e("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = uvpVar.e("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // defpackage.axut
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axut
    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    @Override // defpackage.axut
    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    @Override // defpackage.axut
    public final void d() {
    }
}
