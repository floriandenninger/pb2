package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeqd implements aeqf {
    public final int a;
    public final byte[] b;
    public final Map c;
    private final String d;

    @Override // defpackage.aeqf
    public final amru a() {
        char c;
        if (this.c.containsKey("Authorized-Format-Types")) {
            amrp f = amru.f();
            for (String str : amnm.b(',').f((String) this.c.get("Authorized-Format-Types"))) {
                int hashCode = str.hashCode();
                int i = 0;
                if (hashCode == 2300) {
                    if (str.equals("HD")) {
                        c = 2;
                    }
                    c = 65535;
                } else if (hashCode == 2641) {
                    if (str.equals("SD")) {
                        c = 1;
                    }
                    c = 65535;
                } else if (hashCode != 2603584) {
                    if (hashCode == 62628790 && str.equals("AUDIO")) {
                        c = 0;
                    }
                    c = 65535;
                } else {
                    if (str.equals("UHD1")) {
                        c = 3;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    i = 1;
                } else if (c == 1) {
                    i = 2;
                } else if (c == 2) {
                    i = 3;
                } else if (c == 3) {
                    i = 4;
                }
                f.h(Integer.valueOf(i));
            }
            return f.g();
        }
        return amru.q();
    }

    @Override // defpackage.aeqf
    public final String b() {
        return this.d;
    }

    @Override // defpackage.aeqf
    public final boolean c() {
        return false;
    }

    @Override // defpackage.aeqf
    public final boolean d() {
        afki.d(!(this.a == 0));
        switch (this.a) {
            case 300:
            case 301:
            case 303:
            case 304:
            case 305:
                return true;
            case 302:
            default:
                return false;
        }
    }

    @Override // defpackage.aeqf
    public final byte[] f() {
        return this.b;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    public aeqd(Context context, int i, byte[] bArr, Map map) {
        Integer valueOf;
        this.a = i;
        if (i == 300) {
            valueOf = Integer.valueOf(R.string.error_streaming_devices_quota_per_24h_exceeded);
        } else if (i == 405) {
            valueOf = Integer.valueOf(R.string.error_video_forbidden);
        } else {
            switch (i) {
                case 303:
                    valueOf = Integer.valueOf(R.string.error_stopped_by_another_playback);
                    break;
                case 304:
                    valueOf = Integer.valueOf(R.string.error_too_many_streams_per_user);
                    break;
                case 305:
                    valueOf = Integer.valueOf(R.string.error_too_many_streams_per_entitlement);
                    break;
                default:
                    switch (i) {
                        case 400:
                            valueOf = Integer.valueOf(R.string.error_video_not_found);
                            break;
                        case 401:
                            valueOf = Integer.valueOf(R.string.error_geo_failure);
                            break;
                        case 402:
                            valueOf = Integer.valueOf(R.string.error_streaming_not_allowed);
                            break;
                        case 403:
                            valueOf = Integer.valueOf(R.string.error_unsupported_device);
                            break;
                        default:
                            switch (i) {
                                case 500:
                                    valueOf = Integer.valueOf(R.string.error_purchase_not_found);
                                    break;
                                case 501:
                                    valueOf = Integer.valueOf(R.string.error_rental_expired);
                                    break;
                                case 502:
                                    valueOf = Integer.valueOf(R.string.error_purchase_refunded);
                                    break;
                                default:
                                    valueOf = null;
                                    break;
                            }
                    }
            }
        }
        this.d = valueOf != null ? context.getResources().getString(valueOf.intValue()) : null;
        this.b = bArr;
        this.c = map;
    }
}
