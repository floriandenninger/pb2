package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agqz implements agrd {
    private final Context a;
    private final Executor b;
    private final aijg c;
    private final ysy d;
    private final agri e;
    private final agqx f;
    private final azrw g;
    private final jqv h;

    public agqz(Context context, Executor executor, aijg aijgVar, jqv jqvVar, ysy ysyVar, agri agriVar, agqx agqxVar, azrw azrwVar) {
        this.a = context;
        this.b = executor;
        this.c = aijgVar;
        this.h = jqvVar;
        this.d = ysyVar;
        this.e = agriVar;
        this.f = agqxVar;
        this.g = azrwVar;
    }

    private static final PlaybackStartDescriptor c(PlaybackStartDescriptor playbackStartDescriptor, agnp agnpVar, int i) {
        apxf z = aedn.z(!TextUtils.isEmpty(playbackStartDescriptor.k()) ? playbackStartDescriptor.k() : "PPSV", agnpVar, i, playbackStartDescriptor.i(), playbackStartDescriptor.y());
        aifz d = PlaybackStartDescriptor.d();
        d.a = z;
        return d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r25, defpackage.ykl r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqz.a(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor, ykl, boolean):void");
    }

    @Override // defpackage.agrd
    public final anhy b(final PlaybackStartDescriptor playbackStartDescriptor, final boolean z) {
        final ykm c = ykm.c();
        this.b.execute(new Runnable() { // from class: agqy
            @Override // java.lang.Runnable
            public final void run() {
                agqz.this.a(playbackStartDescriptor, c, z);
            }
        });
        return c;
    }
}
