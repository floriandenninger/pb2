package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kvd extends aiaz implements aibv, aimu {
    private final ahqr c;
    private boolean d;
    private int e;
    private int[] f;
    private int[] g;

    public kvd(kvf kvfVar, ahqr ahqrVar, fnv fnvVar) {
        super(kvfVar, fnvVar);
        this.c = ahqrVar;
    }

    @Override // defpackage.aiax
    public final int a() {
        if (!this.d || this.f == null || j() >= ((int[]) amkq.u(this.f)).length) {
            return super.a();
        }
        int i = ((int[]) amkq.u(this.f))[j()];
        if (i != this.e || ((aiaz) this).a == 1) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.aiax
    public final int b() {
        if (!this.d || this.g == null || j() >= ((int[]) amkq.u(this.g)).length) {
            return super.b();
        }
        if (j() != this.e || ((aiaz) this).a == 1) {
            return ((int[]) amkq.u(this.g))[j()];
        }
        return -1;
    }

    @Override // defpackage.aiax, defpackage.aibc
    public final PlaybackStartDescriptor c(aims aimsVar) {
        PlaybackStartDescriptor c = super.c(aimsVar);
        apxf apxfVar = null;
        if (c == null) {
            return null;
        }
        aifz d = PlaybackStartDescriptor.d();
        apxf apxfVar2 = c.b;
        if (apxfVar2 != null) {
            try {
                aone createBuilder = owc.a.createBuilder();
                createBuilder.m22mergeFrom(apxfVar2.c, aomw.b());
                owc owcVar = (owc) createBuilder.instance;
                if ((owcVar.b & 8) != 0 && owcVar.e.equals("BFa")) {
                    aimr aimrVar = aimr.NEXT;
                    int ordinal = aimsVar.e.ordinal();
                    if (ordinal == 0) {
                        createBuilder.copyOnWrite();
                        owc owcVar2 = (owc) createBuilder.instance;
                        owcVar2.b |= 8;
                        owcVar2.e = "bf_next";
                    } else if (ordinal == 1) {
                        createBuilder.copyOnWrite();
                        owc owcVar3 = (owc) createBuilder.instance;
                        owcVar3.b |= 8;
                        owcVar3.e = "bf_prev";
                    } else if (ordinal == 2 || ordinal == 3) {
                        createBuilder.copyOnWrite();
                        owc owcVar4 = (owc) createBuilder.instance;
                        owcVar4.b |= 8;
                        owcVar4.e = "autoplay";
                    }
                }
                aong aongVar = (aong) apxfVar2.toBuilder();
                aomf byteString = ((owc) createBuilder.build()).toByteString();
                aongVar.copyOnWrite();
                apxf apxfVar3 = (apxf) aongVar.instance;
                apxfVar3.b |= 1;
                apxfVar3.c = byteString;
                apxfVar = (apxf) aongVar.build();
            } catch (aoob unused) {
                apxfVar = apxfVar2;
            }
            if (this.c.a() != null) {
                apxfVar = this.c.a().h(apxfVar);
            }
        }
        d.a = apxfVar;
        return d.a();
    }

    @Override // defpackage.aiaz, defpackage.aibc
    public final aims d(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        if (playbackStartDescriptor.k().isEmpty()) {
            return null;
        }
        return super.d(playbackStartDescriptor, aigdVar);
    }

    @Override // defpackage.aibv
    public final void e() {
        n();
        ((aiaz) this).a = 0;
        rR(false);
        this.g = null;
        this.f = null;
    }

    @Override // defpackage.aimu
    public final void rR(boolean z) {
        this.d = z;
        if (z) {
            if (this.f == null || this.g == null) {
                int i = 0;
                int i2 = i(0);
                this.e = j();
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < i2; i3++) {
                    arrayList.add(Integer.valueOf(i3));
                }
                Collections.shuffle(arrayList);
                this.f = new int[i2];
                this.g = new int[i2];
                while (i < i2) {
                    int intValue = ((Integer) arrayList.get(i)).intValue();
                    int i4 = i + 1;
                    this.f[intValue] = ((Integer) arrayList.get(i4 % i2)).intValue();
                    this.g[intValue] = ((Integer) arrayList.get(((i - 1) + i2) % i2)).intValue();
                    i = i4;
                }
            }
        }
    }

    @Override // defpackage.aimu
    public final boolean rS() {
        return this.d;
    }

    @Override // defpackage.aimu
    public final boolean rT() {
        return true;
    }
}
