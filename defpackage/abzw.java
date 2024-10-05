package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abzw implements acaf {
    private final MediaMuxer a;
    private final String b;
    private final boolean c;
    private long d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;

    public abzw(String str, boolean z) {
        String concat = String.valueOf(str).concat(".mp4");
        this.b = concat;
        this.c = z;
        this.a = new MediaMuxer(concat, 0);
    }

    private final void p() {
        if (new File(this.b).delete()) {
            String valueOf = String.valueOf(this.b);
            Log.e("FileMuxer", valueOf.length() != 0 ? "Removed media file due to muxer failure: ".concat(valueOf) : new String("Removed media file due to muxer failure: "));
        }
    }

    @Override // defpackage.acaf
    public final int a(MediaFormat mediaFormat) {
        if (this.h) {
            Log.e("FileMuxer", "Cannot add a track once started");
            return -1;
        }
        if (this.i) {
            Log.e("FileMuxer", "Cannot add a track once stopped");
            return -1;
        }
        if (this.j) {
            Log.e("FileMuxer", "Cannot add a track after release");
            return -1;
        }
        try {
            int addTrack = this.a.addTrack(mediaFormat);
            if (adyu.cQ(mediaFormat)) {
                this.e = true;
            } else if (adyu.cO(mediaFormat)) {
                this.f = true;
            }
            return addTrack;
        } catch (Exception unused) {
            String valueOf = String.valueOf(mediaFormat);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Adding track failed for format: ");
            sb.append(valueOf);
            Log.e("FileMuxer", sb.toString());
            return -1;
        }
    }

    @Override // defpackage.acaf
    public final int b() {
        return -1;
    }

    @Override // defpackage.acaf
    public final int c() {
        if (this.j) {
            Log.e("FileMuxer", "Cannot prepare once released");
            return 1;
        }
        if (this.i) {
            Log.e("FileMuxer", "Cannot prepare once stopped");
            return 1;
        }
        if (this.h) {
            Log.e("FileMuxer", "Cannot prepare once started");
            return 1;
        }
        this.d = 0L;
        this.g = true;
        return 0;
    }

    @Override // defpackage.acaf
    public final long d() {
        return this.d;
    }

    @Override // defpackage.acaf
    public final Pair e() {
        return null;
    }

    @Override // defpackage.acaf
    public final void f() {
        p();
    }

    @Override // defpackage.acaf
    public final void g(Context context, acae acaeVar) {
        acaeVar.getClass();
        MediaScannerConnection.scanFile(context, new String[]{this.b}, new String[]{"video/avc", "video/mp4v-es"}, new abzv(acaeVar));
    }

    @Override // defpackage.acaf
    public final void h(acad acadVar) {
    }

    @Override // defpackage.acaf
    public final void i(int i) {
    }

    @Override // defpackage.acaf
    public final boolean j() {
        return !this.j && !this.i && this.f && this.e;
    }

    @Override // defpackage.acaf
    public final boolean k() {
        return (!this.h || this.i || this.j) ? false : true;
    }

    @Override // defpackage.acaf
    public final boolean l() {
        if (this.j) {
            Log.e("FileMuxer", "Cannot start once released");
            return false;
        }
        if (this.i) {
            Log.e("FileMuxer", "Cannot restart once stopped");
            return false;
        }
        if (!this.g) {
            Log.e("FileMuxer", "Muxer not prepared");
            return false;
        }
        if (this.h) {
            return true;
        }
        if (!j()) {
            Log.e("FileMuxer", "Cannot start without all tracks");
            return false;
        }
        try {
            this.a.start();
            this.h = true;
        } catch (Exception e) {
            Log.e("FileMuxer", "Starting muxer failed", e);
        }
        return this.h;
    }

    @Override // defpackage.acaf
    public final boolean m() {
        if (this.j) {
            Log.e("FileMuxer", "Cannot stop once released");
            return false;
        }
        if (!this.h) {
            Log.e("FileMuxer", "Muxer not started");
            return false;
        }
        if (this.i) {
            return true;
        }
        try {
            this.a.stop();
            this.i = true;
        } catch (Exception unused) {
            String valueOf = String.valueOf(this.b);
            Log.e("FileMuxer", valueOf.length() != 0 ? "Muxer not stopped cleanly. Deleting media file: ".concat(valueOf) : new String("Muxer not stopped cleanly. Deleting media file: "));
            p();
        }
        return this.i;
    }

    @Override // defpackage.acaf
    public final boolean n(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.j) {
            Log.e("FileMuxer", "Cannot write data once released");
            return false;
        }
        if (this.i) {
            Log.e("FileMuxer", "Cannot write data once stopped");
            return false;
        }
        if (!this.h) {
            Log.e("FileMuxer", "Muxer not started");
            return false;
        }
        try {
            if (!this.c) {
                this.a.writeSampleData(i, byteBuffer, bufferInfo);
            }
            this.d += bufferInfo.size - bufferInfo.offset;
            return true;
        } catch (Exception e) {
            Log.e("FileMuxer", "Writing sample data failed", e);
            return false;
        }
    }

    @Override // defpackage.acaf
    public final void o() {
        if (this.j) {
            return;
        }
        try {
            this.a.release();
            this.j = true;
        } catch (Exception e) {
            Log.e("FileMuxer", "Releasing media muxer failed", e);
        }
    }
}
