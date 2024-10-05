package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jup extends agsb {
    public static final /* synthetic */ int b = 0;
    public final ysy a;
    private final SharedPreferences i;
    private final fka j;
    private final shf k;
    private final axzf l;

    public jup(SharedPreferences sharedPreferences, fka fkaVar, aaea aaeaVar, int i, ysy ysyVar, agsd agsdVar, shf shfVar, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(sharedPreferences, aaeaVar, i, agsdVar);
        this.i = sharedPreferences;
        this.j = fkaVar;
        this.a = ysyVar;
        this.k = shfVar;
        this.l = axzfVar;
    }

    public final long a() {
        return ((fkg) this.j.a.c()).l;
    }

    @Override // defpackage.agsb, defpackage.agsg
    public final ammy b() {
        return juz.b;
    }

    @Override // defpackage.agsb, defpackage.agsg
    public final ammy c() {
        return new ammy() { // from class: juo
            @Override // defpackage.ammy
            public final boolean a(Object obj) {
                PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor) obj;
                return (jup.this.a.o() && (playbackStartDescriptor == null || TextUtils.isEmpty(playbackStartDescriptor.k()))) ? false : true;
            }
        };
    }

    @Override // defpackage.agsb, defpackage.agsg
    public final amru d() {
        ArrayList arrayList = new ArrayList(this.g);
        Collections.sort(arrayList, ahab.b);
        return amru.o(arrayList);
    }

    @Override // defpackage.agsb, defpackage.agsg
    public final Comparator e() {
        return ahab.f;
    }

    @Override // defpackage.agsb, defpackage.agsg
    public final Comparator f() {
        return ahab.d;
    }

    public final void k(atom atomVar) {
        if (atomVar == null || (atomVar.b & 1) == 0) {
            return;
        }
        atol b2 = atol.b(atomVar.d);
        if (b2 == null) {
            b2 = atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN;
        }
        if (b2 == atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_SAVE) {
            atrx b3 = atrx.b(atomVar.c);
            if (b3 == null) {
                b3 = atrx.UNKNOWN_FORMAT_TYPE;
            }
            super.E(b3);
            ynm.m(this.j.d(true), gwr.t);
            return;
        }
        if (b2 == atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_DONT_SAVE) {
            ynm.m(this.j.d(false), gwr.u);
            return;
        }
        if (b2 == atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_EXPIRING_SAVE) {
            atrx b4 = atrx.b(atomVar.c);
            if (b4 == null) {
                b4 = atrx.UNKNOWN_FORMAT_TYPE;
            }
            super.E(b4);
            ynm.m(this.j.a.b(new fjv(this.k.c(), 2)), jun.a);
            ynm.m(this.j.d(true), jun.b);
        }
    }

    @Override // defpackage.agsb, defpackage.agsg
    public final boolean l() {
        return this.i.getBoolean(aghv.WIFI_POLICY, true);
    }

    @Override // defpackage.agsb, defpackage.agsg
    public final boolean m(atsb atsbVar, atom atomVar) {
        Optional empty;
        if (atomVar != null) {
            return false;
        }
        atrx v = v(atrx.UNKNOWN_FORMAT_TYPE);
        if (v != atrx.UNKNOWN_FORMAT_TYPE) {
            for (atrw atrwVar : atsbVar.e) {
                atrx b2 = atrx.b(atrwVar.e);
                if (b2 == null) {
                    b2 = atrx.UNKNOWN_FORMAT_TYPE;
                }
                if (b2 == v) {
                    empty = Optional.of(atrwVar);
                    break;
                }
            }
        }
        empty = Optional.empty();
        if (empty.isPresent()) {
            atrw atrwVar2 = (atrw) empty.get();
            if ((atrwVar2.b & 8) != 0) {
                atrv b3 = atrv.b(atrwVar2.f);
                if (b3 == null) {
                    b3 = atrv.OFFLINEABILITY_AVAILABILITY_TYPE_UNKNOWN;
                }
                if (b3 == atrv.OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_LOCKED) {
                    return true;
                }
            }
            if ((atrwVar2.b & 16) != 0 && atrwVar2.g && (a() == 0 || (this.l.o() > 0 && Instant.ofEpochMilli(this.k.c()).isAfter(Instant.ofEpochMilli(a()).plus(Duration.ofDays(this.l.o())))))) {
                return true;
            }
        }
        if (atsbVar.f.isEmpty()) {
            return N(atsbVar);
        }
        return true;
    }

    @Override // defpackage.agsb, defpackage.agsg
    public final boolean n() {
        return true;
    }
}
