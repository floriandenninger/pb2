package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.imageclient.service.b;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.c;
import com.google.android.libraries.elements.interfaces.JSModuleCache;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ots implements axqr {
    private final /* synthetic */ int a;

    public ots(int i) {
        this.a = i;
    }

    public static aikp a() {
        return new aiko();
    }

    public static Boolean b() {
        return false;
    }

    public static shf c() {
        return new zhr(1);
    }

    public static final Integer d() {
        return 10;
    }

    public static final Integer e() {
        return 11;
    }

    public static final Integer f() {
        return 0;
    }

    public static final Integer g() {
        return Integer.valueOf(sgf.i());
    }

    public static sll h(Map map, Map map2, Set set, syd sydVar, ammv ammvVar, ammv ammvVar2, ammv ammvVar3, ammv ammvVar4, ammv ammvVar5) {
        return new sll(map, map2, set, sydVar, ammvVar, ammvVar2, ammvVar3, ammvVar4, ammvVar5);
    }

    public static JSModuleCache i() {
        sgf.D();
        JSModuleCache create = JSModuleCache.create();
        if (create != null) {
            return create;
        }
        throw new RuntimeException("JS Module Cache not created - was it included in the .so?");
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return ahfd.d;
            case 1:
                return new ansv(false);
            case 2:
            case 3:
                return null;
            case 4:
                return a();
            case 5:
                return "android_embedded_player";
            case 6:
                return null;
            case 7:
                return b();
            case 8:
                return new a();
            case 9:
                return new b();
            case 10:
                return new com.google.android.apps.youtube.embeddedplayer.service.innertube.a();
            case 11:
                return new c();
            case 12:
                return c();
            case 13:
                return d();
            case 14:
                return e();
            case 15:
                return f();
            case 16:
                return g();
            case 17:
                return new sgf();
            case 18:
                return false;
            case 19:
                throw null;
            default:
                return i();
        }
    }
}
