package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fkl implements zff {
    public final /* synthetic */ ammy a;
    public final /* synthetic */ ywl b;
    private final /* synthetic */ int c;

    public /* synthetic */ fkl(ammy ammyVar, ywl ywlVar, int i) {
        this.c = i;
        this.a = ammyVar;
        this.b = ywlVar;
    }

    @Override // defpackage.zff
    public final void a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                ammy ammyVar = this.a;
                ywl ywlVar = this.b;
                amsx amsxVar = fkr.a;
                if (ammyVar.a(fkc.OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED)) {
                    boolean booleanValue = ((Boolean) ywlVar.a(fkc.OFFLINE_BUTTON_POOR_CONNECTIVITY_TOOLTIP_DISABLED, false)).booleanValue();
                    aone aoneVar = (aone) obj2;
                    aoneVar.copyOnWrite();
                    fke fkeVar = (fke) aoneVar.instance;
                    fke fkeVar2 = fke.a;
                    fkeVar.b |= 1;
                    fkeVar.c = booleanValue;
                    return;
                }
                return;
            case 1:
                ammy ammyVar2 = this.a;
                ywl ywlVar2 = this.b;
                String str = (String) obj;
                amsx amsxVar2 = evx.a;
                if (ammyVar2.a(str)) {
                    boolean booleanValue2 = ((Boolean) ywlVar2.a(str, true)).booleanValue();
                    aone aoneVar2 = (aone) obj2;
                    aoneVar2.copyOnWrite();
                    evq evqVar = (evq) aoneVar2.instance;
                    evq evqVar2 = evq.a;
                    evqVar.b |= 2;
                    evqVar.d = !booleanValue2;
                    return;
                }
                return;
            case 2:
                ammy ammyVar3 = this.a;
                ywl ywlVar3 = this.b;
                amsx amsxVar3 = fkr.a;
                if (ammyVar3.a(fkc.OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS)) {
                    long longValue = ((Long) ywlVar3.a(fkc.OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS, 0L)).longValue();
                    aone aoneVar3 = (aone) obj2;
                    aoneVar3.copyOnWrite();
                    fke fkeVar3 = (fke) aoneVar3.instance;
                    fke fkeVar4 = fke.a;
                    fkeVar3.b |= 8;
                    fkeVar3.f = longValue;
                    return;
                }
                return;
            case 3:
                ammy ammyVar4 = this.a;
                ywl ywlVar4 = this.b;
                amsx amsxVar4 = fkr.a;
                if (ammyVar4.a("cross_device_offline_device_name")) {
                    String str2 = (String) ywlVar4.a("cross_device_offline_device_name", "");
                    aone aoneVar4 = (aone) obj2;
                    aoneVar4.copyOnWrite();
                    fkg fkgVar = (fkg) aoneVar4.instance;
                    fkg fkgVar2 = fkg.a;
                    str2.getClass();
                    fkgVar.b |= 1;
                    fkgVar.c = str2;
                    return;
                }
                return;
            case 4:
                ammy ammyVar5 = this.a;
                ywl ywlVar5 = this.b;
                amsx amsxVar5 = fkr.a;
                if (ammyVar5.a("cross_device_offline_device_state")) {
                    boolean booleanValue3 = ((Boolean) ywlVar5.a("cross_device_offline_device_state", false)).booleanValue();
                    aone aoneVar5 = (aone) obj2;
                    aoneVar5.copyOnWrite();
                    fkg fkgVar3 = (fkg) aoneVar5.instance;
                    fkg fkgVar4 = fkg.a;
                    fkgVar3.b |= 2;
                    fkgVar3.d = booleanValue3;
                    return;
                }
                return;
            case 5:
                ammy ammyVar6 = this.a;
                ywl ywlVar6 = this.b;
                amsx amsxVar6 = fkr.a;
                if (ammyVar6.a("offline_has_shown_1080p_option")) {
                    boolean booleanValue4 = ((Boolean) ywlVar6.a("offline_has_shown_1080p_option", false)).booleanValue();
                    aone aoneVar6 = (aone) obj2;
                    aoneVar6.copyOnWrite();
                    fkg fkgVar5 = (fkg) aoneVar6.instance;
                    fkg fkgVar6 = fkg.a;
                    fkgVar5.b |= 4;
                    fkgVar5.e = booleanValue4;
                    return;
                }
                return;
            case 6:
                ammy ammyVar7 = this.a;
                ywl ywlVar7 = this.b;
                amsx amsxVar7 = fkr.a;
                if (ammyVar7.a("offline_has_shown_1080p_tooltip")) {
                    boolean booleanValue5 = ((Boolean) ywlVar7.a("offline_has_shown_1080p_tooltip", false)).booleanValue();
                    aone aoneVar7 = (aone) obj2;
                    aoneVar7.copyOnWrite();
                    fkg fkgVar7 = (fkg) aoneVar7.instance;
                    fkg fkgVar8 = fkg.a;
                    fkgVar7.b |= 8;
                    fkgVar7.f = booleanValue5;
                    return;
                }
                return;
            case 7:
                ammy ammyVar8 = this.a;
                ywl ywlVar8 = this.b;
                amsx amsxVar8 = fkr.a;
                if (ammyVar8.a("offline_has_shown_download_expiration_disclaimer")) {
                    boolean booleanValue6 = ((Boolean) ywlVar8.a("offline_has_shown_download_expiration_disclaimer", false)).booleanValue();
                    aone aoneVar8 = (aone) obj2;
                    aoneVar8.copyOnWrite();
                    fkg fkgVar9 = (fkg) aoneVar8.instance;
                    fkg fkgVar10 = fkg.a;
                    fkgVar9.b |= 16;
                    fkgVar9.g = booleanValue6;
                    return;
                }
                return;
            case 8:
                ammy ammyVar9 = this.a;
                ywl ywlVar9 = this.b;
                amsx amsxVar9 = fkr.a;
                if (ammyVar9.a("offline_stream_snackbar_impressions")) {
                    long longValue2 = ((Long) ywlVar9.a("offline_stream_snackbar_impressions", 0L)).longValue();
                    aone aoneVar9 = (aone) obj2;
                    aoneVar9.copyOnWrite();
                    fkg fkgVar11 = (fkg) aoneVar9.instance;
                    fkg fkgVar12 = fkg.a;
                    fkgVar11.b |= 32;
                    fkgVar11.h = longValue2;
                    return;
                }
                return;
            case 9:
                ammy ammyVar10 = this.a;
                ywl ywlVar10 = this.b;
                amsx amsxVar10 = fkr.a;
                if (ammyVar10.a("offline_stream_snackbar_last_shown")) {
                    long longValue3 = ((Long) ywlVar10.a("offline_stream_snackbar_last_shown", 0L)).longValue();
                    aone aoneVar10 = (aone) obj2;
                    aoneVar10.copyOnWrite();
                    fkg fkgVar13 = (fkg) aoneVar10.instance;
                    fkg fkgVar14 = fkg.a;
                    fkgVar13.b |= 64;
                    fkgVar13.i = longValue3;
                    return;
                }
                return;
            case 10:
                ammy ammyVar11 = this.a;
                ywl ywlVar11 = this.b;
                amsx amsxVar11 = fkr.a;
                if (ammyVar11.a("offline_recs_enabled")) {
                    boolean booleanValue7 = ((Boolean) ywlVar11.a("offline_recs_enabled", true)).booleanValue();
                    aone aoneVar11 = (aone) obj2;
                    aoneVar11.copyOnWrite();
                    fkg fkgVar15 = (fkg) aoneVar11.instance;
                    fkg fkgVar16 = fkg.a;
                    fkgVar15.b |= 128;
                    fkgVar15.k = booleanValue7;
                    return;
                }
                return;
            case 11:
                ammy ammyVar12 = this.a;
                ywl ywlVar12 = this.b;
                amsx amsxVar12 = fkr.a;
                if (ammyVar12.a("offline_quality_preference_updated_timestamp_millis")) {
                    long longValue4 = ((Long) ywlVar12.a("offline_quality_preference_updated_timestamp_millis", 0L)).longValue();
                    aone aoneVar12 = (aone) obj2;
                    aoneVar12.copyOnWrite();
                    fkg fkgVar17 = (fkg) aoneVar12.instance;
                    fkg fkgVar18 = fkg.a;
                    fkgVar17.b |= 256;
                    fkgVar17.l = longValue4;
                    return;
                }
                return;
            case 12:
                ammy ammyVar13 = this.a;
                ywl ywlVar13 = this.b;
                amsx amsxVar13 = fkr.a;
                if (ammyVar13.a("last_downloads_page_usage_seconds")) {
                    long longValue5 = ((Long) ywlVar13.a("last_downloads_page_usage_seconds", 0L)).longValue();
                    aone aoneVar13 = (aone) obj2;
                    aoneVar13.copyOnWrite();
                    fkg fkgVar19 = (fkg) aoneVar13.instance;
                    fkg fkgVar20 = fkg.a;
                    fkgVar19.b |= 512;
                    fkgVar19.m = longValue5;
                    return;
                }
                return;
            case 13:
                ammy ammyVar14 = this.a;
                ywl ywlVar14 = this.b;
                String str3 = (String) obj;
                amsx amsxVar14 = oay.a;
                if (ammyVar14.a(str3)) {
                    long longValue6 = ((Long) ywlVar14.a(str3, 0L)).longValue();
                    aone aoneVar14 = (aone) obj2;
                    aoneVar14.copyOnWrite();
                    oaz oazVar = (oaz) aoneVar14.instance;
                    oaz oazVar2 = oaz.a;
                    oazVar.b |= 1;
                    oazVar.c = longValue6;
                    return;
                }
                return;
            default:
                ammy ammyVar15 = this.a;
                ywl ywlVar15 = this.b;
                String str4 = (String) obj;
                amsx amsxVar15 = oay.a;
                if (ammyVar15.a(str4)) {
                    int intValue = ((Integer) ywlVar15.a(str4, 0)).intValue();
                    aone aoneVar15 = (aone) obj2;
                    aoneVar15.copyOnWrite();
                    oaz oazVar3 = (oaz) aoneVar15.instance;
                    oaz oazVar4 = oaz.a;
                    oazVar3.b |= 2;
                    oazVar3.d = intValue;
                    return;
                }
                return;
        }
    }
}
