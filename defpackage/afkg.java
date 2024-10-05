package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afkg {
    public final ywr a;
    private final aypn e;
    private final aaea f;
    private boolean j;
    private boolean k;
    private final axzg l;
    private final Object h = new Object();
    public avzr c = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
    public avzr b = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
    private final Map i = new afke();
    public boolean d = false;
    private final ayqw g = new ayqw();

    public afkg(ywr ywrVar, aypn aypnVar, aaea aaeaVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        this.a = ywrVar;
        this.e = aypnVar;
        this.f = aaeaVar;
        this.l = axzgVar;
    }

    private final void j() {
        if (!this.j || this.g.a() != 0) {
            if (this.j || this.g.a() == 0) {
                return;
            }
            synchronized (this) {
                if (this.g.a() != 0) {
                    this.g.c();
                }
            }
            return;
        }
        synchronized (this) {
            if (this.g.a() == 0) {
                final int i = 1;
                this.g.d(this.a.d().G().s(new ayrw() { // from class: afkd
                    @Override // defpackage.ayrw
                    public final boolean a(Object obj) {
                        afkg afkgVar = afkg.this;
                        awvr awvrVar = (awvr) obj;
                        avzr b = avzr.b(awvrVar.m);
                        if (b == null) {
                            b = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
                        }
                        if (b != afkgVar.c) {
                            return true;
                        }
                        avzr b2 = avzr.b(awvrVar.n);
                        if (b2 == null) {
                            b2 = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
                        }
                        return b2 != afkgVar.b;
                    }
                }).X(new ayrs(this) { // from class: afkc
                    public final /* synthetic */ afkg a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        if (i == 0) {
                            afkg afkgVar = this.a;
                            int intValue = ((Integer) obj).intValue();
                            afkgVar.d = intValue == 3 || intValue == 10;
                            return;
                        }
                        afkg afkgVar2 = this.a;
                        awvr awvrVar = (awvr) obj;
                        avzr b = avzr.b(awvrVar.n);
                        if (b == null) {
                            b = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
                        }
                        afkgVar2.b = b;
                        avzr b2 = avzr.b(awvrVar.m);
                        if (b2 == null) {
                            b2 = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
                        }
                        afkgVar2.c = b2;
                    }
                }));
                final int i2 = 0;
                this.g.d(this.e.G().s(aflz.b).X(new ayrs(this) { // from class: afkc
                    public final /* synthetic */ afkg a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        if (i2 == 0) {
                            afkg afkgVar = this.a;
                            int intValue = ((Integer) obj).intValue();
                            afkgVar.d = intValue == 3 || intValue == 10;
                            return;
                        }
                        afkg afkgVar2 = this.a;
                        awvr awvrVar = (awvr) obj;
                        avzr b = avzr.b(awvrVar.n);
                        if (b == null) {
                            b = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
                        }
                        afkgVar2.b = b;
                        avzr b2 = avzr.b(awvrVar.m);
                        if (b2 == null) {
                            b2 = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
                        }
                        afkgVar2.c = b2;
                    }
                }));
            }
        }
    }

    private final void k() {
        this.j = a().c;
    }

    public final atcm a() {
        arfd a = this.f.a();
        if (a == null) {
            return atcm.a;
        }
        atcl atclVar = a.i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atcm atcmVar = atclVar.k;
        return atcmVar == null ? atcm.a : atcmVar;
    }

    public final avzr b(String str) {
        boolean z;
        synchronized (this.h) {
            if (this.i.containsKey(str)) {
                z = false;
            } else {
                this.i.put(str, null);
                z = true;
            }
        }
        if (z) {
            k();
            j();
        }
        if (!this.j) {
            return avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
        }
        synchronized (this.h) {
            avzr avzrVar = (avzr) this.i.get(str);
            return avzrVar != null ? avzrVar : this.d ? this.b : this.c;
        }
    }

    public final void c(final int i, final int i2, final int i3, final long j, final String str) {
        ywr ywrVar = this.a;
        final boolean D = FormatStreamModel.D(i2);
        ynm.m(ywrVar.b(new amml() { // from class: afkb
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                afkg afkgVar = afkg.this;
                String str2 = str;
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                boolean z = D;
                long j2 = j;
                aone builder = ((awvr) obj).toBuilder();
                if (!TextUtils.equals(str2, null)) {
                    builder.copyOnWrite();
                    awvr awvrVar = (awvr) builder.instance;
                    str2.getClass();
                    awvrVar.b |= 8;
                    awvrVar.g = str2;
                } else {
                    builder.copyOnWrite();
                    awvr awvrVar2 = (awvr) builder.instance;
                    awvrVar2.b &= -9;
                    awvrVar2.g = awvr.a.g;
                }
                builder.bk("last_manual_video_quality_selection_max", i4);
                builder.bl("last_manual_video_quality_selection_min", i5);
                builder.bj("last_manual_video_quality_selection_direction", i6);
                builder.bm("last_manual_video_quality_selection_timestamp", true != z ? j2 : -1L);
                if (afkgVar.e()) {
                    aone createBuilder = awvk.a.createBuilder();
                    createBuilder.copyOnWrite();
                    awvk awvkVar = (awvk) createBuilder.instance;
                    awvkVar.b = 1 | awvkVar.b;
                    awvkVar.c = i5;
                    createBuilder.copyOnWrite();
                    awvk awvkVar2 = (awvk) createBuilder.instance;
                    awvkVar2.b |= 2;
                    awvkVar2.d = i6;
                    createBuilder.copyOnWrite();
                    awvk awvkVar3 = (awvk) createBuilder.instance;
                    awvkVar3.b |= 4;
                    awvkVar3.e = j2;
                    if (!z) {
                        builder.copyOnWrite();
                        awvr awvrVar3 = (awvr) builder.instance;
                        awvk awvkVar4 = (awvk) createBuilder.build();
                        awvkVar4.getClass();
                        awvrVar3.u = awvkVar4;
                        awvrVar3.b |= 4096;
                    } else {
                        builder.copyOnWrite();
                        awvr awvrVar4 = (awvr) builder.instance;
                        awvk awvkVar5 = (awvk) createBuilder.build();
                        awvkVar5.getClass();
                        awvrVar4.t = awvkVar5;
                        awvrVar4.b |= 2048;
                    }
                }
                return (awvr) builder.build();
            }
        }), afka.a);
    }

    public final void d(String str, avzr avzrVar) {
        if (TextUtils.equals(str, null)) {
            return;
        }
        synchronized (this.h) {
            this.i.put(str, avzrVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e() {
        Boolean bool;
        aqvj aqvjVar = this.l.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45353084L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45353084L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45353084L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean f() {
        if (!this.k) {
            this.k = true;
            k();
            j();
        }
        return this.j;
    }

    public final afkf g(int i) {
        if (e()) {
            return new afkf(this.a, i);
        }
        return new afkf(this.a);
    }
}
