package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tyg implements tya {
    private final udg a;
    private final tzh b;
    private final /* synthetic */ int c;

    public tyg(tzh tzhVar, udg udgVar, int i) {
        this.c = i;
        this.b = tzhVar;
        this.a = udgVar;
    }

    public tyg(udg udgVar, tzh tzhVar, int i) {
        this.c = i;
        this.a = udgVar;
        this.b = tzhVar;
    }

    @Override // defpackage.tya
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    @Override // defpackage.tya
    public final boolean c(Intent intent) {
        char c;
        int i = this.c;
        if (i == 0) {
            return "android.intent.action.LOCALE_CHANGED".equals(intent.getAction());
        }
        if (i != 1) {
            return "android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction());
        }
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == 452039370) {
            if (action.equals("android.app.action.APP_BLOCK_STATE_CHANGED")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 806551504) {
            if (hashCode == 1171977904 && action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED")) {
                c = 2;
            }
            c = 65535;
        }
        return c == 0 || c == 1 || c == 2;
    }

    @Override // defpackage.tya
    public final void b(Intent intent, twd twdVar, long j) {
        String str;
        String str2;
        char c;
        int i = this.c;
        if (i == 0) {
            tzk.e("LocaleChangedIntentHandler", "Syncing registration statuses due to Locale change.", new Object[0]);
            if (axrx.a.get().d()) {
                this.b.b(aohx.LOCALE_CHANGED).i();
            }
            this.a.a(aokm.LOCALE_CHANGED);
            return;
        }
        if (i == 1) {
            tzk.e("BlockStateChangedIntentHandler", "BlockStateChanged due to Intent Action: [%s]", intent.getAction());
            Bundle extras = intent.getExtras();
            tzf tzfVar = null;
            ubn ubnVar = null;
            if (Build.VERSION.SDK_INT < 28 || extras == null) {
                str = null;
                str2 = null;
            } else {
                str2 = extras.getString("android.app.extra.NOTIFICATION_CHANNEL_ID");
                str = extras.getString("android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID");
            }
            String action = intent.getAction();
            int hashCode = action.hashCode();
            if (hashCode == 452039370) {
                if (action.equals("android.app.action.APP_BLOCK_STATE_CHANGED")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 806551504) {
                if (hashCode == 1171977904 && action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (action.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED")) {
                    c = 2;
                }
                c = 65535;
            }
            if (c == 0) {
                tzfVar = this.b.a(aoic.APP_BLOCK_STATE_CHANGED);
            } else if (c == 1) {
                tzfVar = this.b.a(aoic.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED);
                if (str2 != null) {
                    tzfVar.a(str2);
                }
            } else if (c == 2) {
                tzf a = this.b.a(aoic.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED);
                if (str != null) {
                    tzj tzjVar = (tzj) a;
                    Iterator it = tzjVar.g.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ubn ubnVar2 = (ubn) it.next();
                        if (ubnVar2.a.equals(str)) {
                            ubnVar = ubnVar2;
                            break;
                        }
                    }
                    tzjVar.p = ubnVar;
                }
                tzfVar = a;
            }
            if (tzfVar != null) {
                tzfVar.i();
            } else {
                tzk.b("BlockStateChangedIntentHandler", "ChimeLogEvent uninitialized, perhaps due to unvalidated event.", new Object[0]);
            }
            this.a.a(aokm.CHANNEL_BLOCK_STATE_CHANGED);
            return;
        }
        tzk.e("TimezoneChangedIntentHandler", "Syncing registration statuses due to timezone change.", new Object[0]);
        if (axrx.a.get().f()) {
            this.b.b(aohx.TIMEZONE_CHANGED).i();
        }
        this.a.a(aokm.TIMEZONE_CHANGED);
    }
}
