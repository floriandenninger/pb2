package defpackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zoz {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final long g;
    public static final long h;
    public static final long i;

    static {
        String path = new File("video_effects", "assets").getPath();
        a = path;
        b = new File("video_effects", "swazzle_assets").getPath();
        c = new File(path, "stickers").getPath();
        d = new File(path, "dynamic_stickers").getPath();
        new File(path, "text").getPath();
        e = new File("video_effects", "effects_state_cache").getPath();
        f = new File("video_effects", "effects_state_upload").getPath();
        g = TimeUnit.DAYS.toSeconds(14L);
        h = TimeUnit.DAYS.toSeconds(1L);
        i = TimeUnit.DAYS.toSeconds(14L);
    }

    public static String a(String str) {
        return new File("dynamic_stickers", str).getPath();
    }

    public static String b(String str) {
        return new File("stickers", str).getPath();
    }
}
