package androidx.media;

import defpackage.bxx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(bxx bxxVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = bxxVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = bxxVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = bxxVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = bxxVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, bxx bxxVar) {
        bxxVar.h(audioAttributesImplBase.a, 1);
        bxxVar.h(audioAttributesImplBase.b, 2);
        bxxVar.h(audioAttributesImplBase.c, 3);
        bxxVar.h(audioAttributesImplBase.d, 4);
    }
}
