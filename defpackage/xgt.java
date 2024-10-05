package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import j$.util.Collection;
import j$.util.function.Predicate;
import j$.util.stream.Collectors;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgt {
    public static final /* synthetic */ int a = 0;
    private static final Predicate b = nty.e;

    public static amru a(PlayerAd playerAd, tfa tfaVar) {
        tfa tfaVar2 = tfa.START;
        switch (tfaVar) {
            case START:
                return c(playerAd.Z());
            case FIRST_QUARTILE:
                return c(playerAd.Q());
            case MIDPOINT:
                return c(playerAd.U());
            case THIRD_QUARTILE:
                return c(playerAd.aa());
            case COMPLETE:
                return c(playerAd.N());
            case RESUME:
                return c(playerAd.X());
            case PAUSE:
                return c(playerAd.V());
            case SUSPEND:
            case MUTE:
            case UNMUTE:
                return amru.q();
            case ABANDON:
                return c(playerAd.H());
            case SKIP_SHOWN:
                return c((List) Collection.EL.stream(playerAd.W()).filter(b).collect(Collectors.toList()));
            case SKIP:
                return c(playerAd.Y());
            case VIEWABLE_IMPRESSION:
                return c(playerAd.K());
            case MEASURABLE_IMPRESSION:
                return c(playerAd.J());
            case GROUPM_VIEWABLE_IMPRESSION:
                return c(playerAd.I());
            case FULLSCREEN:
                return c(playerAd.R());
            case EXIT_FULLSCREEN:
                return c(playerAd.O());
            default:
                String valueOf = String.valueOf(tfaVar.name());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unrecognized video event: ".concat(valueOf) : new String("Unrecognized video event: "));
        }
    }

    public static amru b(avwa avwaVar, tfa tfaVar) {
        aoyi aoyiVar = avwaVar.c;
        if (aoyiVar == null) {
            aoyiVar = aoyi.a;
        }
        tfa tfaVar2 = tfa.START;
        switch (tfaVar) {
            case START:
                return c(aoyiVar.r);
            case FIRST_QUARTILE:
                return c(aoyiVar.s);
            case MIDPOINT:
                return c(aoyiVar.t);
            case THIRD_QUARTILE:
                return c(aoyiVar.u);
            case COMPLETE:
                return c(aoyiVar.v);
            case RESUME:
                return c(aoyiVar.g);
            case PAUSE:
                return c(aoyiVar.f);
            case SUSPEND:
                return amru.q();
            case ABANDON:
                return c(aoyiVar.q);
            case SKIP_SHOWN:
                return c((List) Collection.EL.stream(aoyiVar.j).filter(b).collect(Collectors.toList()));
            case SKIP:
                return c(aoyiVar.h);
            case MUTE:
                return c(aoyiVar.d);
            case UNMUTE:
                return c(aoyiVar.e);
            case VIEWABLE_IMPRESSION:
                return c(aoyiVar.m);
            case MEASURABLE_IMPRESSION:
                return c(aoyiVar.n);
            case GROUPM_VIEWABLE_IMPRESSION:
                return c(aoyiVar.o);
            case FULLSCREEN:
                return c(aoyiVar.l);
            case EXIT_FULLSCREEN:
                return c(aoyiVar.p);
            default:
                String valueOf = String.valueOf(tfaVar.name());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unrecognized video event: ".concat(valueOf) : new String("Unrecognized video event: "));
        }
    }

    private static amru c(List list) {
        if (list == null || list.isEmpty()) {
            return amru.q();
        }
        amrp amrpVar = new amrp();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aoye aoyeVar = (aoye) it.next();
            if (aoyeVar != null && (aoyeVar.b & 1) != 0) {
                try {
                    Uri ai = wbs.ai(aoyeVar.c);
                    if (ai != null && !Uri.EMPTY.equals(ai)) {
                        amrpVar.h(ai);
                    }
                } catch (MalformedURLException unused) {
                }
            }
        }
        return amrpVar.g();
    }
}
