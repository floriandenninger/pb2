package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.VideoSelectedActionOuterClass$VideoSelectedAction;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iat {
    public static final long a = TimeUnit.DAYS.toMillis(7);
    public final shf b;
    public final ci c;
    public final vgz d;
    private final afsy e;
    private final Handler f;

    public iat(afsy afsyVar, shf shfVar, ci ciVar, vgz vgzVar, Handler handler) {
        this.e = afsyVar;
        this.b = shfVar;
        this.c = ciVar;
        this.d = vgzVar;
        this.f = handler;
    }

    public final boolean a(VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction) {
        if (!videoSelectedActionOuterClass$VideoSelectedAction.c) {
            return true;
        }
        try {
            long longValue = ((Long) Collections.unmodifiableMap(((idr) this.d.a().get()).f).get(d())).longValue();
            if (longValue == 0) {
                return true;
            }
            return this.b.c() - longValue > a;
        } catch (Exception e) {
            zga.d("Could not read from protoStore", e);
            return true;
        }
    }

    public final int b(int i) {
        long j;
        try {
            idr idrVar = (idr) this.d.a().get();
            if (i == 1) {
                j = ((Long) Collections.unmodifiableMap(idrVar.f).get(d())).longValue();
            } else {
                j = idrVar.e;
            }
            return (int) TimeUnit.DAYS.convert(a - (this.b.c() - j), TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            zga.d("Could not read from protoStore", e);
            return 0;
        }
    }

    public final void c(final int i) {
        final long c = this.b.c();
        this.f.post(new Runnable() { // from class: iar
            @Override // java.lang.Runnable
            public final void run() {
                final iat iatVar = iat.this;
                final int i2 = i;
                final long j = c;
                ynm.n(iatVar.c, iatVar.d.b(new amml() { // from class: iaq
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        iat iatVar2 = iat.this;
                        int i3 = i2;
                        long j2 = j;
                        idr idrVar = (idr) obj;
                        if (i3 == 1) {
                            aone builder = idrVar.toBuilder();
                            builder.k(iatVar2.d(), j2);
                            return (idr) builder.build();
                        }
                        aone builder2 = idrVar.toBuilder();
                        builder2.copyOnWrite();
                        ((idr) builder2.instance).e = j2;
                        return (idr) builder2.build();
                    }
                }, angq.a), hue.k, hue.l);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d() {
        return TextUtils.concat(this.e.c().d(), "_", "ReelsCreatorWatchLaterStickerLastUsedTime").toString();
    }

    public final aqyg e(Context context) {
        int b = b(1);
        if (b == 0) {
            b = 1;
        }
        return ajcq.g(context.getResources().getQuantityString(R.plurals.sticker_dialog_title, b, Integer.valueOf(b)));
    }
}
