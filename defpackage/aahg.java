package defpackage;

import android.net.Uri;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aahg {
    static {
        apxf apxfVar = apxf.a;
    }

    public static apxf a(String str) {
        aplt apltVar;
        if (str == null) {
            apltVar = aplt.a;
        } else {
            aone createBuilder = aplt.a.createBuilder();
            createBuilder.copyOnWrite();
            aplt apltVar2 = (aplt) createBuilder.instance;
            apltVar2.b |= 1;
            apltVar2.c = str;
            apltVar = (aplt) createBuilder.build();
        }
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(BrowseEndpointOuterClass.browseEndpoint, apltVar);
        return (apxf) aongVar.build();
    }

    public static apxf b(byte[] bArr) {
        aong aongVar = (aong) apxf.a.createBuilder();
        if (bArr != null) {
            try {
                aongVar.mergeFrom(bArr, aomw.b());
            } catch (aoob unused) {
            }
        }
        return (apxf) aongVar.build();
    }

    public static apxf c(byte[] bArr) {
        if (bArr != null) {
            try {
                return (apxf) aonm.parseFrom(apxf.a, bArr, aomw.b());
            } catch (aoob unused) {
            }
        }
        return apxf.a;
    }

    public static apxf d(String str) {
        aone createBuilder = aplt.a.createBuilder();
        createBuilder.copyOnWrite();
        aplt apltVar = (aplt) createBuilder.instance;
        apltVar.b |= 1;
        apltVar.c = str;
        createBuilder.copyOnWrite();
        aplt apltVar2 = (aplt) createBuilder.instance;
        apltVar2.b |= 16;
        apltVar2.f = true;
        aplt apltVar3 = (aplt) createBuilder.build();
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(BrowseEndpointOuterClass.browseEndpoint, apltVar3);
        return (apxf) aongVar.build();
    }

    public static apxf e(String str) {
        aong aongVar = (aong) aunn.a.createBuilder();
        aongVar.copyOnWrite();
        aunn aunnVar = (aunn) aongVar.instance;
        str.getClass();
        aunnVar.b |= 1;
        aunnVar.c = str;
        aunn aunnVar2 = (aunn) aongVar.build();
        aong aongVar2 = (aong) apxf.a.createBuilder();
        aongVar2.e(SearchEndpointOuterClass.searchEndpoint, aunnVar2);
        return (apxf) aongVar2.build();
    }

    public static apxf f(Uri uri) {
        aong aongVar = (aong) apxf.a.createBuilder();
        aonk aonkVar = UrlEndpointOuterClass.urlEndpoint;
        aone createBuilder = avuo.a.createBuilder();
        String uri2 = uri.toString();
        createBuilder.copyOnWrite();
        avuo avuoVar = (avuo) createBuilder.instance;
        uri2.getClass();
        avuoVar.b |= 1;
        avuoVar.c = uri2;
        aongVar.e(aonkVar, (avuo) createBuilder.build());
        return (apxf) aongVar.build();
    }
}
