package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agqv {
    private static final long a = TimeUnit.SECONDS.toMillis(5);
    private final azrw b;
    private final agqu c;
    private final Executor d;
    private final zaw e;
    private final aaea f;
    private final jqv g;
    private final axzg h;

    public agqv(ScheduledExecutorService scheduledExecutorService, azrw azrwVar, agqu agquVar, zaw zawVar, jqv jqvVar, aaea aaeaVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = scheduledExecutorService;
        this.b = azrwVar;
        this.c = agquVar;
        this.e = zawVar;
        this.g = jqvVar;
        this.f = aaeaVar;
        this.h = axzgVar;
    }

    private final agmv d(String str) {
        try {
            ammv ammvVar = (ammv) e().m().h(str).get(a, TimeUnit.MILLISECONDS);
            if (ammvVar.h()) {
                return (agmv) ammvVar.c();
            }
            return null;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    private final agsn e() {
        return ((agof) this.b.get()).a();
    }

    public final anhy a(final PlaybackStartDescriptor playbackStartDescriptor) {
        final ykm c = ykm.c();
        this.d.execute(new Runnable() { // from class: agqt
            @Override // java.lang.Runnable
            public final void run() {
                agqv.this.c(playbackStartDescriptor, c);
            }
        });
        return c;
    }

    public final anhy b(final PlaybackStartDescriptor playbackStartDescriptor) {
        final ykm c = ykm.c();
        this.d.execute(new Runnable() { // from class: agqs
            @Override // java.lang.Runnable
            public final void run() {
                agqv.this.c(playbackStartDescriptor, c);
            }
        });
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019e A[Catch: aglr -> 0x026a, aglu -> 0x026c, Exception -> 0x026e, TryCatch #0 {Exception -> 0x026e, blocks: (B:13:0x0021, B:15:0x004b, B:18:0x0053, B:20:0x005b, B:22:0x0063, B:25:0x0071, B:29:0x0098, B:31:0x009e, B:33:0x00a6, B:35:0x00b6, B:37:0x00bc, B:38:0x00c9, B:40:0x00cf, B:43:0x00dd, B:44:0x00f4, B:46:0x00fa, B:49:0x010e, B:52:0x0115, B:57:0x0135, B:62:0x013f, B:66:0x019e, B:68:0x01a8, B:70:0x01e8, B:74:0x0253, B:75:0x01f1, B:76:0x01f6, B:79:0x01f9, B:81:0x01ff, B:83:0x020b, B:84:0x020d, B:86:0x0216, B:88:0x0222, B:90:0x022c, B:91:0x0236, B:92:0x0246, B:95:0x024d, B:96:0x0252, B:98:0x023b, B:99:0x0240, B:100:0x0241, B:101:0x0260, B:102:0x0265, B:103:0x01b1, B:105:0x01c5, B:106:0x01cb, B:108:0x01de, B:111:0x0266, B:113:0x0146, B:114:0x0179, B:115:0x017e, B:116:0x017f, B:117:0x0184, B:118:0x0185, B:119:0x018a, B:120:0x018b, B:121:0x0190, B:122:0x0193, B:123:0x0198), top: B:12:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r18, defpackage.ykl r19) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqv.c(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor, ykl):void");
    }
}
