package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aifz {
    public apxf a;
    public int b;
    List c;
    public boolean d;
    public boolean e;
    public boolean f;
    Boolean g;
    Boolean h;
    public Boolean i;
    Boolean j;
    public owi m;
    public String n;
    public String o;
    public long k = -1;
    public int p = 1;
    final owg l = owg.AUDIO_ROUTE_UNSPECIFIED;

    public final PlaybackStartDescriptor a() {
        aone builder;
        boolean z;
        owi owiVar;
        if (this.m != null) {
            amkq.F(this.c == null, "Only one of localProto, command, videoIdList can be set");
            if (this.a == null) {
                owi owiVar2 = this.m;
                apxf apxfVar = null;
                if (owiVar2 != null && (owiVar2.b & 524288) != 0) {
                    try {
                        apxfVar = (apxf) aonm.parseFrom(apxf.a, owiVar2.t.I(), aomw.b());
                    } catch (aoob unused) {
                    }
                }
                this.a = apxfVar;
            }
        } else if (this.a != null) {
            amkq.F(this.c == null, "Only one of localProto, command, videoIdList can be set");
        }
        if (this.n != null || this.o != null) {
            amkq.F(this.m != null, "Can only set videoId/playlistId/playerParams when localProto is set");
        }
        owi owiVar3 = this.m;
        if (owiVar3 == null) {
            apxf apxfVar2 = this.a;
            if (apxfVar2 != null) {
                aiga a = aigb.a(apxfVar2);
                if (a != null) {
                    owiVar = a.h(apxfVar2);
                } else {
                    owiVar = owi.a;
                }
                builder = owiVar.toBuilder();
                aomf x = aomf.x(apxfVar2.toByteArray());
                builder.copyOnWrite();
                owi owiVar4 = (owi) builder.instance;
                owiVar4.b = 524288 | owiVar4.b;
                owiVar4.t = x;
                if (apxfVar2.pY(WatchEndpointOuterClass.watchEndpoint)) {
                    int O = awxr.O(((awdp) apxfVar2.pX(WatchEndpointOuterClass.watchEndpoint)).n);
                    if (O == 0) {
                        O = 1;
                    }
                    this.p = O;
                    this.j = Boolean.valueOf(((awdp) apxfVar2.pX(WatchEndpointOuterClass.watchEndpoint)).v);
                }
                aomf aomfVar = apxfVar2.c;
                builder.copyOnWrite();
                owi owiVar5 = (owi) builder.instance;
                aomfVar.getClass();
                owiVar5.b |= 16;
                owiVar5.h = aomfVar;
            } else if (this.c != null) {
                builder = owi.a.createBuilder();
                List list = this.c;
                builder.copyOnWrite();
                owi owiVar6 = (owi) builder.instance;
                aony aonyVar = owiVar6.d;
                if (!aonyVar.c()) {
                    owiVar6.d = aonm.mutableCopy(aonyVar);
                }
                aolo.addAll((Iterable) list, (List) owiVar6.d);
                builder.copyOnWrite();
                owi owiVar7 = (owi) builder.instance;
                owiVar7.b |= 2;
                owiVar7.e = "";
                int i = this.b;
                if (i < 0) {
                    if (i == -1) {
                        i = -1;
                    }
                    z = false;
                    amkq.N(z);
                    String str = (String) this.c.get(Math.max(0, this.b));
                    builder.copyOnWrite();
                    owi owiVar8 = (owi) builder.instance;
                    str.getClass();
                    owiVar8.b |= 1;
                    owiVar8.c = str;
                    int i2 = this.b;
                    builder.copyOnWrite();
                    owi owiVar9 = (owi) builder.instance;
                    owiVar9.b |= 4;
                    owiVar9.f = i2;
                    builder.copyOnWrite();
                    owi owiVar10 = (owi) builder.instance;
                    owiVar10.b |= 64;
                    owiVar10.j = false;
                    builder.copyOnWrite();
                    owi owiVar11 = (owi) builder.instance;
                    owiVar11.b |= 32;
                    owiVar11.i = false;
                }
                if (i < this.c.size()) {
                    z = true;
                    amkq.N(z);
                    String str2 = (String) this.c.get(Math.max(0, this.b));
                    builder.copyOnWrite();
                    owi owiVar82 = (owi) builder.instance;
                    str2.getClass();
                    owiVar82.b |= 1;
                    owiVar82.c = str2;
                    int i22 = this.b;
                    builder.copyOnWrite();
                    owi owiVar92 = (owi) builder.instance;
                    owiVar92.b |= 4;
                    owiVar92.f = i22;
                    builder.copyOnWrite();
                    owi owiVar102 = (owi) builder.instance;
                    owiVar102.b |= 64;
                    owiVar102.j = false;
                    builder.copyOnWrite();
                    owi owiVar112 = (owi) builder.instance;
                    owiVar112.b |= 32;
                    owiVar112.i = false;
                }
                z = false;
                amkq.N(z);
                String str22 = (String) this.c.get(Math.max(0, this.b));
                builder.copyOnWrite();
                owi owiVar822 = (owi) builder.instance;
                str22.getClass();
                owiVar822.b |= 1;
                owiVar822.c = str22;
                int i222 = this.b;
                builder.copyOnWrite();
                owi owiVar922 = (owi) builder.instance;
                owiVar922.b |= 4;
                owiVar922.f = i222;
                builder.copyOnWrite();
                owi owiVar1022 = (owi) builder.instance;
                owiVar1022.b |= 64;
                owiVar1022.j = false;
                builder.copyOnWrite();
                owi owiVar1122 = (owi) builder.instance;
                owiVar1122.b |= 32;
                owiVar1122.i = false;
            } else {
                builder = owi.a.createBuilder();
            }
        } else {
            builder = owiVar3.toBuilder();
        }
        boolean z2 = this.d;
        builder.copyOnWrite();
        owi owiVar12 = (owi) builder.instance;
        owiVar12.b |= 4096;
        owiVar12.p = z2;
        boolean z3 = this.e;
        builder.copyOnWrite();
        owi owiVar13 = (owi) builder.instance;
        owiVar13.b |= 4194304;
        owiVar13.v = z3;
        boolean z4 = this.f;
        builder.copyOnWrite();
        owi owiVar14 = (owi) builder.instance;
        owiVar14.b |= 2097152;
        owiVar14.u = z4;
        long j = this.k;
        if (j > -1) {
            builder.copyOnWrite();
            owi owiVar15 = (owi) builder.instance;
            owiVar15.b |= 256;
            owiVar15.l = j;
        }
        Boolean bool = this.g;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            builder.copyOnWrite();
            owi owiVar16 = (owi) builder.instance;
            owiVar16.b |= 1024;
            owiVar16.n = booleanValue;
        }
        Boolean bool2 = this.i;
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            builder.copyOnWrite();
            owi owiVar17 = (owi) builder.instance;
            owiVar17.b |= 64;
            owiVar17.j = booleanValue2;
        }
        Boolean bool3 = this.h;
        if (bool3 != null) {
            boolean booleanValue3 = bool3.booleanValue();
            builder.copyOnWrite();
            owi owiVar18 = (owi) builder.instance;
            owiVar18.b |= 2048;
            owiVar18.o = booleanValue3;
        }
        String str3 = this.n;
        if (str3 != null) {
            builder.copyOnWrite();
            owi owiVar19 = (owi) builder.instance;
            owiVar19.b = 1 | owiVar19.b;
            owiVar19.c = str3;
        }
        String str4 = this.o;
        if (str4 != null) {
            builder.copyOnWrite();
            owi owiVar20 = (owi) builder.instance;
            owiVar20.b |= 512;
            owiVar20.m = str4;
        }
        if (this.l != owg.AUDIO_ROUTE_UNSPECIFIED) {
            owg owgVar = this.l;
            builder.copyOnWrite();
            owi owiVar21 = (owi) builder.instance;
            owiVar21.w = owgVar.d;
            owiVar21.b |= 33554432;
        }
        Boolean bool4 = this.j;
        if (bool4 != null) {
            boolean booleanValue4 = bool4.booleanValue();
            builder.copyOnWrite();
            owi owiVar22 = (owi) builder.instance;
            owiVar22.b |= 134217728;
            owiVar22.z = booleanValue4;
        }
        this.m = (owi) builder.build();
        return new PlaybackStartDescriptor(this.m, this.p, this.a);
    }

    public final void b(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        amkq.E(!arrayList.isEmpty());
        this.c = arrayList;
    }

    public final void d() {
        this.h = true;
    }
}
