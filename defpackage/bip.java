package defpackage;

import android.util.Log;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bip {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final bio k;
    private final Metadata l;

    public bip(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, bio bioVar, Metadata metadata) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = h(i5);
        this.g = i6;
        this.h = i7;
        this.i = g(i7);
        this.j = j;
        this.k = bioVar;
        this.l = metadata;
    }

    public bip(byte[] bArr, int i) {
        ptg ptgVar = new ptg(bArr);
        ptgVar.j(i * 8);
        this.a = ptgVar.d(16);
        this.b = ptgVar.d(16);
        this.c = ptgVar.d(24);
        this.d = ptgVar.d(24);
        int d = ptgVar.d(20);
        this.e = d;
        this.f = h(d);
        this.g = ptgVar.d(3) + 1;
        int d2 = ptgVar.d(5) + 1;
        this.h = d2;
        this.i = g(d2);
        this.j = (pts.t(ptgVar.d(4)) << 32) | pts.t(ptgVar.d(32));
        this.k = null;
        this.l = null;
    }

    public static Metadata e(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] ag = pts.ag(str, "=");
            if (ag.length != 2) {
                String valueOf = String.valueOf(str);
                Log.w("FlacStreamMetadata", valueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(valueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new VorbisComment(ag[0], ag[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static int g(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int h(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final long b(long j) {
        return pts.m((j * this.e) / 1000000, 0L, this.j - 1);
    }

    public final bip c(bio bioVar) {
        return new bip(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, bioVar, this.l);
    }

    public final pms d(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        Metadata f = f(metadata);
        pmr pmrVar = new pmr();
        pmrVar.k = "audio/flac";
        pmrVar.l = i;
        pmrVar.x = this.g;
        pmrVar.y = this.e;
        pmrVar.m = Collections.singletonList(bArr);
        pmrVar.i = f;
        return pmrVar.a();
    }

    public final Metadata f(Metadata metadata) {
        Metadata metadata2 = this.l;
        return metadata2 == null ? metadata : metadata2.d(metadata);
    }
}
