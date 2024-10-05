package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hrb extends hrl {
    final /* synthetic */ Context a;
    final /* synthetic */ ShortsVideoTrimView2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrb(ShortsVideoTrimView2 shortsVideoTrimView2, Context context) {
        super(shortsVideoTrimView2);
        this.b = shortsVideoTrimView2;
        this.a = context;
    }

    @Override // defpackage.hrl
    protected final long a() {
        return this.b.k();
    }

    @Override // defpackage.hrl
    protected final String b(long j) {
        return fkc.r(this.a, j, TimeUnit.MICROSECONDS.toMillis(this.b.e()));
    }

    @Override // defpackage.hrl
    protected final String c() {
        return this.b.getContext().getResources().getString(R.string.trim_handle_short);
    }

    @Override // defpackage.hrl
    protected final void d(long j) {
        this.b.t(Math.max(0L, j));
    }

    @Override // defpackage.hrl
    protected final void e(long j) {
        ShortsVideoTrimView2 shortsVideoTrimView2 = this.b;
        shortsVideoTrimView2.t(Math.min(shortsVideoTrimView2.j() - this.b.h(), j));
    }
}
