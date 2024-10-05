package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeou {
    public String a;
    public final String b;
    public String c;
    public String d;

    public aeou(afqu afquVar) {
        afqu afquVar2 = afqu.NATIVE_MEDIA_PLAYER;
        int ordinal = afquVar.ordinal();
        this.b = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "exo2_smf" : "exo2" : "exo" : "fw";
    }

    public final void a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5) {
        StringBuilder sb = new StringBuilder(true != z ? "" : "IT");
        if (z2) {
            sb.append(",HD");
        } else {
            sb.append(",SD");
        }
        if (z3) {
            sb.append(",Allowed");
        }
        sb.append(",L");
        sb.append(i);
        if (z4) {
            sb.append(",SS");
        }
        if (z5) {
            sb.append(",KR");
        }
        this.a = sb.toString();
    }

    public final void b(VideoStreamingData videoStreamingData, boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str;
        String str2;
        if (videoStreamingData == null) {
            str = "invalid";
        } else if (videoStreamingData.B()) {
            str = videoStreamingData.I() ? "windowed-live" : videoStreamingData.C() ? "manifestless" : videoStreamingData.y() ? "dash" : "hls-live";
        } else if (!videoStreamingData.E()) {
            if (videoStreamingData.w) {
                str = "otf";
            }
            str = "vod";
        } else if (videoStreamingData.C()) {
            str = "mfless-post-live";
        } else {
            if (videoStreamingData.y()) {
                str = "dash-post-live";
            }
            str = "vod";
        }
        this.c = str;
        str2 = "";
        if (videoStreamingData != null) {
            str2 = true == videoStreamingData.H() ? "S" : "";
            if (videoStreamingData.w()) {
                str2 = str2.concat("3");
            }
        }
        if (z4) {
            str2 = String.valueOf(str2).concat("G");
        }
        if (z) {
            str2 = String.valueOf(str2).concat("Q");
            if (j != -1) {
                String valueOf = String.valueOf(str2);
                String valueOf2 = String.valueOf(String.format(Locale.US, ":%.1fs;", Float.valueOf(((float) j) / 1000.0f)));
                str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
        }
        if (z2) {
            str2 = String.valueOf(str2).concat("D");
            if (z3) {
                str2 = String.valueOf(str2).concat("H");
            }
        }
        if (z5) {
            str2 = String.valueOf(str2).concat("A");
        }
        this.d = str2;
    }
}
