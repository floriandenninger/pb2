package defpackage;

import android.net.Uri;
import android.text.Spanned;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zks {
    public final aaue a;

    public zks(aaue aaueVar) {
        aaueVar.getClass();
        this.a = aaueVar;
    }

    public static Track a(apgo apgoVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        Uri uri;
        avgg avggVar;
        aqyg aqygVar3;
        aqyg aqygVar4 = null;
        if ((apgoVar.b & 1) != 0) {
            aqygVar = apgoVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((apgoVar.b & 2) != 0) {
            aqygVar2 = apgoVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        int i = apgoVar.e;
        avuo avuoVar = apgoVar.g;
        if (avuoVar == null) {
            avuoVar = avuo.a;
        }
        if ((avuoVar.b & 1) != 0) {
            avuo avuoVar2 = apgoVar.g;
            if (avuoVar2 == null) {
                avuoVar2 = avuo.a;
            }
            uri = Uri.parse(avuoVar2.c);
        } else {
            uri = null;
        }
        if ((apgoVar.b & 8) != 0) {
            avgg avggVar2 = apgoVar.f;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            avggVar = avggVar2;
        } else {
            avggVar = null;
        }
        if ((apgoVar.b & 32) != 0) {
            aqygVar3 = apgoVar.h;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        Spanned b3 = ajcq.b(aqygVar3);
        if ((apgoVar.b & 64) != 0 && (aqygVar4 = apgoVar.i) == null) {
            aqygVar4 = aqyg.a;
        }
        return new Track(b, b2, i, uri, avggVar, b3, ajcq.b(aqygVar4));
    }
}
