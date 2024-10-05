package defpackage;

import com.google.android.youtube.R;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ixh implements ykl {
    final /* synthetic */ ixj a;

    public ixh(ixj ixjVar) {
        this.a = ixjVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        zaw zawVar = this.a.aA;
        zawVar.d(zawVar.b(exc));
        String valueOf = String.valueOf(String.valueOf(exc));
        afsi.b(2, 10, valueOf.length() != 0 ? "Could not get playability result: ".concat(valueOf) : new String("Could not get playability result: "));
        this.a.an.m(this);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        int i = ((aile) obj2).c - 1;
        if (i != 0) {
            if (i != 1) {
                ixj ixjVar = this.a;
                ixjVar.aK(ixjVar.av, ixjVar.aj);
                return;
            } else {
                String valueOf = String.valueOf(this.a.av);
                zga.l(valueOf.length() != 0 ? "The following video is unplayable: ".concat(valueOf) : new String("The following video is unplayable: "));
                whu.K(this.a.C(), R.string.player_video_not_available, 0);
                this.a.an.m(this);
                return;
            }
        }
        ixj ixjVar2 = this.a;
        CountDownLatch countDownLatch = ixjVar2.ay;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            if (this.a.ay.getCount() <= 0) {
                this.a.aH();
                return;
            }
            return;
        }
        ixjVar2.aH();
    }
}
