package defpackage;

import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.youtube.app.settings.videoquality.VideoQualityCheckBoxPreference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lrd {
    public static final amru a = amru.t("mobile_video_quality_auto_key", "mobile_video_quality_high_key", "mobile_video_quality_low_key");
    public static final amru b = amru.t("wifi_video_quality_auto_key", "wifi_video_quality_high_key", "wifi_video_quality_low_key");
    public final ywr c;
    public final shf d;
    public final ayqw e = new ayqw();
    public final aaea f;
    public final acra g;
    public boolean h;
    public boolean i;

    public lrd(ywr ywrVar, shf shfVar, aaea aaeaVar, acqz acqzVar) {
        this.c = ywrVar;
        this.d = shfVar;
        this.f = aaeaVar;
        this.g = acqzVar.mM();
    }

    public static /* synthetic */ void a(Throwable th) {
        zga.d("Failed to persist video quality setting last written time", th);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final acsc c(String str) {
        char c;
        switch (str.hashCode()) {
            case -1397913968:
                if (str.equals("mobile_video_quality_auto_key")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -226929405:
                if (str.equals("mobile_video_quality_high_key")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 819494931:
                if (str.equals("mobile_video_quality_low_key")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 893580870:
                if (str.equals("wifi_video_quality_low_key")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 898750141:
                if (str.equals("wifi_video_quality_auto_key")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2069734704:
                if (str.equals("wifi_video_quality_high_key")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        int i = 93930;
        if (c == 0) {
            i = 93929;
        } else if (c == 1) {
            i = 93932;
        } else if (c == 2) {
            i = 93928;
        } else if (c == 3) {
            i = 93931;
        } else if (c == 4) {
            i = 93927;
        } else if (c != 5) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 96);
            sb.append("Unknown preference key (");
            sb.append(str);
            sb.append(")! returning Visual Element VIDEO_QUALITY_PERSISTENT_SETTINGS_WIFI_AUTO.");
            zga.n(sb.toString(), new Exception());
        }
        return acsb.c(i);
    }

    public final void b(bsu bsuVar, amru amruVar, final amml ammlVar) {
        final ArrayList arrayList = new ArrayList();
        int i = ((amvj) amruVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) amruVar.get(i2);
            if (this.h) {
                this.g.n(new acqx(c(str)));
            }
            final VideoQualityCheckBoxPreference videoQualityCheckBoxPreference = (VideoQualityCheckBoxPreference) bsuVar.d(str);
            videoQualityCheckBoxPreference.getClass();
            videoQualityCheckBoxPreference.n = new bry() { // from class: lqz
                @Override // defpackage.bry
                public final boolean a(Preference preference, Object obj) {
                    lrd lrdVar = lrd.this;
                    VideoQualityCheckBoxPreference videoQualityCheckBoxPreference2 = videoQualityCheckBoxPreference;
                    lrdVar.i = true;
                    lrdVar.g.I(3, new acqx(lrd.c(((VideoQualityCheckBoxPreference) preference).s)), null);
                    return !((TwoStatePreference) videoQualityCheckBoxPreference2).a;
                }
            };
            arrayList.add(videoQualityCheckBoxPreference);
        }
        this.e.d(this.c.d().G().E(ayqr.a()).X(new ayrs() { // from class: lrc
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                char c;
                avzr avzrVar;
                amml ammlVar2 = amml.this;
                List<VideoQualityCheckBoxPreference> list = arrayList;
                amru amruVar2 = lrd.a;
                avzr avzrVar2 = (avzr) ammlVar2.apply((awvr) obj);
                for (VideoQualityCheckBoxPreference videoQualityCheckBoxPreference2 : list) {
                    String str2 = videoQualityCheckBoxPreference2.s;
                    switch (str2.hashCode()) {
                        case -226929405:
                            if (str2.equals("mobile_video_quality_high_key")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 819494931:
                            if (str2.equals("mobile_video_quality_low_key")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 893580870:
                            if (str2.equals("wifi_video_quality_low_key")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 2069734704:
                            if (str2.equals("wifi_video_quality_high_key")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    c = 65535;
                    if (c == 0 || c == 1) {
                        avzrVar = avzr.VIDEO_QUALITY_SETTING_HIGHER_QUALITY;
                    } else if (c == 2 || c == 3) {
                        avzrVar = avzr.VIDEO_QUALITY_SETTING_DATA_SAVER;
                    } else {
                        avzrVar = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
                    }
                    if (((TwoStatePreference) videoQualityCheckBoxPreference2).a && avzrVar != avzrVar2) {
                        videoQualityCheckBoxPreference2.k(false);
                    }
                }
            }
        }));
    }
}
