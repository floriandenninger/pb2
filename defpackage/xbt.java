package defpackage;

import android.media.AudioManager;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xbt implements afxe {
    private final shf a;
    private final zbw b;
    private final ysy c;
    private final String d;
    private final aloh e;

    public xbt(wni wniVar, shf shfVar, zbw zbwVar, ysy ysyVar, aloh alohVar, byte[] bArr, byte[] bArr2) {
        String valueOf = String.valueOf(wniVar.e);
        this.d = valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        this.a = shfVar;
        this.b = true != wniVar.h ? null : zbwVar;
        this.c = ysyVar;
        this.e = alohVar;
    }

    @Override // defpackage.afxe
    public final String a(Uri uri, String str) {
        Integer num = (Integer) xbr.a.get(str);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 12) {
            ysy ysyVar = this.c;
            return ysyVar != null ? String.valueOf(ysyVar.a()) : "0";
        }
        if (intValue == 25) {
            zbw zbwVar = this.b;
            if (zbwVar == null) {
                zga.l("userPresenceTracker is not supported and should not expect receiving LACT macro");
                return "-1";
            }
            return String.valueOf(zbwVar.a());
        }
        if (intValue == 31) {
            return this.d;
        }
        if (intValue != 33) {
            if (intValue != 34) {
                return null;
            }
            return Long.toString(this.a.c());
        }
        aloh alohVar = this.e;
        if (alohVar == null) {
            return "0";
        }
        AudioManager audioManager = (AudioManager) alohVar.a.getSystemService("audio");
        return Integer.toString(Math.round((audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)) * 100.0f));
    }

    @Override // defpackage.afxe
    public final String b() {
        return "xbt";
    }
}
