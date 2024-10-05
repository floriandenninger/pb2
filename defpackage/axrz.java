package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axrz implements axry {
    public static final uxe a;
    public static final uxe b;
    public static final uxe c;
    public static final uxe d;
    public static final uxe e;
    public static final uxe f;

    static {
        uxj f2 = new uxj("com.google.android.libraries.notifications").f();
        f2.d("LoggingFeature__log_device_state_battery_charging", false);
        f2.d("LoggingFeature__log_device_state_battery_level", false);
        f2.a("LoggingFeature__log_device_state_battery_level_precision", 0.1d);
        f2.d("LoggingFeature__log_device_state_network_metered", false);
        f2.d("LoggingFeature__log_device_state_network_roaming", false);
        f2.d("LoggingFeature__log_device_state_network_transport", false);
        f2.d("LoggingFeature__log_device_state_notifications_in_tray", false);
        f2.d("LoggingFeature__log_device_state_power_saving", false);
        a = f2.d("LoggingFeature__log_removed_event", true);
        b = f2.d("LoggingFeature__log_system_event_app_updated", false);
        c = f2.d("LoggingFeature__log_system_event_boot_completed", false);
        d = f2.d("LoggingFeature__log_system_event_locale_changed", false);
        f2.d("LoggingFeature__log_system_event_phenotype_changed", false);
        e = f2.d("LoggingFeature__log_system_event_scheduled_job", false);
        f = f2.d("LoggingFeature__log_system_event_timezone_changed", false);
    }

    @Override // defpackage.axry
    public final boolean a() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.axry
    public final boolean b() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // defpackage.axry
    public final boolean c() {
        return ((Boolean) c.get()).booleanValue();
    }

    @Override // defpackage.axry
    public final boolean d() {
        return ((Boolean) d.get()).booleanValue();
    }

    @Override // defpackage.axry
    public final boolean e() {
        return ((Boolean) e.get()).booleanValue();
    }

    @Override // defpackage.axry
    public final boolean f() {
        return ((Boolean) f.get()).booleanValue();
    }
}
