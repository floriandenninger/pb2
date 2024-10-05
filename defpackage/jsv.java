package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jsv extends jsn {
    private final Context a;

    public jsv(Context context) {
        super(jht.class, atzr.class);
        this.a = context;
    }

    @Override // defpackage.jtc
    public final /* synthetic */ Object b(Object obj, amrz amrzVar) {
        jht jhtVar = (jht) obj;
        String string = this.a.getString(R.string.video_views, jhtVar.i);
        String str = jhtVar.d;
        aone createBuilder = atzr.a.createBuilder();
        aone createBuilder2 = atzw.a.createBuilder();
        aone createBuilder3 = atzv.a.createBuilder();
        aqyg g = ajcq.g(jhtVar.b);
        createBuilder3.copyOnWrite();
        atzv atzvVar = (atzv) createBuilder3.instance;
        g.getClass();
        atzvVar.c = g;
        atzvVar.b |= 1;
        aqyg g2 = !TextUtils.isEmpty(str) ? ajcq.g(TextUtils.concat(str, " · ", string).toString()) : ajcq.g(string.toString());
        createBuilder3.copyOnWrite();
        atzv atzvVar2 = (atzv) createBuilder3.instance;
        g2.getClass();
        atzvVar2.d = g2;
        atzvVar2.b |= 2;
        atzv atzvVar3 = (atzv) createBuilder3.build();
        createBuilder2.copyOnWrite();
        atzw atzwVar = (atzw) createBuilder2.instance;
        atzvVar3.getClass();
        atzwVar.c = atzvVar3;
        atzwVar.b = 128392103;
        atzw atzwVar2 = (atzw) createBuilder2.build();
        createBuilder.copyOnWrite();
        atzr atzrVar = (atzr) createBuilder.instance;
        atzwVar2.getClass();
        atzrVar.i = atzwVar2;
        atzrVar.b |= 4096;
        return (atzr) createBuilder.build();
    }
}
