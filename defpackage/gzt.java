package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gzt implements afwx {
    public final azrr a = azrr.ab();
    final /* synthetic */ gzu b;
    private final Uri c;
    private final byte[] d;

    public gzt(gzu gzuVar, Uri uri, byte[] bArr) {
        this.b = gzuVar;
        this.c = uri;
        this.d = bArr;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("Error loading video", cnqVar);
        this.b.d.e(cnqVar);
        this.a.sc(gzy.a(1, this.b.d.b(cnqVar)));
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arwa arwaVar = (arwa) obj;
        if ((arwaVar.b & 2) != 0) {
            apxf apxfVar = arwaVar.d;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (this.d != null) {
                aong aongVar = (aong) apxfVar.toBuilder();
                aomf x = aomf.x(this.d);
                aongVar.copyOnWrite();
                apxf apxfVar2 = (apxf) aongVar.instance;
                apxfVar2.b |= 1;
                apxfVar2.c = x;
                apxfVar = (apxf) aongVar.build();
            }
            aifz d = PlaybackStartDescriptor.d();
            d.a = apxfVar;
            d.b(false);
            PlaybackStartDescriptor a = d.a();
            if (!amkq.b(a.l(), "") || !amkq.b(a.k(), "") || a.m() != null) {
                azrr azrrVar = this.a;
                gzu gzuVar = this.b;
                if (gzuVar.e() || gzuVar.b.m) {
                    ((ainl) gzuVar.c.get()).d(a);
                } else {
                    Context context = gzuVar.a;
                    WatchDescriptor watchDescriptor = new WatchDescriptor(a);
                    watchDescriptor.h();
                    context.startActivity(fav.e(context).putExtra("watch", watchDescriptor).putExtra("playback_start_flag", 3));
                }
                azrrVar.sc(gzy.a);
                return;
            }
            this.a.sc(gzy.a(2, String.format("Unsupported link: %s", this.c)));
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
