package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aigb {
    private static final Map a = new ConcurrentHashMap();

    static {
        b(new aigp());
        b(new aigq());
        b(new aify());
        b(new aigi());
    }

    public static aiga a(apxf apxfVar) {
        if (apxfVar == null) {
            return null;
        }
        for (aiga aigaVar : a.values()) {
            if (apxfVar.pY(aigaVar.b())) {
                return aigaVar;
            }
        }
        return null;
    }

    public static void b(aiga aigaVar) {
        a.put(aigaVar.b(), aigaVar);
    }

    public static boolean c(PlaybackStartDescriptor playbackStartDescriptor, PlaybackStartDescriptor playbackStartDescriptor2) {
        if (playbackStartDescriptor == playbackStartDescriptor2) {
            return true;
        }
        if (playbackStartDescriptor != null && playbackStartDescriptor2 != null) {
            apxf apxfVar = playbackStartDescriptor.b;
            apxf apxfVar2 = playbackStartDescriptor2.b;
            if (apxfVar == null || apxfVar2 == null) {
                if (playbackStartDescriptor.m() == null && playbackStartDescriptor2.m() == null && playbackStartDescriptor.t() == playbackStartDescriptor2.t() && playbackStartDescriptor.v() == playbackStartDescriptor2.v() && TextUtils.equals(playbackStartDescriptor.k(), playbackStartDescriptor2.k()) && (TextUtils.equals("", playbackStartDescriptor.k()) || Math.abs(playbackStartDescriptor.a() - playbackStartDescriptor2.a()) <= 1)) {
                    return TextUtils.equals(playbackStartDescriptor.l(), playbackStartDescriptor2.l());
                }
            } else {
                return d(apxfVar, apxfVar2);
            }
        }
        return false;
    }

    public static boolean d(apxf apxfVar, apxf apxfVar2) {
        aiga a2 = a(apxfVar);
        if (a2 == null || !apxfVar2.pY(a2.b())) {
            return false;
        }
        return a2.l(apxfVar, apxfVar2);
    }
}
