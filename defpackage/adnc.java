package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adnc implements Runnable {
    final /* synthetic */ adnd a;
    private final SubtitleTrack b;

    public adnc(adnd adndVar, SubtitleTrack subtitleTrack) {
        this.a = adndVar;
        this.b = subtitleTrack;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        adnd adndVar = this.a;
        adndVar.ae = null;
        if (adndVar.aJ()) {
            adnd adndVar2 = this.a;
            SubtitleTrack subtitleTrack = this.b;
            if (adndVar2.M.f()) {
                adgj adgjVar = new adgj();
                if (subtitleTrack == null || subtitleTrack.p() || subtitleTrack.l()) {
                    adgjVar.a("videoId", adndVar2.M.b);
                } else {
                    adgjVar.a("format", String.valueOf(subtitleTrack.a()));
                    adgjVar.a("languageCode", subtitleTrack.c());
                    adgjVar.a("languageName", subtitleTrack.d());
                    adgjVar.a("sourceLanguageCode", subtitleTrack.c());
                    adgjVar.a("trackName", subtitleTrack.g());
                    adgjVar.a("vss_id", subtitleTrack.j());
                    adgjVar.a("videoId", adndVar2.M.b);
                    float a = adndVar2.m.a();
                    SubtitlesStyle b = adndVar2.m.b();
                    HashMap hashMap = new HashMap();
                    hashMap.put("background", SubtitlesStyle.a(b.a));
                    hashMap.put("backgroundOpacity", SubtitlesStyle.b(b.a));
                    hashMap.put("color", SubtitlesStyle.a(b.e));
                    hashMap.put("textOpacity", SubtitlesStyle.b(b.e));
                    hashMap.put("fontSizeRelative", String.format(Locale.US, "%.2f", Float.valueOf(a)));
                    hashMap.put("windowColor", SubtitlesStyle.a(b.b));
                    hashMap.put("windowOpacity", SubtitlesStyle.b(b.b));
                    int i = b.d;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                str = "raised";
                            } else if (i == 4) {
                                str = "depressed";
                            } else if (i != 5) {
                                str = "none";
                            }
                        }
                        str = "dropShadow";
                    } else {
                        str = "uniform";
                    }
                    hashMap.put("charEdgeStyle", str);
                    switch (b.f) {
                        case 0:
                            str2 = "monoSerif";
                            break;
                        case 1:
                            str2 = "propSerif";
                            break;
                        case 2:
                            str2 = "monoSans";
                            break;
                        case 3:
                            str2 = "propSans";
                            break;
                        case 4:
                            str2 = "casual";
                            break;
                        case 5:
                            str2 = "cursive";
                            break;
                        case 6:
                            str2 = "smallCaps";
                            break;
                        default:
                            str2 = "";
                            break;
                    }
                    hashMap.put("fontFamilyOption", str2);
                    adgjVar.a("style", new JSONObject(hashMap).toString());
                }
                adndVar2.aA(adgf.SET_SUBTITLES_TRACK, adgjVar);
            }
        }
    }
}
