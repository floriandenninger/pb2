package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class juz implements ammy {
    private final /* synthetic */ int u;
    public static final /* synthetic */ juz t = new juz(20);
    public static final /* synthetic */ juz s = new juz(19);
    public static final /* synthetic */ juz r = new juz(18);
    public static final /* synthetic */ juz q = new juz(17);
    public static final /* synthetic */ juz p = new juz(16);
    public static final /* synthetic */ juz o = new juz(15);
    public static final /* synthetic */ juz n = new juz(14);
    public static final /* synthetic */ juz m = new juz(13);
    public static final /* synthetic */ juz l = new juz(12);
    public static final /* synthetic */ juz k = new juz(11);
    public static final /* synthetic */ juz j = new juz(10);
    public static final /* synthetic */ juz i = new juz(9);
    public static final /* synthetic */ juz h = new juz(8);
    public static final /* synthetic */ juz g = new juz(7);
    public static final /* synthetic */ juz f = new juz(6);
    public static final /* synthetic */ juz e = new juz(5);
    public static final /* synthetic */ juz d = new juz(4);
    public static final /* synthetic */ juz c = new juz(3);
    public static final /* synthetic */ juz b = new juz(1);
    public static final /* synthetic */ juz a = new juz(0);

    public /* synthetic */ juz(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ammy
    public final boolean a(Object obj) {
        awog d2;
        switch (this.u) {
            case 0:
                return ((agnv) obj).s();
            case 1:
                PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor) obj;
                int i2 = jup.b;
                return (playbackStartDescriptor == null || TextUtils.isEmpty(playbackStartDescriptor.k())) ? false : true;
            case 2:
                if ((obj instanceof ajds) && (d2 = acqy.d((ajds) obj)) != null) {
                    return d2.pY(aqnh.b);
                }
                return false;
            case 3:
                return !(obj instanceof askh);
            case 4:
                apxf apxfVar = (apxf) obj;
                return apxfVar.pY(WatchEndpointOuterClass.watchEndpoint) || apxfVar.pY(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint) || apxfVar.pY(atrs.a);
            case 5:
                apxf apxfVar2 = (apxf) obj;
                return apxfVar2.pY(WatchEndpointOuterClass.watchEndpoint) || apxfVar2.pY(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint) || apxfVar2.pY(atrs.a);
            case 6:
                askg askgVar = (askg) obj;
                return (askgVar == null || (askgVar.d & 32) == 0) ? false : true;
            case 7:
                return ((kye) obj).d();
            case 8:
                return !((kye) obj).c();
            case 9:
                return obj instanceof lfk;
            case 10:
                return (obj instanceof awcl) || (obj instanceof auxq) || (obj instanceof ajds) || (obj instanceof lfk) || (obj instanceof lfu);
            case 11:
                return true;
            case 12:
                askg askgVar2 = (askg) obj;
                return (askgVar2 == null || (askgVar2.d & 262144) == 0) ? false : true;
            case 13:
                askg askgVar3 = (askg) obj;
                return (askgVar3 == null || (askgVar3.c & 1048576) == 0) ? false : true;
            case 14:
                askg askgVar4 = (askg) obj;
                return (askgVar4 == null || (askgVar4.e & 16777216) == 0) ? false : true;
            case 15:
                avvr avvrVar = (avvr) obj;
                return (avvrVar == null || (avvrVar.b & 16777216) == 0) ? false : true;
            case 16:
                return mhm.o(obj);
            case 17:
                return ((View) obj).isClickable();
            case 18:
                return ((View) obj).isClickable();
            case 19:
                return (((atvt) obj).b & 4) != 0;
            default:
                return (((atvt) obj).b & 64) != 0;
        }
    }
}
