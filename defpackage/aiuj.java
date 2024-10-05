package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiuj {
    public final atyf a;
    public atyd b;
    private final String c;
    private final boolean d;
    private final String e;
    private final aifk f;

    private aiuj(String str, boolean z, atyf atyfVar, String str2, aifk aifkVar) {
        this.c = str;
        this.a = atyfVar;
        this.d = z;
        this.e = str2;
        this.f = aifkVar;
        int i = atyfVar.d;
        atyd atydVar = null;
        if (i >= 0 && i < atyfVar.c.size()) {
            atydVar = (atyd) atyfVar.c.get(atyfVar.d);
        }
        this.b = atydVar;
    }

    public static aiuj e(PlayerResponseModel playerResponseModel, Context context, aifk aifkVar) {
        return f(playerResponseModel, context.getString(R.string.turn_off_subtitles), aifkVar);
    }

    public static aiuj f(PlayerResponseModel playerResponseModel, String str, aifk aifkVar) {
        atyf atyfVar;
        playerResponseModel.getClass();
        String y = playerResponseModel.y();
        boolean B = playerResponseModel.B();
        aryr aryrVar = playerResponseModel.a;
        if ((aryrVar.b & 256) != 0) {
            apnt apntVar = aryrVar.n;
            if (apntVar == null) {
                apntVar = apnt.a;
            }
            atyfVar = apntVar.b;
            if (atyfVar == null) {
                atyfVar = atyf.a;
            }
        } else {
            atyfVar = null;
        }
        if (y == null || atyfVar == null) {
            return null;
        }
        return new aiuj(y, B, atyfVar, str, aifkVar);
    }

    private final SubtitleTrack h(atye atyeVar) {
        aiuh a = a(atyeVar);
        a.d(false);
        return a.a();
    }

    public final aiuh a(atye atyeVar) {
        aqyg aqygVar;
        aiuh m = SubtitleTrack.m();
        m.e(atyeVar.f);
        m.j(this.c);
        m.k(atyeVar.e);
        m.i(atyeVar.c);
        if ((atyeVar.b & 16) != 0) {
            aqygVar = atyeVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        m.b = ajcq.b(aqygVar);
        m.c(this.d);
        return m;
    }

    public final SubtitleTrack b() {
        int i;
        atyd atydVar = this.b;
        if (atydVar == null || !atydVar.f || (i = atydVar.e) < 0 || i >= this.a.b.size()) {
            return null;
        }
        return h((atye) this.a.b.get(atydVar.e));
    }

    public final SubtitleTrack c(String str) {
        atyd atydVar;
        if (str != null && (atydVar = this.b) != null) {
            Iterator it = atydVar.d.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (intValue >= 0 && intValue < this.a.b.size() && ((atye) this.a.b.get(intValue)).f.equals(str)) {
                    return h((atye) this.a.b.get(intValue));
                }
            }
        }
        return null;
    }

    public final aiui d() {
        aiui aiuiVar;
        atyd atydVar = this.b;
        if (atydVar == null) {
            return aiui.UNKNOWN;
        }
        aifk aifkVar = this.f;
        aiui aiuiVar2 = aiui.UNKNOWN;
        if (!aifkVar.A() || (atydVar.b & 64) == 0) {
            Map map = aiui.e;
            atyc b = atyc.b(atydVar.i);
            if (b == null) {
                b = atyc.UNKNOWN;
            }
            aiuiVar = (aiui) yjj.r(map, b, aiui.UNKNOWN);
        } else {
            Map map2 = aiui.f;
            apnr b2 = apnr.b(atydVar.j);
            if (b2 == null) {
                b2 = apnr.CAPTIONS_INITIAL_STATE_UNKNOWN;
            }
            aiuiVar = (aiui) yjj.r(map2, b2, aiui.UNKNOWN);
        }
        return aiuiVar == null ? aiui.UNKNOWN : aiuiVar;
    }

    public final List g() {
        atyd atydVar;
        ArrayList arrayList = new ArrayList();
        if (this.a.b.size() != 0 && this.a.c.size() != 0 && (atydVar = this.b) != null) {
            Iterator it = atydVar.d.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (intValue >= 0 && intValue < this.a.b.size()) {
                    arrayList.add(h((atye) this.a.b.get(intValue)));
                }
            }
            arrayList.add(0, SubtitleTrack.o(this.e));
        }
        return arrayList;
    }
}
