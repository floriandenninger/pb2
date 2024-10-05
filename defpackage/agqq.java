package defpackage;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.offline.player.OfflinePlaybackTrackingPlaybackListener$State;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agqq extends ajbh {
    private agqr a;
    private agqp b;
    private String c;
    private long d;
    private final aadw e;
    private final akpq f;
    private final akpq g;

    public agqq(akpq akpqVar, akpq akpqVar2, aadw aadwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f = akpqVar;
        this.g = akpqVar2;
        this.e = aadwVar;
    }

    @Override // defpackage.ajbh
    public final Parcelable ai() {
        return new OfflinePlaybackTrackingPlaybackListener$State(this.c);
    }

    @Override // defpackage.ajbh
    public final void aj(ahef ahefVar) {
        PlayerResponseModel b;
        aign c = ahefVar.c();
        if ((c == aign.VIDEO_REQUESTED || c == aign.VIDEO_PLAYING) && (b = ahefVar.b()) != null) {
            String y = b.y();
            String str = this.c;
            if (str == null || !str.equals(y)) {
                this.c = y;
                akpq akpqVar = this.f;
                azrw azrwVar = akpqVar.a;
                shf shfVar = (shf) akpqVar.b.get();
                shfVar.getClass();
                y.getClass();
                this.a = new agqr(azrwVar, shfVar, y);
                akpq akpqVar2 = this.g;
                String str2 = this.c;
                azrw azrwVar2 = akpqVar2.b;
                azrw azrwVar3 = akpqVar2.a;
                str2.getClass();
                this.b = new agqp(azrwVar2, azrwVar3, str2);
            }
        }
    }

    @Override // defpackage.ajbh
    public final void b() {
        agqp agqpVar;
        agnv e;
        if (!agzr.o(this.e) || (agqpVar = this.b) == null) {
            return;
        }
        if (this.d >= 0) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.d);
            if (!TextUtils.isEmpty(agqpVar.c)) {
                agof agofVar = (agof) agqpVar.b.get();
                if (agofVar.h()) {
                    agsn a = agofVar.a();
                    if (!((agsg) agqpVar.a.get()).K(agofVar.d()) && (e = a.m().e(agqpVar.c)) != null && !e.s()) {
                        a.m().D(agqpVar.c, seconds);
                    }
                }
            }
        }
        this.d = -1L;
    }

    @Override // defpackage.ajbh
    public final void e(aheg ahegVar) {
        agqr agqrVar = this.a;
        if (agqrVar != null && ahegVar.j()) {
            if (!TextUtils.isEmpty(agqrVar.c)) {
                agof agofVar = (agof) agqrVar.a.get();
                if (agofVar.h()) {
                    agsn a = agofVar.a();
                    if (a.m().e(agqrVar.c) != null) {
                        long c = agqrVar.b.c();
                        agqrVar.c.length();
                        a.m().E(agqrVar.c, c);
                    }
                }
            }
            this.a = null;
        }
        if (agzr.o(this.e) && ahegVar.j()) {
            this.d = ahegVar.e();
        }
    }

    @Override // defpackage.ajbh
    public final void f(Parcelable parcelable, ansv ansvVar) {
        amkq.E(parcelable instanceof OfflinePlaybackTrackingPlaybackListener$State);
        if (ansvVar.a) {
            return;
        }
        this.c = ((OfflinePlaybackTrackingPlaybackListener$State) parcelable).a;
    }
}
