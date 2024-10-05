package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajbq implements aixx {
    public PlaybackStartDescriptor a;
    public aigd b;
    public PlayerResponseModel c;
    public long e;
    public long h;
    public long i;
    public long j;
    public aigr l;
    private final shf m;
    public float d = 1.0f;
    public long f = -1;
    public long g = 0;
    public int k = 4;

    public ajbq(shf shfVar) {
        this.m = shfVar;
    }

    @Override // defpackage.aixx
    public final long a() {
        return this.i;
    }

    @Override // defpackage.aixx
    public final long b() {
        return this.f;
    }

    @Override // defpackage.aixx
    public final long c() {
        return this.m.d();
    }

    @Override // defpackage.aixx
    public final long d() {
        return this.j;
    }

    public final void e(PlayerResponseModel playerResponseModel) {
        this.c = playerResponseModel;
        if (playerResponseModel != null) {
            this.h = TimeUnit.SECONDS.toMillis(playerResponseModel.a());
        }
    }

    @Override // defpackage.aixx
    public final long f() {
        return this.h;
    }

    @Override // defpackage.aixx
    public final long g() {
        return this.e;
    }

    @Override // defpackage.aixx
    public final long h() {
        return this.g;
    }
}
