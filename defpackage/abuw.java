package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abuw implements aaha {
    private final Activity a;
    private final abhh b;
    private final abiy c;

    public abuw(Activity activity, abhh abhhVar, abiy abiyVar) {
        this.a = activity;
        this.b = abhhVar;
        this.c = abiyVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        dd supportFragmentManager = ((ci) this.a).getSupportFragmentManager();
        if (!this.c.a.h || map == null || map.get("context_menu_header_renderer_key") == null) {
            abhh abhhVar = this.b;
            abkk abkkVar = new abkk();
            Bundle bundle = new Bundle();
            bundle.putByteArray("navigation_endpoint", apxfVar.toByteArray());
            abkkVar.af(bundle);
            abkkVar.ag = abhhVar;
            abkkVar.qh(supportFragmentManager, "live_chat_item_context_menu_dialog");
            return;
        }
        asps aspsVar = (asps) map.get("context_menu_header_renderer_key");
        abhh abhhVar2 = this.b;
        abhhVar2.getClass();
        abkh abkhVar = new abkh();
        Bundle bundle2 = new Bundle();
        bundle2.putByteArray("navigation_endpoint", apxfVar.toByteArray());
        if (aspsVar != null) {
            bundle2.putParcelable("live_chat_context_menu_included_renderer", new ParcelableMessageLite(aspsVar));
        }
        abkhVar.af(bundle2);
        abkhVar.ak = abhhVar2;
        abkhVar.qh(supportFragmentManager, "live_chat_item_context_menu_bottom_sheet_fragment");
    }
}
