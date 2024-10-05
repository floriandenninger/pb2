package defpackage;

import android.content.Context;
import android.webkit.WebChromeClient;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.av;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class oqu implements ayrs {
    private final /* synthetic */ int t;
    public static final /* synthetic */ oqu s = new oqu(20);
    public static final /* synthetic */ oqu r = new oqu(19);
    public static final /* synthetic */ oqu q = new oqu(17);
    public static final /* synthetic */ oqu p = new oqu(16);
    public static final /* synthetic */ oqu o = new oqu(15);
    public static final /* synthetic */ oqu n = new oqu(13);
    public static final /* synthetic */ oqu m = new oqu(12);
    public static final /* synthetic */ oqu l = new oqu(11);
    public static final /* synthetic */ oqu k = new oqu(10);
    public static final /* synthetic */ oqu j = new oqu(9);
    public static final /* synthetic */ oqu i = new oqu(8);
    public static final /* synthetic */ oqu h = new oqu(7);
    public static final /* synthetic */ oqu g = new oqu(6);
    public static final /* synthetic */ oqu f = new oqu(5);
    public static final /* synthetic */ oqu e = new oqu(4);
    public static final /* synthetic */ oqu d = new oqu(3);
    public static final /* synthetic */ oqu c = new oqu(2);
    public static final /* synthetic */ oqu b = new oqu(1);
    public static final /* synthetic */ oqu a = new oqu(0);

    public /* synthetic */ oqu(int i2) {
        this.t = i2;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        SimplePlaybackDescriptor simplePlaybackDescriptor;
        switch (this.t) {
            case 0:
                ((WebChromeClient.CustomViewCallback) obj).onCustomViewHidden();
                return;
            case 1:
                return;
            case 2:
                alta.B("Failed to receive hot config data", new Object[0]);
                return;
            case 3:
                av avVar = (av) obj;
                SimplePlaybackDescriptor simplePlaybackDescriptor2 = avVar.q;
                if (simplePlaybackDescriptor2 != null) {
                    avVar.l(simplePlaybackDescriptor2.a(1));
                    return;
                }
                return;
            case 4:
                av avVar2 = (av) obj;
                Context context = (Context) avVar2.e.get();
                if (avVar2.q == null || context == null || zev.e(context)) {
                    return;
                }
                avVar2.l(avVar2.q.a(2));
                return;
            case 5:
                ((av) obj).f();
                return;
            case 6:
                av avVar3 = (av) obj;
                if (avVar3.n()) {
                    return;
                }
                avVar3.g.w(avVar3);
                return;
            case 7:
                av avVar4 = (av) obj;
                if (avVar4.n() || avVar4.g.t(avVar4) || (simplePlaybackDescriptor = avVar4.q) == null) {
                    return;
                }
                avVar4.l(simplePlaybackDescriptor.a(1));
                return;
            case 8:
                av avVar5 = (av) obj;
                if (avVar5.n()) {
                    return;
                }
                avVar5.g.m(avVar5);
                return;
            case 9:
                ((av) obj).m();
                return;
            case 10:
                return;
            case 11:
                av avVar6 = (av) obj;
                if (avVar6.n()) {
                    return;
                }
                avVar6.g.s();
                return;
            case 12:
                String valueOf = String.valueOf(((Throwable) obj).getMessage());
                alta.B(valueOf.length() != 0 ? "Could not access YouTube service: ".concat(valueOf) : new String("Could not access YouTube service: "), new Object[0]);
                return;
            case 13:
                oba.A((Throwable) obj);
                return;
            case 14:
                return;
            case 15:
                oba.A((Throwable) obj);
                return;
            case 16:
                wbs.H((Throwable) obj);
                return;
            case 17:
                wbs.H((Throwable) obj);
                return;
            case 18:
                afsi.c(2, 1, "AdNotificationController failed unexpectedly while receiving an RX event.", (Throwable) obj);
                return;
            case 19:
                wbs.H((Throwable) obj);
                return;
            default:
                wbs.H((Throwable) obj);
                return;
        }
    }
}
