package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjh {
    static final String[] a = {"video_id", "language_code", "subtitles_path", "track_vss_id", "user_visible_track_name"};
    public final agik b;

    public agjh(agik agikVar) {
        this.b = agikVar;
    }

    public final void a(String str) {
        this.b.a().delete("subtitles_v5", "video_id = ?", new String[]{str});
    }
}
