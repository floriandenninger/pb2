package androidx.media;

import android.media.AudioAttributes;
import defpackage.bxx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(bxx bxxVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) bxxVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = bxxVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, bxx bxxVar) {
        bxxVar.i(audioAttributesImplApi21.a, 1);
        bxxVar.h(audioAttributesImplApi21.b, 2);
    }
}
