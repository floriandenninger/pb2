package defpackage;

import com.google.android.libraries.video.media.VideoMetaData;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import org.chromium.net.CellularSignalStrengthError;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vxr implements Iterator, vxp {
    public final VideoMetaData a;
    public final int[] b;
    private java.util.Iterator g;
    final List c = new ArrayList();
    private boolean f = true;
    public long d = -1;
    public long e = -1;

    public vxr(int[] iArr, VideoMetaData videoMetaData) {
        int length;
        iArr.getClass();
        this.b = iArr;
        videoMetaData.getClass();
        this.a = videoMetaData;
        int[] iArr2 = videoMetaData.j;
        int length2 = iArr2 != null ? iArr2.length : videoMetaData.i.length;
        Arrays.sort(iArr);
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            length = iArr.length;
            if (i >= length) {
                break;
            }
            int i4 = iArr[i];
            vcp.g(i4, videoMetaData.i.length);
            int f = videoMetaData.f(i4);
            if (i2 != -1 && i3 != f) {
                this.c.add(new vxq(this, i2, i - i2, a(i3, length2)));
                i2 = -1;
            }
            if (videoMetaData.m(i4)) {
                this.c.add(new vxq(this, i, 1, a(f, length2) + CellularSignalStrengthError.ERROR_NOT_SUPPORTED));
            } else if (i2 == -1) {
                i2 = i;
                i3 = f;
            }
            i++;
        }
        if (i2 != -1) {
            this.c.add(new vxq(this, i2, length - i2, a(i3, length2)));
        }
    }

    static int a(int i, int i2) {
        int i3 = 0;
        vcp.b(i2 > 0);
        vcp.g(i, i2);
        if (i2 > 1) {
            int i4 = i2 - 1;
            while (i % i4 != 0) {
                i4 >>= 1;
                i3++;
                if (i4 <= 1) {
                }
            }
            return i3;
        }
        return i3;
    }

    private final synchronized void c() {
        if (this.f) {
            Collections.sort(this.c);
            this.f = false;
        }
    }

    @Override // defpackage.vxm
    public final synchronized void b(long j, long j2) {
        if (this.d == j && this.e == j2) {
            return;
        }
        this.d = j;
        this.e = j2;
        this.f = true;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        java.util.Iterator it;
        java.util.Iterator it2 = this.g;
        if (it2 == null || !it2.hasNext()) {
            c();
            while (true) {
                if (this.c.size() <= 0) {
                    it = null;
                    break;
                }
                it = ((vxq) this.c.remove(r0.size() - 1)).iterator();
                if (it.hasNext()) {
                    break;
                }
            }
            this.g = it;
        }
        java.util.Iterator it3 = this.g;
        return it3 != null && it3.hasNext();
    }

    @Override // j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            return ((vsa) this.g).next();
        }
        throw new NoSuchElementException();
    }

    @Override // j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
