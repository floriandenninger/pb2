package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acaq implements Runnable {
    final /* synthetic */ acas a;

    public acaq(acas acasVar) {
        this.a = acasVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acas acasVar = this.a;
        if (acasVar.k) {
            acasVar.o.clear();
            return;
        }
        acasVar.c = ((Integer) acasVar.o.removeFirst()).intValue();
        acasVar.p = System.currentTimeMillis();
        acasVar.h.putInt("video-bitrate", acasVar.c);
        try {
            acasVar.b.setParameters(acasVar.h);
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to set bitrate: ");
            sb.append(valueOf);
            Log.e("ScreencastVideoEncoder", sb.toString());
        }
        if (acasVar.o.isEmpty()) {
            return;
        }
        acasVar.g.postDelayed(acasVar.i, acasVar.r);
    }
}
