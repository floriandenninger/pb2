package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kat implements kbj {
    private final Context a;
    private final jni b;
    private final jyu c;

    public kat(Context context, jni jniVar, jyu jyuVar) {
        this.a = context;
        this.b = jniVar;
        this.c = jyuVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        String str = (String) this.c.a.a(fir.a).s(jtu.l).x(jtu.q).j("").X();
        jni jniVar = this.b;
        aonk aonkVar = aqob.b;
        aone createBuilder = aqob.a.createBuilder();
        String string = this.a.getString(R.string.smart_downloads_title);
        createBuilder.copyOnWrite();
        aqob aqobVar = (aqob) createBuilder.instance;
        string.getClass();
        aqobVar.c |= 8;
        aqobVar.d = string;
        createBuilder.copyOnWrite();
        aqob aqobVar2 = (aqob) createBuilder.instance;
        str.getClass();
        aqobVar2.c |= 16;
        aqobVar2.e = str;
        String d = amkq.d(this.a.getString(R.string.smart_downloads_opt_in_button_text));
        createBuilder.copyOnWrite();
        aqob aqobVar3 = (aqob) createBuilder.instance;
        d.getClass();
        aqobVar3.c |= 32;
        aqobVar3.f = d;
        String d2 = amkq.d(this.a.getString(R.string.dismiss));
        createBuilder.copyOnWrite();
        aqob aqobVar4 = (aqob) createBuilder.instance;
        d2.getClass();
        aqobVar4.c |= 64;
        aqobVar4.g = d2;
        ammv b = jniVar.b(R.raw.downloads_page_smart_downloads_opt_in_banner_element_android, aonkVar, (aqob) createBuilder.build());
        if (!b.h()) {
            return amru.q();
        }
        aone createBuilder2 = askg.a.createBuilder();
        aqrf aqrfVar = (aqrf) b.c();
        createBuilder2.copyOnWrite();
        askg askgVar = (askg) createBuilder2.instance;
        askgVar.av = aqrfVar;
        askgVar.h |= 1048576;
        return amru.r(new kbh((askg) createBuilder2.build()));
    }
}
