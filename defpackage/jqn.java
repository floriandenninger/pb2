package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jqn extends BroadcastReceiver {
    final /* synthetic */ azrw a;
    final /* synthetic */ jqp b;

    public jqn(jqp jqpVar, azrw azrwVar) {
        this.b = jqpVar;
        this.a = azrwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.b.c != null) {
            String stringExtra = intent.getStringExtra("video_id");
            String stringExtra2 = intent.getStringExtra("playlist_id");
            if (stringExtra == null) {
                if (stringExtra2 != null) {
                    if (intent.getBooleanExtra("is_sync", false)) {
                        this.b.c.a.i().u(stringExtra2);
                        return;
                    } else {
                        this.b.c.a.i().w(stringExtra2);
                        return;
                    }
                }
                return;
            }
            try {
                agpd agpdVar = (agpd) this.a.get();
                aone createBuilder = atpq.a.createBuilder();
                createBuilder.copyOnWrite();
                atpq atpqVar = (atpq) createBuilder.instance;
                atpqVar.c = 2;
                atpqVar.b |= 1;
                String h = fhe.h(stringExtra);
                createBuilder.copyOnWrite();
                atpq atpqVar2 = (atpq) createBuilder.instance;
                h.getClass();
                atpqVar2.b = 2 | atpqVar2.b;
                atpqVar2.d = h;
                agpdVar.d((atpq) createBuilder.build());
            } catch (agpe unused) {
                zga.b("Couldn't remove download via notification");
            }
        }
    }
}
