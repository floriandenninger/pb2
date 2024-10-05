package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kar implements kbj {
    private final Context a;
    private final jni b;

    public kar(Context context, jni jniVar) {
        this.a = context;
        this.b = jniVar;
    }

    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        jni jniVar = this.b;
        aonk aonkVar = aqnl.b;
        aone createBuilder = aqnl.a.createBuilder();
        String string = this.a.getString(R.string.smart_downloads_loading_spinner_text);
        createBuilder.copyOnWrite();
        aqnl aqnlVar = (aqnl) createBuilder.instance;
        string.getClass();
        aqnlVar.c |= 4;
        aqnlVar.d = string;
        ammv b = jniVar.b(R.raw.downloads_page_loading_spinner_element_android, aonkVar, (aqnl) createBuilder.build());
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
