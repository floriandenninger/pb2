package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jnh implements zfi {
    private final /* synthetic */ int u;
    public static final /* synthetic */ jnh t = new jnh(20);
    public static final /* synthetic */ jnh s = new jnh(19);
    public static final /* synthetic */ jnh r = new jnh(18);
    public static final /* synthetic */ jnh q = new jnh(17);
    public static final /* synthetic */ jnh p = new jnh(16);
    public static final /* synthetic */ jnh o = new jnh(15);
    public static final /* synthetic */ jnh n = new jnh(14);
    public static final /* synthetic */ jnh m = new jnh(13);
    public static final /* synthetic */ jnh l = new jnh(12);
    public static final /* synthetic */ jnh k = new jnh(11);
    public static final /* synthetic */ jnh j = new jnh(10);
    public static final /* synthetic */ jnh i = new jnh(9);
    public static final /* synthetic */ jnh h = new jnh(8);
    public static final /* synthetic */ jnh g = new jnh(7);
    public static final /* synthetic */ jnh f = new jnh(6);
    public static final /* synthetic */ jnh e = new jnh(5);
    public static final /* synthetic */ jnh d = new jnh(4);
    public static final /* synthetic */ jnh c = new jnh(3);
    public static final /* synthetic */ jnh b = new jnh(2);
    public static final /* synthetic */ jnh a = new jnh(1);

    public /* synthetic */ jnh(int i2) {
        this.u = i2;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        switch (this.u) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th instanceof InterruptedException) {
                    zga.d("DownloadsElementsFactory interrupted when loading persisted FUT", th);
                    return;
                } else if (th instanceof ExecutionException) {
                    zga.d("DownloadsElementsFactory crashed when loading persisted FUT", th);
                    return;
                } else {
                    if (th instanceof TimeoutException) {
                        zga.d("DownloadsElementsFactory timed out when loading persisted FUT", th);
                        return;
                    }
                    return;
                }
            case 1:
                zga.d("Failed to get DownloadOptionsPickerDialogCommand", (Throwable) obj);
                return;
            case 2:
                zga.d("Failed to update pending delete video Id", (Throwable) obj);
                return;
            case 3:
                long j2 = kqm.a;
                zga.d("accountIdResolver.get() failed", (Throwable) obj);
                return;
            case 4:
                long j3 = kqm.a;
                zga.d("Error getting accessibility settings", (Throwable) obj);
                return;
            case 5:
                return;
            case 6:
                int i2 = VoiceSearchActivity.af;
                return;
            case 7:
                int i3 = VoiceSearchActivity.af;
                return;
            case 8:
                int i4 = VoiceSearchActivity.af;
                return;
            case 9:
                int i5 = VoiceSearchActivity.af;
                return;
            case 10:
                int i6 = VoiceSearchActivity.af;
                zga.l("Error stopping player on activity pause");
                return;
            case 11:
                zga.l("Error playing conversation audio");
                return;
            case 12:
                zga.l("Error stopping player on conversation end");
                return;
            case 13:
                return;
            case 14:
                return;
            case 15:
                int i7 = ljn.y;
                return;
            case 16:
                int i8 = ljn.y;
                return;
            case 17:
                int i9 = VoiceSearchHalfPlateV0Activity.ab;
                return;
            case 18:
                int i10 = VoiceSearchHalfPlateV0Activity.ab;
                return;
            case 19:
                int i11 = VoiceSearchHalfPlateV0Activity.ab;
                return;
            default:
                zga.d("Error getting pip settings.", (Throwable) obj);
                return;
        }
    }
}
