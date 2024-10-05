package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axsi implements axsh {
    public static final uxe a;
    public static final uxe b;
    public static final uxe c;
    public static final uxe d;
    public static final uxe e;
    public static final uxe f;
    public static final uxe g;
    public static final uxe h;

    static {
        uxj f2 = new uxj("com.google.android.libraries.notifications").f();
        a = f2.a("RichNotificationFeature__default_aspect_ratio", 1.777d);
        b = f2.d("RichNotificationFeature__enable_enlarged_image_for_collaborator", true);
        c = f2.d("RichNotificationFeature__enable_reply", true);
        d = f2.d("RichNotificationFeature__enable_snooze_action", false);
        e = f2.d("RichNotificationFeature__enable_turn_off_action", false);
        try {
            f = f2.e("RichNotificationFeature__enlarged_image_layout", (ucv) aonm.parseFrom(ucv.a, new byte[]{8, 0}), uxf.f);
            g = f2.a("RichNotificationFeature__max_aspect_ratio", 2.5d);
            h = f2.a("RichNotificationFeature__min_aspect_ratio", 0.75d);
        } catch (aoob unused) {
            throw new AssertionError("Could not parse proto flag \"RichNotificationFeature__enlarged_image_layout\"");
        }
    }

    @Override // defpackage.axsh
    public final double a() {
        return ((Double) a.get()).doubleValue();
    }

    @Override // defpackage.axsh
    public final double b() {
        return ((Double) g.get()).doubleValue();
    }

    @Override // defpackage.axsh
    public final double c() {
        return ((Double) h.get()).doubleValue();
    }

    @Override // defpackage.axsh
    public final ucv d() {
        return (ucv) f.get();
    }

    @Override // defpackage.axsh
    public final boolean e() {
        return ((Boolean) b.get()).booleanValue();
    }

    @Override // defpackage.axsh
    public final boolean f() {
        return ((Boolean) c.get()).booleanValue();
    }

    @Override // defpackage.axsh
    public final boolean g() {
        return ((Boolean) d.get()).booleanValue();
    }

    @Override // defpackage.axsh
    public final boolean h() {
        return ((Boolean) e.get()).booleanValue();
    }
}
