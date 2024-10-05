package defpackage;

import android.content.Intent;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tyl implements tya {
    private final tzt a;
    private final twx b;
    private final Set c;
    private final txq d;

    public tyl(tzt tztVar, twx twxVar, txq txqVar, Set set) {
        this.a = tztVar;
        this.b = twxVar;
        this.d = txqVar;
        this.c = set;
    }

    @Override // defpackage.tya
    public final int a(Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
        if (stringExtra != null) {
            return (stringExtra.equals("com.google.android.libraries.notifications.NOTIFICATION_CLICKED") || stringExtra.startsWith("com.google.android.libraries.notifications.ACTION_ID:")) ? -2 : 10;
        }
        return 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7 A[LOOP:0: B:25:0x00b1->B:27:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058 A[ADDED_TO_REGION] */
    @Override // defpackage.tya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Intent r11, defpackage.twd r12, long r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyl.b(android.content.Intent, twd, long):void");
    }

    @Override // defpackage.tya
    public final boolean c(Intent intent) {
        return "com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT".equals(intent.getAction());
    }
}
