package defpackage;

import android.content.Context;
import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bagy extends bage {
    public bagy(Context context) {
        super(context);
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        super.c(str, set, z, date);
        return this;
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        super.d(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        if (this.e == null) {
            this.e = getDefaultUserAgent();
        }
        return new bagx(this);
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.i = z;
        return this;
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.h = z;
        return this;
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        super.e(i, j);
        return this;
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.n = z;
        return this;
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.d = z;
        return this;
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.g = z;
        return this;
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.m = str;
        return this;
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        super.g(str);
        return this;
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        super.h(i);
        return this;
    }

    @Override // defpackage.bage, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.e = str;
        return this;
    }
}
