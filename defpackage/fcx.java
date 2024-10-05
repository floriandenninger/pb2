package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fcx implements actd {
    private final /* synthetic */ int s;
    public static final /* synthetic */ fcx r = new fcx(17);
    public static final /* synthetic */ fcx q = new fcx(16);
    public static final /* synthetic */ fcx p = new fcx(15);
    public static final /* synthetic */ fcx o = new fcx(14);
    public static final /* synthetic */ fcx n = new fcx(13);
    public static final /* synthetic */ fcx m = new fcx(12);
    public static final /* synthetic */ fcx l = new fcx(11);
    public static final /* synthetic */ fcx k = new fcx(10);
    public static final /* synthetic */ fcx j = new fcx(9);
    public static final /* synthetic */ fcx i = new fcx(8);
    public static final /* synthetic */ fcx h = new fcx(7);
    public static final /* synthetic */ fcx g = new fcx(6);
    public static final /* synthetic */ fcx f = new fcx(5);
    public static final /* synthetic */ fcx e = new fcx(4);
    public static final /* synthetic */ fcx d = new fcx(3);
    public static final /* synthetic */ fcx c = new fcx(2);
    public static final /* synthetic */ fcx b = new fcx(1);
    public static final /* synthetic */ fcx a = new fcx(0);

    private /* synthetic */ fcx(int i2) {
        this.s = i2;
    }

    @Override // defpackage.actd
    public final Map a(Object obj) {
        switch (this.s) {
            case 0:
                return amrz.k("csn", ((acrm) obj).a());
            case 1:
                return Collections.singletonMap("bres_d", Integer.toString(0));
            case 2:
                ahef ahefVar = (ahef) obj;
                adz adzVar = new adz(2);
                aign aignVar = aign.NEW;
                xaf xafVar = xaf.AD_INTERRUPT_ACQUIRED;
                int ordinal = ahefVar.c().ordinal();
                if (ordinal == 4) {
                    adzVar.put("cpn", ahefVar.e());
                    adzVar.put("ad_cpn", ahefVar.k());
                    adzVar.put("target_cpn", ahefVar.k());
                    if (ahefVar.a() != null) {
                        adzVar.put("target_video_id", ahefVar.a().y());
                    }
                } else {
                    if (ordinal != 7) {
                        return null;
                    }
                    adzVar.put("cpn", ahefVar.e());
                }
                return adzVar;
            case 3:
                return Collections.singletonMap("cir", Integer.toString(aobq.aH(((adzs) obj).a)));
            case 4:
                return Collections.singletonMap("crm", Integer.toString(aobq.aF(((adzt) obj).a)));
            case 5:
                HashMap hashMap = new HashMap();
                hashMap.put("one", "1");
                return hashMap;
            case 6:
                return Collections.singletonMap("ohrtt", Long.toString(((aebg) obj).a));
            case 7:
                return Collections.singletonMap("orec", "1");
            case 8:
                return Collections.singletonMap("oubpr", "1");
            case 9:
                return Collections.singletonMap("outi", ((aebu) obj).a);
            case 10:
                aeqq aeqqVar = (aeqq) obj;
                FormatStreamModel f2 = aeqqVar.f();
                if (f2 == null) {
                    f2 = aeqqVar.e();
                }
                if (f2 == null) {
                    return null;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("fmt", String.valueOf(f2.e()));
                hashMap2.put("mod_local", true != f2.J() ? "0" : "1");
                return hashMap2;
            case 11:
                HashMap hashMap3 = new HashMap();
                hashMap3.put("cmt", String.valueOf(((ahde) obj).a));
                return hashMap3;
            case 12:
                if (!((ahdg) obj).a) {
                    return null;
                }
                HashMap hashMap4 = new HashMap();
                hashMap4.put("mod_pft", "cache");
                return hashMap4;
            case 13:
                HashMap hashMap5 = new HashMap();
                if (((ahdi) obj).a) {
                    hashMap5.put("mod_adap", "1");
                }
                return hashMap5;
            case 14:
                ahef ahefVar2 = (ahef) obj;
                HashMap hashMap6 = new HashMap();
                aign aignVar2 = aign.NEW;
                aiey aieyVar = aiey.START;
                int ordinal2 = ahefVar2.c().ordinal();
                if (ordinal2 != 2 && ordinal2 != 7) {
                    return null;
                }
                String e2 = ahefVar2.e();
                PlayerResponseModel b2 = ahefVar2.b();
                if (e2 == null || b2 == null) {
                    return null;
                }
                if (!b2.y().isEmpty()) {
                    hashMap6.put("docid", b2.y());
                }
                hashMap6.put("cpn", e2);
                return hashMap6;
            case 15:
                aign aignVar3 = aign.NEW;
                aiey aieyVar2 = aiey.START;
                String str = "jp";
                switch (((aiez) obj).a()) {
                    case START:
                        str = "st";
                        break;
                    case NEXT:
                        str = "n";
                        break;
                    case PREVIOUS:
                        str = "p";
                        break;
                    case AUTOPLAY:
                        str = "ap";
                        break;
                    case AUTONAV:
                        str = "an";
                        break;
                    case RETRY:
                        str = "rt";
                        break;
                    case JUMP:
                    case INSERT:
                        break;
                    default:
                        str = null;
                        break;
                }
                if (str == null) {
                    return null;
                }
                HashMap hashMap7 = new HashMap();
                hashMap7.put("yt_wt", str);
                return hashMap7;
            case 16:
                aigr aigrVar = (aigr) obj;
                HashMap hashMap8 = new HashMap();
                String str2 = aigrVar.g;
                if (!TextUtils.isEmpty(str2)) {
                    hashMap8.put("docid", str2);
                }
                if (!TextUtils.isEmpty(aigrVar.b)) {
                    hashMap8.put("cpn", aigrVar.b);
                }
                return hashMap8;
            default:
                ajmr ajmrVar = (ajmr) obj;
                int a2 = ajmrVar.a();
                StringBuilder sb = new StringBuilder(16);
                sb.append("th");
                sb.append(a2);
                sb.append("_tt");
                return Collections.singletonMap(sb.toString(), Integer.toString(ajmrVar.a));
        }
    }
}
