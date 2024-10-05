package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hre extends hrl {
    final /* synthetic */ Context a;
    final /* synthetic */ ShortsVideoTrimView2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hre(ShortsVideoTrimView2 shortsVideoTrimView2, Context context) {
        super(shortsVideoTrimView2);
        this.b = shortsVideoTrimView2;
        this.a = context;
    }

    @Override // defpackage.hrl
    protected final long a() {
        return this.b.k();
    }

    @Override // defpackage.hrl
    protected final String c() {
        return this.b.getContext().getResources().getString(R.string.filmstrip_content_description);
    }

    @Override // defpackage.hrl
    protected final void d(long j) {
        this.b.x();
        this.b.d(j - a(), false);
    }

    @Override // defpackage.hrl
    protected final void e(long j) {
        this.b.x();
        this.b.d(j - a(), false);
    }

    @Override // defpackage.hrl
    protected final String b(long j) {
        Context context = this.a;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        vsm vsmVar = this.b.s;
        long millis = timeUnit.toMillis(vsmVar == null ? 0L : vsmVar.e(0.0f));
        TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
        vsm vsmVar2 = this.b.s;
        return context.getResources().getString(R.string.accessibility_trim_filmstrip_time, wbs.ay(context.getResources(), fkc.s(millis)), wbs.ay(context.getResources(), fkc.s(timeUnit2.toMillis(vsmVar2 != null ? vsmVar2.e(1.0f) : 0L))));
    }
}
