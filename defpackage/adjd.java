package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adjd {
    static {
        zga.a("MDX.PlayerUtil");
    }

    public static long a(PlayerResponseModel playerResponseModel, aheg ahegVar) {
        char c = 0;
        if (playerResponseModel != null) {
            if (playerResponseModel.C()) {
                VideoStreamingData videoStreamingData = playerResponseModel.c;
                if (videoStreamingData != null) {
                    String uri = videoStreamingData.d().toString();
                    if (uri.contains("manifest_duration") && uri.contains("start_walltime")) {
                        long b = b(playerResponseModel, "start_walltime_us/(\\d*)", TimeUnit.MICROSECONDS);
                        long b2 = b(playerResponseModel, "manifest_duration/(\\d*)", TimeUnit.SECONDS) + b;
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                        if (b >= seconds || b2 <= seconds) {
                            c = 3;
                        }
                    }
                    c = 2;
                }
            } else {
                c = 1;
            }
        }
        if ((c == 2 || c == 3) && ahegVar != null) {
            return ahegVar.b();
        }
        if (c == 2) {
            return -1L;
        }
        if (c == 3) {
            return 0L;
        }
        if (ahegVar == null) {
            if (playerResponseModel == null) {
                return 0L;
            }
            return playerResponseModel.c().F();
        }
        if (ahegVar.f() - ahegVar.e() < 1500) {
            return 0L;
        }
        return ahegVar.e();
    }

    private static long b(PlayerResponseModel playerResponseModel, String str, TimeUnit timeUnit) {
        VideoStreamingData videoStreamingData = playerResponseModel.c;
        Uri d = videoStreamingData != null ? videoStreamingData.d() : null;
        if (d == null) {
            return 0L;
        }
        Matcher matcher = Pattern.compile(str).matcher(d.toString());
        if (matcher.find()) {
            return timeUnit.toSeconds(Long.parseLong(matcher.group(1)));
        }
        return 0L;
    }
}
