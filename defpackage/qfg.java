package defpackage;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qfg {
    public MediaInfo a;
    public MediaQueueData b;
    public long[] e;
    public JSONObject f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public Boolean c = true;
    public long d = -1;
    private double l = 1.0d;

    public final MediaLoadRequestData a() {
        return new MediaLoadRequestData(this.a, this.b, this.c, this.d, this.l, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final void b(double d) {
        if (Double.compare(d, 2.0d) > 0 || Double.compare(d, 0.5d) < 0) {
            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
        }
        this.l = d;
    }
}
