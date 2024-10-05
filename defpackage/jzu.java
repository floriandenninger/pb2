package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jzu implements kbj {
    private final Context a;
    private final aahv b;
    private final ammv c;

    public jzu(Context context, aahv aahvVar, ammv ammvVar) {
        this.a = context;
        this.b = aahvVar;
        this.c = ammvVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        ammv ammvVar;
        awja b;
        ammv H;
        if (!this.c.h()) {
            return amru.q();
        }
        awiu awiuVar = (awiu) this.c.c();
        aahu c = this.b.c();
        Iterator it = awiuVar.getDownloads().iterator();
        while (true) {
            if (it.hasNext()) {
                awiv awivVar = (awiv) it.next();
                int i = awivVar.b;
                if (i == 1) {
                    ammvVar = fav.H(fav.G((String) awivVar.c, c));
                } else {
                    if (i == 2) {
                        ammv i2 = ammv.i((awig) c.f((String) awivVar.c).g(awig.class).X());
                        if (i2.h() && (b = ((awig) i2.c()).b()) != null) {
                            amru b2 = b.b();
                            int i3 = ((amvj) b2).c;
                            int i4 = 0;
                            while (i4 < i3) {
                                awjp b3 = ((awji) b2.get(i4)).b();
                                if (b3 == null) {
                                    H = amlr.a;
                                } else {
                                    List downloads = awiuVar.getDownloads();
                                    aone createBuilder = awiv.a.createBuilder();
                                    String h = fhe.h(b3.getVideoId());
                                    createBuilder.copyOnWrite();
                                    awiv awivVar2 = (awiv) createBuilder.instance;
                                    h.getClass();
                                    awivVar2.b = 1;
                                    awivVar2.c = h;
                                    H = downloads.contains(createBuilder.build()) ? amlr.a : fav.H(fav.G(fhe.h(b3.getVideoId()), c));
                                }
                                i4++;
                                if (H.h()) {
                                    ammvVar = H;
                                    break;
                                }
                            }
                        }
                    }
                    ammvVar = amlr.a;
                }
                if (ammvVar.h()) {
                    break;
                }
            } else {
                ammvVar = amlr.a;
                break;
            }
        }
        if (!ammvVar.h() || ((Integer) ammvVar.c()).intValue() <= 0) {
            return amru.q();
        }
        aone createBuilder2 = atdp.a.createBuilder();
        aqyg g = ajcq.g(this.a.getResources().getQuantityString(R.plurals.offline_go_online_to_renew_dialog_message, ((Integer) ammvVar.c()).intValue(), ammvVar.c()));
        createBuilder2.copyOnWrite();
        atdp atdpVar = (atdp) createBuilder2.instance;
        g.getClass();
        atdpVar.c = g;
        atdpVar.b |= 1;
        atdp atdpVar2 = (atdp) createBuilder2.build();
        aone createBuilder3 = askg.a.createBuilder();
        aone createBuilder4 = atdn.a.createBuilder();
        aone createBuilder5 = atdq.a.createBuilder();
        createBuilder5.copyOnWrite();
        atdq atdqVar = (atdq) createBuilder5.instance;
        atdpVar2.getClass();
        atdqVar.c = atdpVar2;
        atdqVar.b |= 1;
        createBuilder4.copyOnWrite();
        atdn atdnVar = (atdn) createBuilder4.instance;
        atdq atdqVar2 = (atdq) createBuilder5.build();
        atdqVar2.getClass();
        atdnVar.f = atdqVar2;
        atdnVar.b |= 2;
        aone createBuilder6 = atdo.a.createBuilder();
        createBuilder6.copyOnWrite();
        atdo atdoVar = (atdo) createBuilder6.instance;
        atdoVar.c = 2;
        atdoVar.b |= 1;
        createBuilder4.copyOnWrite();
        atdn atdnVar2 = (atdn) createBuilder4.instance;
        atdo atdoVar2 = (atdo) createBuilder6.build();
        atdoVar2.getClass();
        atdnVar2.g = atdoVar2;
        atdnVar2.b |= 16;
        atdn atdnVar3 = (atdn) createBuilder4.build();
        createBuilder3.copyOnWrite();
        askg askgVar = (askg) createBuilder3.instance;
        atdnVar3.getClass();
        askgVar.Y = atdnVar3;
        askgVar.d |= 64;
        return amru.r(new kbh((askg) createBuilder3.build()));
    }
}
