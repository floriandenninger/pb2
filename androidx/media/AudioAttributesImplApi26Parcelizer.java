package androidx.media;

import android.media.AudioAttributes;
import defpackage.bxx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(bxx bxxVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) bxxVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = bxxVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, bxx bxxVar) {
        bxxVar.i(audioAttributesImplApi26.a, 1);
        bxxVar.h(audioAttributesImplApi26.b, 2);
    }
}
