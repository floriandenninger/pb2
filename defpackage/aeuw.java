package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aeuw implements amnv {
    public final /* synthetic */ aezf a;
    private final /* synthetic */ int b;

    public /* synthetic */ aeuw(aezf aezfVar, int i) {
        this.b = i;
        this.a = aezfVar;
    }

    @Override // defpackage.amnv
    public final Object get() {
        int i = this.b;
        if (i == 0) {
            return this.a.a();
        }
        if (i == 1) {
            return Boolean.valueOf(this.a.w());
        }
        if (i == 2) {
            return Boolean.valueOf(this.a.w());
        }
        if (i == 3) {
            return Boolean.valueOf(this.a.w());
        }
        if (i != 4) {
            return this.a.a();
        }
        FormatStreamModel formatStreamModel = this.a.m;
        return Integer.valueOf(formatStreamModel == null ? 0 : formatStreamModel.f);
    }
}
