package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpw implements jpi {
    private final Context a;
    private final aahv b;
    private final shf c;
    private final axzg d;
    private final ajoy e;

    public jpw(Context context, aahv aahvVar, ajoy ajoyVar, shf shfVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = context;
        this.b = aahvVar;
        this.e = ajoyVar;
        this.c = shfVar;
        this.d = axzgVar;
    }

    private static void i(awxk awxkVar, amru amruVar) {
        int size = amruVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            awjp b = ((awji) amruVar.get(i2)).b();
            if (b != null && b.h() && b.getThumbnail() != null) {
                avgg[] avggVarArr = {b.getThumbnail()};
                for (int i3 = 0; i3 <= 0; i3++) {
                    avgg avggVar = avggVarArr[i3];
                    aone aoneVar = awxkVar.a;
                    aoneVar.copyOnWrite();
                    aqnq aqnqVar = (aqnq) aoneVar.instance;
                    aqnq aqnqVar2 = aqnq.a;
                    avggVar.getClass();
                    aony aonyVar = aqnqVar.d;
                    if (!aonyVar.c()) {
                        aqnqVar.d = aonm.mutableCopy(aonyVar);
                    }
                    aqnqVar.d.add(avggVar);
                }
                i++;
                if (i >= 2) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.jpi
    public final int a() {
        return 156;
    }

    @Override // defpackage.jpi
    public final int b() {
        return 192;
    }

    @Override // defpackage.jpi
    public final /* bridge */ /* synthetic */ jpg c(aakt aaktVar, String str, jph jphVar) {
        awjd awjdVar;
        avgg avggVar;
        awig awigVar = (awig) aaktVar;
        aahu c = this.b.c();
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = aqnr.a.createBuilder();
        createBuilder.copyOnWrite();
        aqnr aqnrVar = (aqnr) createBuilder.instance;
        aqnrVar.c |= 1;
        aqnrVar.f = str;
        aqnn aqnnVar = new aqnn(createBuilder);
        if (awigVar == null) {
            return jpg.a(aqnnVar.a(c));
        }
        awja b = awigVar.b();
        if (b == null) {
            return jpg.a(aqnnVar.a(c));
        }
        aakt b2 = b.b.b(b.c.f);
        amkq.O(b2 == null || (b2 instanceof awic), "entityFromStore is not instance of YtMainChannelEntityModel, key=channelOwner");
        awic awicVar = (awic) b2;
        String playlistId = b.getPlaylistId();
        int size = b.f().size();
        String title = b.getTitle();
        aone aoneVar = aqnnVar.a;
        aoneVar.copyOnWrite();
        aqnr aqnrVar2 = (aqnr) aoneVar.instance;
        title.getClass();
        aqnrVar2.c |= 4;
        aqnrVar2.h = title;
        String title2 = awicVar == null ? "" : awicVar.getTitle();
        aone aoneVar2 = aqnnVar.a;
        aoneVar2.copyOnWrite();
        aqnr aqnrVar3 = (aqnr) aoneVar2.instance;
        title2.getClass();
        aqnrVar3.c |= 8;
        aqnrVar3.i = title2;
        aong aongVar = (aong) awas.a.createBuilder();
        String playlistId2 = b.getPlaylistId();
        aongVar.copyOnWrite();
        awas awasVar = (awas) aongVar.instance;
        playlistId2.getClass();
        awasVar.b |= 1;
        awasVar.c = playlistId2;
        aongVar.copyOnWrite();
        awas awasVar2 = (awas) aongVar.instance;
        awasVar2.b |= 2;
        awasVar2.d = 156;
        String f = fhe.f((awas) aongVar.build());
        aone aoneVar3 = aqnnVar.a;
        aoneVar3.copyOnWrite();
        aqnr aqnrVar4 = (aqnr) aoneVar3.instance;
        f.getClass();
        aqnrVar4.c |= 256;
        aqnrVar4.l = f;
        aone aoneVar4 = aqnnVar.a;
        aoneVar4.copyOnWrite();
        aqnr aqnrVar5 = (aqnr) aoneVar4.instance;
        playlistId.getClass();
        aqnrVar5.c |= 2;
        aqnrVar5.g = playlistId;
        Integer valueOf = Integer.valueOf(size);
        aone aoneVar5 = aqnnVar.a;
        int intValue = valueOf.intValue();
        aoneVar5.copyOnWrite();
        aqnr aqnrVar6 = (aqnr) aoneVar5.instance;
        aqnrVar6.c |= 32;
        aqnrVar6.k = intValue;
        String quantityString = this.a.getResources().getQuantityString(R.plurals.video_count, size, valueOf);
        aone aoneVar6 = aqnnVar.a;
        aoneVar6.copyOnWrite();
        aqnr aqnrVar7 = (aqnr) aoneVar6.instance;
        quantityString.getClass();
        aqnrVar7.c |= 16;
        aqnrVar7.j = quantityString;
        awas z = etx.z(str, this.d);
        if (z == null || !z.pY(aqns.b)) {
            awjdVar = awjd.PLAYLIST_THUMBNAIL_STYLE_UNKNOWN;
        } else {
            awjdVar = awjd.b(((aqns) z.pX(aqns.b)).d);
            if (awjdVar == null) {
                awjdVar = awjd.PLAYLIST_THUMBNAIL_STYLE_UNKNOWN;
            }
        }
        aahu c2 = this.b.c();
        amru amruVar = (amru) c2.f(fhe.t(playlistId)).g(awja.class).x(jif.o).O(jif.q).t(new fiy(c2, 3)).L(iub.l).av().G(jif.p).X();
        auct auctVar = (auct) b.getThumbnailStyleDataMap().get(Integer.valueOf(awjdVar.f));
        int ordinal = awjdVar.ordinal();
        if (ordinal == 2) {
            awxk a = aqnm.a();
            a.n(awjdVar);
            int size2 = amruVar.size();
            int i = 0;
            for (int i2 = 0; i2 < size2; i2++) {
                awjp b3 = ((awji) amruVar.get(i2)).b();
                if (b3 != null && b3.h() && b3.getThumbnail() != null) {
                    a.m(b3.getThumbnail());
                    i++;
                    if (i >= 2) {
                        break;
                    }
                }
            }
            int size3 = amruVar.size();
            if (size3 > 2) {
                i(a, amruVar.subList(2, size3));
            }
            aqnnVar.c(a.l(this.b.c()).b);
        } else if (ordinal == 3 || ordinal == 4) {
            awxk a2 = aqnm.a();
            a2.n(awjdVar);
            if (auctVar != null) {
                aucu aucuVar = auctVar.a().b;
                if ((aucuVar.b & 1) != 0) {
                    avgg[] avggVarArr = new avgg[1];
                    avgg avggVar2 = aucuVar.c;
                    if (avggVar2 == null) {
                        avggVar2 = avgg.a;
                    }
                    avggVarArr[0] = avggVar2;
                    a2.m(avggVarArr);
                }
            }
            i(a2, amruVar);
            aqnnVar.c(a2.l(this.b.c()).b);
        } else {
            if (auctVar != null) {
                aucv aucvVar = auctVar.b;
                if (aucvVar.b == 1) {
                    avggVar = (avgg) aucvVar.c;
                } else {
                    avggVar = avgg.a;
                }
                aone aoneVar7 = aqnnVar.a;
                aoneVar7.copyOnWrite();
                aqnr aqnrVar8 = (aqnr) aoneVar7.instance;
                avggVar.getClass();
                aqnrVar8.e = avggVar;
                aqnrVar8.d = 6;
            }
            aqnnVar.d(Integer.valueOf(acrb.DOWNLOADS_PAGE_PLAYLIST.Jk));
            return jpg.a(aqnnVar.a(c));
        }
        String ac = mcy.ac(this.a.getResources(), this.c, awigVar.getLastSyncedTimestampMillis().longValue());
        aone aoneVar8 = aqnnVar.a;
        aoneVar8.copyOnWrite();
        aqnr aqnrVar9 = (aqnr) aoneVar8.instance;
        ac.getClass();
        aqnrVar9.c |= 2048;
        aqnrVar9.o = ac;
        aqnnVar.d(Integer.valueOf(acrb.OFFLINE_BUNDLE_ITEM_RENDERER.Jk));
        return jpg.a(aqnnVar.a(c));
    }

    @Override // defpackage.jpi
    public final ammv d(String str) {
        awas z = etx.z(str, this.d);
        return z == null ? amlr.a : ammv.j(fhe.g(z.c));
    }

    @Override // defpackage.jpi
    public final amsx e(String str) {
        awas z = etx.z(str, this.d);
        if (z == null) {
            return amvs.a;
        }
        String str2 = z.c;
        String g = fhe.g(str2);
        String t = fhe.t(str2);
        awja awjaVar = (awja) this.b.c().f(t).g(awja.class).X();
        amsv i = amsx.i();
        i.i(this.e.G(g), this.e.G(t));
        if (awjaVar != null) {
            i.c(this.e.G(awjaVar.c.f));
        }
        return i.g();
    }

    @Override // defpackage.jpi
    public final Class f() {
        return awig.class;
    }

    @Override // defpackage.jpi
    public final Class g() {
        return aqnp.class;
    }

    @Override // defpackage.jpi
    public final aajc h(String str) {
        return new aajc(2, str);
    }
}
