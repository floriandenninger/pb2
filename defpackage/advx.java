package defpackage;

import android.os.SystemClock;
import androidx.media3.decoder.vp9.VpxLibrary;
import com.google.android.exoplayer.ext.opus.OpusDecoder;
import com.google.android.exoplayer.youtube.libvpx.VpxDecoder;
import j$.util.Optional;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class advx implements amnv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ advx u = new advx(20);
    public static final /* synthetic */ advx t = new advx(19);
    public static final /* synthetic */ advx s = new advx(18);
    public static final /* synthetic */ advx r = new advx(17);
    public static final /* synthetic */ advx q = new advx(16);
    public static final /* synthetic */ advx p = new advx(15);
    public static final /* synthetic */ advx o = new advx(14);
    public static final /* synthetic */ advx n = new advx(13);
    public static final /* synthetic */ advx m = new advx(12);
    public static final /* synthetic */ advx l = new advx(11);
    public static final /* synthetic */ advx k = new advx(10);
    public static final /* synthetic */ advx j = new advx(9);
    public static final /* synthetic */ advx i = new advx(8);
    public static final /* synthetic */ advx h = new advx(7);
    public static final /* synthetic */ advx g = new advx(6);
    public static final /* synthetic */ advx f = new advx(5);
    public static final /* synthetic */ advx e = new advx(4);
    public static final /* synthetic */ advx d = new advx(3);
    public static final /* synthetic */ advx c = new advx(2);
    public static final /* synthetic */ advx b = new advx(1);
    public static final /* synthetic */ advx a = new advx(0);

    private /* synthetic */ advx(int i2) {
        this.v = i2;
    }

    @Override // defpackage.amnv
    public final Object get() {
        switch (this.v) {
            case 0:
            case 1:
            case 2:
            case 3:
                return false;
            case 4:
                return Collections.emptyList();
            case 5:
                return ovv.a;
            case 6:
                return 128000;
            case 7:
                return Long.MAX_VALUE;
            case 8:
                int i2 = aepd.f;
                return null;
            case 9:
                int i3 = aepd.f;
                return null;
            case 10:
                return false;
            case 11:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 12:
                return false;
            case 13:
                return Boolean.valueOf(aub.a());
            case 14:
                return Boolean.valueOf(VpxLibrary.a());
            case 15:
                return Boolean.valueOf(OpusDecoder.a);
            case 16:
                return Boolean.valueOf(VpxDecoder.a);
            case 17:
                return null;
            case 18:
                return Optional.empty();
            case 19:
                return awvr.a;
            default:
                return ajm.a();
        }
    }
}
