package androidx.media;

import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b = -1;

    public AudioAttributesImplApi21() {
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.a.equals(((AudioAttributesImplApi21) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }
}
