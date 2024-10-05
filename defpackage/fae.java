package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.RefreshCommandOuterClass$RefreshCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fae {
    private final Context a;
    private final fjs b;

    public fae(Context context, fjs fjsVar) {
        this.a = context;
        this.b = fjsVar;
    }

    public static final arjv c(arjv arjvVar) {
        arke arkeVar;
        arke arkeVar2;
        arke arkeVar3;
        aveh avehVar;
        aveh avehVar2;
        arjvVar.getClass();
        arjw arjwVar = arjvVar.f;
        if (arjwVar == null) {
            arjwVar = arjw.a;
        }
        if (arjwVar.b == 58173949) {
            arkeVar = (arke) arjwVar.c;
        } else {
            arkeVar = arke.a;
        }
        if (arkeVar.c.size() == 0) {
            return null;
        }
        aong aongVar = (aong) arjvVar.toBuilder();
        aone createBuilder = aved.a.createBuilder();
        auov auovVar = auov.a;
        createBuilder.copyOnWrite();
        aved avedVar = (aved) createBuilder.instance;
        auovVar.getClass();
        avedVar.c = auovVar;
        avedVar.b |= 1;
        aved avedVar2 = (aved) createBuilder.build();
        ArrayList aO = amkq.aO();
        arjw arjwVar2 = ((arjv) aongVar.instance).f;
        if (arjwVar2 == null) {
            arjwVar2 = arjw.a;
        }
        if (arjwVar2.b == 58173949) {
            arkeVar2 = (arke) arjwVar2.c;
        } else {
            arkeVar2 = arke.a;
        }
        aony aonyVar = arkeVar2.c;
        int i = 0;
        while (i < aonyVar.size()) {
            arjy arjyVar = (arjy) aonyVar.get(i);
            if (arjyVar.b == 58174010) {
                avehVar = (aveh) arjyVar.c;
            } else {
                avehVar = aveh.a;
            }
            aone builder = avehVar.toBuilder();
            boolean z = i == 0;
            builder.copyOnWrite();
            aveh avehVar3 = (aveh) builder.instance;
            avehVar3.b |= 8;
            avehVar3.f = z;
            if (arjyVar.b == 58174010) {
                avehVar2 = (aveh) arjyVar.c;
            } else {
                avehVar2 = aveh.a;
            }
            aved avedVar3 = avehVar2.k;
            if (avedVar3 == null) {
                avedVar3 = aved.a;
            }
            auov auovVar2 = avedVar3.c;
            if (auovVar2 == null) {
                auovVar2 = auov.a;
            }
            if (auovVar2.d.size() != 0) {
                aved avedVar4 = avehVar2.k;
                if (avedVar4 == null) {
                    avedVar4 = aved.a;
                }
                auov auovVar3 = avedVar4.c;
                if (auovVar3 == null) {
                    auovVar3 = auov.a;
                }
                for (auoy auoyVar : auovVar3.d) {
                    if ((auoyVar.c & 65536) != 0) {
                        break;
                    }
                    if ((auoyVar.e & 8) != 0) {
                        apux apuxVar = auoyVar.ba;
                        if (apuxVar == null) {
                            apuxVar = apux.a;
                        }
                        apus apusVar = apuxVar.c;
                        if (apusVar == null) {
                            apusVar = apus.a;
                        }
                        int aK = aobq.aK(apusVar.c);
                        if (aK != 0 && aK == 2) {
                            break;
                        }
                    }
                    aone builder2 = arjyVar.toBuilder();
                    builder2.copyOnWrite();
                    arjy arjyVar2 = (arjy) builder2.instance;
                    aveh avehVar4 = (aveh) builder.build();
                    avehVar4.getClass();
                    arjyVar2.c = avehVar4;
                    arjyVar2.b = 58174010;
                    aO.add((arjy) builder2.build());
                    i++;
                }
            }
            builder.copyOnWrite();
            aveh avehVar5 = (aveh) builder.instance;
            avedVar2.getClass();
            avehVar5.k = avedVar2;
            avehVar5.b |= 8192;
            aone builder22 = arjyVar.toBuilder();
            builder22.copyOnWrite();
            arjy arjyVar22 = (arjy) builder22.instance;
            aveh avehVar42 = (aveh) builder.build();
            avehVar42.getClass();
            arjyVar22.c = avehVar42;
            arjyVar22.b = 58174010;
            aO.add((arjy) builder22.build());
            i++;
        }
        arjw arjwVar3 = ((arjv) aongVar.instance).f;
        if (arjwVar3 == null) {
            arjwVar3 = arjw.a;
        }
        if (arjwVar3.b == 58173949) {
            arkeVar3 = (arke) arjwVar3.c;
        } else {
            arkeVar3 = arke.a;
        }
        aone builder3 = arkeVar3.toBuilder();
        builder3.copyOnWrite();
        ((arke) builder3.instance).c = arke.emptyProtobufList();
        builder3.copyOnWrite();
        arke arkeVar4 = (arke) builder3.instance;
        arkeVar4.a();
        aolo.addAll((Iterable) aO, (List) arkeVar4.c);
        arke arkeVar5 = (arke) builder3.build();
        arjw arjwVar4 = ((arjv) aongVar.instance).f;
        if (arjwVar4 == null) {
            arjwVar4 = arjw.a;
        }
        aone builder4 = arjwVar4.toBuilder();
        builder4.copyOnWrite();
        arjw arjwVar5 = (arjw) builder4.instance;
        arkeVar5.getClass();
        arjwVar5.c = arkeVar5;
        arjwVar5.b = 58173949;
        aongVar.copyOnWrite();
        arjv arjvVar2 = (arjv) aongVar.instance;
        arjw arjwVar6 = (arjw) builder4.build();
        arjwVar6.getClass();
        arjvVar2.f = arjwVar6;
        arjvVar2.b |= 64;
        return (arjv) aongVar.build();
    }

    private final aqyg d(int i) {
        return ajcq.g(this.a.getString(i));
    }

    private final arjv e(auoy... auoyVarArr) {
        aone createBuilder = auov.a.createBuilder();
        createBuilder.aL(Arrays.asList(auoyVarArr));
        auov auovVar = (auov) createBuilder.build();
        aone createBuilder2 = aveh.a.createBuilder();
        createBuilder2.copyOnWrite();
        aveh avehVar = (aveh) createBuilder2.instance;
        avehVar.b |= 8;
        avehVar.f = true;
        createBuilder2.copyOnWrite();
        aveh avehVar2 = (aveh) createBuilder2.instance;
        avehVar2.b |= 4;
        avehVar2.e = "FElibrary";
        aone createBuilder3 = aved.a.createBuilder();
        createBuilder3.copyOnWrite();
        aved avedVar = (aved) createBuilder3.instance;
        auovVar.getClass();
        avedVar.c = auovVar;
        avedVar.b |= 1;
        createBuilder2.copyOnWrite();
        aveh avehVar3 = (aveh) createBuilder2.instance;
        aved avedVar2 = (aved) createBuilder3.build();
        avedVar2.getClass();
        avehVar3.k = avedVar2;
        avehVar3.b |= 8192;
        aveh avehVar4 = (aveh) createBuilder2.build();
        aone createBuilder4 = arke.a.createBuilder();
        createBuilder4.copyOnWrite();
        arke arkeVar = (arke) createBuilder4.instance;
        arkeVar.b |= 1;
        arkeVar.d = true;
        createBuilder4.copyOnWrite();
        arke arkeVar2 = (arke) createBuilder4.instance;
        arkeVar2.b |= 2;
        arkeVar2.e = true;
        aone createBuilder5 = arjy.a.createBuilder();
        createBuilder5.copyOnWrite();
        arjy arjyVar = (arjy) createBuilder5.instance;
        avehVar4.getClass();
        arjyVar.c = avehVar4;
        arjyVar.b = 58174010;
        createBuilder4.ai(createBuilder5);
        arke arkeVar3 = (arke) createBuilder4.build();
        aone createBuilder6 = aqwi.a.createBuilder();
        aqyg g = ajcq.g(this.a.getString(R.string.offline_application_name));
        createBuilder6.copyOnWrite();
        aqwi aqwiVar = (aqwi) createBuilder6.instance;
        g.getClass();
        aqwiVar.c = g;
        aqwiVar.b |= 1;
        aqwi aqwiVar2 = (aqwi) createBuilder6.build();
        aong aongVar = (aong) arjv.a.createBuilder();
        arnd arndVar = arnd.a;
        aongVar.copyOnWrite();
        arjv arjvVar = (arjv) aongVar.instance;
        arndVar.getClass();
        arjvVar.c = arndVar;
        arjvVar.b = 1 | arjvVar.b;
        aone createBuilder7 = arjq.a.createBuilder();
        createBuilder7.copyOnWrite();
        arjq arjqVar = (arjq) createBuilder7.instance;
        aqwiVar2.getClass();
        arjqVar.c = aqwiVar2;
        arjqVar.b = 50236216;
        aongVar.copyOnWrite();
        arjv arjvVar2 = (arjv) aongVar.instance;
        arjq arjqVar2 = (arjq) createBuilder7.build();
        arjqVar2.getClass();
        arjvVar2.d = arjqVar2;
        arjvVar2.b |= 2;
        aone createBuilder8 = arjw.a.createBuilder();
        createBuilder8.copyOnWrite();
        arjw arjwVar = (arjw) createBuilder8.instance;
        arkeVar3.getClass();
        arjwVar.c = arkeVar3;
        arjwVar.b = 58173949;
        aongVar.copyOnWrite();
        arjv arjvVar3 = (arjv) aongVar.instance;
        arjw arjwVar2 = (arjw) createBuilder8.build();
        arjwVar2.getClass();
        arjvVar3.f = arjwVar2;
        arjvVar3.b |= 64;
        return (arjv) aongVar.build();
    }

    private static apia f(int i, aqyg aqygVar, apxf apxfVar) {
        aone createBuilder = apia.a.createBuilder();
        aong aongVar = (aong) apmg.a.createBuilder();
        aongVar.copyOnWrite();
        apmg apmgVar = (apmg) aongVar.instance;
        apmgVar.d = Integer.valueOf(i - 1);
        apmgVar.c = 1;
        aongVar.copyOnWrite();
        apmg apmgVar2 = (apmg) aongVar.instance;
        apmgVar2.e = 3;
        apmgVar2.b |= 8;
        aongVar.copyOnWrite();
        apmg apmgVar3 = (apmg) aongVar.instance;
        aqygVar.getClass();
        apmgVar3.i = aqygVar;
        apmgVar3.b |= 256;
        aongVar.copyOnWrite();
        apmg apmgVar4 = (apmg) aongVar.instance;
        apxfVar.getClass();
        apmgVar4.o = apxfVar;
        apmgVar4.b |= 16384;
        createBuilder.copyOnWrite();
        apia apiaVar = (apia) createBuilder.instance;
        apmg apmgVar5 = (apmg) aongVar.build();
        apmgVar5.getClass();
        apiaVar.c = apmgVar5;
        apiaVar.b = 65153809;
        return (apia) createBuilder.build();
    }

    public final arjv a() {
        askd askdVar;
        if (this.b.h()) {
            aone createBuilder = arfu.a.createBuilder();
            aong aongVar = (aong) arfs.a.createBuilder();
            arfr arfrVar = arfr.OFFLINE_DOWNLOAD;
            aongVar.copyOnWrite();
            arfs arfsVar = (arfs) aongVar.instance;
            arfsVar.c = arfrVar.pV;
            arfsVar.b |= 1;
            createBuilder.copyOnWrite();
            arfu arfuVar = (arfu) createBuilder.instance;
            arfs arfsVar2 = (arfs) aongVar.build();
            arfsVar2.getClass();
            arfuVar.c = arfsVar2;
            arfuVar.b |= 1;
            arfu arfuVar2 = (arfu) createBuilder.build();
            aone createBuilder2 = aqbw.a.createBuilder();
            aqyg g = ajcq.g(this.a.getString(R.string.fallback_downloads_top_link_title));
            createBuilder2.copyOnWrite();
            aqbw aqbwVar = (aqbw) createBuilder2.instance;
            g.getClass();
            aqbwVar.g = g;
            aqbwVar.b |= 1;
            aone createBuilder3 = aqby.a.createBuilder();
            createBuilder3.copyOnWrite();
            aqby aqbyVar = (aqby) createBuilder3.instance;
            arfuVar2.getClass();
            aqbyVar.f = arfuVar2;
            aqbyVar.b |= 128;
            createBuilder2.copyOnWrite();
            aqbw aqbwVar2 = (aqbw) createBuilder2.instance;
            aqby aqbyVar2 = (aqby) createBuilder3.build();
            aqbyVar2.getClass();
            aqbwVar2.i = aqbyVar2;
            aqbwVar2.b |= 32;
            aone createBuilder4 = auar.a.createBuilder();
            createBuilder4.copyOnWrite();
            auar auarVar = (auar) createBuilder4.instance;
            auarVar.b |= 1;
            auarVar.c = "PPSV";
            auar auarVar2 = (auar) createBuilder4.build();
            aone createBuilder5 = aqbt.a.createBuilder();
            createBuilder5.copyOnWrite();
            aqbt aqbtVar = (aqbt) createBuilder5.instance;
            auarVar2.getClass();
            aqbtVar.c = auarVar2;
            aqbtVar.b = 135739232;
            createBuilder2.copyOnWrite();
            aqbw aqbwVar3 = (aqbw) createBuilder2.instance;
            aqbt aqbtVar2 = (aqbt) createBuilder5.build();
            aqbtVar2.getClass();
            aqbwVar3.k = aqbtVar2;
            aqbwVar3.b |= 32768;
            apxf apxfVar = fia.a;
            createBuilder2.copyOnWrite();
            aqbw aqbwVar4 = (aqbw) createBuilder2.instance;
            apxfVar.getClass();
            aqbwVar4.d = apxfVar;
            aqbwVar4.c = 4;
            aong aongVar2 = (aong) askd.a.createBuilder();
            aone createBuilder6 = askg.a.createBuilder();
            createBuilder6.copyOnWrite();
            askg askgVar = (askg) createBuilder6.instance;
            aqbw aqbwVar5 = (aqbw) createBuilder2.build();
            aqbwVar5.getClass();
            askgVar.x = aqbwVar5;
            askgVar.b |= 4096;
            aongVar2.cx(createBuilder6);
            askdVar = (askd) aongVar2.build();
        } else {
            askdVar = null;
        }
        aone createBuilder7 = apuv.a.createBuilder();
        aqyg g2 = ajcq.g(this.a.getString(R.string.fallback_client_sorting_section_renderer_header));
        createBuilder7.copyOnWrite();
        apuv apuvVar = (apuv) createBuilder7.instance;
        g2.getClass();
        apuvVar.c = g2;
        apuvVar.b |= 1;
        aone createBuilder8 = aput.a.createBuilder();
        createBuilder8.copyOnWrite();
        aput aputVar = (aput) createBuilder8.instance;
        aputVar.b |= 8;
        aputVar.f = false;
        createBuilder8.copyOnWrite();
        aput aputVar2 = (aput) createBuilder8.instance;
        aputVar2.b |= 2;
        aputVar2.d = true;
        aone createBuilder9 = apuy.a.createBuilder();
        createBuilder9.copyOnWrite();
        apuy apuyVar = (apuy) createBuilder9.instance;
        apuyVar.c = 1;
        apuyVar.b |= 1;
        createBuilder8.copyOnWrite();
        aput aputVar3 = (aput) createBuilder8.instance;
        apuy apuyVar2 = (apuy) createBuilder9.build();
        apuyVar2.getClass();
        aputVar3.e = apuyVar2;
        aputVar3.b = 4 | aputVar3.b;
        createBuilder7.copyOnWrite();
        apuv apuvVar2 = (apuv) createBuilder7.instance;
        aput aputVar4 = (aput) createBuilder8.build();
        aputVar4.getClass();
        aony aonyVar = apuvVar2.d;
        if (!aonyVar.c()) {
            apuvVar2.d = aonm.mutableCopy(aonyVar);
        }
        apuvVar2.d.add(aputVar4);
        apuv apuvVar3 = (apuv) createBuilder7.build();
        aone createBuilder10 = apux.a.createBuilder();
        aone createBuilder11 = apuw.a.createBuilder();
        createBuilder11.copyOnWrite();
        apuw apuwVar = (apuw) createBuilder11.instance;
        apuvVar3.getClass();
        apuwVar.c = apuvVar3;
        apuwVar.b = 140080728;
        createBuilder10.copyOnWrite();
        apux apuxVar = (apux) createBuilder10.instance;
        apuw apuwVar2 = (apuw) createBuilder11.build();
        apuwVar2.getClass();
        apuxVar.d = apuwVar2;
        apuxVar.b |= 2;
        aone createBuilder12 = apus.a.createBuilder();
        createBuilder12.copyOnWrite();
        apus apusVar = (apus) createBuilder12.instance;
        apusVar.c = 1;
        apusVar.b |= 1;
        createBuilder10.copyOnWrite();
        apux apuxVar2 = (apux) createBuilder10.instance;
        apus apusVar2 = (apus) createBuilder12.build();
        apusVar2.getClass();
        apuxVar2.c = apusVar2;
        apuxVar2.b |= 1;
        createBuilder10.copyOnWrite();
        apux apuxVar3 = (apux) createBuilder10.instance;
        aony aonyVar2 = apuxVar3.g;
        if (!aonyVar2.c()) {
            apuxVar3.g = aonm.mutableCopy(aonyVar2);
        }
        apuxVar3.g.add("PPSV");
        apux apuxVar4 = (apux) createBuilder10.build();
        aone createBuilder13 = auoy.a.createBuilder();
        createBuilder13.copyOnWrite();
        auoy auoyVar = (auoy) createBuilder13.instance;
        apuxVar4.getClass();
        auoyVar.ba = apuxVar4;
        auoyVar.e |= 8;
        auoy auoyVar2 = (auoy) createBuilder13.build();
        if (askdVar != null) {
            aone createBuilder14 = auoy.a.createBuilder();
            createBuilder14.copyOnWrite();
            auoy auoyVar3 = (auoy) createBuilder14.instance;
            auoyVar3.j = askdVar;
            auoyVar3.b |= 16;
            return e((auoy) createBuilder14.build(), auoyVar2);
        }
        return e(auoyVar2);
    }

    public final arjv b(arjv arjvVar) {
        arke arkeVar;
        arfr arfrVar;
        arke arkeVar2;
        aveh avehVar;
        arjvVar.getClass();
        arjw arjwVar = arjvVar.f;
        if (arjwVar == null) {
            arjwVar = arjw.a;
        }
        if (arjwVar.b == 58173949) {
            arkeVar = (arke) arjwVar.c;
        } else {
            arkeVar = arke.a;
        }
        if (arkeVar.c.size() == 0) {
            return null;
        }
        aong aongVar = (aong) arjvVar.toBuilder();
        aong aongVar2 = (aong) askd.a.createBuilder();
        boolean h = this.b.h();
        boolean z = arjvVar.s;
        aone createBuilder = apib.a.createBuilder();
        aone createBuilder2 = apic.a.createBuilder();
        createBuilder2.copyOnWrite();
        apic apicVar = (apic) createBuilder2.instance;
        apicVar.c = 1;
        apicVar.b |= 1;
        createBuilder.copyOnWrite();
        apib apibVar = (apib) createBuilder.instance;
        apic apicVar2 = (apic) createBuilder2.build();
        apicVar2.getClass();
        apibVar.j = apicVar2;
        apibVar.b |= 256;
        aone createBuilder3 = apid.a.createBuilder();
        if (z || h) {
            arfrVar = arfr.OFFLINE_NO_CONTENT;
        } else {
            arfrVar = arfr.OFFLINE_NO_CONTENT_UPSIDE_DOWN;
        }
        createBuilder3.copyOnWrite();
        apid apidVar = (apid) createBuilder3.instance;
        apidVar.c = arfrVar.pV;
        apidVar.b |= 1;
        createBuilder.copyOnWrite();
        apib apibVar2 = (apib) createBuilder.instance;
        apid apidVar2 = (apid) createBuilder3.build();
        apidVar2.getClass();
        apibVar2.d = apidVar2;
        apibVar2.c = 3;
        if (h) {
            aqyg d = d(R.string.offline_no_content_title_offline_eligible_and_has_content);
            createBuilder.copyOnWrite();
            apib apibVar3 = (apib) createBuilder.instance;
            d.getClass();
            apibVar3.e = d;
            apibVar3.b |= 1;
            aong aongVar3 = (aong) apxf.a.createBuilder();
            aongVar3.e(DownloadsPageEndpointOuterClass.downloadsPageEndpoint, aqng.a);
            apxf apxfVar = (apxf) aongVar3.build();
            if (this.b.n()) {
                aqyg d2 = d(R.string.offline_no_content_title_has_download_recommendations);
                createBuilder.copyOnWrite();
                apib apibVar4 = (apib) createBuilder.instance;
                d2.getClass();
                apibVar4.e = d2;
                apibVar4.b |= 1;
                aqyg d3 = d(R.string.offline_no_content_body_text_has_download_recommendations);
                createBuilder.copyOnWrite();
                apib apibVar5 = (apib) createBuilder.instance;
                d3.getClass();
                apibVar5.f = d3;
                apibVar5.b |= 2;
                apia f = f(3, d(R.string.offline_no_content_button_text_has_download_recommendations), apxfVar);
                createBuilder.copyOnWrite();
                apib apibVar6 = (apib) createBuilder.instance;
                f.getClass();
                apibVar6.h = f;
                apibVar6.b |= 64;
            } else if (this.b.e()) {
                aqyg d4 = d(R.string.offline_no_content_body_text_has_both_downloads_and_recommendations);
                createBuilder.copyOnWrite();
                apib apibVar7 = (apib) createBuilder.instance;
                d4.getClass();
                apibVar7.f = d4;
                apibVar7.b |= 2;
                apia f2 = f(3, d(R.string.offline_no_content_button_text_has_download_recommendations), apxfVar);
                createBuilder.copyOnWrite();
                apib apibVar8 = (apib) createBuilder.instance;
                f2.getClass();
                apibVar8.h = f2;
                apibVar8.b |= 64;
            } else {
                aqyg d5 = d(R.string.offline_no_content_body_text_offline_eligible_and_has_only_singletons);
                createBuilder.copyOnWrite();
                apib apibVar9 = (apib) createBuilder.instance;
                d5.getClass();
                apibVar9.f = d5;
                apibVar9.b |= 2;
                apia f3 = f(3, d(R.string.offline_no_content_downloads_button_text), apxfVar);
                createBuilder.copyOnWrite();
                apib apibVar10 = (apib) createBuilder.instance;
                f3.getClass();
                apibVar10.h = f3;
                apibVar10.b |= 64;
            }
        } else if (z) {
            aqyg d6 = d(R.string.offline_no_content_title_offline_eligible_and_no_content);
            createBuilder.copyOnWrite();
            apib apibVar11 = (apib) createBuilder.instance;
            d6.getClass();
            apibVar11.e = d6;
            apibVar11.b |= 1;
            aqyg d7 = d(R.string.offline_no_content_body_text_offline_eligible_and_no_content);
            createBuilder.copyOnWrite();
            apib apibVar12 = (apib) createBuilder.instance;
            d7.getClass();
            apibVar12.f = d7;
            apibVar12.b |= 2;
        } else {
            aqyg d8 = d(R.string.offline_no_content_title_not_offline_eligible);
            createBuilder.copyOnWrite();
            apib apibVar13 = (apib) createBuilder.instance;
            d8.getClass();
            apibVar13.e = d8;
            apibVar13.b |= 1;
            aqyg d9 = d(R.string.offline_no_content_body_text_not_offline_eligible);
            createBuilder.copyOnWrite();
            apib apibVar14 = (apib) createBuilder.instance;
            d9.getClass();
            apibVar14.f = d9;
            apibVar14.b |= 2;
        }
        aone createBuilder4 = RefreshCommandOuterClass$RefreshCommand.a.createBuilder();
        createBuilder4.copyOnWrite();
        RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand = (RefreshCommandOuterClass$RefreshCommand) createBuilder4.instance;
        refreshCommandOuterClass$RefreshCommand.c = 1;
        refreshCommandOuterClass$RefreshCommand.b |= 1;
        RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand2 = (RefreshCommandOuterClass$RefreshCommand) createBuilder4.build();
        aong aongVar4 = (aong) apxf.a.createBuilder();
        aongVar4.e(RefreshCommandOuterClass$RefreshCommand.refreshCommand, refreshCommandOuterClass$RefreshCommand2);
        apia f4 = f(14, d(R.string.offline_retry), (apxf) aongVar4.build());
        createBuilder.copyOnWrite();
        apib apibVar15 = (apib) createBuilder.instance;
        f4.getClass();
        apibVar15.i = f4;
        apibVar15.b |= 128;
        apib apibVar16 = (apib) createBuilder.build();
        aone createBuilder5 = askg.a.createBuilder();
        createBuilder5.copyOnWrite();
        askg askgVar = (askg) createBuilder5.instance;
        apibVar16.getClass();
        askgVar.ag = apibVar16;
        askgVar.f |= 512;
        aongVar2.cn((askg) createBuilder5.build());
        askd askdVar = (askd) aongVar2.build();
        aone createBuilder6 = auov.a.createBuilder();
        aone createBuilder7 = auoy.a.createBuilder();
        createBuilder7.copyOnWrite();
        auoy auoyVar = (auoy) createBuilder7.instance;
        askdVar.getClass();
        auoyVar.j = askdVar;
        auoyVar.b |= 16;
        createBuilder6.aN(createBuilder7);
        auov auovVar = (auov) createBuilder6.build();
        aone createBuilder8 = aved.a.createBuilder();
        createBuilder8.copyOnWrite();
        aved avedVar = (aved) createBuilder8.instance;
        auovVar.getClass();
        avedVar.c = auovVar;
        avedVar.b |= 1;
        aved avedVar2 = (aved) createBuilder8.build();
        arjw arjwVar2 = arjvVar.f;
        if (arjwVar2 == null) {
            arjwVar2 = arjw.a;
        }
        if (arjwVar2.b == 58173949) {
            arkeVar2 = (arke) arjwVar2.c;
        } else {
            arkeVar2 = arke.a;
        }
        aone builder = arkeVar2.toBuilder();
        builder.copyOnWrite();
        ((arke) builder.instance).c = arke.emptyProtobufList();
        aone createBuilder9 = arjy.a.createBuilder();
        arjy arjyVar = (arjy) arkeVar2.c.get(0);
        if (arjyVar.b == 58174010) {
            avehVar = (aveh) arjyVar.c;
        } else {
            avehVar = aveh.a;
        }
        aone builder2 = avehVar.toBuilder();
        builder2.copyOnWrite();
        aveh avehVar2 = (aveh) builder2.instance;
        avedVar2.getClass();
        avehVar2.k = avedVar2;
        avehVar2.b |= 8192;
        builder2.copyOnWrite();
        aveh avehVar3 = (aveh) builder2.instance;
        avehVar3.b |= 8;
        avehVar3.f = true;
        String string = this.a.getString(R.string.offline_application_name);
        builder2.copyOnWrite();
        aveh avehVar4 = (aveh) builder2.instance;
        string.getClass();
        avehVar4.b |= 4;
        avehVar4.e = string;
        createBuilder9.copyOnWrite();
        arjy arjyVar2 = (arjy) createBuilder9.instance;
        aveh avehVar5 = (aveh) builder2.build();
        avehVar5.getClass();
        arjyVar2.c = avehVar5;
        arjyVar2.b = 58174010;
        builder.ai(createBuilder9);
        arke arkeVar3 = (arke) builder.build();
        arjw arjwVar3 = ((arjv) aongVar.instance).f;
        if (arjwVar3 == null) {
            arjwVar3 = arjw.a;
        }
        aone builder3 = arjwVar3.toBuilder();
        builder3.copyOnWrite();
        arjw arjwVar4 = (arjw) builder3.instance;
        arkeVar3.getClass();
        arjwVar4.c = arkeVar3;
        arjwVar4.b = 58173949;
        aongVar.copyOnWrite();
        arjv arjvVar2 = (arjv) aongVar.instance;
        arjw arjwVar5 = (arjw) builder3.build();
        arjwVar5.getClass();
        arjvVar2.f = arjwVar5;
        arjvVar2.b |= 64;
        return (arjv) aongVar.build();
    }
}
