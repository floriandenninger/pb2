package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axso implements axsn {
    public static final uxe a;
    public static final uxe b;
    public static final uxe c;
    public static final uxe d;

    static {
        uxj f = new uxj("com.google.android.libraries.notifications").f();
        a = f.d("SystemTrayFeature__enable_html_tags", true);
        b = f.c("SystemTrayFeature__force_action_to_open_as_activity", "");
        c = f.d("SystemTrayFeature__forced_notifications_storage_update", false);
        d = f.d("SystemTrayFeature__schedule_refresh_notifications_task", false);
    }

    @Override // defpackage.axsn
    public final String a() {
        return (String) b.get();
    }

    @Override // defpackage.axsn
    public final boolean b() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.axsn
    public final boolean c() {
        return ((Boolean) c.get()).booleanValue();
    }

    @Override // defpackage.axsn
    public final boolean d() {
        return ((Boolean) d.get()).booleanValue();
    }
}
