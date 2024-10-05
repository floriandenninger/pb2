package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aejf {
    public static final FormatStreamModel a;
    public final aeez b;
    public final aaea c;
    public final aeet d;
    public final afhs e;
    private final aenf f;
    private final ysy g;
    private final adxr h;
    private final afkn i;

    static {
        aong aongVar = (aong) aqxz.b.createBuilder();
        Uri.Builder builder = new Uri.Builder();
        int i = aaoq.aD;
        aongVar.copyOnWrite();
        aqxz aqxzVar = (aqxz) aongVar.instance;
        aqxzVar.c |= 1;
        aqxzVar.d = i;
        a = whu.W(builder, null, 0L, aongVar);
    }

    public aejf(aeez aeezVar, aenf aenfVar, ysy ysyVar, adxr adxrVar, afkn afknVar, aaea aaeaVar, aeet aeetVar, afhs afhsVar) {
        afki.a(aeezVar);
        this.b = aeezVar;
        afki.a(aenfVar);
        this.f = aenfVar;
        afki.a(ysyVar);
        this.g = ysyVar;
        afki.a(adxrVar);
        this.h = adxrVar;
        afki.a(afknVar);
        this.i = afknVar;
        afki.a(aaeaVar);
        this.c = aaeaVar;
        afki.a(aeetVar);
        this.d = aeetVar;
        afki.a(afhsVar);
        this.e = afhsVar;
    }

    public static List d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((FormatStreamModel) it.next()).e()));
        }
        return arrayList;
    }

    public static List f(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public static ozv[] i(FormatStreamModel[] formatStreamModelArr) {
        int length = formatStreamModelArr.length;
        ozv[] ozvVarArr = new ozv[length];
        for (int i = 0; i < length; i++) {
            ozvVarArr[i] = ozv.d(formatStreamModelArr[i]);
        }
        return ozvVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ozv a(ozv[] ozvVarArr, PlayerConfigModel playerConfigModel, aeeu aeeuVar, String str, String str2) {
        afef afefVar = new afef(new afdl(this.f, this.g, playerConfigModel, this.h, false, this.i, aeeuVar.f, advx.g, playerConfigModel.e(), playerConfigModel.d(), str, str2, this.e, advx.h, null, aesa.a, aeru.c), afdp.a);
        ozw ozwVar = new ozw();
        afefVar.a(Collections.emptyList(), 0L, ozvVarArr, ozwVar);
        return ozwVar.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final afjd b(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        return afje.c(videoStreamingData, playerConfigModel, this.e, afje.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final afjd c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        afhs afhsVar = this.e;
        amnv amnvVar = afje.a;
        afjd c = afje.c(videoStreamingData, playerConfigModel, afhsVar, amnvVar);
        HashSet hashSet = new HashSet(c.a);
        int i = c.c;
        Set d = afje.d(afhsVar, videoStreamingData);
        Set e = afje.e(afhsVar, videoStreamingData);
        if (!afhsVar.J() && !videoStreamingData.D()) {
            hashSet.removeAll(aaoq.w());
            d.remove(Integer.valueOf(aaoq.B));
            e.remove(Integer.valueOf(aaoq.aA));
        }
        int i2 = 0;
        if (c.a == aaoq.d()) {
            if (afje.j(videoStreamingData, playerConfigModel, afhsVar, amnvVar)) {
                hashSet.addAll(d);
            }
            if (afje.g(videoStreamingData, playerConfigModel, afhsVar)) {
                hashSet.addAll(e);
            }
        } else if (c.a.equals(d)) {
            if (afje.g(videoStreamingData, playerConfigModel, afhsVar)) {
                hashSet.addAll(e);
            }
        } else if (afhsVar.f() > 0 && videoStreamingData.t && ((Boolean) amnvVar.get()).booleanValue() && afhsVar.aR()) {
            i2 = afhsVar.f();
            hashSet.addAll(d);
        }
        return new afjd(hashSet, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List e(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        afhs afhsVar = this.e;
        amnv amnvVar = afje.d;
        afjc b = afje.b(videoStreamingData, playerConfigModel, afhsVar, amnvVar);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (videoStreamingData.D() || (afhsVar.G() && afhsVar.J())) {
            z = true;
        }
        if (afje.h(videoStreamingData, playerConfigModel, afhsVar, amnvVar) || afje.i(videoStreamingData, playerConfigModel, afhsVar)) {
            arrayList.add(Integer.valueOf(aaoq.W));
            arrayList.add(Integer.valueOf(aaoq.aT));
            arrayList.add(Integer.valueOf(playerConfigModel.aY() ? aaoq.V : aaoq.U));
            arrayList.add(Integer.valueOf(aaoq.aS));
            if (z) {
                arrayList.add(Integer.valueOf(aaoq.T));
                arrayList.add(Integer.valueOf(aaoq.aR));
            }
        } else if (!z) {
            b.a.remove(Integer.valueOf(aaoq.aR));
            arrayList.addAll(b.a);
        } else {
            arrayList.addAll(b.a);
        }
        if (afhsVar.ah()) {
            arrayList.addAll(aaoq.g());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set g(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        return afje.b(videoStreamingData, playerConfigModel, this.e, afje.d).a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        arfd a2 = this.c.a();
        if (a2 == null) {
            return false;
        }
        atcl atclVar = a2.i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atsh atshVar = atclVar.d;
        if (atshVar == null) {
            atshVar = atsh.a;
        }
        atsf atsfVar = atshVar.g;
        if (atsfVar == null) {
            atsfVar = atsf.b;
        }
        return atsfVar.h;
    }
}
