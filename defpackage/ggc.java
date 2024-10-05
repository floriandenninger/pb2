package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ggc implements ayrm {
    private final /* synthetic */ int p;
    public static final /* synthetic */ ggc o = new ggc(15);
    public static final /* synthetic */ ggc n = new ggc(14);
    public static final /* synthetic */ ggc m = new ggc(13);
    public static final /* synthetic */ ggc l = new ggc(12);
    public static final /* synthetic */ ggc k = new ggc(11);
    public static final /* synthetic */ ggc j = new ggc(10);
    public static final /* synthetic */ ggc i = new ggc(9);
    public static final /* synthetic */ ggc h = new ggc(8);
    public static final /* synthetic */ ggc g = new ggc(7);
    public static final /* synthetic */ ggc f = new ggc(6);
    public static final /* synthetic */ ggc e = new ggc(5);
    public static final /* synthetic */ ggc d = new ggc(4);
    public static final /* synthetic */ ggc c = new ggc(3);
    public static final /* synthetic */ ggc b = new ggc(2);
    public static final /* synthetic */ ggc a = new ggc(0);

    public /* synthetic */ ggc(int i2) {
        this.p = i2;
    }

    @Override // defpackage.ayrm
    public final void a() {
        int i2 = this.p;
        if (i2 == 13) {
            zga.l("Could not retrieve a non-empty authToken");
            return;
        }
        switch (i2) {
            case 4:
                int i3 = gub.b;
                afsi.b(2, 1, "Could not retrieve survey entity on display");
                return;
            case 5:
                int i4 = guo.b;
                afsi.b(2, 1, "Could not retrieve ad player fullscreen state entity on exit");
                return;
            case 6:
                int i5 = gur.d;
                afsi.b(2, 1, "Null survey on submit");
                return;
            case 7:
                long j2 = SfvAudioItemPlaybackController.a;
                return;
            case 8:
                long j3 = SfvAudioItemPlaybackController.a;
                return;
            default:
                return;
        }
    }
}
