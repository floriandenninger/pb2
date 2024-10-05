package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vug extends ddw {
    public static final vug b = new vug();
    private static final Set c;
    private static final Set d;
    private static final Set e;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add("samr");
        hashSet.add("sawb");
        hashSet.add("mp4a");
        hashSet.add("drms");
        hashSet.add("alac");
        hashSet.add("owma");
        hashSet.add("ac-3");
        hashSet.add("ec-3");
        hashSet.add("mlpa");
        hashSet.add("dtsl");
        hashSet.add("dtsh");
        hashSet.add("dtse");
        hashSet.add("lpcm");
        hashSet.add("dtsc");
        hashSet.add("enca");
        HashSet hashSet2 = new HashSet();
        d = hashSet2;
        hashSet2.add("mp4v");
        hashSet2.add("s263");
        hashSet2.add("avc1");
        hashSet2.add("avc3");
        hashSet2.add("drmi");
        hashSet2.add("hvc1");
        hashSet2.add("hev1");
        hashSet2.add("encv");
        HashSet hashSet3 = new HashSet();
        e = hashSet3;
        hashSet3.add("tx3g");
        hashSet3.add("enct");
    }

    @Override // defpackage.ddw
    public final deb b(String str, byte[] bArr) {
        if ("moov".equals(str)) {
            return new det();
        }
        if ("mvhd".equals(str)) {
            return new deu();
        }
        if ("ftyp".equals(str)) {
            return new del();
        }
        if ("mdat".equals(str)) {
            return new dga();
        }
        if ("moov".equals(str)) {
            return new det();
        }
        if ("mvhd".equals(str)) {
            return new deu();
        }
        if ("trak".equals(str)) {
            return new dfm();
        }
        if ("tkhd".equals(str)) {
            return new dfn();
        }
        if ("edts".equals(str)) {
            return new axkr((byte[]) null);
        }
        if ("elst".equals(str)) {
            return new dek();
        }
        if ("mdia".equals(str)) {
            return new deq();
        }
        if ("mdhd".equals(str)) {
            return new der();
        }
        if ("vmhd".equals(str)) {
            return new dfq();
        }
        if ("smhd".equals(str)) {
            return new dfd();
        }
        if ("sthd".equals(str)) {
            return new dfi();
        }
        if ("hmhd".equals(str)) {
            return new dep();
        }
        if ("hdlr".equals(str)) {
            return new deo();
        }
        if ("minf".equals(str)) {
            return new des();
        }
        if ("dinf".equals(str)) {
            return new axkr();
        }
        if ("dref".equals(str)) {
            return new dei();
        }
        if ("url ".equals(str)) {
            return new deh();
        }
        if ("stbl".equals(str)) {
            return new dfa();
        }
        if ("ctts".equals(str)) {
            return new def();
        }
        if ("stsd".equals(str)) {
            return new dey();
        }
        if ("stts".equals(str)) {
            return new dfl();
        }
        if ("stss".equals(str)) {
            return new dfj();
        }
        if ("stsc".equals(str)) {
            return new dfc();
        }
        if ("stsz".equals(str)) {
            return new dez();
        }
        if ("stco".equals(str)) {
            return new dfe();
        }
        if ("co64".equals(str)) {
            return new dec();
        }
        if ("skip".equals(str)) {
            return new den();
        }
        if ("free".equals(str)) {
            return new dem();
        }
        if ("sdtp".equals(str)) {
            return new dex();
        }
        if (c.contains(str)) {
            return new dge(str);
        }
        if (d.contains(str)) {
            return new dgl(str);
        }
        if (e.contains(str)) {
            return new dgj(str);
        }
        if ("stsd-stpp".equals(str)) {
            return new axnm();
        }
        if ("stsd-mp4s".equals(str)) {
            return new dgf(str);
        }
        if ("udta".equals(str)) {
            return new axkr("udta");
        }
        if ("pasp".equals(str)) {
            return new axlt();
        }
        if ("uuid".equals(str)) {
            return new dfp(bArr);
        }
        if ("st3d".equals(str)) {
            return new vva();
        }
        if ("sv3d".equals(str)) {
            return new dfo();
        }
        if ("©xyz".equals(str)) {
            return new vvg();
        }
        return new dfo(str);
    }
}
