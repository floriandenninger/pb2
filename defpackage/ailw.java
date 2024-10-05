package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ailw implements aemd {
    private final ailv a;

    public ailw(ailv ailvVar) {
        this.a = ailvVar;
    }

    @Override // defpackage.aemd
    public final aemg a(FormatStreamModel formatStreamModel) {
        long j = formatStreamModel.j();
        if (formatStreamModel.b == null || ((j <= 0 && j != -1) || this.a == null)) {
            return new aemb();
        }
        return new ailq(new aemb(), this.a, formatStreamModel);
    }
}
