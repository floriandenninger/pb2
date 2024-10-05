package defpackage;

import android.media.AudioRecord;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akfz {
    private static final int[] a = {16000, 22050, 24000};
    private static final short[] b = {2};
    private static final short[] c = {16};
    private AudioRecord d;

    public final AudioRecord a() {
        AudioRecord audioRecord;
        if (this.d == null) {
            int[] iArr = a;
            int i = 0;
            while (true) {
                if (i >= 3) {
                    audioRecord = null;
                    break;
                }
                int i2 = iArr[i];
                short s = b[0];
                short s2 = c[0];
                try {
                    int minBufferSize = AudioRecord.getMinBufferSize(i2, s2, s);
                    if (minBufferSize != -2 && minBufferSize != -1) {
                        audioRecord = new AudioRecord(6, i2, s2, s, Math.max(1280, minBufferSize));
                        if (audioRecord.getState() == 1) {
                            break;
                        }
                        audioRecord.release();
                    }
                } catch (Exception e) {
                    zga.c("Could not initialize AudioRecord: ", e.getMessage());
                }
                i++;
            }
            this.d = audioRecord;
        }
        return this.d;
    }
}
