package androidx.media;

import defpackage.bxx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(bxx bxxVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl) bxxVar.t(audioAttributesCompat.a);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, bxx bxxVar) {
        bxxVar.u(audioAttributesCompat.a);
    }
}
