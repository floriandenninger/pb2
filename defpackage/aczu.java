package defpackage;

import android.content.SharedPreferences;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aczu implements amml {
    private final /* synthetic */ int u;
    public static final /* synthetic */ aczu t = new aczu(20);
    public static final /* synthetic */ aczu s = new aczu(18);
    public static final /* synthetic */ aczu r = new aczu(17);
    public static final /* synthetic */ aczu q = new aczu(16);
    public static final /* synthetic */ aczu p = new aczu(15);
    public static final /* synthetic */ aczu o = new aczu(14);
    public static final /* synthetic */ aczu n = new aczu(13);
    public static final /* synthetic */ aczu m = new aczu(12);
    public static final /* synthetic */ aczu l = new aczu(11);
    public static final /* synthetic */ aczu k = new aczu(10);
    public static final /* synthetic */ aczu j = new aczu(9);
    public static final /* synthetic */ aczu i = new aczu(8);
    public static final /* synthetic */ aczu h = new aczu(7);
    public static final /* synthetic */ aczu g = new aczu(6);
    public static final /* synthetic */ aczu f = new aczu(5);
    public static final /* synthetic */ aczu e = new aczu(4);
    public static final /* synthetic */ aczu d = new aczu(3);
    public static final /* synthetic */ aczu c = new aczu(2);
    public static final /* synthetic */ aczu b = new aczu(1);
    public static final /* synthetic */ aczu a = new aczu(0);

    public /* synthetic */ aczu(int i2) {
        this.u = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.u) {
            case 0:
                awvd awvdVar = (awvd) obj;
                int i2 = aczv.d;
                String.format("ClearStore: [id=%s][ignoredCount=%s]", awvdVar.c, Integer.valueOf(awvdVar.d));
                return awvd.a;
            case 1:
                return Boolean.valueOf(((awuv) obj).f);
            case 2:
                awvd awvdVar2 = (awvd) obj;
                int i3 = aczv.d;
                return awvdVar2 == null ? "" : awvdVar2.c;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                aone createBuilder = awvg.a.createBuilder();
                int i4 = sharedPreferences.getInt("mdx.recovery.session_type", -1);
                createBuilder.copyOnWrite();
                awvg awvgVar = (awvg) createBuilder.instance;
                awvgVar.b |= 1;
                awvgVar.c = i4;
                int i5 = sharedPreferences.getInt("mdx.recovery.disconnect_reason", -1);
                createBuilder.copyOnWrite();
                awvg awvgVar2 = (awvg) createBuilder.instance;
                awvgVar2.b = 2 | awvgVar2.b;
                awvgVar2.d = i5;
                long j2 = sharedPreferences.getLong("mdx.recovery.last_connected_time", -1L);
                createBuilder.copyOnWrite();
                awvg awvgVar3 = (awvg) createBuilder.instance;
                awvgVar3.b |= 4;
                awvgVar3.e = j2;
                long j3 = sharedPreferences.getLong("mdx.recovery.expiration_time", -1L);
                createBuilder.copyOnWrite();
                awvg awvgVar4 = (awvg) createBuilder.instance;
                awvgVar4.b |= 8;
                awvgVar4.f = j3;
                String string = sharedPreferences.getString("mdx.recovery.route_id", "");
                createBuilder.copyOnWrite();
                awvg awvgVar5 = (awvg) createBuilder.instance;
                string.getClass();
                awvgVar5.b |= 32;
                awvgVar5.g = string;
                String string2 = sharedPreferences.getString("mdx.recovery.ssdp_id", "");
                createBuilder.copyOnWrite();
                awvg awvgVar6 = (awvg) createBuilder.instance;
                string2.getClass();
                awvgVar6.b |= 4096;
                awvgVar6.m = string2;
                String string3 = sharedPreferences.getString("mdx.recovery.screen_name", "");
                createBuilder.copyOnWrite();
                awvg awvgVar7 = (awvg) createBuilder.instance;
                string3.getClass();
                awvgVar7.b |= 128;
                awvgVar7.h = string3;
                String string4 = sharedPreferences.getString("mdx.recovery.session_nonce", "");
                createBuilder.copyOnWrite();
                awvg awvgVar8 = (awvg) createBuilder.instance;
                string4.getClass();
                awvgVar8.b |= 256;
                awvgVar8.i = string4;
                int i6 = sharedPreferences.getInt("mdx.recovery.session_index", 0);
                createBuilder.copyOnWrite();
                awvg awvgVar9 = (awvg) createBuilder.instance;
                awvgVar9.b |= 512;
                awvgVar9.j = i6;
                long j4 = sharedPreferences.getLong("mdx.recovery.first_connected_time_ms", -1L);
                createBuilder.copyOnWrite();
                awvg awvgVar10 = (awvg) createBuilder.instance;
                awvgVar10.b |= 2048;
                awvgVar10.l = j4;
                long j5 = sharedPreferences.getLong("mdx.recovery.started_time_ms", -1L);
                createBuilder.copyOnWrite();
                awvg awvgVar11 = (awvg) createBuilder.instance;
                awvgVar11.b |= 1024;
                awvgVar11.k = j5;
                return (awvg) createBuilder.build();
            case 4:
                return Boolean.valueOf(((awve) obj).f);
            case 5:
                return Boolean.valueOf(((awve) obj).e);
            case 6:
                return Long.valueOf(((awve) obj).d);
            case 7:
                awve awveVar = (awve) obj;
                if ((awveVar.b & 1) != 0) {
                    return awveVar.c;
                }
                return null;
            case 8:
                aone builder = ((awve) obj).toBuilder();
                builder.copyOnWrite();
                awve awveVar2 = (awve) builder.instance;
                awveVar2.b &= -5;
                awveVar2.e = false;
                return (awve) builder.build();
            case 9:
                aone builder2 = ((awve) obj).toBuilder();
                builder2.copyOnWrite();
                awve awveVar3 = (awve) builder2.instance;
                awveVar3.b |= 8;
                awveVar3.f = true;
                return (awve) builder2.build();
            case 10:
                String str = adhq.a;
                acvk a2 = acvl.a();
                a2.b(((Boolean) obj).booleanValue());
                return a2.a();
            case 11:
                return new Exception((Throwable) obj);
            case 12:
                aose aoseVar = (aose) obj;
                ArrayList arrayList = new ArrayList(aoseVar.b.size());
                for (aosd aosdVar : aoseVar.b) {
                    adfv f2 = adfw.f();
                    f2.c = new adgg(1);
                    f2.c(new ScreenId(aosdVar.c));
                    f2.b(new adfs(aosdVar.e));
                    f2.e(aosdVar.d);
                    f2.a = null;
                    arrayList.add(new adga(f2.a()));
                }
                return arrayList;
            case 13:
                return ((ajbl) obj).R();
            case 14:
                return ((aioc) obj).V();
            case 15:
                return ((ajbl) obj).u();
            case 16:
                return false;
            case 17:
                return false;
            case 18:
                return true;
            case 19:
                awvg awvgVar12 = (awvg) obj;
                if (awvgVar12 == null) {
                    return Optional.empty();
                }
                int i7 = awvgVar12.c;
                if (i7 == -1) {
                    return Optional.empty();
                }
                int cS = amkq.cS(i7);
                String str2 = awvgVar12.g;
                if ("".equals(str2)) {
                    return Optional.empty();
                }
                adlo a3 = adlp.a();
                a3.i(cS);
                a3.e(awvgVar12.h);
                a3.d(str2);
                a3.g(awvgVar12.i);
                a3.f(awvgVar12.j);
                a3.h(awvgVar12.k);
                long j6 = awvgVar12.l;
                long j7 = awvgVar12.e;
                long j8 = awvgVar12.f;
                if (j6 != -1 && j7 != -1 && j8 != -1) {
                    boolean z = j8 == -2;
                    adkp a4 = adkq.a();
                    a4.b(j6);
                    a4.c(j7);
                    if (j8 == -2) {
                        j8 = 0;
                    }
                    a4.d(j8);
                    a4.e(z);
                    a3.b(a4.a());
                }
                int i8 = awvgVar12.d;
                if (i8 != -1) {
                    a3.c(atbi.b(i8));
                }
                if (cS == 3) {
                    String str3 = awvgVar12.m;
                    if ("".equals(str3)) {
                        return Optional.empty();
                    }
                    adkr a5 = adks.a();
                    a5.b(new adgn(str3));
                    a3.a = a5.a();
                }
                return Optional.of(a3.a());
            default:
                int i9 = adov.b;
                aone createBuilder2 = awvg.a.createBuilder();
                createBuilder2.copyOnWrite();
                awvg awvgVar13 = (awvg) createBuilder2.instance;
                awvgVar13.b |= 1;
                awvgVar13.c = -1;
                createBuilder2.copyOnWrite();
                awvg awvgVar14 = (awvg) createBuilder2.instance;
                awvgVar14.b |= 4096;
                awvgVar14.m = "";
                createBuilder2.copyOnWrite();
                awvg awvgVar15 = (awvg) createBuilder2.instance;
                awvgVar15.b |= 4;
                awvgVar15.e = -1L;
                createBuilder2.copyOnWrite();
                awvg awvgVar16 = (awvg) createBuilder2.instance;
                awvgVar16.b |= 8;
                awvgVar16.f = -1L;
                createBuilder2.copyOnWrite();
                awvg awvgVar17 = (awvg) createBuilder2.instance;
                awvgVar17.b |= 32;
                awvgVar17.g = "";
                createBuilder2.copyOnWrite();
                awvg awvgVar18 = (awvg) createBuilder2.instance;
                awvgVar18.b |= 128;
                awvgVar18.h = "";
                createBuilder2.copyOnWrite();
                awvg awvgVar19 = (awvg) createBuilder2.instance;
                awvgVar19.b = 2 | awvgVar19.b;
                awvgVar19.d = -1;
                createBuilder2.copyOnWrite();
                awvg awvgVar20 = (awvg) createBuilder2.instance;
                awvgVar20.b |= 256;
                awvgVar20.i = "";
                createBuilder2.copyOnWrite();
                awvg awvgVar21 = (awvg) createBuilder2.instance;
                awvgVar21.b |= 512;
                awvgVar21.j = 0;
                createBuilder2.copyOnWrite();
                awvg awvgVar22 = (awvg) createBuilder2.instance;
                awvgVar22.b |= 2048;
                awvgVar22.l = -1L;
                createBuilder2.copyOnWrite();
                awvg awvgVar23 = (awvg) createBuilder2.instance;
                awvgVar23.b |= 1024;
                awvgVar23.k = -1L;
                return (awvg) createBuilder2.build();
        }
    }
}
