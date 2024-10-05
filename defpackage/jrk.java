package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jrk implements jry {
    public static final /* synthetic */ int b = 0;
    public final Context a;
    private final azrw c;
    private final azrw d;
    private final jwd e;
    private final fiu f;

    public jrk(Context context, azrw azrwVar, azrw azrwVar2, jwd jwdVar, fiu fiuVar) {
        this.a = context;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.e = jwdVar;
        this.f = fiuVar;
    }

    private final jql d(int i) {
        return new jql(R.attr.ytTextSecondary, this.a.getResources().getQuantityString(R.plurals.recommendation_count, i, Integer.valueOf(i)));
    }

    private final jql e(int i) {
        return (jql) this.f.b().G(new fih(i, 2)).G(new ayrv() { // from class: jrj
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                Integer num = (Integer) obj;
                return new jql(R.attr.ytTextSecondary, jrk.this.a.getResources().getQuantityString(R.plurals.video_count, num.intValue(), num));
            }
        }).X();
    }

    @Override // defpackage.jry
    public final jql a() {
        Collection<agnv> j = ((agof) this.c.get()).a().m().j();
        ArrayList arrayList = new ArrayList();
        for (agnv agnvVar : j) {
            if (!agnvVar.s()) {
                arrayList.add(agnvVar);
            }
        }
        fjs fjsVar = (fjs) this.d.get();
        if (!arrayList.isEmpty()) {
            return e(arrayList.size());
        }
        int i = ((amvj) fjsVar.d).c;
        if (i > 0) {
            return d(i);
        }
        if (!j.isEmpty()) {
            return d(j.size());
        }
        return e(0);
    }

    @Override // defpackage.jry
    public final jql b(agnh agnhVar) {
        String string;
        if (agnhVar == null) {
            return new jql(R.attr.ytTextSecondary, "");
        }
        if (agnhVar.e()) {
            amkq.E(agnhVar.e());
            return new jql(R.attr.ytTextSecondary, mcy.ad(this.a, agnhVar.a));
        }
        amkq.E(!agnhVar.e());
        int i = agnhVar.e;
        if (i == 0) {
            string = this.a.getString(R.string.offline_playlist_waiting);
        } else {
            string = this.a.getString(R.string.offline_adding_progress, Integer.valueOf(i));
        }
        return new jql(R.attr.ytStaticBlue, string);
    }

    @Override // defpackage.jry
    public final jql c(int i, agnv agnvVar) {
        jql jqlVar;
        String l;
        jwd jwdVar = this.e;
        jwc jwcVar = (jwc) jwdVar.b.get(Integer.valueOf(i));
        jwcVar.getClass();
        if (agnvVar == null || agnvVar.i() == agnq.DELETED) {
            String[] strArr = new String[1];
            strArr[0] = i == 1 ? jwdVar.a.getString(R.string.downloaded_video_deleted) : "";
            jqlVar = new jql(R.attr.ytTextDisabled, strArr);
        } else {
            agnq i2 = agnvVar.i();
            if (i2 == agnq.PLAYABLE || i2 == agnq.CANDIDATE) {
                agnu agnuVar = agnvVar.j;
                if (agnuVar == null || !jwdVar.d.m() || !mcy.ah(agnuVar) || i != 1) {
                    return new jql(R.attr.ytTextDisabled, "");
                }
                jqlVar = new jql(R.attr.ytTextDisabled, mcy.ae(jwdVar.a, mcy.X(agnuVar, jwdVar.c), true));
            } else {
                if (i2 != agnq.TRANSFER_IN_PROGRESS) {
                    ammv a = jwcVar.a(i2, agnvVar.j, agnvVar.k);
                    if (a.h()) {
                        l = jwdVar.a.getString(((Integer) a.c()).intValue());
                    } else {
                        l = agnvVar.l(i2, jwdVar.a);
                    }
                    return jwd.a(agnvVar, i) ? new jql(R.attr.ytStaticBlue, l, jwdVar.a.getString(R.string.downloaded_video_partially_playable)) : new jql(R.attr.ytTextDisabled, l);
                }
                String string = jwdVar.a.getString(R.string.downloaded_video_in_progress, Integer.valueOf(agnvVar.c()));
                return jwd.a(agnvVar, i) ? new jql(R.attr.ytStaticBlue, string, jwdVar.a.getString(R.string.downloaded_video_partially_playable)) : new jql(R.attr.ytStaticBlue, string);
            }
        }
        return jqlVar;
    }
}
